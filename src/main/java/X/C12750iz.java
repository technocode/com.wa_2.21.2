package X;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.0iz  reason: invalid class name and case insensitive filesystem */
public class C12750iz implements AbsListView.OnScrollListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C12750iz(View view, View view2) {
        this.A01 = view;
        this.A00 = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C12810j6.A01(absListView, this.A01, this.A00);
    }
}
