package X;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0b1  reason: invalid class name and case insensitive filesystem */
public class C08380b1 extends DataSetObserver {
    public final /* synthetic */ ViewPager A00;

    public C08380b1(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void onChanged() {
        this.A00.A05();
    }

    public void onInvalidated() {
        this.A00.A05();
    }
}
