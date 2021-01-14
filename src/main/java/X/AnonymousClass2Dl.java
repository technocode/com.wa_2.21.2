package X;

import android.hardware.Camera;

/* renamed from: X.2Dl  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Dl implements Camera.ShutterCallback {
    public final /* synthetic */ AnonymousClass2WW A00;

    public /* synthetic */ AnonymousClass2Dl(AnonymousClass2WW r1) {
        this.A00 = r1;
    }

    public final void onShutter() {
        AnonymousClass2WW r3 = this.A00;
        AnonymousClass02M r2 = r3.A00.A0s;
        r2.A02.post(new RunnableEBaseShape8S0100000_I1_3(r3, 5));
    }
}
