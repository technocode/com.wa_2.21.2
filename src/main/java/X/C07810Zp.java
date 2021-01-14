package X;

import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.0Zp  reason: invalid class name and case insensitive filesystem */
public class C07810Zp extends AnonymousClass0Q0 {
    @Override // X.AnonymousClass0Q0
    public boolean A02(View view, int i, Bundle bundle) {
        if (super.A02(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.A08(max, true);
                return true;
            } else if (i != 16908346) {
                return false;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.A08(min, true);
        return true;
    }
}
