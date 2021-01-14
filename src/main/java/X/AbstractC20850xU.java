package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0xU  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC20850xU extends PhantomReference {
    public AbstractC20850xU A00;
    public AbstractC20850xU A01;

    public abstract void destruct();

    public AbstractC20850xU() {
        super(null, C20880xX.A03);
    }

    public AbstractC20850xU(C20840xT r3) {
        super(null, C20880xX.A03);
    }

    public AbstractC20850xU(Object obj) {
        super(obj, C20880xX.A03);
        AtomicReference atomicReference;
        AbstractC20850xU r0;
        C20870xW r2 = C20880xX.A01;
        do {
            atomicReference = r2.A00;
            r0 = (AbstractC20850xU) atomicReference.get();
            this.A00 = r0;
        } while (!atomicReference.compareAndSet(r0, this));
    }
}
