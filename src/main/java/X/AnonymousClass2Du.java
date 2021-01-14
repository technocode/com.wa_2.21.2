package X;

import android.hardware.Camera;
import com.whatsapp.util.Log;

/* renamed from: X.2Du  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Du implements Camera.PictureCallback {
    public final /* synthetic */ AnonymousClass2WW A00;
    public final /* synthetic */ SurfaceHolder$CallbackC50852Wi A01;

    public /* synthetic */ AnonymousClass2Du(SurfaceHolder$CallbackC50852Wi r1, AnonymousClass2WW r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        SurfaceHolder$CallbackC50852Wi r4 = this.A01;
        AnonymousClass2WW r3 = this.A00;
        AnonymousClass008.A1a(AnonymousClass008.A0S("cameraview/take-picture taken "), r4.A0M);
        try {
            r4.A07.stopPreview();
            r4.A0L = false;
        } catch (Exception e) {
            Log.w("cameraview/take-picture error stopping camera preview", e);
        }
        r4.A0P = false;
        r3.A00(bArr, r4.A0M);
    }
}
