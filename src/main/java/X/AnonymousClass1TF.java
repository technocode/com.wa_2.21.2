package X;

import android.hardware.Camera;
import java.io.File;

/* renamed from: X.1TF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1TF implements Camera.PictureCallback {
    public final /* synthetic */ AnonymousClass05q A00;
    public final /* synthetic */ C43081xl A01;
    public final /* synthetic */ C46472Ap A02;

    public /* synthetic */ AnonymousClass1TF(C43081xl r1, AnonymousClass05q r2, C46472Ap r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C43081xl r4 = this.A01;
        AnonymousClass05q r5 = this.A00;
        C46472Ap r14 = this.A02;
        if (bArr == null) {
            AnonymousClass02M r2 = r4.A0G;
            r2.A02.post(new RunnableEBaseShape8S0100000_I1_3(r4, 2));
            return;
        }
        File A002 = C43081xl.A00(r4.A0A, false);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(r4.A00, cameraInfo);
        AnonymousClass00T r1 = r4.A0H;
        boolean z = false;
        if (cameraInfo.facing == 1) {
            z = true;
        }
        r1.ANC(new C10990fX(r4, r5, bArr, z, A002, r4.A0A, r4.A02, r4.A03, r4.A08, r4.A01, r14), new Void[0]);
    }
}
