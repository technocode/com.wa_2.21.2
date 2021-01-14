package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.35b  reason: invalid class name and case insensitive filesystem */
public final class ViewTreeObserver$OnGlobalLayoutListenerC666135b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Runnable A01;

    public ViewTreeObserver$OnGlobalLayoutListenerC666135b(View view, Runnable runnable) {
        this.A00 = view;
        this.A01 = runnable;
    }

    public void onGlobalLayout() {
        this.A00.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.A01.run();
    }
}
