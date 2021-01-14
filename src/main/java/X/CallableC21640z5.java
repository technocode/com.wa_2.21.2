package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.0z5  reason: invalid class name and case insensitive filesystem */
public class CallableC21640z5 implements Callable {
    public final /* synthetic */ CameraCaptureSession A00;
    public final /* synthetic */ CaptureRequest.Builder A01;
    public final /* synthetic */ C33251gR A02;

    public CallableC21640z5(CameraCaptureSession cameraCaptureSession, CaptureRequest.Builder builder, C33251gR r3) {
        this.A00 = cameraCaptureSession;
        this.A01 = builder;
        this.A02 = r3;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        CaptureRequest.Builder builder;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (cameraCaptureSession == null || (builder = this.A01) == null) {
            return this.A02;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        CaptureRequest build = builder.build();
        C33251gR r1 = this.A02;
        cameraCaptureSession.capture(build, r1, null);
        return r1;
    }
}
