package X;

import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.util.Log;

/* renamed from: X.2Wp  reason: invalid class name and case insensitive filesystem */
public class C50922Wp implements AbstractC19840vh {
    public final /* synthetic */ LiteCameraView A00;

    public C50922Wp(LiteCameraView liteCameraView) {
        this.A00 = liteCameraView;
    }

    @Override // X.AbstractC19840vh
    public void AJ9(C07060Vt r2) {
        Log.d("LiteCamera/onRecordingEnded");
    }

    @Override // X.AbstractC19840vh
    public void AJA(Exception exc) {
        StringBuilder sb = new StringBuilder("LiteCamera/onRecordingError: ");
        sb.append(exc);
        Log.d(sb.toString());
        AnonymousClass2E5 r1 = this.A00.A00;
        if (r1 != null) {
            ((AnonymousClass2WY) r1).A02(4);
        }
    }

    @Override // X.AbstractC19840vh
    public void AJB(C07060Vt r2) {
        Log.d("LiteCamera/onRecordingStarted");
        AnonymousClass2E5 r0 = this.A00.A00;
        if (r0 != null) {
            ((AnonymousClass2WY) r0).A01();
        }
    }
}
