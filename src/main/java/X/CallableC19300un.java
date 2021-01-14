package X;

import java.util.concurrent.Callable;

/* renamed from: X.0un  reason: invalid class name and case insensitive filesystem */
public class CallableC19300un implements Callable {
    public final /* synthetic */ C19380uv A00;

    public CallableC19300un(C19380uv r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C19380uv r1 = this.A00;
        synchronized (r1) {
            if (r1.A04 == null) {
                return null;
            }
            r1.A05();
            if (r1.A08()) {
                r1.A06();
                r1.A00 = 0;
            }
            return null;
        }
    }
}
