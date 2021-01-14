package X;

import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import org.pjsip.PjCamera;

/* renamed from: X.3UZ  reason: invalid class name */
public class AnonymousClass3UZ implements AnonymousClass3AE {
    @Override // X.AnonymousClass3AE
    public void ADl(VoipPhysicalCamera voipPhysicalCamera, int i) {
        if (this instanceof C74393an) {
            VoipCameraManager voipCameraManager = ((C74393an) this).A00;
            int i2 = 2;
            if (voipPhysicalCamera instanceof PjCamera) {
                i2 = 1;
            }
            VoipCameraManager.clearStoredRawCameraInfo(voipCameraManager, i, i2);
        }
    }

    @Override // X.AnonymousClass3AE
    public void AEG(VoipPhysicalCamera voipPhysicalCamera) {
        if (this instanceof C74393an) {
            VoipCameraManager.closeCurrentCamera(((C74393an) this).A00, voipPhysicalCamera);
        }
    }

    @Override // X.AnonymousClass3AE
    public void AFm(VoipPhysicalCamera voipPhysicalCamera) {
        if (this instanceof C74373al) {
            ((C74373al) this).A00.A0E.sendEmptyMessage(11);
        }
    }

    @Override // X.AnonymousClass3AE
    public void AJz(VoipPhysicalCamera voipPhysicalCamera) {
        if (this instanceof C74373al) {
            ((C74373al) this).A00.A0E.sendEmptyMessage(12);
        }
    }

    @Override // X.AnonymousClass3AE
    public void ALR(VoipPhysicalCamera voipPhysicalCamera) {
        if (this instanceof C74373al) {
            ((C74373al) this).A00.A0E.sendEmptyMessage(12);
        }
    }
}
