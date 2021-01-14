package X;

import android.hardware.Camera;

/* renamed from: X.2yj  reason: invalid class name and case insensitive filesystem */
public class C64762yj implements Camera.PreviewCallback {
    public final /* synthetic */ AbstractActivityC29861aJ A00;

    public C64762yj(AbstractActivityC29861aJ r1) {
        this.A00 = r1;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.A00.A00.post(new RunnableEBaseShape9S0200000_I1_4(this, bArr, 5));
    }
}
