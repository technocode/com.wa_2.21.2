package X;

import java.util.concurrent.Callable;

/* renamed from: X.0yz  reason: invalid class name and case insensitive filesystem */
public class CallableC21590yz implements Callable {
    public final /* synthetic */ C33171gJ A00;

    public CallableC21590yz(C33171gJ r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33171gJ r1 = this.A00;
        if (!r1.A0X.A06.A00.isEmpty()) {
            return null;
        }
        C21780zJ r3 = r1.A0W;
        if (!r3.A0P) {
            return null;
        }
        r3.A0N.A06(new CallableC21740zF(r3, false, false), "restart_preview_on_background_thread");
        return null;
    }
}
