package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Fi  reason: invalid class name and case insensitive filesystem */
public class C03230Fi {
    public static volatile C03230Fi A07;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final C000300f A02;
    public final AnonymousClass01A A03;
    public final C02770Dj A04;
    public final C02130At A05;
    public final C03100Eu A06;

    public C03230Fi(AnonymousClass009 r1, AnonymousClass01I r2, C000300f r3, C02770Dj r4, AnonymousClass01A r5, C03100Eu r6, C02130At r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A06 = r6;
        this.A05 = r7;
    }

    public static final void A00(List list, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            list.add(new AnonymousClass0OS(str, str2));
        }
    }

    public static void A01(List list, List list2) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3LO r4 = (AnonymousClass3LO) it.next();
            AnonymousClass02N r3 = r4.A00;
            boolean A0e = AnonymousClass1VY.A0e(r3);
            arrayList.clear();
            arrayList.add(new AnonymousClass0OS("jid", r3));
            if (!TextUtils.isEmpty(r4.A0H)) {
                String str2 = r4.A0H;
                if (str2 != null) {
                    arrayList.add(new AnonymousClass0OS("notify", str2));
                } else {
                    throw null;
                }
            }
            int i = ((C64392y7) r4).A00;
            if (i == 0 || i == -1) {
                String str3 = r4.A0G;
                if (str3 != null) {
                    AnonymousClass008.A1D("name", str3, arrayList);
                    if (!r4.A0L && A0e) {
                        AnonymousClass008.A1D("type", "out", arrayList);
                    }
                    String str4 = r4.A0I;
                    if (str4 != null) {
                        AnonymousClass008.A1D("short", str4, arrayList);
                    }
                    if (r4.A0O) {
                        AnonymousClass008.A1D("status_mute", "true", arrayList);
                    }
                }
            } else {
                String str5 = r4.A0G;
                if (str5 != null) {
                    AnonymousClass008.A1D("name", str5, arrayList);
                    if (!r4.A0L && A0e) {
                        AnonymousClass008.A1D("type", "out", arrayList);
                    }
                }
                String str6 = r4.A0I;
                if (str6 != null) {
                    AnonymousClass008.A1D("vname", str6, arrayList);
                }
                if (r4.A0O) {
                    AnonymousClass008.A1D("status_mute", "true", arrayList);
                }
                if (i == 1) {
                    str = "0";
                } else if (i == 2) {
                    str = "1";
                } else if (i == 3) {
                    str = "2";
                }
                AnonymousClass008.A1D("verify", str, arrayList);
                if (r4.A0M) {
                    AnonymousClass008.A1D("enterprise", "true", arrayList);
                }
            }
            list2.add(new AnonymousClass0M5("user", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[arrayList.size()])));
        }
    }

    public AnonymousClass0M5 A02(C64392y7 r12) {
        byte[] bArr;
        AnonymousClass009 r5 = this.A00;
        AnonymousClass01I r6 = this.A01;
        C000300f r7 = this.A02;
        C02770Dj r8 = this.A04;
        C03100Eu r9 = this.A06;
        C02130At r10 = this.A05;
        synchronized (r12) {
            bArr = r12.A0Q;
        }
        if (bArr == null) {
            bArr = r12.A05(r5, r6, r7, r8, r9, r10);
        }
        return new AnonymousClass0M5("message", (AnonymousClass0OS[]) null, bArr);
    }
}
