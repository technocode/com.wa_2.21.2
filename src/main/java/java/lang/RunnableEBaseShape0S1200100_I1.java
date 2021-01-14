package java.lang;

import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass2FF;
import X.AnonymousClass2XQ;
import X.AnonymousClass2XR;
import X.C02420Bx;
import X.C27511Qh;
import X.C41661vQ;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class RunnableEBaseShape0S1200100_I1 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableEBaseShape0S1200100_I1(Object obj, String str, long j, Object obj2, int i) {
        this.A04 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = j;
        this.A02 = obj2;
    }

    public final void run() {
        Set set;
        switch (this.A04) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                String str = this.A03;
                long j = this.A00;
                C27511Qh r7 = (C27511Qh) this.A02;
                restoreFromBackupActivity.A0K.block();
                restoreFromBackupActivity.A0g(24, null);
                AnonymousClass00D r6 = ((ActivityC004702f) restoreFromBackupActivity).A0J;
                AnonymousClass008.A0m(r6, "gdrive_account_name", str);
                if (j > 0) {
                    r6.A0V(str, j);
                }
                if (!(r7 instanceof C41661vQ)) {
                    set = Collections.emptySet();
                } else {
                    C41661vQ r72 = (C41661vQ) r7;
                    synchronized (r72) {
                        Map map = r72.A00;
                        if (map != null) {
                            set = map.keySet();
                        } else {
                            set = Collections.emptySet();
                        }
                    }
                }
                if (!set.isEmpty()) {
                    Log.i("gdrive-activity/create-media-placeholders/before message restore");
                    if (!set.isEmpty()) {
                        restoreFromBackupActivity.A0m.ANF(new RunnableEBaseShape6S0200000_I1_1(restoreFromBackupActivity, set, 18));
                    }
                }
                restoreFromBackupActivity.A0e();
                return;
            case 1:
                AnonymousClass2XR r5 = (AnonymousClass2XR) this.A01;
                String str2 = this.A03;
                AnonymousClass2FF r3 = (AnonymousClass2FF) this.A02;
                long j2 = this.A00;
                if (r5.A05.A04()) {
                    r5.A06.A00(new AnonymousClass2XQ(r5, str2));
                    C02420Bx r2 = r5.A05;
                    if (!r2.A05()) {
                        r2.A04.A02(0);
                        r2.A01();
                        return;
                    }
                    return;
                }
                r5.A03.A01();
                r5.A00(r3, j2, false);
                return;
            default:
                return;
        }
    }
}
