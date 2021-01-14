package X;

import android.graphics.SurfaceTexture;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;

/* renamed from: X.39y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C677239y implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ VoipPhysicalCamera A00;

    public /* synthetic */ C677239y(VoipPhysicalCamera voipPhysicalCamera) {
        this.A00 = voipPhysicalCamera;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00.lambda$createTexture$2769$VoipPhysicalCamera(surfaceTexture);
    }
}
