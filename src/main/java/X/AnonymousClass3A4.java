package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.3A4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3A4 implements Callable {
    public final /* synthetic */ VoipPhysicalCamera A00;

    public /* synthetic */ AnonymousClass3A4(VoipPhysicalCamera voipPhysicalCamera) {
        this.A00 = voipPhysicalCamera;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(this.A00.startOnCameraThread());
    }
}
