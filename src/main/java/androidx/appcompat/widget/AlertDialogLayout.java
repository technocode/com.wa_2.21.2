package androidx.appcompat.widget;

import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.C13310k0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int A00(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return A00(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i10 = this.A06;
        int i11 = i10 & 112;
        int i12 = i10 & 8388615;
        if (i11 == 16) {
            paddingTop = (((i4 - i2) - measuredHeight) >> 1) + getPaddingTop();
        } else if (i11 != 80) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
        }
        Drawable drawable = this.A0A;
        if (drawable == null) {
            i5 = 0;
        } else {
            i5 = drawable.getIntrinsicHeight();
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C13310k0 r5 = (C13310k0) childAt.getLayoutParams();
                int i14 = r5.A01;
                if (i14 < 0) {
                    i14 = i12;
                }
                int A03 = AnonymousClass0N2.A03(i14, AnonymousClass0Q7.A05(this)) & 7;
                if (A03 == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) r5).leftMargin;
                    i7 = ((ViewGroup.MarginLayoutParams) r5).rightMargin;
                    i8 = i6 - i7;
                } else if (A03 != 5) {
                    i8 = ((ViewGroup.MarginLayoutParams) r5).leftMargin + paddingLeft;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i7 = ((ViewGroup.MarginLayoutParams) r5).rightMargin;
                    i8 = i6 - i7;
                }
                if (A02(i13)) {
                    paddingTop += i5;
                }
                int i15 = paddingTop + ((ViewGroup.MarginLayoutParams) r5).topMargin;
                childAt.layout(i8, i15, measuredWidth + i8, measuredHeight2 + i15);
                paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) r5).bottomMargin + i15;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        ViewGroup viewGroup = null;
        View view2 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    viewGroup = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view2 == null) {
                    view2 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (viewGroup != null) {
            viewGroup.measure(i, 0);
            i4 = viewGroup.getMinimumHeight();
            if (i4 <= 0) {
                if (viewGroup instanceof ViewGroup) {
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup2.getChildCount() == 1) {
                        View childAt2 = viewGroup2.getChildAt(0);
                        i4 = childAt2.getMinimumHeight();
                        if (i4 <= 0) {
                            i4 = 0;
                            if (childAt2 instanceof ViewGroup) {
                                ViewGroup viewGroup3 = (ViewGroup) childAt2;
                                if (viewGroup3.getChildCount() == 1) {
                                    i4 = A00(viewGroup3.getChildAt(0));
                                }
                            }
                        }
                    }
                }
                i4 = 0;
            }
            i5 = viewGroup.getMeasuredHeight() - i4;
            paddingBottom += i4;
            i3 = View.combineMeasuredStates(i3, viewGroup.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view2 != null) {
            int i8 = 0;
            if (mode != 0) {
                i8 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view2.measure(i, i8);
            i6 = view2.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i9 = size - paddingBottom;
        if (viewGroup != null) {
            int i10 = paddingBottom - i4;
            int min = Math.min(i9, i5);
            if (min > 0) {
                i9 -= min;
                i4 += min;
            }
            viewGroup.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingBottom = i10 + viewGroup.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, viewGroup.getMeasuredState());
        }
        if (view2 != null && i9 > 0) {
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i9, mode));
            paddingBottom = (paddingBottom - i6) + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt3 = getChildAt(i12);
            if (childAt3.getVisibility() != 8) {
                i11 = Math.max(i11, childAt3.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i11, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt4 = getChildAt(i13);
                if (childAt4.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt4.getLayoutParams();
                    if (marginLayoutParams.width == -1) {
                        int i14 = marginLayoutParams.height;
                        marginLayoutParams.height = childAt4.getMeasuredHeight();
                        measureChildWithMargins(childAt4, makeMeasureSpec, 0, i2, 0);
                        marginLayoutParams.height = i14;
                    }
                }
            }
        }
    }
}
