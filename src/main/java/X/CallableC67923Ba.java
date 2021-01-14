package X;

import java.util.concurrent.Callable;
import org.pjsip.PjCamera;

/* renamed from: X.3Ba  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC67923Ba implements Callable {
    public final /* synthetic */ PjCamera A00;

    public /* synthetic */ CallableC67923Ba(PjCamera pjCamera) {
        this.A00 = pjCamera;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(PjCamera.updatePreviewOrientationOnCameraThread(this.A00));
    }
}
