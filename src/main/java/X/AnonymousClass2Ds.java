package X;

import android.hardware.Camera;

/* renamed from: X.2Ds  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Ds implements Camera.AutoFocusCallback {
    public final /* synthetic */ SurfaceHolder$CallbackC50852Wi A00;

    public /* synthetic */ AnonymousClass2Ds(SurfaceHolder$CallbackC50852Wi r1) {
        this.A00 = r1;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        SurfaceHolder$CallbackC50852Wi r1 = this.A00;
        AnonymousClass008.A1G("cameraview/on-auto-focus ", z);
        AnonymousClass2WY r3 = (AnonymousClass2WY) r1.A0H;
        AnonymousClass02M r2 = r3.A01.A0s;
        r2.A02.post(new RunnableEBaseShape1S0110000_I1(r3, z, 5));
    }
}
