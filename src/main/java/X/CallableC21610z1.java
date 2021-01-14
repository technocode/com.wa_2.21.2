package X;

import java.util.concurrent.Callable;

/* renamed from: X.0z1  reason: invalid class name and case insensitive filesystem */
public class CallableC21610z1 implements Callable {
    public final /* synthetic */ C33171gJ A00;

    public CallableC21610z1(C33171gJ r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33171gJ r3 = this.A00;
        r3.A05();
        if (r3.A0g != null) {
            C32451ey r1 = r3.A0g;
            if (r3.A0g != null) {
                r1.A01();
                r3.A0g = null;
                r3.A0A = null;
            } else {
                throw null;
            }
        }
        return null;
    }
}
