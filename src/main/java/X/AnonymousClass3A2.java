package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.3A2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3A2 implements Callable {
    public final /* synthetic */ VoipPhysicalCamera A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass3A2(VoipPhysicalCamera voipPhysicalCamera, boolean z) {
        this.A00 = voipPhysicalCamera;
        this.A01 = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.A00.lambda$close$2766$VoipPhysicalCamera(this.A01);
    }
}
