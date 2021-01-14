package com.google.android.material.behavior;

import X.AbstractC07570Yg;
import X.AnonymousClass1DE;
import X.C08060aP;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior extends AbstractC07570Yg {
    public int A00 = 2;
    public int A01 = 0;
    public ViewPropertyAnimator A02;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A01 = view.getMeasuredHeight();
        return false;
    }

    public void A07(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.A00 = 1;
        int i = this.A01;
        this.A02 = view.animate().translationY((float) i).setInterpolator(C08060aP.A01).setDuration(175).setListener(new AnonymousClass1DE(this));
    }

    public void A08(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.A00 = 2;
        this.A02 = view.animate().translationY((float) 0).setInterpolator(C08060aP.A04).setDuration(225).setListener(new AnonymousClass1DE(this));
    }
}
