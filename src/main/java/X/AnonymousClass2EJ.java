package X;

import android.hardware.camera2.CameraCaptureSession;
import com.whatsapp.util.Log;

/* renamed from: X.2EJ  reason: invalid class name */
public class AnonymousClass2EJ extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ AnonymousClass2Wh A00;

    public AnonymousClass2EJ(AnonymousClass2Wh r1) {
        this.A00 = r1;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Log.e("cameraview/start-video-capture/create-camera-video-session/configure-failed");
        AnonymousClass2Wh r1 = this.A00;
        r1.A0L();
        r1.A0N(3);
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass2Wh.A0D(this.A00, cameraCaptureSession);
    }
}
