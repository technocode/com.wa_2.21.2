package X;

import java.util.concurrent.Executor;

/* renamed from: X.1lo  reason: invalid class name and case insensitive filesystem */
public final class C36241lo implements AbstractC011706x, AbstractC011806y, AbstractC011906z, AbstractC24631Bs {
    public final C011506v A00;
    public final AnonymousClass1Eu A01;
    public final Executor A02;

    public C36241lo(Executor executor, AnonymousClass1Eu r2, C011506v r3) {
        this.A02 = executor;
        this.A01 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC011706x
    public final void ADs() {
        this.A00.A05();
    }

    @Override // X.AbstractC24631Bs
    public final void AEQ(AbstractC011406u r4) {
        this.A02.execute(new RunnableEBaseShape5S0200000_I1_0(r4, this, 47));
    }

    @Override // X.AbstractC011806y
    public final void AFt(Exception exc) {
        this.A00.A07(exc);
    }

    @Override // X.AbstractC011906z
    public final void AKi(Object obj) {
        this.A00.A08(obj);
    }
}
