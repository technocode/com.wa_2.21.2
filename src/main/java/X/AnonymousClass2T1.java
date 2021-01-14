package X;

import java.util.concurrent.Callable;

/* renamed from: X.2T1  reason: invalid class name */
public class AnonymousClass2T1 implements Callable {
    public C05450Op A00;
    public AnonymousClass0D7 A01;

    public AnonymousClass2T1(C05450Op r1, AnonymousClass0D7 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C05450Op r1 = this.A00;
        if (r1 == null) {
            return null;
        }
        this.A01.A01(r1);
        return new AnonymousClass1XF(this.A00.A05(), this.A00.A06());
    }
}
