package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.06w  reason: invalid class name and case insensitive filesystem */
public final class C011606w implements AbstractC011706x, AbstractC011806y, AbstractC011906z {
    public final CountDownLatch A00 = new CountDownLatch(1);

    @Override // X.AbstractC011706x
    public final void ADs() {
        this.A00.countDown();
    }

    @Override // X.AbstractC011806y
    public final void AFt(Exception exc) {
        this.A00.countDown();
    }

    @Override // X.AbstractC011906z
    public final void AKi(Object obj) {
        this.A00.countDown();
    }
}
