package X;

import android.content.SharedPreferences;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0Fb  reason: invalid class name and case insensitive filesystem */
public class C03170Fb {
    public static volatile C03170Fb A05;
    public final C000300f A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass09H A03;
    public final AbstractC29211Xn A04;

    public C03170Fb(AnonymousClass00S r1, C000300f r2, AnonymousClass09H r3, AnonymousClass00D r4, AbstractC29211Xn r5) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r4;
        this.A04 = r5;
    }

    public static C03170Fb A00() {
        if (A05 == null) {
            synchronized (C03170Fb.class) {
                if (A05 == null) {
                    A05 = new C03170Fb(AnonymousClass00S.A00(), C000300f.A00(), AnonymousClass09H.A01(), AnonymousClass00D.A00(), AbstractC29211Xn.A00());
                }
            }
        }
        return A05;
    }

    public synchronized int A01() {
        SharedPreferences sharedPreferences = this.A02.A00;
        if (sharedPreferences.getLong("tos_v2_accepted_time", 0) != 0 || !AbstractC000400g.A05()) {
            return 0;
        }
        return sharedPreferences.getInt("tos_v2_current_stage_id", 0);
    }

    public synchronized int A02() {
        int i;
        SharedPreferences sharedPreferences = this.A02.A00;
        if (sharedPreferences.getLong("tos_v2_accepted_time", 0) != 0 || !AbstractC000400g.A05()) {
            return 0;
        }
        int i2 = sharedPreferences.getInt("tos_v2_current_stage_id", 0);
        if (i2 == 3) {
            return 3;
        }
        if (i2 == 0) {
            sharedPreferences.edit().putInt("tos_v2_current_stage_id", 1).apply();
            i = 1;
        } else {
            i = i2;
        }
        StringBuilder sb = new StringBuilder("tos_v2_stage_start_time");
        sb.append(i);
        long j = sharedPreferences.getLong(sb.toString(), 0);
        if (j == 0) {
            j = this.A01.A05();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("tosupdate/init stage:");
            sb2.append(i);
            sb2.append(" start:");
            sb2.append(j);
            Log.i(sb2.toString());
            SharedPreferences.Editor edit = sharedPreferences.edit();
            StringBuilder sb3 = new StringBuilder("tos_v2_stage_start_time");
            sb3.append(i);
            edit.putLong(sb3.toString(), j).apply();
        }
        C000300f r10 = this.A00;
        AnonymousClass00S r3 = this.A01;
        if (j + r10.A07(i) <= r3.A05()) {
            do {
                i++;
                if (r10.A07(i) != 0) {
                    break;
                }
            } while (i < 3);
            long A052 = r3.A05();
            sharedPreferences.edit().putInt("tos_v2_current_stage_id", i).apply();
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            StringBuilder sb4 = new StringBuilder("tos_v2_stage_start_time");
            sb4.append(i);
            edit2.putLong(sb4.toString(), A052).apply();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("tosupdate/advance stage:");
            sb5.append(i);
            sb5.append(" start:");
            sb5.append(A052);
            Log.i(sb5.toString());
        }
        if (i2 != i && this.A03.A0C(Message.obtain(null, 0, 99, i))) {
            AnonymousClass008.A0v("tosupdate/send/stage ", i);
        }
        return i;
    }

    public void A03() {
        if (this.A03.A0C(Message.obtain(null, 0, 100, 0))) {
            Log.i("tosupdate/send/accept");
        }
    }

    public synchronized void A04() {
        SharedPreferences.Editor remove = this.A02.A00.edit().remove("tos_v2_current_stage_id").remove("tos_v2_last_stage_1_display_time").remove("tos_v2_page_2_ack").remove("tos_v2_accepted_time").remove("tos_v2_accepted_ack");
        int[] iArr = AnonymousClass020.A09;
        for (int i : iArr) {
            StringBuilder sb = new StringBuilder("tos_v2_stage_start_time");
            sb.append(i);
            remove.remove(sb.toString());
            StringBuilder sb2 = new StringBuilder("tos_v2_stage_start_ack");
            sb2.append(i);
            remove.remove(sb2.toString());
        }
        remove.apply();
        C000300f r1 = this.A00;
        if (r1 != null) {
            synchronized (AbstractC000400g.class) {
                AbstractC000400g.A0L.clear();
                r1.A00.edit().remove("tos_update_v2").apply();
            }
        } else {
            throw null;
        }
    }

    public boolean A05() {
        if (this.A00 != null) {
            int A012 = A01();
            return (A012 == 2 || A012 == 3) ? false : true;
        }
        throw null;
    }

    public synchronized boolean A06() {
        int A012 = A01();
        boolean z = false;
        if (A012 != 1) {
            return A012 == 2 || A012 == 3;
        }
        if (this.A02.A00.getLong("tos_v2_last_stage_1_display_time", 0) + 86400000 < this.A01.A05()) {
            z = true;
        }
        return z;
    }
}
