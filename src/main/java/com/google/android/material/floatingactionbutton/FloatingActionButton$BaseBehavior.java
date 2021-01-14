package com.google.android.material.floatingactionbutton;

import X.AbstractC07570Yg;
import X.C08000aJ;
import X.C08010aK;
import X.C08030aM;
import X.C14270lr;
import X.C24831De;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class FloatingActionButton$BaseBehavior extends AbstractC07570Yg {
    public Rect A00;
    public boolean A01;

    public FloatingActionButton$BaseBehavior() {
        this.A01 = true;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08030aM.A0U);
        this.A01 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC07570Yg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior.A04(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final boolean A07(View view, C08000aJ r7) {
        boolean z;
        C14270lr r1 = (C14270lr) r7.getLayoutParams();
        if (!this.A01) {
            z = false;
        } else if (r1.A05 != view.getId()) {
            z = false;
        } else {
            z = false;
            if (((C08010aK) r7).A00 == 0) {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        if (view.getTop() < (r7.getHeight() >> 1) + ((ViewGroup.MarginLayoutParams) r7.getLayoutParams()).topMargin) {
            r7.A04(false);
            return true;
        }
        r7.A05(false);
        return true;
    }

    public final boolean A08(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C08000aJ r6) {
        boolean z;
        C14270lr r1 = (C14270lr) r6.getLayoutParams();
        if (!this.A01) {
            z = false;
        } else if (r1.A05 != appBarLayout.getId()) {
            z = false;
        } else {
            z = false;
            if (((C08010aK) r6).A00 == 0) {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        Rect rect = this.A00;
        if (rect == null) {
            rect = new Rect();
            this.A00 = rect;
        }
        C24831De.A00(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
            r6.A04(false);
            return true;
        }
        r6.A05(false);
        return true;
    }
}
