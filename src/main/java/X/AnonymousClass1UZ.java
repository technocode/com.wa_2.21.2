package X;

import java.util.concurrent.Callable;

/* renamed from: X.1UZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1UZ implements Callable {
    public final /* synthetic */ C014508d A00;

    public /* synthetic */ AnonymousClass1UZ(C014508d r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C014508d r1 = this.A00;
        AnonymousClass01I r0 = r1.A04;
        r0.A04();
        if (r0.A00 != null) {
            return null;
        }
        r1.A05.A01();
        return null;
    }
}
