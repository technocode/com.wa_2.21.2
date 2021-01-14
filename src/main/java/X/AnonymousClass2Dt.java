package X;

import android.hardware.Camera;

/* renamed from: X.2Dt  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Dt implements Camera.PreviewCallback {
    public final /* synthetic */ SurfaceHolder$CallbackC50852Wi A00;

    public /* synthetic */ AnonymousClass2Dt(SurfaceHolder$CallbackC50852Wi r1) {
        this.A00 = r1;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        this.A00.A0U.A02("cameraView1");
    }
}
