package java.lang;

import X.AnonymousClass169;
import X.C225512f;

public class RunnableEBaseShape0S1100200_I1 extends RunnableEmptyBase implements Runnable {
    public long A00;
    public long A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableEBaseShape0S1100200_I1(Object obj, String str, long j, long j2, int i) {
        this.A04 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                ((C225512f) this.A02).A01.AD1(this.A03, this.A00, this.A01);
                return;
            case 1:
                ((AnonymousClass169) this.A02).A01.ALf(this.A03, this.A00, this.A01);
                return;
            default:
                return;
        }
    }
}
