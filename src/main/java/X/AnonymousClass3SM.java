package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3SM  reason: invalid class name */
public class AnonymousClass3SM implements AbstractC02170Ax {
    public AbstractC02190Az A00;

    public AnonymousClass3SM(AbstractC02170Ax r4) {
        this.A00 = new C02180Ay(new AnonymousClass3SL(r4), null);
    }

    @Override // X.AbstractC02170Ax
    public Object get() {
        return ((AtomicReference) this.A00.get()).get();
    }
}
