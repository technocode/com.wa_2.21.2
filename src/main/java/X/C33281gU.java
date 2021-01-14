package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.1gU  reason: invalid class name and case insensitive filesystem */
public class C33281gU extends CameraCaptureSession.StateCallback implements AbstractC22140zw {
    public final C33221gO A00;
    public final AbstractC21870zT A01 = new C33271gT(this);
    public final C21880zU A02;
    public volatile int A03 = 0;
    public volatile CameraCaptureSession A04;
    public volatile Boolean A05;

    public C33281gU(C33221gO r3) {
        this.A00 = r3;
        C21880zU r1 = new C21880zU();
        this.A02 = r1;
        r1.A01 = this.A01;
    }

    @Override // X.AbstractC22140zw
    public void A2I() {
        this.A02.A00();
    }

    @Override // X.AbstractC22140zw
    public Object A8p() {
        if (this.A05 == null) {
            throw new IllegalStateException("Configure Preview operation hasn't completed yet.");
        } else if (this.A05.booleanValue()) {
            return this.A04;
        } else {
            throw new C21620z2("Failed to configure preview.");
        }
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        C33221gO r1 = this.A00;
        if (r1 != null) {
            r1.A00.A0N.A01(new CallableC21720zD(r1), "camera_session_active", new AnonymousClass254());
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        if (this.A03 == 2) {
            this.A03 = 0;
            this.A05 = Boolean.TRUE;
            this.A04 = cameraCaptureSession;
            this.A02.A01();
        }
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        if (this.A03 == 1) {
            this.A03 = 0;
            this.A05 = Boolean.FALSE;
            this.A02.A01();
        }
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        if (this.A03 == 1) {
            this.A03 = 0;
            this.A05 = Boolean.TRUE;
            this.A04 = cameraCaptureSession;
            this.A02.A01();
        }
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        if (this.A03 == 3) {
            this.A03 = 0;
            this.A05 = Boolean.TRUE;
            this.A04 = cameraCaptureSession;
            this.A02.A01();
        }
    }
}
