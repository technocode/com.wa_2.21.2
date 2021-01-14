package com.google.android.material.appbar;

import X.AnonymousClass1D7;
import X.AnonymousClass1DC;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public VelocityTracker A03;
    public OverScroller A04;
    public Runnable A05;
    public boolean A06;

    public HeaderBehavior() {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 != 3) goto L_0x002e;
     */
    @Override // X.AbstractC07570Yg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A05(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 != 3) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        if (r5 != false) goto L_0x0056;
     */
    @Override // X.AbstractC07570Yg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 277
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A06(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int A07() {
        int i;
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        AnonymousClass1DC r0 = ((ViewOffsetBehavior) baseBehavior).A01;
        if (r0 != null) {
            i = r0.A02;
        } else {
            i = 0;
        }
        return i + baseBehavior.A02;
    }

    public int A08(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int A07 = baseBehavior.A07();
        boolean z = false;
        if (i2 == 0 || A07 < i2 || A07 > i3) {
            baseBehavior.A02 = 0;
            return 0;
        }
        if (i >= i2) {
            i2 = i;
            if (i > i3) {
                i2 = i3;
            }
        }
        if (A07 == i2) {
            return 0;
        }
        if (appBarLayout.A06) {
            int abs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i7);
                AnonymousClass1D7 r8 = (AnonymousClass1D7) childAt.getLayoutParams();
                Interpolator interpolator = r8.A01;
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i7++;
                } else if (interpolator != null) {
                    int i8 = r8.A00;
                    if ((i8 & 1) != 0) {
                        i6 = childAt.getHeight() + ((LinearLayout.LayoutParams) r8).topMargin + ((LinearLayout.LayoutParams) r8).bottomMargin + 0;
                        if ((i8 & 2) != 0) {
                            i6 -= childAt.getMinimumHeight();
                        }
                    } else {
                        i6 = 0;
                    }
                    if (childAt.getFitsSystemWindows()) {
                        i6 -= appBarLayout.getTopInset();
                    }
                    if (i6 > 0) {
                        float f = (float) i6;
                        int round = Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f) * f);
                        i4 = (childAt.getTop() + round) * Integer.signum(i2);
                    }
                }
            }
        }
        i4 = i2;
        AnonymousClass1DC r0 = ((ViewOffsetBehavior) baseBehavior).A01;
        if (r0 != null) {
            z = r0.A01(i4);
        } else {
            ((ViewOffsetBehavior) baseBehavior).A00 = i4;
        }
        int i9 = A07 - i2;
        baseBehavior.A02 = i2 - i4;
        if (!z && appBarLayout.A06) {
            coordinatorLayout.A0A(appBarLayout);
        }
        AnonymousClass1DC r02 = ((ViewOffsetBehavior) baseBehavior).A01;
        if (r02 != null) {
            i5 = r02.A02;
        } else {
            i5 = 0;
        }
        appBarLayout.A01(i5);
        int i10 = 1;
        if (i2 < A07) {
            i10 = -1;
        }
        AppBarLayout.BaseBehavior.A00(coordinatorLayout, appBarLayout, i2, i10, false);
        return i9;
    }

    public void A09(CoordinatorLayout coordinatorLayout, View view, int i) {
        A08(coordinatorLayout, view, i, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
    }

    public boolean A0A(View view) {
        View view2;
        WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).A05;
        if (weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) {
            return true;
        }
        return false;
    }
}
