package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.35c  reason: invalid class name and case insensitive filesystem */
public final class ViewTreeObserver$OnPreDrawListenerC666235c implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Runnable A01;

    public ViewTreeObserver$OnPreDrawListenerC666235c(View view, Runnable runnable) {
        this.A00 = view;
        this.A01 = runnable;
    }

    public boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        this.A01.run();
        return true;
    }
}
