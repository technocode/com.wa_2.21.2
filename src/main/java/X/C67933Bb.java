package X;

import android.hardware.Camera;
import org.pjsip.PjCamera;

/* renamed from: X.3Bb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67933Bb implements Camera.ErrorCallback {
    public final /* synthetic */ PjCamera A00;

    public /* synthetic */ C67933Bb(PjCamera pjCamera) {
        this.A00 = pjCamera;
    }

    public final void onError(int i, Camera camera) {
        this.A00.lambda$startOnCameraThread$2840$PjCamera(i, camera);
    }
}
