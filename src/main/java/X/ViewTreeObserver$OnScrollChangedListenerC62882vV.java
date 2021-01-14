package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.2vV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnScrollChangedListenerC62882vV implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;

    public /* synthetic */ ViewTreeObserver$OnScrollChangedListenerC62882vV(View view, ViewGroup viewGroup, View view2) {
        this.A00 = view;
        this.A02 = viewGroup;
        this.A01 = view2;
    }

    public final void onScrollChanged() {
        View view = this.A00;
        ViewGroup viewGroup = this.A02;
        View view2 = this.A01;
        if (view.getScrollY() <= 20) {
            int i = (int) ((C002301g.A0K.A00 * 6.0f) + 0.5f);
            viewGroup.setPadding(i, i, i, i);
            view2.setVisibility(0);
            return;
        }
        int i2 = (int) ((C002301g.A0K.A00 * 10.0f) + 0.5f);
        viewGroup.setPadding(i2, i2, i2, i2);
        view2.setVisibility(8);
    }
}
