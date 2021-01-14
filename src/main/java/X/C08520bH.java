package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.0bH  reason: invalid class name and case insensitive filesystem */
public class C08520bH extends AnonymousClass0Q0 {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public C08520bH(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    @Override // X.AnonymousClass0Q0
    public void A01(View view, C07890a3 r4) {
        View.AccessibilityDelegate accessibilityDelegate = this.A01;
        AccessibilityNodeInfo accessibilityNodeInfo = r4.A02;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (view.isSelected()) {
            r4.A07(C06790Us.A04);
            accessibilityNodeInfo.setClickable(false);
        }
        if (Build.VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(this.A00.A0N.getId());
        }
    }
}
