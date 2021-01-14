package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3SL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3SL implements AbstractC02170Ax {
    public final /* synthetic */ AbstractC02170Ax A00;

    public /* synthetic */ AnonymousClass3SL(AbstractC02170Ax r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02170Ax
    public final Object get() {
        return new AtomicReference(this.A00.get());
    }
}
