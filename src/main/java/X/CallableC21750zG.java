package X;

import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.0zG  reason: invalid class name and case insensitive filesystem */
public class CallableC21750zG implements Callable {
    public final /* synthetic */ C21780zJ A00;
    public final /* synthetic */ List A01;

    public CallableC21750zG(C21780zJ r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C21780zJ r4 = this.A00;
        CameraDevice cameraDevice = r4.A02;
        C33321gY r0 = r4.A09;
        List<Surface> list = this.A01;
        if (r0 != null) {
            C33281gU r02 = r4.A0M;
            cameraDevice.createCaptureSession(list, r02, null);
            return r02;
        }
        throw null;
    }
}
