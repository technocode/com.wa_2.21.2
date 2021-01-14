package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.0Ep  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C03050Ep implements AbstractC02170Ax {
    public final /* synthetic */ C03040Eo A00;

    public /* synthetic */ C03050Ep(C03040Eo r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02170Ax
    public final Object get() {
        return this.A00.A00.A3T("ProcessImageQueue", 4, 4, 0, 1, new LinkedBlockingQueue());
    }
}
