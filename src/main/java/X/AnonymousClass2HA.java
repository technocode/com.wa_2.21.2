package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2HA  reason: invalid class name */
public class AnonymousClass2HA implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass2HD A00;

    public AnonymousClass2HA(AnonymousClass2HD r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        int[] iArr = new int[2];
        AnonymousClass2HD r3 = this.A00;
        View view = r3.A07;
        view.getLocationOnScreen(iArr);
        if (!r3.isShowing()) {
            r3.A04();
        } else if (r3.A01 != iArr[0]) {
            r3.A04();
            view.post(new RunnableEBaseShape8S0100000_I1_3(this, 45));
        }
    }
}
