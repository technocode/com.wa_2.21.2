package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.0zE  reason: invalid class name and case insensitive filesystem */
public class CallableC21730zE implements Callable {
    public final /* synthetic */ C21780zJ A00;

    public CallableC21730zE(C21780zJ r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C21770zI r0;
        C21780zJ r4 = this.A00;
        if (!r4.A0P) {
            return null;
        }
        List list = r4.A0O;
        if (list.isEmpty() || (r0 = (C21770zI) list.remove(0)) == null) {
            return null;
        }
        r4.A0N.A06(new CallableC21740zF(r4, r0.A00, r0.A01), "restart_preview_on_background_thread");
        return null;
    }
}
