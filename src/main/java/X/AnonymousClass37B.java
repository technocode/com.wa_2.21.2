package X;

import android.webkit.JavascriptInterface;

/* renamed from: X.37B  reason: invalid class name */
public class AnonymousClass37B {
    public final /* synthetic */ C72463Sy A00;

    public AnonymousClass37B(C72463Sy r1) {
        this.A00 = r1;
    }

    @JavascriptInterface
    public void postPlayerEvent(int i, int i2) {
        if (i2 >= 0 && i2 < 2147483) {
            AnonymousClass02M r2 = this.A00.A0B;
            r2.A02.post(new RunnableEBaseShape0S0102000_I1(this, i2, i, 4));
        }
    }
}
