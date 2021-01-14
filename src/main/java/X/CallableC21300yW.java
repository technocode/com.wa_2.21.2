package X;

import java.util.concurrent.Callable;

/* renamed from: X.0yW  reason: invalid class name and case insensitive filesystem */
public class CallableC21300yW implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C33081gA A01;

    public CallableC21300yW(C33081gA r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r3 = this.A01;
        if (r3.isConnected()) {
            r3.A00 = this.A00;
            if (r3.A0X == null) {
                r3.A0W.setDisplayOrientation(r3.A05(r3.A00));
            } else if (r3.A0X != null) {
                if (C32451ey.A0E) {
                    r3.A0W.setDisplayOrientation(r3.A05(0));
                } else {
                    r3.A0W.setDisplayOrientation(r3.A05(r3.A00));
                }
                r3.A0X.A02(C33081gA.A00(r3.A00));
            } else {
                throw null;
            }
            AnonymousClass0VN A06 = r3.A06();
            C07070Vu r0 = (C07070Vu) A06.A00(AnonymousClass0VN.A0e);
            r3.A0D(r0.A01, r0.A00);
            return new C21960zc(r3.A06, r3.A5B(), A06);
        }
        throw new C21100yB("Can not update preview display rotation");
    }
}
