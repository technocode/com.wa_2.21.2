package com.google.android.material.appbar;

import X.AbstractC07570Yg;
import X.C14270lr;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int A00;
    public int A01 = 0;
    public final Rect A02 = new Rect();
    public final Rect A03 = new Rect();

    public HeaderScrollingViewBehavior() {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int A07(View view) {
        int i;
        int i2;
        int i3 = 0;
        if (this.A00 != 0) {
            float f = 0.0f;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                AbstractC07570Yg r1 = ((C14270lr) appBarLayout.getLayoutParams()).A0A;
                if (r1 instanceof AppBarLayout.BaseBehavior) {
                    i = ((HeaderBehavior) r1).A07();
                } else {
                    i = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    f = 1.0f + (((float) i) / ((float) i2));
                }
            }
            int i4 = this.A00;
            int i5 = (int) (f * ((float) i4));
            if (i5 >= 0) {
                i3 = i5;
                if (i5 > i4) {
                    return i4;
                }
            }
        }
        return i3;
    }
}
