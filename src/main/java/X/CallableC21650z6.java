package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.0z6  reason: invalid class name and case insensitive filesystem */
public class CallableC21650z6 implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C21660z7 A01;
    public final /* synthetic */ C33251gR A02;

    public CallableC21650z6(C21660z7 r1, C33251gR r2, CaptureRequest.Builder builder) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = builder;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C21660z7 r4 = this.A01;
        r4.A09.A00("Cannot schedule reset focus task, not prepared");
        if (r4.A03.A00.isConnected()) {
            r4.A0B = false;
            r4.A00();
            EnumC21130yE r2 = EnumC21130yE.CANCELLED;
            if (r4.A02 != null) {
                AnonymousClass100.A00(new RunnableEBaseShape2S0300000_I1(r4, null, r2, 4));
            }
            C33251gR r1 = this.A02;
            if (r1 != null) {
                r1.A03 = null;
            }
            try {
                r4.A02(this.A00, r1);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
