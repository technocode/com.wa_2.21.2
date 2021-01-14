package X;

import java.util.concurrent.Executor;

/* renamed from: X.1ln  reason: invalid class name and case insensitive filesystem */
public final class C36231ln implements AbstractC24631Bs {
    public AbstractC011906z A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C36231ln(Executor executor, AbstractC011906z r3) {
        this.A02 = executor;
        this.A00 = r3;
    }

    @Override // X.AbstractC24631Bs
    public final void AEQ(AbstractC011406u r4) {
        AbstractC011906z r0;
        if (r4.A04()) {
            synchronized (this.A01) {
                r0 = this.A00;
            }
            if (r0 != null) {
                this.A02.execute(new RunnableEBaseShape5S0200000_I1_0(r4, this, 46));
            }
        }
    }
}
