package androidx.appcompat.widget;

import X.AnonymousClass008;
import X.AnonymousClass05p;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0T3;
import X.C06360Sy;
import X.C13310k0;
import X.C29561Zg;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Drawable A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;

    public int getChildrenSkipCount() {
        return 0;
    }

    public int getLocationOffset() {
        return 0;
    }

    public int getNextLocationOffset() {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = 0;
        this.A06 = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0N, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!obtainStyledAttributes.getBoolean(2, true)) {
            this.A0B = false;
        }
        this.A00 = obtainStyledAttributes.getFloat(4, -1.0f);
        this.A01 = obtainStyledAttributes.getInt(3, -1);
        this.A0C = obtainStyledAttributes.getBoolean(7, false);
        if (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(5);
        } else {
            drawable = AnonymousClass05p.A01(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.A08 = obtainStyledAttributes.getInt(8, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public void A00(Canvas canvas, int i) {
        this.A0A.setBounds(getPaddingLeft() + this.A04, i, (getWidth() - getPaddingRight()) - this.A04, this.A03 + i);
        this.A0A.draw(canvas);
    }

    public void A01(Canvas canvas, int i) {
        this.A0A.setBounds(i, getPaddingTop() + this.A04, this.A05 + i, (getHeight() - getPaddingBottom()) - this.A04);
        this.A0A.draw(canvas);
    }

    public boolean A02(int i) {
        if (i == 0) {
            return (this.A08 & 1) != 0;
        }
        if (i == getChildCount()) {
            if ((this.A08 & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.A08 & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C13310k0;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!(this instanceof ActionMenuView)) {
            int i = this.A07;
            if (i == 0) {
                return new C13310k0(-2);
            }
            if (i == 1) {
                return new C13310k0(-1);
            }
            return null;
        }
        C29561Zg r1 = new C29561Zg();
        ((C13310k0) r1).A01 = 16;
        return r1;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (!(this instanceof ActionMenuView)) {
            return new C13310k0(getContext(), attributeSet);
        }
        return new C29561Zg(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(this instanceof ActionMenuView)) {
            return new C13310k0(layoutParams);
        }
        return ((ActionMenuView) this).generateLayoutParams(layoutParams);
    }

    public int getBaseline() {
        int i;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.A01;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.A02;
                if (this.A07 == 1 && (i = this.A06 & 112) != 48) {
                    if (i == 16) {
                        i3 = (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.A09) / 2) + i3;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.A09;
                    }
                }
                return i3 + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.A01 == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A0A;
    }

    public int getDividerPadding() {
        return this.A04;
    }

    public int getDividerWidth() {
        return this.A05;
    }

    public int getGravity() {
        return this.A06;
    }

    public int getOrientation() {
        return this.A07;
    }

    public int getShowDividers() {
        return this.A08;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.A00;
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (this.A0A != null) {
            int i4 = this.A07;
            int i5 = 0;
            int childCount = getChildCount();
            if (i4 == 1) {
                while (i5 < childCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !A02(i5))) {
                        A00(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin) - this.A03);
                    }
                    i5++;
                }
                if (A02(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.A03;
                    } else {
                        bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).bottomMargin;
                    }
                    A00(canvas, bottom);
                    return;
                }
                return;
            }
            boolean A012 = C06360Sy.A01(this);
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !A02(i5))) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt3.getLayoutParams();
                    if (A012) {
                        left = childAt3.getRight() + marginLayoutParams.rightMargin;
                    } else {
                        left = (childAt3.getLeft() - marginLayoutParams.leftMargin) - this.A05;
                    }
                    A01(canvas, left);
                }
                i5++;
            }
            if (A02(childCount)) {
                View childAt4 = getChildAt(childCount - 1);
                if (childAt4 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt4.getLayoutParams();
                    if (A012) {
                        i = childAt4.getLeft() - marginLayoutParams2.leftMargin;
                        i2 = this.A05;
                        i3 = i - i2;
                    } else {
                        i3 = childAt4.getRight() + marginLayoutParams2.rightMargin;
                    }
                } else if (A012) {
                    i3 = getPaddingLeft();
                } else {
                    i = getWidth() - getPaddingRight();
                    i2 = this.A05;
                    i3 = i - i2;
                }
                A01(canvas, i3);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 8;
        int i12 = 5;
        if (this.A07 == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i13 = i3 - i;
            int paddingRight = i13 - getPaddingRight();
            int paddingRight2 = (i13 - paddingLeft2) - getPaddingRight();
            int childCount = getChildCount();
            int i14 = this.A06;
            int i15 = i14 & 112;
            int i16 = 8388615 & i14;
            if (i15 == 16) {
                paddingTop = (((i4 - i2) - this.A09) / 2) + getPaddingTop();
            } else if (i15 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i4) - i2) - this.A09;
            }
            int i17 = 0;
            while (i17 < childCount) {
                View childAt = getChildAt(i17);
                if (childAt == null) {
                    i10 = 0 + paddingTop;
                } else if (childAt.getVisibility() != i11) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C13310k0 r7 = (C13310k0) childAt.getLayoutParams();
                    int i18 = r7.A01;
                    if (i18 < 0) {
                        i18 = i16;
                    }
                    int A032 = AnonymousClass0N2.A03(i18, AnonymousClass0Q7.A05(this)) & 7;
                    if (A032 == 1) {
                        i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((ViewGroup.MarginLayoutParams) r7).leftMargin;
                        i8 = ((ViewGroup.MarginLayoutParams) r7).rightMargin;
                        i9 = i7 - i8;
                    } else if (A032 != i12) {
                        i9 = ((ViewGroup.MarginLayoutParams) r7).leftMargin + paddingLeft2;
                    } else {
                        i7 = paddingRight - measuredWidth;
                        i8 = ((ViewGroup.MarginLayoutParams) r7).rightMargin;
                        i9 = i7 - i8;
                    }
                    if (A02(i17)) {
                        paddingTop += this.A03;
                    }
                    int i19 = paddingTop + ((ViewGroup.MarginLayoutParams) r7).topMargin;
                    int i20 = 0 + i19;
                    childAt.layout(i9, i20, measuredWidth + i9, measuredHeight + i20);
                    i10 = 0 + measuredHeight + ((ViewGroup.MarginLayoutParams) r7).bottomMargin + i19;
                    i17 = 0 + i17;
                } else {
                    i17++;
                    i11 = 8;
                    i12 = 5;
                }
                paddingTop = i10;
                i17++;
                i11 = 8;
                i12 = 5;
            }
            return;
        }
        boolean A012 = C06360Sy.A01(this);
        int paddingTop2 = getPaddingTop();
        int i21 = i4 - i2;
        int paddingBottom = i21 - getPaddingBottom();
        int paddingBottom2 = (i21 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i22 = this.A06;
        int i23 = i22 & 112;
        boolean z2 = this.A0B;
        int[] iArr = this.A0D;
        int[] iArr2 = this.A0E;
        int A033 = AnonymousClass0N2.A03(8388615 & i22, AnonymousClass0Q7.A05(this));
        if (A033 == 1) {
            paddingLeft = (((i3 - i) - this.A09) / 2) + getPaddingLeft();
        } else if (A033 != 5) {
            paddingLeft = getPaddingLeft();
        } else {
            paddingLeft = ((getPaddingLeft() + i3) - i) - this.A09;
        }
        int i24 = 0;
        int i25 = 1;
        int i26 = 0;
        if (A012) {
            i26 = childCount2 - 1;
            i25 = -1;
        }
        while (i24 < childCount2) {
            int i27 = (i25 * i24) + i26;
            View childAt2 = getChildAt(i27);
            if (childAt2 == null) {
                paddingLeft += 0;
            } else if (childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                C13310k0 r8 = (C13310k0) childAt2.getLayoutParams();
                if (z2) {
                    if (((ViewGroup.MarginLayoutParams) r8).height != -1) {
                        i5 = childAt2.getBaseline();
                    }
                    i5 = -1;
                } else {
                    z2 = false;
                    i5 = -1;
                }
                int i28 = r8.A01;
                if (i28 < 0) {
                    i28 = i23;
                }
                int i29 = i28 & 112;
                if (i29 == 16) {
                    i6 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) r8).topMargin) - ((ViewGroup.MarginLayoutParams) r8).bottomMargin;
                } else if (i29 != 48) {
                    i6 = paddingTop2;
                    if (i29 == 80) {
                        i6 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) r8).bottomMargin;
                        if (i5 != -1) {
                            i6 -= iArr2[2] - (childAt2.getMeasuredHeight() - i5);
                        }
                    }
                } else {
                    i6 = ((ViewGroup.MarginLayoutParams) r8).topMargin + paddingTop2;
                    if (i5 != -1) {
                        i6 += iArr[1] - i5;
                    }
                }
                if (A02(i27)) {
                    paddingLeft += this.A05;
                }
                int i30 = paddingLeft + ((ViewGroup.MarginLayoutParams) r8).leftMargin;
                int i31 = 0 + i30;
                childAt2.layout(i31, i6, measuredWidth2 + i31, measuredHeight2 + i6);
                i24 += 0;
                paddingLeft = 0 + measuredWidth2 + ((ViewGroup.MarginLayoutParams) r8).rightMargin + i30;
            }
            i24++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x022d, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r10).width == -1) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0239, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r10).width != r5) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0418, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r12).height != -1) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04ce, code lost:
        if (r6[3] != -1) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0616, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r7).height != -1) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0637, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r7).height != -1) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06ed, code lost:
        if (r6[3] != -1) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0116, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r2).width != -1) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x042d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
        // Method dump skipped, instructions count: 1928
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.A0B = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder A0S = AnonymousClass008.A0S("base aligned child index out of range (0, ");
            A0S.append(getChildCount());
            A0S.append(")");
            throw new IllegalArgumentException(A0S.toString());
        }
        this.A01 = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.A0A) {
            this.A0A = drawable;
            boolean z = false;
            if (drawable != null) {
                this.A05 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A05 = 0;
                this.A03 = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.A04 = i;
    }

    public void setGravity(int i) {
        if (this.A06 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A06 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A06;
        if ((8388615 & i3) != i2) {
            this.A06 = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.A0C = z;
    }

    public void setOrientation(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.A08) {
            requestLayout();
        }
        this.A08 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A06;
        if ((i3 & 112) != i2) {
            this.A06 = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.A00 = Math.max(0.0f, f);
    }
}
