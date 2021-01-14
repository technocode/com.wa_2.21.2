package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.0zH  reason: invalid class name and case insensitive filesystem */
public class CallableC21760zH implements Callable {
    public final /* synthetic */ C21780zJ A00;
    public final /* synthetic */ C33291gV A01;

    public CallableC21760zH(C21780zJ r1, C33291gV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C21780zJ r1 = this.A00;
        if (r1.A00 != null) {
            CaptureRequest.Builder builder = r1.A03;
        }
        C33291gV r12 = this.A01;
        r12.A00.A01();
        return r12;
    }
}
