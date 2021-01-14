package X;

import android.hardware.camera2.CameraCaptureSession;
import android.media.MediaRecorder;
import android.view.Surface;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1gH  reason: invalid class name and case insensitive filesystem */
public class C33151gH implements AbstractC21160yH {
    public final /* synthetic */ C33171gJ A00;

    public C33151gH(C33171gJ r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC21160yH
    public void AK3(MediaRecorder mediaRecorder) {
        mediaRecorder.setVideoSource(2);
    }

    @Override // X.AbstractC21160yH
    public void AKL(MediaRecorder mediaRecorder) {
        Surface surface;
        C33171gJ r2 = this.A00;
        r2.A0b.A04("Method onStartMediaRecorder() must run on the Optic Background Thread.");
        C21780zJ r4 = r2.A0W;
        C21630z4 r1 = r4.A0I;
        r1.A01("Can only check if the prepared on the Optic thread");
        if (!r1.A00) {
            C22100zr.A02("Camera2Device", "Can not start video recording, PreviewController is not prepared");
            return;
        }
        r2.A0Y.A0B = true;
        Surface surface2 = mediaRecorder.getSurface();
        r1.A00("Cannot start video recording.");
        if (r4.A03 == null || (surface = r4.A05) == null) {
            throw new IllegalStateException("Cannot start video recording, preview closed.");
        }
        r4.A06 = surface2;
        List asList = Arrays.asList(surface, surface2);
        CameraCaptureSession cameraCaptureSession = r4.A00;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
        }
        r4.A00 = r4.A02(asList, "record_video_on_camera_thread");
        r4.A03.addTarget(surface2);
        C33251gR r12 = r4.A08;
        r12.A0C = 7;
        r12.A07 = Boolean.TRUE;
        r12.A02 = null;
        r4.A06(false);
        r4.A07(true, "Preview session was closed while starting recording.");
    }
}
