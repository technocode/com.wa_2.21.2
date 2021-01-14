package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0Yq  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC07610Yq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;

    public ViewTreeObserver$OnPreDrawListenerC07610Yq(View view) {
        this.A00 = view;
    }

    public boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
