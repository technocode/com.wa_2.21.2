package X;

import java.util.concurrent.Executor;

/* renamed from: X.1lk  reason: invalid class name and case insensitive filesystem */
public final class C36201lk implements AbstractC24631Bs {
    public AbstractC011706x A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C36201lk(Executor executor, AbstractC011706x r3) {
        this.A02 = executor;
        this.A00 = r3;
    }

    @Override // X.AbstractC24631Bs
    public final void AEQ(AbstractC011406u r4) {
        AbstractC011706x r0;
        if (((C011506v) r4).A05) {
            synchronized (this.A01) {
                r0 = this.A00;
            }
            if (r0 != null) {
                this.A02.execute(new RunnableEBaseShape6S0100000_I1_1(this, 1));
            }
        }
    }
}
