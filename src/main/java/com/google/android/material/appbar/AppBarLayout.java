package com.google.android.material.appbar;

import X.AnonymousClass0Q7;
import X.AnonymousClass1D4;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1DC;
import X.AnonymousClass1DD;
import X.C06730Um;
import X.C08030aM;
import X.C08040aN;
import X.C08060aP;
import X.C36651ma;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.List;

@CoordinatorLayout.DefaultBehavior(Behavior.class)
public class AppBarLayout extends LinearLayout {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public int A03 = -1;
    public C06730Um A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;

    public float getTargetElevation() {
        return 0.0f;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            Context context2 = getContext();
            TypedArray A002 = C08040aN.A00(context2, attributeSet, AnonymousClass1DD.A00, 0, 2131952403, new int[0]);
            try {
                if (A002.hasValue(0)) {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, A002.getResourceId(0, 0)));
                }
            } finally {
                A002.recycle();
            }
        }
        TypedArray A003 = C08040aN.A00(context, attributeSet, C08030aM.A06, 0, 2131952403, new int[0]);
        setBackground(A003.getDrawable(0));
        if (A003.hasValue(4)) {
            A02(A003.getBoolean(4, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && A003.hasValue(3)) {
            AnonymousClass1DD.A00(this, (float) A003.getDimensionPixelSize(3, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (A003.hasValue(2)) {
                setKeyboardNavigationCluster(A003.getBoolean(2, false));
            }
            if (A003.hasValue(1)) {
                setTouchscreenBlocksFocus(A003.getBoolean(1, false));
            }
        }
        this.A07 = A003.getBoolean(5, false);
        A003.recycle();
        AnonymousClass0Q7.A0e(this, new C36651ma(this));
    }

    public static AnonymousClass1D7 A00(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new AnonymousClass1D7((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass1D7((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass1D7(layoutParams);
    }

    public void A01(int i) {
        List list = this.A05;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass1D6 r0 = (AnonymousClass1D6) this.A05.get(i2);
                if (r0 != null) {
                    r0.AI6(this, i);
                }
            }
        }
    }

    public final void A02(boolean z, boolean z2, boolean z3) {
        int i = 2;
        if (z) {
            i = 1;
        }
        int i2 = 0;
        int i3 = 0;
        if (z2) {
            i3 = 4;
        }
        int i4 = i | i3;
        if (z3) {
            i2 = 8;
        }
        this.A02 = i4 | i2;
        requestLayout();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass1D7;
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass1D7();
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m2generateDefaultLayoutParams() {
        return new AnonymousClass1D7();
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass1D7(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m3generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass1D7(getContext(), attributeSet);
    }

    public int getDownNestedPreScrollRange() {
        int topInset;
        int i = this.A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            AnonymousClass1D7 r5 = (AnonymousClass1D7) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = r5.A00;
            if ((i3 & 5) == 5) {
                int i4 = ((LinearLayout.LayoutParams) r5).topMargin + ((LinearLayout.LayoutParams) r5).bottomMargin + i2;
                if ((i3 & 8) != 0) {
                    i2 = childAt.getMinimumHeight() + i4;
                } else {
                    if ((i3 & 2) != 0) {
                        topInset = childAt.getMinimumHeight();
                    } else {
                        topInset = getTopInset();
                    }
                    i2 = (measuredHeight - topInset) + i4;
                }
            } else if (i2 > 0) {
                break;
            }
        }
        int max = Math.max(0, i2);
        this.A00 = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.A01;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            AnonymousClass1D7 r3 = (AnonymousClass1D7) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) r3).topMargin + ((LinearLayout.LayoutParams) r3).bottomMargin + childAt.getMeasuredHeight();
            int i4 = r3.A00;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= getTopInset() + childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A01 = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0 || ((childCount = getChildCount()) >= 1 && (minimumHeight = getChildAt(childCount - 1).getMinimumHeight()) != 0)) {
            return (minimumHeight << 1) + topInset;
        }
        return getHeight() / 3;
    }

    public int getPendingAction() {
        return this.A02;
    }

    public final int getTopInset() {
        C06730Um r0 = this.A04;
        if (r0 != null) {
            return r0.A04();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A03;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            AnonymousClass1D7 r3 = (AnonymousClass1D7) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = r3.A00;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) r3).topMargin + ((LinearLayout.LayoutParams) r3).bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.A03 = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r1 == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] onCreateDrawableState(int r7) {
        /*
            r6 = this;
            int[] r3 = r6.A0A
            if (r3 != 0) goto L_0x0009
            r0 = 4
            int[] r3 = new int[r0]
            r6.A0A = r3
        L_0x0009:
            int r0 = r3.length
            int r7 = r7 + r0
            int[] r4 = super.onCreateDrawableState(r7)
            r1 = 0
            boolean r5 = r6.A08
            r0 = 2130969372(0x7f04031c, float:1.7547424E38)
            int r0 = -r0
            if (r5 == 0) goto L_0x001b
            r0 = 2130969372(0x7f04031c, float:1.7547424E38)
        L_0x001b:
            r3[r1] = r0
            r2 = 1
            if (r5 == 0) goto L_0x0027
            boolean r1 = r6.A09
            r0 = 2130969373(0x7f04031d, float:1.7547426E38)
            if (r1 != 0) goto L_0x002b
        L_0x0027:
            r0 = 2130969373(0x7f04031d, float:1.7547426E38)
            int r0 = -r0
        L_0x002b:
            r3[r2] = r0
            r1 = 2
            r0 = 2130969371(0x7f04031b, float:1.7547422E38)
            int r0 = -r0
            if (r5 == 0) goto L_0x0037
            r0 = 2130969371(0x7f04031b, float:1.7547422E38)
        L_0x0037:
            r3[r1] = r0
            r2 = 3
            if (r5 == 0) goto L_0x0043
            boolean r1 = r6.A09
            r0 = 2130969370(0x7f04031a, float:1.754742E38)
            if (r1 != 0) goto L_0x0047
        L_0x0043:
            r0 = 2130969370(0x7f04031a, float:1.754742E38)
            int r0 = -r0
        L_0x0047:
            r3[r2] = r0
            int[] r0 = android.widget.LinearLayout.mergeDrawableStates(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r0 = -1
            r6.A03 = r0
            r6.A00 = r0
            r6.A01 = r0
            r5 = 0
            r6.A06 = r5
            int r2 = r6.getChildCount()
            r1 = 0
        L_0x0012:
            r4 = 1
            if (r1 >= r2) goto L_0x0025
            android.view.View r0 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.1D7 r0 = (X.AnonymousClass1D7) r0
            android.view.animation.Interpolator r0 = r0.A01
            if (r0 == 0) goto L_0x0052
            r6.A06 = r4
        L_0x0025:
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0044
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x002e:
            if (r2 >= r3) goto L_0x0045
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.1D7 r0 = (X.AnonymousClass1D7) r0
            int r1 = r0.A00
            r0 = r1 & 1
            if (r0 != r4) goto L_0x004f
            r0 = r1 & 10
            if (r0 == 0) goto L_0x004f
        L_0x0044:
            r5 = 1
        L_0x0045:
            boolean r0 = r6.A08
            if (r0 == r5) goto L_0x004e
            r6.A08 = r5
            r6.refreshDrawableState()
        L_0x004e:
            return
        L_0x004f:
            int r2 = r2 + 1
            goto L_0x002e
        L_0x0052:
            int r1 = r1 + 1
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A03 = -1;
        this.A00 = -1;
        this.A01 = -1;
    }

    public void setExpanded(boolean z) {
        A02(z, AnonymousClass0Q7.A0j(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.A07 = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass1DD.A00(this, f);
        }
    }

    public class BaseBehavior extends HeaderBehavior {
        public float A00;
        public int A01;
        public int A02;
        public int A03 = -1;
        public ValueAnimator A04;
        public WeakReference A05;
        public boolean A06;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void A00(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.appbar.AppBarLayout r6, int r7, int r8, boolean r9) {
            /*
            // Method dump skipped, instructions count: 194
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A00(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // X.AbstractC07570Yg
        public void A03(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.A01 == 0 || i == 1) {
                A0B(coordinatorLayout, appBarLayout);
            }
            this.A05 = new WeakReference(view2);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, X.AbstractC07570Yg
        public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            int i3;
            int i4;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.A04(coordinatorLayout, appBarLayout, i);
            int i5 = appBarLayout.A02;
            int i6 = this.A03;
            if (i6 >= 0 && (i5 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i6);
                int i7 = -childAt.getBottom();
                if (this.A06) {
                    round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i7;
                } else {
                    round = Math.round(((float) childAt.getHeight()) * this.A00) + i7;
                }
                A09(coordinatorLayout, appBarLayout, round);
            } else if (i5 != 0) {
                boolean z = false;
                if ((i5 & 4) != 0) {
                    z = true;
                }
                if ((i5 & 2) != 0) {
                    int i8 = -appBarLayout.getTotalScrollRange();
                    if (z) {
                        A0C(coordinatorLayout, appBarLayout, i8);
                    } else {
                        A09(coordinatorLayout, appBarLayout, i8);
                    }
                } else if ((i5 & 1) != 0) {
                    if (z) {
                        A0C(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A09(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.A02 = 0;
            this.A03 = -1;
            AnonymousClass1DC r0 = ((ViewOffsetBehavior) this).A01;
            if (r0 != null) {
                i2 = r0.A02;
            } else {
                i2 = 0;
            }
            int i9 = -appBarLayout.getTotalScrollRange();
            if (i2 < i9) {
                i2 = i9;
            } else if (i2 > 0) {
                i2 = 0;
            }
            AnonymousClass1DC r02 = ((ViewOffsetBehavior) this).A01;
            if (r02 != null) {
                r02.A01(i2);
            } else {
                ((ViewOffsetBehavior) this).A00 = i2;
            }
            AnonymousClass1DC r03 = ((ViewOffsetBehavior) this).A01;
            if (r03 != null) {
                i3 = r03.A02;
            } else {
                i3 = 0;
            }
            A00(coordinatorLayout, appBarLayout, i3, 0, true);
            AnonymousClass1DC r04 = ((ViewOffsetBehavior) this).A01;
            if (r04 != null) {
                i4 = r04.A02;
            } else {
                i4 = 0;
            }
            appBarLayout.A01(i4);
            return true;
        }

        public final void A0B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int A07 = A07();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                AnonymousClass1D7 r2 = (AnonymousClass1D7) childAt.getLayoutParams();
                if ((r2.A00 & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) r2).topMargin;
                    bottom += ((LinearLayout.LayoutParams) r2).bottomMargin;
                }
                int i2 = -A07;
                if (top <= i2 && bottom >= i2) {
                    if (i >= 0) {
                        View childAt2 = appBarLayout.getChildAt(i);
                        AnonymousClass1D7 r6 = (AnonymousClass1D7) childAt2.getLayoutParams();
                        int i3 = r6.A00;
                        if ((i3 & 17) == 17) {
                            int i4 = -childAt2.getTop();
                            int i5 = -childAt2.getBottom();
                            if (i == appBarLayout.getChildCount() - 1) {
                                i5 += appBarLayout.getTopInset();
                            }
                            if ((i3 & 2) == 2) {
                                i5 += childAt2.getMinimumHeight();
                            } else if ((i3 & 5) == 5) {
                                int minimumHeight = childAt2.getMinimumHeight() + i5;
                                if (A07 < minimumHeight) {
                                    i4 = minimumHeight;
                                } else {
                                    i5 = minimumHeight;
                                }
                            }
                            if ((i3 & 32) == 32) {
                                i4 += ((LinearLayout.LayoutParams) r6).topMargin;
                                i5 -= ((LinearLayout.LayoutParams) r6).bottomMargin;
                            }
                            if (A07 < (i5 + i4) / 2) {
                                i4 = i5;
                            }
                            int i6 = -appBarLayout.getTotalScrollRange();
                            if (i4 >= i6) {
                                i6 = i4;
                                if (i4 > 0) {
                                    i6 = 0;
                                }
                            }
                            A0C(coordinatorLayout, appBarLayout, i6);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void A0C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(A07() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int A07 = A07();
            if (A07 == i) {
                ValueAnimator valueAnimator = this.A04;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.A04.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.A04;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.A04 = valueAnimator3;
                valueAnimator3.setInterpolator(C08060aP.A00);
                this.A04.addUpdateListener(new AnonymousClass1D4(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.A04.setDuration((long) Math.min(height, 600));
            this.A04.setIntValues(A07, i);
            this.A04.start();
        }
    }

    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08030aM.A0o);
            ((HeaderScrollingViewBehavior) this).A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public static AppBarLayout A00(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
