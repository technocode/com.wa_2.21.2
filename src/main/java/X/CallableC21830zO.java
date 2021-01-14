package X;

import java.util.concurrent.Callable;

/* renamed from: X.0zO  reason: invalid class name and case insensitive filesystem */
public class CallableC21830zO implements Callable {
    public final /* synthetic */ AnonymousClass25B A00;

    public CallableC21830zO(AnonymousClass25B r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        AnonymousClass25B r4 = this.A00;
        C21850zQ r3 = r4.A02;
        r3.A00();
        C21660z7 r2 = r3.A02;
        if (r2 != null) {
            r2.A02(r4.A00, r4.A03);
        }
        C21780zJ r22 = r3.A03;
        if (r22 == null) {
            return null;
        }
        r22.A08(r4.A04, true);
        return null;
    }
}
