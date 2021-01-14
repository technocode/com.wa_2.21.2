package java.lang;

import X.AnonymousClass00Y;
import X.AnonymousClass0IW;

public class RunnableEBaseShape0S0111000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public RunnableEBaseShape0S0111000_I0(Object obj, int i, boolean z, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = z;
    }

    public final void run() {
        switch (this.A03) {
            case 0:
                AnonymousClass0IW r3 = (AnonymousClass0IW) this.A01;
                int i = this.A00;
                boolean z = this.A02;
                if (r3.A03) {
                    r3.A05[i] = z;
                    if (z) {
                        r3.A04[i] = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass00Y r1 = (AnonymousClass00Y) this.A01;
                boolean z2 = this.A02;
                int i2 = this.A00;
                if (r1.A0G()) {
                    r1.A06.ANc(r1.A01, z2, false, i2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
