package X;

import android.hardware.Camera;
import java.util.concurrent.Callable;

/* renamed from: X.0yO  reason: invalid class name and case insensitive filesystem */
public class CallableC21220yO implements Callable {
    public final /* synthetic */ C33081gA A00;

    public CallableC21220yO(C33081gA r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r6 = this.A00;
        if (!r6.isConnected()) {
            return null;
        }
        C33101gC r5 = r6.A0N;
        Camera camera = r6.A0W;
        C21950zb r3 = r6.A0P;
        r5.A02(camera, (C07070Vu) r3.A02(r6.A06).A00(AnonymousClass0VN.A0e), ((Number) r3.A02(r6.A06).A00(AnonymousClass0VN.A0a)).intValue());
        return null;
    }
}
