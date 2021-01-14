package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.2EI  reason: invalid class name */
public class AnonymousClass2EI extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ AnonymousClass2Wh A00;

    public AnonymousClass2EI(AnonymousClass2Wh r1) {
        this.A00 = r1;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        AnonymousClass2Wh r1 = this.A00;
        r1.A0R(totalCaptureResult);
        if (r1.A0X) {
            AnonymousClass2EQ r3 = r1.A0d;
            Object obj = totalCaptureResult.get(TotalCaptureResult.SENSOR_TIMESTAMP);
            if (obj != null) {
                long longValue = ((Number) obj).longValue();
                synchronized (r3) {
                    if (r3.A00 && r3.A01) {
                        r3.A00(longValue).A00 = totalCaptureResult;
                        r3.A02();
                        return;
                    }
                    return;
                }
            }
            throw null;
        }
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.A00.A0R(captureResult);
    }
}
