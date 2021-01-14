package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.whatsapp.util.Log;

/* renamed from: X.2EL  reason: invalid class name */
public class AnonymousClass2EL extends CameraCaptureSession.CaptureCallback {
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        StringBuilder A0S = AnonymousClass008.A0S("cameraview/capture-complete af-state:");
        A0S.append(AnonymousClass2Wh.A08((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE)));
        A0S.append(" ae-state:");
        A0S.append(AnonymousClass2Wh.A07((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE)));
        A0S.append(" flash-state:");
        A0S.append(AnonymousClass2Wh.A09((Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE)));
        Log.d(A0S.toString());
    }
}
