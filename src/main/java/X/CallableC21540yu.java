package X;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.Callable;

/* renamed from: X.0yu  reason: invalid class name and case insensitive filesystem */
public class CallableC21540yu implements Callable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C33171gJ A01;

    public CallableC21540yu(C33171gJ r1, Rect rect) {
        this.A01 = r1;
        this.A00 = rect;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        AnonymousClass0VO r1;
        C33171gJ r12 = this.A01;
        if (r12.isConnected()) {
            C21780zJ r3 = r12.A0W;
            C21630z4 r8 = r3.A0I;
            r8.A01("Can only check if the prepared on the Optic thread");
            if (r8.A00) {
                MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(r12.A0Z.A01(this.A00), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)};
                r8.A01("Can only perform spot metering on the Optic thread");
                r8.A01("Can only check if the prepared on the Optic thread");
                if (r8.A00 && r3.A0P && r3.A03 != null && r3.A00 != null && (r1 = r3.A0C) != null && ((Boolean) r1.A00(AnonymousClass0VO.A0F)).booleanValue()) {
                    if (r3.A09 != null) {
                        r3.A03.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
                        r3.A00.setRepeatingRequest(r3.A03.build(), null, null);
                    } else {
                        throw null;
                    }
                }
            }
        }
        return null;
    }
}
