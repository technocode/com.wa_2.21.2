package X;

import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.util.Log;

/* renamed from: X.2Wr  reason: invalid class name and case insensitive filesystem */
public class C50942Wr implements AbstractC19790vc {
    public final /* synthetic */ AnonymousClass2WW A00;
    public final /* synthetic */ LiteCameraView A01;

    public C50942Wr(LiteCameraView liteCameraView, AnonymousClass2WW r2) {
        this.A01 = liteCameraView;
        this.A00 = r2;
    }

    @Override // X.AbstractC19790vc
    public void ADt(Exception exc) {
        StringBuilder sb = new StringBuilder("LiteCamera/onCaptureError: ");
        sb.append(exc);
        Log.d(sb.toString());
        AnonymousClass2E5 r1 = this.A01.A00;
        if (r1 != null) {
            ((AnonymousClass2WY) r1).A02(3);
        }
    }

    @Override // X.AbstractC19790vc
    public void ADu() {
        Log.d("LiteCamera/onCaptureStarted");
        AnonymousClass2WW r3 = this.A00;
        AnonymousClass02M r2 = r3.A00.A0s;
        r2.A02.post(new RunnableEBaseShape8S0100000_I1_3(r3, 5));
    }

    @Override // X.AbstractC19790vc
    public void AIT(byte[] bArr, C19780vb r4) {
        Log.d("LiteCamera/onPhotoTaken");
        this.A00.A00(bArr, this.A01.AB5());
    }
}
