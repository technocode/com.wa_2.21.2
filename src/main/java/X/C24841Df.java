package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Df  reason: invalid class name and case insensitive filesystem */
public class C24841Df extends ViewGroup {
    public int A00;
    public int A01;
    public boolean A02 = false;

    public C24841Df(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipGroupStyle);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C08030aM.A0V, 0, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.A00;
    }

    public int getLineSpacing() {
        return this.A01;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (AnonymousClass0Q7.A05(this) == 1) {
                paddingLeft = getPaddingRight();
                paddingRight = getPaddingLeft();
            } else {
                z2 = false;
                paddingLeft = getPaddingLeft();
                paddingRight = getPaddingRight();
            }
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingRight;
            int i8 = paddingLeft;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (Build.VERSION.SDK_INT >= 17) {
                            i6 = marginLayoutParams.getMarginStart();
                        } else {
                            i6 = marginLayoutParams.leftMargin;
                        }
                        i5 = AnonymousClass0N2.A0B(marginLayoutParams);
                    } else {
                        i5 = 0;
                        i6 = 0;
                    }
                    int measuredWidth = childAt.getMeasuredWidth() + i8 + i6;
                    if (!this.A02 && measuredWidth > i7) {
                        i9 = this.A01 + paddingTop;
                        i8 = paddingLeft;
                    }
                    int i11 = i8 + i6;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    paddingTop = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, paddingTop);
                    } else {
                        childAt.layout(i11, i9, measuredWidth2, paddingTop);
                    }
                    i8 += childAt.getMeasuredWidth() + i6 + i5 + this.A00;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r9 == 1073741824) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24841Df.onMeasure(int, int):void");
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
    }

    public void setLineSpacing(int i) {
        this.A01 = i;
    }

    public void setSingleLine(boolean z) {
        this.A02 = z;
    }
}
