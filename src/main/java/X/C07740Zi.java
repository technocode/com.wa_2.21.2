package X;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0Zi  reason: invalid class name and case insensitive filesystem */
public class C07740Zi extends AnonymousClass0Q0 {
    public final /* synthetic */ ViewPager A00;

    public C07740Zi(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    @Override // X.AnonymousClass0Q0
    public boolean A02(View view, int i, Bundle bundle) {
        if (super.A02(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            ViewPager viewPager = this.A00;
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.A0A + 1);
            return true;
        } else if (i != 8192) {
            return false;
        } else {
            ViewPager viewPager2 = this.A00;
            if (!viewPager2.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager2.setCurrentItem(viewPager2.A0A - 1);
            return true;
        }
    }
}
