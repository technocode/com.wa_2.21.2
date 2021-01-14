package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.1aL  reason: invalid class name and case insensitive filesystem */
public class C29871aL implements AnonymousClass0TF {
    public final /* synthetic */ CoordinatorLayout A00;

    public C29871aL(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    @Override // X.AnonymousClass0TF
    public C06730Um ACw(View view, C06730Um r7) {
        CoordinatorLayout coordinatorLayout = this.A00;
        if (!C002001d.A3b(coordinatorLayout.A06, r7)) {
            coordinatorLayout.A06 = r7;
            boolean z = true;
            boolean z2 = false;
            if (r7.A04() > 0) {
                z2 = true;
            }
            coordinatorLayout.A08 = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z = false;
            }
            coordinatorLayout.setWillNotDraw(z);
            if (!r7.A06()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt.getFitsSystemWindows() && ((C14270lr) childAt.getLayoutParams()).A0A != null && r7.A06()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return r7;
    }
}
