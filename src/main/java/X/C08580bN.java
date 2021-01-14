package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0bN  reason: invalid class name and case insensitive filesystem */
public class C08580bN extends C02270Bi {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    @Override // X.AbstractC02280Bj
    public void A03(AbstractC005102k r3, AnonymousClass0SG r4) {
        if (super.A00 > 0) {
            throw new IllegalStateException("Can not register multiple observers for a *Single*LiveEvent");
        }
        super.A03(r3, new AnonymousClass3SA(this, r4));
    }

    @Override // X.AbstractC02280Bj
    public void A07(Object obj) {
        this.A00.set(true);
        super.A07(obj);
    }
}
