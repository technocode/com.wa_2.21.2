package X;

import android.hardware.Camera;
import java.util.List;

/* renamed from: X.0yl  reason: invalid class name and case insensitive filesystem */
public class C21450yl implements Camera.PreviewCallback {
    public final /* synthetic */ C33101gC A00;

    public C21450yl(C33101gC r1) {
        this.A00 = r1;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (bArr != null) {
            C22120zu.A00().A01();
            C22070zn r4 = new C22070zn();
            C33101gC r3 = this.A00;
            int i = r3.A00;
            C07070Vu r0 = r3.A01;
            r4.A02(bArr, i, r0.A01, r0.A00);
            List list = r3.A05.A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC21150yG) list.get(i2)).AIn(r4);
            }
            camera.addCallbackBuffer(bArr);
        }
    }
}
