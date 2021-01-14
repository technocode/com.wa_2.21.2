package X;

import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: X.2Sa  reason: invalid class name and case insensitive filesystem */
public class C49762Sa implements AbsListView.OnScrollListener {
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02 = true;
    public final /* synthetic */ AbstractC49792Sd A03;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C49762Sa(AbstractC49792Sd r3) {
        this.A03 = r3;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.A01) {
            int footerViewsCount = i3 - ((ListView) absListView).getFooterViewsCount();
            boolean z = this.A02;
            if (z && footerViewsCount > this.A00) {
                this.A02 = false;
                this.A00 = footerViewsCount;
            } else if (z) {
                return;
            }
            if (i + i2 >= footerViewsCount - 5) {
                this.A02 = true;
                AbstractC49792Sd r1 = this.A03;
                r1.A1O.ANC(new C10250eK(r1, r1.A0a), new Void[0]);
            }
        }
    }
}
