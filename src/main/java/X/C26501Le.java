package X;

import android.widget.AbsListView;

/* renamed from: X.1Le  reason: invalid class name and case insensitive filesystem */
public class C26501Le implements AbsListView.OnScrollListener {
    public final /* synthetic */ C26621Lq A00;

    public C26501Le(C26621Lq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (r3 <= 1.0f) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.widget.AbsListView r9) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26501Le.A00(android.widget.AbsListView):void");
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        A00(absListView);
        AbsListView.OnScrollListener onScrollListener = this.A00.A0J;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        A00(absListView);
        AbsListView.OnScrollListener onScrollListener = this.A00.A0J;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
    }
}
