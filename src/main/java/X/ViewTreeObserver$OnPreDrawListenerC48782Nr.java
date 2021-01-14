package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2Nr  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC48782Nr implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C48802Nt A00;

    public ViewTreeObserver$OnPreDrawListenerC48782Nr(C48802Nt r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        C48802Nt r2 = this.A00;
        View view = r2.A02;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        if (view.canScrollVertically(1)) {
            r2.A01.setElevation((float) r2.A00);
            return false;
        }
        r2.A01.setElevation(0.0f);
        return false;
    }
}
