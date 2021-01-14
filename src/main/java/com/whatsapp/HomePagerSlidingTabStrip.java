package com.whatsapp;

import X.C08530bI;
import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class HomePagerSlidingTabStrip extends PagerSlidingTabStrip {
    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.whatsapp.PagerSlidingTabStrip
    public void A02(int i, View view) {
        LayoutTransition layoutTransition;
        super.A02(i, view);
        if (view instanceof ViewGroup) {
            View childAt = ((ViewGroup) view).getChildAt(0);
            if ((childAt instanceof ViewGroup) && (layoutTransition = ((ViewGroup) childAt).getLayoutTransition()) != null) {
                layoutTransition.addTransitionListener(new C08530bI(this));
            }
        }
    }
}
