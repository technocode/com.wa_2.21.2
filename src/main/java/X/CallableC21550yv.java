package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.Callable;

/* renamed from: X.0yv  reason: invalid class name and case insensitive filesystem */
public class CallableC21550yv implements Callable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C33171gJ A01;

    public CallableC21550yv(C33171gJ r1, Rect rect) {
        this.A01 = r1;
        this.A00 = rect;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C21780zJ r0;
        CameraCaptureSession cameraCaptureSession;
        Rect rect = this.A00;
        float[] fArr = {(float) rect.centerX(), (float) rect.centerY()};
        C33171gJ r3 = this.A01;
        if (r3.A03 != null) {
            Matrix matrix = new Matrix();
            r3.A03.invert(matrix);
            matrix.mapPoints(fArr);
        }
        C21660z7 r5 = r3.A0U;
        CaptureRequest.Builder builder = r3.A05;
        C33321gY r7 = r3.A0A;
        C33251gR r32 = r3.A0h;
        C21630z4 r1 = r5.A09;
        r1.A01("Cannot perform focus, not on Optic thread.");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (!r1.A00 || !r5.A03.A00.isConnected() || (r0 = r5.A04) == null || !r0.A0P || builder == null || r32 == null || !((Boolean) r5.A07.A00(AnonymousClass0VO.A0E)).booleanValue() || r7 == null || (cameraCaptureSession = r5.A04.A00) == null) {
            return null;
        }
        r5.A00();
        EnumC21130yE r11 = EnumC21130yE.FOCUSING;
        if (r5.A02 != null) {
            AnonymousClass100.A00(new RunnableEBaseShape2S0300000_I1(r5, fArr, r11, 4));
        }
        MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(r5.A05.A01(rect), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)};
        r32.A03 = new C33191gL(r5, r32, fArr, builder);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        r5.A0B = true;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        builder.set(key, 2);
        cameraCaptureSession.capture(builder.build(), r32, null);
        builder.set(key, 0);
        cameraCaptureSession.setRepeatingRequest(builder.build(), r32, null);
        builder.set(key, 1);
        cameraCaptureSession.capture(builder.build(), r32, null);
        r5.A01(4000, builder, r32);
        return null;
    }
}
