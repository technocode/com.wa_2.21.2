package X;

import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.3A0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3A0 implements Callable {
    public final /* synthetic */ VoipCamera A00;
    public final /* synthetic */ VoipPhysicalCamera A01;

    public /* synthetic */ AnonymousClass3A0(VoipPhysicalCamera voipPhysicalCamera, VoipCamera voipCamera) {
        this.A01 = voipPhysicalCamera;
        this.A00 = voipCamera;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.A01.lambda$registerVirtualCamera$2767$VoipPhysicalCamera(this.A00);
    }
}
