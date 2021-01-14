package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.0Ej  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C02990Ej implements AbstractC02170Ax {
    public final /* synthetic */ C02980Ei A00;

    public /* synthetic */ C02990Ej(C02980Ei r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02170Ax
    public final Object get() {
        C02980Ei r0 = this.A00;
        return r0.A00.A3T(r0.A01, 0, 1, 60, 1, new LinkedBlockingQueue());
    }
}
