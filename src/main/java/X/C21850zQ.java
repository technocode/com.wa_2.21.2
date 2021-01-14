package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* renamed from: X.0zQ  reason: invalid class name and case insensitive filesystem */
public class C21850zQ {
    public long A00;
    public C33021g4 A01;
    public C21660z7 A02;
    public C21780zJ A03;
    public AnonymousClass0VM A04;
    public AnonymousClass0VO A05;
    public C07050Vs A06;
    public AnonymousClass104 A07;
    public final C21630z4 A08;
    public final C22170zz A09;
    public volatile CameraDevice A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;

    public C21850zQ(C22170zz r2) {
        this.A09 = r2;
        this.A08 = new C21630z4(r2);
    }

    public Exception A00() {
        Exception e;
        Surface surface;
        this.A08.A01("Method stopVideoRecording() must be run on the background thread.");
        AnonymousClass104 r0 = this.A07;
        if (r0 != null) {
            try {
                r0.AQI();
                e = null;
            } catch (Exception e2) {
                e = e2;
            }
            this.A07 = null;
        } else {
            e = null;
        }
        C21780zJ r2 = this.A03;
        if (r2 != null) {
            r2.A0I.A01("Can only stop video recording on the Optic thread");
            C21630z4 r1 = r2.A0I;
            r1.A01("Can only check if the prepared on the Optic thread");
            if (r1.A00) {
                CaptureRequest.Builder builder = r2.A03;
                if (!(builder == null || (surface = r2.A06) == null)) {
                    builder.removeTarget(surface);
                }
                r2.A06 = null;
            }
        }
        this.A06 = null;
        this.A0C = false;
        this.A0B = false;
        return e;
    }
}
