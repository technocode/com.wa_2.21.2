package X;

import android.widget.AbsListView;

/* renamed from: X.2GU  reason: invalid class name */
public class AnonymousClass2GU implements AbsListView.OnScrollListener {
    public int A00 = 0;
    public final /* synthetic */ AnonymousClass0QH A01;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public AnonymousClass2GU(AnonymousClass0QH r2) {
        this.A01 = r2;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        int i2 = this.A00;
        if (i2 == 0 && i != i2) {
            ((ActivityC004602e) this.A01).A0H.A02(absListView);
        }
        this.A00 = i;
    }
}
