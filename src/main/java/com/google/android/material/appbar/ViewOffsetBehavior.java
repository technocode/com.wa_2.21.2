package com.google.android.material.appbar;

import X.AbstractC07570Yg;
import X.AnonymousClass0N2;
import X.AnonymousClass1DC;
import X.C06730Um;
import X.C14270lr;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class ViewOffsetBehavior extends AbstractC07570Yg {
    public int A00 = 0;
    public AnonymousClass1DC A01;

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!(this instanceof HeaderScrollingViewBehavior)) {
            coordinatorLayout.A0B(view, i);
        } else {
            HeaderScrollingViewBehavior headerScrollingViewBehavior = (HeaderScrollingViewBehavior) this;
            AppBarLayout A002 = AppBarLayout.ScrollingViewBehavior.A00(coordinatorLayout.A06(view));
            if (A002 != null) {
                C14270lr r4 = (C14270lr) view.getLayoutParams();
                Rect rect = headerScrollingViewBehavior.A02;
                rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r4).leftMargin, A002.getBottom() + ((ViewGroup.MarginLayoutParams) r4).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) r4).rightMargin, ((A002.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) r4).bottomMargin);
                C06730Um r2 = coordinatorLayout.A06;
                if (r2 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = r2.A02() + rect.left;
                    rect.right -= r2.A03();
                }
                Rect rect2 = headerScrollingViewBehavior.A03;
                int i2 = r4.A02;
                if (i2 == 0) {
                    i2 = 8388659;
                }
                AnonymousClass0N2.A10(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
                int A07 = headerScrollingViewBehavior.A07(A002);
                view.layout(rect2.left, rect2.top - A07, rect2.right, rect2.bottom - A07);
                headerScrollingViewBehavior.A01 = rect2.top - A002.getBottom();
            } else {
                coordinatorLayout.A0B(view, i);
                headerScrollingViewBehavior.A01 = 0;
            }
        }
        AnonymousClass1DC r22 = this.A01;
        if (r22 == null) {
            r22 = new AnonymousClass1DC(view);
            this.A01 = r22;
        }
        View view2 = r22.A03;
        r22.A01 = view2.getTop();
        r22.A00 = view2.getLeft();
        r22.A00();
        int i3 = this.A00;
        if (i3 == 0) {
            return true;
        }
        this.A01.A01(i3);
        this.A00 = 0;
        return true;
    }
}
