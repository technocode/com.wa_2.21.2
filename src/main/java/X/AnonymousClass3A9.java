package X;

import android.hardware.camera2.CameraDevice;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.3A9  reason: invalid class name */
public class AnonymousClass3A9 extends CameraDevice.StateCallback {
    public final /* synthetic */ C72733Ua A00;

    public AnonymousClass3A9(C72733Ua r1) {
        this.A00 = r1;
    }

    public void onClosed(CameraDevice cameraDevice) {
        C72733Ua r2 = this.A00;
        r2.A00 = 0;
        Log.i("voip/video/VoipCamera/ cameraDevice closed");
        if (r2.A08) {
            r2.A08 = false;
            if (r2.startOnCameraThread() != 0) {
                r2.cameraEventsDispatcher.A00();
            }
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        C72733Ua r1 = this.A00;
        if (cameraDevice == r1.A03) {
            Log.i("voip/video/VoipCamera/ cameraDevice disconnected");
            r1.stopPeriodicCameraCallbackCheck();
            AnonymousClass3AD r3 = r1.cameraEventsDispatcher;
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                ((AnonymousClass3AE) it.next()).AFm(r3.A01);
            }
        }
    }

    public void onError(CameraDevice cameraDevice, int i) {
        AnonymousClass008.A0v("voip/video/VoipCamera/ cameraDevice error ", i);
        this.A00.cameraEventsDispatcher.A00();
    }

    public void onOpened(CameraDevice cameraDevice) {
        Log.i("voip/video/VoipCamera/ camera opened");
        C72733Ua r1 = this.A00;
        r1.A00 = 2;
        r1.A03 = cameraDevice;
        if (r1.videoPort != null && r1.A01() != 0) {
            r1.cameraEventsDispatcher.A00();
        }
    }
}
