package X;

import android.hardware.Camera;
import java.util.concurrent.Callable;

/* renamed from: X.0yJ  reason: invalid class name and case insensitive filesystem */
public class CallableC21180yJ implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C32451ey A01;
    public final /* synthetic */ C21060y6 A02;
    public final /* synthetic */ C33021g4 A03;
    public final /* synthetic */ C33081gA A04;
    public final /* synthetic */ AnonymousClass0VV A05;

    public CallableC21180yJ(C33081gA r1, C32451ey r2, AnonymousClass0VV r3, C21060y6 r4, C33021g4 r5, int i) {
        this.A04 = r1;
        this.A01 = r2;
        this.A05 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        try {
            C22100zr.A00();
            C33081gA r4 = this.A04;
            if (!(r4.A0X == null || r4.A0X == this.A01)) {
                C32451ey r2 = r4.A0X;
                if (r4.A0X != null) {
                    r2.A01();
                    r4.A0X = null;
                } else {
                    throw null;
                }
            }
            C21380ye r0 = r4.A0K;
            AnonymousClass0VV r5 = this.A05;
            if (r0.A00.A08()) {
                r5.A01();
                if (!C21380ye.A00(r5.mCameraId)) {
                    int i = C21380ye.A01;
                    if (i == -1) {
                        C22100zr.A01("Camera count was not initialised");
                        i = Camera.getNumberOfCameras();
                        C21380ye.A01 = i;
                    }
                    if (i != 0) {
                        AnonymousClass0VV r1 = AnonymousClass0VV.BACK;
                        if (r5.equals(r1) && C21380ye.A00(1)) {
                            C22100zr.A02("CameraInventory", "Requested back camera doesn't exist, using front instead");
                            r5 = AnonymousClass0VV.FRONT;
                        } else if (!r5.equals(AnonymousClass0VV.FRONT) || !C21380ye.A00(0)) {
                            StringBuilder A0S = AnonymousClass008.A0S("found ");
                            A0S.append(C21380ye.A01);
                            A0S.append(" cameras with bad facing constants");
                            C22100zr.A01(A0S.toString());
                        } else {
                            C22100zr.A02("CameraInventory", "Requested front camera doesn't exist, using back instead");
                            r5 = r1;
                        }
                        if (r5 != null) {
                        }
                    }
                    throw new C21100yB("No cameras found on device");
                }
                C21060y6 r3 = this.A02;
                C33021g4 r22 = this.A03;
                C33081gA.A03(r4, r5, r3);
                C21960zc A012 = C33081gA.A01(r4, r22, r3, this.A01, this.A00);
                C22100zr.A00();
                return A012;
            }
            throw new RuntimeException("Cannot resolve camera facing, not on the Optic thread");
        } catch (Exception e) {
            C33081gA r23 = this.A04;
            r23.A09();
            r23.A0U.set(false);
            r23.A07();
            C33081gA.A02(r23);
            throw e;
        }
    }
}
