package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.0zB  reason: invalid class name and case insensitive filesystem */
public class CallableC21700zB implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C21710zC A01;
    public final /* synthetic */ C33251gR A02;
    public final /* synthetic */ boolean A03;

    public CallableC21700zB(C21710zC r1, C33251gR r2, boolean z, CaptureRequest.Builder builder) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z;
        this.A00 = builder;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C21710zC r1 = this.A01;
        C21780zJ r0 = r1.A03;
        if (r0 == null || !r0.A0P) {
            return this.A02;
        }
        CameraCaptureSession cameraCaptureSession = r1.A03.A00;
        if (cameraCaptureSession == null) {
            return this.A02;
        }
        if (this.A03) {
            CaptureRequest.Builder builder = this.A00;
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            cameraCaptureSession.capture(builder.build(), this.A02, null);
        }
        CaptureRequest.Builder builder2 = this.A00;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        builder2.set(key, 0);
        CaptureRequest build = builder2.build();
        C33251gR r2 = this.A02;
        cameraCaptureSession.capture(build, r2, null);
        builder2.set(key, 1);
        cameraCaptureSession.capture(builder2.build(), r2, null);
        builder2.set(key, 0);
        cameraCaptureSession.setRepeatingRequest(builder2.build(), r2, null);
        return r2;
    }
}
