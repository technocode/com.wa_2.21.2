package X;

import android.graphics.Rect;
import java.util.concurrent.Callable;

/* renamed from: X.0yR  reason: invalid class name and case insensitive filesystem */
public class CallableC21250yR implements Callable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C33081gA A01;

    public CallableC21250yR(C33081gA r1, Rect rect) {
        this.A01 = r1;
        this.A00 = rect;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r2 = this.A01;
        if (r2.isConnected() && ((Boolean) r2.A5B().A00(AnonymousClass0VO.A0F)).booleanValue()) {
            C33331gZ A002 = r2.A0P.A00(r2.A06);
            Rect rect = this.A00;
            if (A002 != null) {
                ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0V, C21990zf.A04(rect));
                A002.A00();
            } else {
                throw null;
            }
        }
        return null;
    }
}
