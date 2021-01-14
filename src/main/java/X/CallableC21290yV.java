package X;

import java.util.concurrent.Callable;

/* renamed from: X.0yV  reason: invalid class name and case insensitive filesystem */
public class CallableC21290yV implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C33081gA A01;

    public CallableC21290yV(C33081gA r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r1 = this.A01;
        if (!r1.isConnected() || !r1.A0c) {
            return 0;
        }
        C21490yp r12 = r1.A0O;
        int i = this.A00;
        r12.A00(i);
        return Integer.valueOf(i);
    }
}
