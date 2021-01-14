package X;

import android.hardware.camera2.CameraCaptureSession;
import com.whatsapp.util.Log;

/* renamed from: X.2EK  reason: invalid class name */
public class AnonymousClass2EK extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ AnonymousClass2Wh A00;

    public AnonymousClass2EK(AnonymousClass2Wh r1) {
        this.A00 = r1;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Log.e("cameraview/create-camera-preview-session/configure-failed");
        this.A00.A0N(3);
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.A00.A0Q(cameraCaptureSession);
    }
}
