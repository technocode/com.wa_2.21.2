package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0n7  reason: invalid class name and case insensitive filesystem */
public final class View$OnAttachStateChangeListenerC14930n7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final Runnable A02;

    public View$OnAttachStateChangeListenerC14930n7(View view, Runnable runnable) {
        this.A01 = view;
        this.A00 = view.getViewTreeObserver();
        this.A02 = runnable;
    }

    public static void A00(View view, Runnable runnable) {
        if (view != null) {
            View$OnAttachStateChangeListenerC14930n7 r1 = new View$OnAttachStateChangeListenerC14930n7(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(r1);
            view.addOnAttachStateChangeListener(r1);
            return;
        }
        throw new NullPointerException("view == null");
    }

    public void A01() {
        if (this.A00.isAlive()) {
            this.A00.removeOnPreDrawListener(this);
        } else {
            this.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.A01.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        A01();
        this.A02.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.A00 = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        A01();
    }
}
