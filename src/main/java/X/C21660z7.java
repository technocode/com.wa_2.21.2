package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.FutureTask;

/* renamed from: X.0z7  reason: invalid class name and case insensitive filesystem */
public class C21660z7 {
    public CameraDevice A00;
    public CameraManager A01;
    public AbstractC21140yF A02;
    public C33121gE A03;
    public C21780zJ A04;
    public C21860zR A05;
    public AnonymousClass0VM A06;
    public AnonymousClass0VO A07;
    public FutureTask A08;
    public final C21630z4 A09;
    public final C22170zz A0A;
    public volatile boolean A0B;

    public C21660z7(C22170zz r2) {
        this.A0A = r2;
        this.A09 = new C21630z4(r2);
    }

    public synchronized void A00() {
        FutureTask futureTask = this.A08;
        if (futureTask != null) {
            this.A0A.A07(futureTask);
            this.A08 = null;
        }
    }

    public synchronized void A01(long j, CaptureRequest.Builder builder, C33251gR r7) {
        CallableC21650z6 r2 = new CallableC21650z6(this, r7, builder);
        A00();
        this.A08 = this.A0A.A00(r2, "reset_focus", j);
    }

    public void A02(CaptureRequest.Builder builder, C33251gR r8) {
        C21860zR r1;
        CameraCaptureSession cameraCaptureSession;
        this.A09.A01("Can only reset focus on the Optic thread.");
        C21780zJ r2 = this.A04;
        if (r2 != null && (r1 = this.A05) != null && builder != null && this.A07 != null && (cameraCaptureSession = r2.A00) != null) {
            Rect rect = r1.A00;
            MeteringRectangle[] A022 = r1.A02(r1.A07);
            C21860zR r12 = this.A05;
            C21780zJ.A00(builder, rect, A022, r12.A02(r12.A06), this.A07);
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            cameraCaptureSession.capture(builder.build(), r8, null);
            int A092 = AnonymousClass0N2.A09(this.A01, this.A00.getId(), builder, this.A06, this.A07);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 0);
            cameraCaptureSession.setRepeatingRequest(builder.build(), r8, null);
            if (A092 == 1) {
                builder.set(key, 1);
                cameraCaptureSession.capture(builder.build(), r8, null);
                builder.set(key, 0);
            }
        }
    }
}
