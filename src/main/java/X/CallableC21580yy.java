package X;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.0yy  reason: invalid class name and case insensitive filesystem */
public class CallableC21580yy implements Callable {
    public final /* synthetic */ C33171gJ A00;
    public final /* synthetic */ C33261gS A01;
    public final /* synthetic */ String A02;

    public CallableC21580yy(C33171gJ r1, String str, C33261gS r3) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r3;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        CameraManager cameraManager = this.A00.A0L;
        String str = this.A02;
        C33261gS r1 = this.A01;
        cameraManager.openCamera(str, r1, (Handler) null);
        return r1;
    }
}
