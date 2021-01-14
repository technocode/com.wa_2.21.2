package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.3A1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3A1 implements Callable {
    public final /* synthetic */ VoipPhysicalCamera A00;

    public /* synthetic */ AnonymousClass3A1(VoipPhysicalCamera voipPhysicalCamera) {
        this.A00 = voipPhysicalCamera;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.A00.lambda$stop$2765$VoipPhysicalCamera();
    }
}
