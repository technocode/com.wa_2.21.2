package com.google.android.material.snackbar;

import X.AnonymousClass1Dw;
import X.C24911Dn;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final C24911Dn A00 = new C24911Dn(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, X.AbstractC07570Yg
    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C24911Dn r2 = this.A00;
        if (r2 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    AnonymousClass1Dw.A00().A03(r2.A00);
                }
            } else if (coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                AnonymousClass1Dw.A00().A02(r2.A00);
            }
            return super.A05(coordinatorLayout, view, motionEvent);
        }
        throw null;
    }
}
