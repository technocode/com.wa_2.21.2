package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;

/* renamed from: X.1gR  reason: invalid class name and case insensitive filesystem */
public class C33251gR extends CameraCaptureSession.CaptureCallback implements AbstractC22140zw {
    public static final int[] A0G = new int[18];
    public CameraCaptureSession A00;
    public C33141gG A01;
    public C21620z2 A02;
    public C33191gL A03;
    public C33231gP A04;
    public AnonymousClass0zS A05;
    public C22050zl A06;
    public Boolean A07;
    public Integer A08;
    public Long A09;
    public final AbstractC21870zT A0A = new C33241gQ(this);
    public final C21880zU A0B;
    public volatile int A0C = 0;
    public volatile boolean A0D;
    public volatile boolean A0E = true;
    public volatile boolean A0F;

    public C33251gR() {
        C21880zU r1 = new C21880zU();
        this.A0B = r1;
        r1.A01 = this.A0A;
    }

    public final void A00(CameraCaptureSession cameraCaptureSession) {
        if (this.A0C == 1) {
            this.A0C = 0;
            this.A07 = Boolean.TRUE;
            this.A00 = cameraCaptureSession;
            this.A0B.A01();
            AnonymousClass0zS r0 = this.A05;
            if (r0 != null) {
                r0.AIp();
                return;
            }
            return;
        }
        throw new RuntimeException("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
    }

    public final void A01(CameraCaptureSession cameraCaptureSession) {
        if (this.A0C == 7) {
            this.A0C = 0;
            this.A07 = Boolean.TRUE;
            this.A00 = cameraCaptureSession;
            this.A0B.A01();
            return;
        }
        throw new RuntimeException("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
    }

    @Override // X.AbstractC22140zw
    public void A2I() {
        this.A0B.A00();
    }

    @Override // X.AbstractC22140zw
    public Object A8p() {
        Boolean bool = this.A07;
        if (bool == null) {
            throw new IllegalStateException("Start Preview operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            return this.A00;
        } else {
            throw this.A02;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0200, code lost:
        if (r4.intValue() != 4) goto L_0x0202;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession r18, android.hardware.camera2.CaptureRequest r19, android.hardware.camera2.TotalCaptureResult r20) {
        /*
        // Method dump skipped, instructions count: 560
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33251gR.onCaptureCompleted(android.hardware.camera2.CameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        if (this.A0E) {
            if (this.A0C == 1 || this.A0C == 7) {
                this.A0C = 0;
                this.A07 = Boolean.FALSE;
                StringBuilder A0S = AnonymousClass008.A0S("Failed to start operation. Reason: ");
                A0S.append(captureFailure.getReason());
                this.A02 = new C21620z2(A0S.toString());
                if (this.A01 != null) {
                    captureFailure.getReason();
                }
                this.A0B.A01();
            }
        }
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        if (this.A0E) {
            if (this.A0C == 1) {
                A00(cameraCaptureSession);
            } else if (this.A0C == 7) {
                A01(cameraCaptureSession);
            }
        }
    }
}
