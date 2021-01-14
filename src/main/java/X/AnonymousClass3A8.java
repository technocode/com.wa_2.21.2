package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Arrays;

/* renamed from: X.3A8  reason: invalid class name */
public class AnonymousClass3A8 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C72733Ua A01;

    public AnonymousClass3A8(C72733Ua r1, CaptureRequest.Builder builder) {
        this.A01 = r1;
        this.A00 = builder;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Log.i("voip/video/VoipCamera/ cameraDevice configure failed");
        this.A01.cameraEventsDispatcher.A00();
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C72733Ua r2 = this.A01;
        if (r2.A03 == null) {
            Log.i("voip/video/VoipCamera/ cameraDevice configured, but device is null");
            r2.cameraEventsDispatcher.A00();
            return;
        }
        Log.i("voip/video/VoipCamera/ cameraDevice configured");
        CaptureRequest.Builder builder = this.A00;
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
        builder.set(CaptureRequest.FLASH_MODE, 0);
        Range[] rangeArr = (Range[]) r2.A0A.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            int i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Range range = null;
            for (Range range2 : rangeArr) {
                int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(((Number) range2.getLower()).intValue() * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, ((Number) range2.getUpper()).intValue() * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, r2.A0F.A01);
                StringBuilder A0S = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread check fps [");
                A0S.append(range2.getLower());
                A0S.append(", ");
                A0S.append(range2.getUpper());
                A0S.append("], score: ");
                A0S.append(fpsRangeScore);
                Log.i(A0S.toString());
                if (fpsRangeScore > i) {
                    range = range2;
                    i = fpsRangeScore;
                }
            }
            if (range != null) {
                StringBuilder A0S2 = AnonymousClass008.A0S("voip/video/VoipCamera/startOnCameraThread with fps range [");
                A0S2.append(range.getLower());
                A0S2.append(", ");
                A0S2.append(range.getUpper());
                A0S2.append("], score: ");
                A0S2.append(i);
                A0S2.append(", supported ranges : ");
                A0S2.append(Arrays.toString(rangeArr));
                Log.i(A0S2.toString());
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            }
        }
        r2.A02 = cameraCaptureSession;
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), null, r2.cameraThreadHandler);
            r2.startPeriodicCameraCallbackCheck();
        } catch (CameraAccessException unused) {
            Log.i("voip/video/VoipCamera/ failed to start preview");
            r2.cameraEventsDispatcher.A00();
        }
    }
}
