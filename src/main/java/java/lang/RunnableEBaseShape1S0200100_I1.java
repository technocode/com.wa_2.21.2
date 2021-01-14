package java.lang;

import X.AnonymousClass2FF;
import X.AnonymousClass2XP;
import X.C03400Ga;
import X.C49232Po;

public class RunnableEBaseShape1S0200100_I1 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape1S0200100_I1(Object obj, Object obj2, long j, int i) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
    }

    public final void run() {
        switch (this.A03) {
            case 0:
                long j = this.A00;
                ((AnonymousClass2XP) this.A01).A00.A00((AnonymousClass2FF) this.A02, j, true);
                return;
            case 1:
                C03400Ga r4 = (C03400Ga) this.A01;
                C49232Po r3 = (C49232Po) this.A02;
                long j2 = this.A00;
                if (r4.A02(r3)) {
                    r4.A09.A01(r3, j2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
