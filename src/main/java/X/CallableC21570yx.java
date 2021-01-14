package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.0yx  reason: invalid class name and case insensitive filesystem */
public class CallableC21570yx implements Callable {
    public final /* synthetic */ C33171gJ A00;

    public CallableC21570yx(C33171gJ r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        C21780zJ r3 = this.A00.A0W;
        C21630z4 r1 = r3.A0I;
        r1.A01("Can only check if is retrieving preview frames from the Optic thread");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00 && r3.A0Q) {
            return null;
        }
        try {
            r3.A08(true, false);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            StringBuilder A0S = AnonymousClass008.A0S("Could not start preview: ");
            A0S.append(e.getMessage());
            throw new C21620z2(A0S.toString());
        }
    }
}
