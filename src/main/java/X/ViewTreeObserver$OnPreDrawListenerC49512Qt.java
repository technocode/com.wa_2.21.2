package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* renamed from: X.2Qt  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC49512Qt implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScrollView A01;

    public ViewTreeObserver$OnPreDrawListenerC49512Qt(View view, ScrollView scrollView) {
        this.A00 = view;
        this.A01 = scrollView;
    }

    public boolean onPreDraw() {
        View view = this.A00;
        int height = view.getHeight();
        ScrollView scrollView = this.A01;
        scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), scrollView.getPaddingBottom() + height);
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
