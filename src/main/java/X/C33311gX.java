package X;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageReader;

/* renamed from: X.1gX  reason: invalid class name and case insensitive filesystem */
public class C33311gX extends CameraCaptureSession.CaptureCallback implements AbstractC22140zw {
    public final ImageReader.OnImageAvailableListener A00 = new C21890zV(this);
    public final AbstractC21870zT A01 = new C33301gW(this);
    public final C21880zU A02;
    public volatile C21620z2 A03;
    public volatile Boolean A04;
    public volatile byte[] A05;

    public C33311gX() {
        C21880zU r2 = new C21880zU();
        this.A02 = r2;
        r2.A01 = this.A01;
        r2.A02(10000);
    }

    @Override // X.AbstractC22140zw
    public void A2I() {
        this.A02.A00();
    }

    @Override // X.AbstractC22140zw
    public Object A8p() {
        if (this.A04 == null) {
            throw new IllegalStateException("Photo capture operation hasn't completed yet.");
        } else if (this.A04.booleanValue()) {
            return this.A05;
        } else {
            throw this.A03;
        }
    }
}
