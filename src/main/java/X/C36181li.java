package X;

import java.util.concurrent.Executor;

/* renamed from: X.1li  reason: invalid class name and case insensitive filesystem */
public final class C36181li implements AbstractC24631Bs {
    public final AbstractC24581Bn A00;
    public final C011506v A01;
    public final Executor A02;

    public C36181li(Executor executor, AbstractC24581Bn r2, C011506v r3) {
        this.A02 = executor;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AbstractC24631Bs
    public final void AEQ(AbstractC011406u r4) {
        this.A02.execute(new RunnableEBaseShape5S0200000_I1_0(r4, this, 42));
    }
}
