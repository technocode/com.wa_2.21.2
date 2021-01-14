package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import java.util.concurrent.Callable;

/* renamed from: X.0zA  reason: invalid class name and case insensitive filesystem */
public class CallableC21690zA implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ ImageReader A01;
    public final /* synthetic */ C21710zC A02;
    public final /* synthetic */ C33311gX A03;

    public CallableC21690zA(C21710zC r1, ImageReader imageReader, C33311gX r3, CaptureRequest.Builder builder) {
        this.A02 = r1;
        this.A01 = imageReader;
        this.A03 = r3;
        this.A00 = builder;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C21780zJ r0 = this.A02.A03;
        if (r0 != null) {
            CameraCaptureSession cameraCaptureSession = r0.A00;
            if (cameraCaptureSession != null) {
                ImageReader imageReader = this.A01;
                C33311gX r2 = this.A03;
                imageReader.setOnImageAvailableListener(r2.A00, null);
                cameraCaptureSession.capture(this.A00.build(), r2, null);
                return r2;
            }
            throw new C21620z2("Session closed while capturing photo.");
        }
        throw new C21620z2("Preview closed while capturing photo.");
    }
}
