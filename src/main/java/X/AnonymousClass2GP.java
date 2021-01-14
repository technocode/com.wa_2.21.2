package X;

import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;

/* renamed from: X.2GP  reason: invalid class name */
public class AnonymousClass2GP implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ HorizontalScrollView A00;

    public AnonymousClass2GP(HorizontalScrollView horizontalScrollView) {
        this.A00 = horizontalScrollView;
    }

    public void onGlobalLayout() {
        HorizontalScrollView horizontalScrollView = this.A00;
        horizontalScrollView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        horizontalScrollView.fullScroll(66);
    }
}
