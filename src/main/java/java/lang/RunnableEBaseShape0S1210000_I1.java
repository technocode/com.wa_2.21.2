package java.lang;

import X.ActivityC004902h;
import X.AnonymousClass02M;
import X.AnonymousClass0GG;
import X.AnonymousClass2ZH;
import X.C007003k;
import X.C27891Sa;
import X.C47282He;
import com.whatsapp.ReportSpamDialogFragment;
import java.util.Set;

public class RunnableEBaseShape0S1210000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public RunnableEBaseShape0S1210000_I1(Object obj, boolean z, Object obj2, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = z;
        this.A01 = obj2;
        this.A02 = str;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                ReportSpamDialogFragment reportSpamDialogFragment = (ReportSpamDialogFragment) this.A00;
                boolean z = this.A03;
                C007003k r7 = (C007003k) this.A01;
                String str = this.A02;
                C47282He r4 = reportSpamDialogFragment.A04;
                if (z) {
                    ActivityC004902h A0A = reportSpamDialogFragment.A0A();
                    r4.A02(r7, str);
                    r4.A01(A0A, new AnonymousClass2ZH(reportSpamDialogFragment, r7), r7, null, null);
                    return;
                }
                r4.A02(r7, str);
                AnonymousClass02M r2 = reportSpamDialogFragment.A00;
                r2.A02();
                r2.A02.post(new RunnableEBaseShape6S0100000_I1_1(reportSpamDialogFragment, 29));
                return;
            case 1:
                C27891Sa r42 = (C27891Sa) this.A00;
                boolean z2 = this.A03;
                Set set = (Set) this.A01;
                String str2 = this.A02;
                AnonymousClass0GG r1 = r42.A03;
                if (z2) {
                    r1.A0D(null);
                } else {
                    r1.A0F(set, str2);
                }
                r42.A0F.run();
                return;
            default:
                return;
        }
    }
}
