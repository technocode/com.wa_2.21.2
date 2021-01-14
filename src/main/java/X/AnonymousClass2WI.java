package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2WI  reason: invalid class name */
public class AnonymousClass2WI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C58762mT A00;

    public AnonymousClass2WI(C58762mT r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        C58762mT r4 = this.A00;
        View view = (View) ((AnonymousClass1MI) r4).A03;
        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (!r4.isShowing()) {
            r4.showAtLocation(view, 48, 0, 1000000);
        }
    }
}
