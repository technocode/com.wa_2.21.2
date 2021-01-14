package X;

import java.util.concurrent.Callable;

/* renamed from: X.0yX  reason: invalid class name and case insensitive filesystem */
public class CallableC21310yX implements Callable {
    public final /* synthetic */ C33081gA A00;

    public CallableC21310yX(C33081gA r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r4 = this.A00;
        C22100zr.A00();
        if (r4.isConnected()) {
            AnonymousClass0VV r0 = r4.A06;
            AnonymousClass0VV r2 = AnonymousClass0VV.BACK;
            if (r0.equals(r2)) {
                r2 = AnonymousClass0VV.FRONT;
            }
            r2.A01();
            if (C21380ye.A00(r2.mCameraId)) {
                C33081gA.A03(r4, r2, r4.A03);
                C21960zc A01 = C33081gA.A01(r4, r4.A04, r4.A03, r4.A0X, r4.A00);
                C22100zr.A00();
                return A01;
            }
            StringBuilder A0S = AnonymousClass008.A0S("Cannot switch to ");
            A0S.append(r2.name());
            A0S.append(", camera is not present");
            throw new AnonymousClass0y7(A0S.toString());
        }
        throw new C21100yB("Cannot switch cameras.");
    }
}
