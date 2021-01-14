package X;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: X.0z0  reason: invalid class name and case insensitive filesystem */
public class CallableC21600z0 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C32451ey A01;
    public final /* synthetic */ C21060y6 A02;
    public final /* synthetic */ C33021g4 A03;
    public final /* synthetic */ C33171gJ A04;
    public final /* synthetic */ AnonymousClass0VV A05;

    public CallableC21600z0(C33171gJ r1, C32451ey r2, C21060y6 r3, C33021g4 r4, int i, AnonymousClass0VV r6) {
        this.A04 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = i;
        this.A05 = r6;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C22100zr.A00();
        C33171gJ r5 = this.A04;
        if (!(r5.A0g == null || r5.A0g == this.A01)) {
            C32451ey r1 = r5.A0g;
            if (r5.A0g != null) {
                r1.A01();
            } else {
                throw null;
            }
        }
        C32451ey r0 = this.A01;
        r5.A0g = r0;
        if (r0 != null) {
            r5.A0A = null;
            r5.A0A = C33321gY.A00;
            r5.A06 = this.A02;
            r5.A07 = this.A03;
            r5.A00 = this.A00;
            AnonymousClass0z3 r3 = r5.A0T;
            AnonymousClass0VV r7 = this.A05;
            if (r3.A01.A08()) {
                AnonymousClass0VV r6 = AnonymousClass0VV.FRONT;
                int i = 1;
                if (r7 == r6) {
                    i = 0;
                }
                if (!r3.A02(Integer.valueOf(i))) {
                    Set set = AnonymousClass0z3.A04;
                    if (set == null) {
                        C22100zr.A01("Logical cameras not initialised!");
                    } else if (!set.isEmpty()) {
                        AnonymousClass0VV r12 = AnonymousClass0VV.BACK;
                        if (r7.equals(r12)) {
                            int i2 = 1;
                            if (r6 == r6) {
                                i2 = 0;
                            }
                            if (r3.A02(Integer.valueOf(i2))) {
                                C22100zr.A02("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                r7 = r6;
                            }
                        }
                        if (r7.equals(r6) && r3.A02(1)) {
                            C22100zr.A02("CameraInventory", "Requested front camera doesn't exist, using back instead");
                            r7 = r12;
                        }
                    }
                    throw new C21100yB("No cameras found on device");
                }
                if (r7 != null) {
                    String A012 = r3.A01(r7);
                    try {
                        C33171gJ.A01(r5, A012);
                        C33171gJ.A02(r5, A012);
                        C22100zr.A00();
                        return new C21960zc(r5.A0E, r5.A5B(), r5.A04());
                    } catch (Exception e) {
                        r5.A3l(null);
                        throw e;
                    }
                }
                throw new C21100yB("No cameras found on device");
            }
            throw new RuntimeException("Cannot resolve camera facing, not on the Optic thread");
        }
        throw null;
    }
}
