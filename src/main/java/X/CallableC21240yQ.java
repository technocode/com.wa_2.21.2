package X;

import java.util.concurrent.Callable;

/* renamed from: X.0yQ  reason: invalid class name and case insensitive filesystem */
public class CallableC21240yQ implements Callable {
    public final /* synthetic */ C33081gA A00;

    public CallableC21240yQ(C33081gA r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        boolean z;
        C33081gA r2 = this.A00;
        if (!r2.isConnected()) {
            return null;
        }
        C33101gC r1 = r2.A0N;
        synchronized (r1) {
            z = !r1.A05.A00.isEmpty();
        }
        if (z) {
            return null;
        }
        r1.A01(r2.A0W);
        synchronized (r1) {
            r1.A06.clear();
        }
        return null;
    }
}
