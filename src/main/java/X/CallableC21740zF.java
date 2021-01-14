package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.0zF  reason: invalid class name and case insensitive filesystem */
public class CallableC21740zF implements Callable {
    public final /* synthetic */ C21780zJ A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public CallableC21740zF(C21780zJ r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        try {
            this.A00.A08(this.A01, this.A02);
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
