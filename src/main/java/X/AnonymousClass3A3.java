package X;

import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.3A3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3A3 implements Callable {
    public final /* synthetic */ VideoPort A00;
    public final /* synthetic */ VoipPhysicalCamera A01;

    public /* synthetic */ AnonymousClass3A3(VoipPhysicalCamera voipPhysicalCamera, VideoPort videoPort) {
        this.A01 = voipPhysicalCamera;
        this.A00 = videoPort;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.A01.lambda$setVideoPort$2764$VoipPhysicalCamera(this.A00);
    }
}
