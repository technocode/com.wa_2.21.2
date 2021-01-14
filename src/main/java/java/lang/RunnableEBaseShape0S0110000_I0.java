package java.lang;

import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00Y;
import X.AnonymousClass02M;
import X.AnonymousClass08G;
import X.AnonymousClass0FE;
import X.AnonymousClass0L1;
import X.AnonymousClass0X4;
import X.C014508d;
import X.C02290Bk;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

public class RunnableEBaseShape0S0110000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public RunnableEBaseShape0S0110000_I0(Object obj, boolean z, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void run() {
        switch (this.A02) {
            case 0:
                C02290Bk r2 = (C02290Bk) this.A00;
                boolean z = this.A01;
                Log.i("msgstore/backupdb/sb unlocker");
                try {
                    C014508d r0 = r2.A0L;
                    r0.A05();
                    r0.A07.A9x();
                    r2.A0N.A02();
                    r2.A0H(z);
                    return;
                } catch (SQLiteException e) {
                    Log.e("msgstore/backupdb/failed-to-get-database/cannot-generate-fts-or-links", e);
                    return;
                }
            case 1:
                AnonymousClass00Y r4 = (AnonymousClass00Y) this.A00;
                boolean z2 = this.A01;
                if (z2) {
                    AnonymousClass008.A0n(r4.A0B, "wam_is_current_buffer_real_time", true);
                }
                if (r4.A0H()) {
                    r4.A07.ANb(r4.A02, z2);
                }
                if (r4.A0F()) {
                    r4.A07.ANb(r4.A00, z2);
                    return;
                }
                return;
            case 2:
                AnonymousClass00Y r3 = (AnonymousClass00Y) this.A00;
                boolean z3 = this.A01;
                if (r3.A0G()) {
                    r3.A06.ANb(r3.A01, z3);
                    return;
                }
                return;
            case 3:
                ((AnonymousClass08G) this.A00).A02(this.A01);
                return;
            case 4:
                AnonymousClass0FE r42 = (AnonymousClass0FE) this.A00;
                if (this.A01) {
                    Log.i("updating dismissed notification hash");
                    AnonymousClass00D r32 = r42.A0P;
                    AnonymousClass008.A0m(r32, "notification_hash", r32.A00.getString("last_notification_hash", null));
                }
                r42.A0O.A04(null, 1, "MessageNotification1");
                return;
            case 5:
                ((AnonymousClass0L1) this.A00).A06(this.A01);
                return;
            case 6:
                AnonymousClass0X4 r5 = (AnonymousClass0X4) this.A00;
                boolean z4 = this.A01;
                r5.A0Q.A01(new RunnableEBaseShape3S0100000_I0_3(r5, 47), 14);
                if (z4) {
                    AnonymousClass02M r43 = r5.A03;
                    r43.A02.postDelayed(new RunnableEBaseShape3S0100000_I0_3(r5, 46), 2000);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
