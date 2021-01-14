package X;

import android.hardware.camera2.CameraDevice;
import com.whatsapp.util.Log;

/* renamed from: X.2EH  reason: invalid class name */
public class AnonymousClass2EH extends CameraDevice.StateCallback {
    public final /* synthetic */ AnonymousClass2Wh A00;

    public AnonymousClass2EH(AnonymousClass2Wh r1) {
        this.A00 = r1;
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        this.A00.A0K();
    }

    public void onError(CameraDevice cameraDevice, int i) {
        AnonymousClass2Wh r0 = this.A00;
        r0.A0K();
        r0.A0N(i);
    }

    public void onOpened(CameraDevice cameraDevice) {
        AnonymousClass2Wh r1 = this.A00;
        synchronized (r1) {
            if (r1.A06 != null) {
                Log.i("cameraview/camera-opened");
                r1.A07 = cameraDevice;
                r1.A0M();
            } else {
                Log.i("cameraview/camera-opened-but-no-longer-needed");
                cameraDevice.close();
            }
        }
    }
}
