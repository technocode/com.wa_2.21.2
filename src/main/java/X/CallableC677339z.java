package X;

import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.39z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC677339z implements Callable {
    public final /* synthetic */ VoipCamera A00;
    public final /* synthetic */ VoipPhysicalCamera A01;

    public /* synthetic */ CallableC677339z(VoipPhysicalCamera voipPhysicalCamera, VoipCamera voipCamera) {
        this.A01 = voipPhysicalCamera;
        this.A00 = voipCamera;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.A01.lambda$unregisterVirtualCamera$2768$VoipPhysicalCamera(this.A00);
    }
}
