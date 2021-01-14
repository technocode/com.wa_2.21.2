package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2S4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2S4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener A01;

    public /* synthetic */ AnonymousClass2S4(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.A00 = view;
        this.A01 = onGlobalLayoutListener;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.A00;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.A01;
        int visibility = view2.getVisibility();
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (visibility == 0) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }
}
