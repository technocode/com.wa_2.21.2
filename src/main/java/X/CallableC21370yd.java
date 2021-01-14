package X;

import java.util.concurrent.Callable;

/* renamed from: X.0yd  reason: invalid class name and case insensitive filesystem */
public class CallableC21370yd implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C33081gA A01;
    public final /* synthetic */ boolean A02;

    public CallableC21370yd(C33081gA r1, boolean z, long j) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r2 = this.A01;
        boolean z = this.A02;
        long j = this.A00;
        if (r2.A0b) {
            r2.A0B();
            if (z) {
                r2.A0A();
            }
            C07050Vs r5 = r2.A07;
            long j2 = r5.A02;
            if (j2 != -1) {
                j = j2;
            }
            r5.A02 = j;
            return r5;
        }
        throw new IllegalStateException("Not recording video.");
    }
}
