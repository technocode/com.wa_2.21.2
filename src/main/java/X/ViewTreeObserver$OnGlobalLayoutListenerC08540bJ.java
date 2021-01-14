package X;

import android.view.ViewTreeObserver;
import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.0bJ  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC08540bJ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC08540bJ(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    public void onGlobalLayout() {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
        pagerSlidingTabStrip.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int currentItem = pagerSlidingTabStrip.A0N.getCurrentItem();
        pagerSlidingTabStrip.A01 = currentItem;
        PagerSlidingTabStrip.A00(pagerSlidingTabStrip, currentItem, 0);
    }
}
