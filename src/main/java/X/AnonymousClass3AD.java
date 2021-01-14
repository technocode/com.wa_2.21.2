package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3AD  reason: invalid class name */
public final class AnonymousClass3AD {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();
    public final /* synthetic */ VoipPhysicalCamera A01;

    public AnonymousClass3AD(VoipPhysicalCamera voipPhysicalCamera) {
        this.A01 = voipPhysicalCamera;
    }

    public void A00() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass3AE) it.next()).ALR(this.A01);
        }
    }
}
