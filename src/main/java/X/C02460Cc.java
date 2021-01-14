package X;

import android.content.SharedPreferences;
import android.net.NetworkInfo;
import com.whatsapp.util.Log;
import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Cc  reason: invalid class name and case insensitive filesystem */
public class C02460Cc {
    public static volatile C02460Cc A04;
    public final AnonymousClass04j A00;
    public final AnonymousClass00S A01;
    public final C002701k A02;
    public final C02470Cd A03;

    public C02460Cc(AnonymousClass00S r1, C002701k r2, AnonymousClass04j r3, C02470Cd r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }

    public static int A00(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 4;
        }
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type == 0) {
            switch (subtype) {
                case 1:
                case 2:
                    return 0;
                case 3:
                    return 1;
                case 4:
                    return 0;
                case 5:
                case 6:
                case 12:
                    return 1;
                case 7:
                    return 0;
                case 8:
                case 9:
                case 10:
                    return 1;
                case 11:
                    return 0;
                case 13:
                    return 2;
                case 14:
                    return 1;
                case 15:
                    return 2;
                default:
                    return 4;
            }
        } else if (type == 1) {
            return 3;
        } else {
            return 4;
        }
    }

    public static C02460Cc A01() {
        if (A04 == null) {
            synchronized (C02460Cc.class) {
                if (A04 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C002701k A003 = C002701k.A00();
                    AnonymousClass04j A004 = AnonymousClass04j.A00();
                    if (C02470Cd.A01 == null) {
                        synchronized (C02470Cd.class) {
                            if (C02470Cd.A01 == null) {
                                C02470Cd.A01 = new C02470Cd(AnonymousClass022.A00());
                            }
                        }
                    }
                    A04 = new C02460Cc(A002, A003, A004, C02470Cd.A01);
                }
            }
        }
        return A04;
    }

    public synchronized Float A02(int i) {
        float f;
        float f2;
        int i2;
        int A002 = A00(this.A00.A04());
        int A05 = (int) ((((this.A01.A05() / 1000) / 60) / 60) % 24);
        C49912Sr r4 = new C49912Sr(this.A03.A01(i, A05, A002));
        if (r4.A03() || !this.A02.A0E(154)) {
            if (!r4.A03()) {
                f = -1.0f;
            } else {
                f = (float) C49912Sr.A00(r4.A02);
            }
            return Float.valueOf(f);
        }
        List A012 = this.A03.A01(i, (A05 + 23) % 24, A002);
        List A013 = this.A03.A01(i, (A05 + 1) % 24, A002);
        Iterator it = ((AbstractSequentialList) A012).iterator();
        Iterator it2 = ((AbstractSequentialList) A013).iterator();
        boolean z = false;
        while (!r4.A03()) {
            if (!z && it.hasNext()) {
                i2 = ((Integer) it.next()).intValue();
                z = true;
            } else if (it2.hasNext()) {
                i2 = ((Integer) it2.next()).intValue();
                z = false;
            } else if (!it.hasNext()) {
                return null;
            } else {
                i2 = ((Integer) it.next()).intValue();
            }
            r4.A02(i2);
        }
        if (!r4.A03()) {
            f2 = -1.0f;
        } else {
            f2 = (float) C49912Sr.A00(r4.A02);
        }
        return Float.valueOf(f2);
    }

    public synchronized void A03(AnonymousClass1XO r7, long j, long j2, int i) {
        int A002 = A00(this.A00.A04());
        int A05 = (int) ((((this.A01.A05() / 1000) / 60) / 60) % 24);
        StringBuilder sb = new StringBuilder();
        sb.append("BandwidthManager/addMeasurement/transferredBytes = ");
        sb.append(j);
        sb.append(", networkTime = ");
        sb.append(j2);
        sb.append(", mmsType=");
        sb.append(r7);
        sb.append(", hourOfDay=");
        sb.append(A05);
        sb.append(", networkTypeGrouping=");
        sb.append(A002);
        sb.append(", requestType = ");
        sb.append(i);
        Log.d(sb.toString());
        if (A002 == 0 || A002 == 4 || (!(r7 == AnonymousClass1XO.A0A || r7 == AnonymousClass1XO.A0C || r7 == AnonymousClass1XO.A0P) || j < 51200 || j2 < 100)) {
            Log.d("BandwidthManager/addMeasurement/ignore data");
            return;
        }
        C02470Cd r2 = this.A03;
        C49912Sr r1 = new C49912Sr(r2.A01(i, A05, A002));
        r1.A02((int) (((float) j) / ((float) j2)));
        List<Integer> list = r1.A02;
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : list) {
            sb2.append(num.intValue());
            sb2.append(",");
        }
        SharedPreferences.Editor edit = r2.A00.edit();
        edit.putString(C02470Cd.A00(i, A05, A002), sb2.toString());
        edit.apply();
    }
}
