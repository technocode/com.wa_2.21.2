package X;

import java.lang.ref.PhantomReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.049  reason: invalid class name */
public abstract class AnonymousClass049 extends PhantomReference {
    public AnonymousClass049 next;
    public AnonymousClass049 previous;

    public abstract void destruct();

    public AnonymousClass049() {
        super(null, C04910Mi.A03);
    }

    public /* synthetic */ AnonymousClass049(C04950Mm r1) {
        this();
    }

    public AnonymousClass049(Object obj) {
        super(obj, C04910Mi.A03);
        AtomicReference atomicReference;
        AnonymousClass049 r0;
        C04920Mj r2 = C04910Mi.A01;
        do {
            atomicReference = r2.A00;
            r0 = (AnonymousClass049) atomicReference.get();
            this.next = r0;
        } while (!atomicReference.compareAndSet(r0, this));
    }
}
