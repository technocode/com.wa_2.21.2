package X;

import com.whatsapp.camera.litecamera.LiteCameraView;

/* renamed from: X.1et  reason: invalid class name and case insensitive filesystem */
public class C32401et {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC32431ew A00;

    public C32401et(TextureView$SurfaceTextureListenerC32431ew r1) {
        this.A00 = r1;
    }

    public void A00() {
        AbstractC19830vg r2 = this.A00.A07;
        if (r2 != null) {
            C50912Wo r22 = (C50912Wo) r2;
            r22.A00.A0D.A02("LiteCamera");
            LiteCameraView liteCameraView = r22.A00;
            if (!liteCameraView.A05 || liteCameraView.AB5()) {
                liteCameraView.A0C.A00();
                return;
            }
            TextureView$SurfaceTextureListenerC32431ew r23 = liteCameraView.A0B;
            AnonymousClass2EV r1 = liteCameraView.A0C;
            r23.A03(r1.A01);
            if (!r1.A08) {
                r1.A03.A02();
                r1.A08 = true;
            }
        }
    }
}
