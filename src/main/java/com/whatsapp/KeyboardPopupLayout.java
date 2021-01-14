package com.whatsapp;

import X.AnonymousClass1MF;
import X.AnonymousClass1MI;
import X.C002001d;
import X.C06170Sb;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class KeyboardPopupLayout extends RelativeLayout implements AnonymousClass1MF {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public Paint A03;
    public AnonymousClass1MI A04;
    public boolean A05 = false;
    public boolean A06;
    public final Rect A07 = new Rect();
    public final C06170Sb A08;
    public final int[] A09 = new int[2];

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = isInEditMode() ? null : C06170Sb.A00();
    }

    @Override // X.AnonymousClass1MF
    public void A2i() {
        if (this.A04 != null) {
            this.A04 = null;
            requestLayout();
        }
    }

    @Override // X.AnonymousClass1MF
    public boolean ABI() {
        return this.A05;
    }

    private int getSizeWithKeyboard() {
        int i = getResources().getConfiguration().orientation;
        if (i == 1) {
            return this.A02;
        }
        if (i != 2) {
            return -1;
        }
        return this.A01;
    }

    public void invalidate() {
        if (!this.A05) {
            super.invalidate();
        }
    }

    public void invalidate(int i, int i2, int i3, int i4) {
        if (!this.A05) {
            super.invalidate(i, i2, i3, i4);
        }
    }

    public void invalidate(Rect rect) {
        if (!this.A05) {
            super.invalidate(rect);
        }
    }

    @Override // X.AnonymousClass1MF
    public void lock() {
        this.A05 = true;
    }

    public void onDraw(Canvas canvas) {
        if (this.A03 != null && this.A00 != getHeight()) {
            Rect rect = this.A07;
            rect.set(0, this.A00, getWidth(), getHeight());
            canvas.drawRect(rect, this.A03);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.A05) {
            if (this.A04 != null) {
                super.onLayout(z, i, i2, i3, i2 + this.A00);
                int[] iArr = this.A09;
                getLocationInWindow(iArr);
                if (this.A06) {
                    AnonymousClass1MI r3 = this.A04;
                    r3.update(getPaddingLeft() + iArr[0], 1000000, (i3 - i) - getPaddingRight(), r3.A01);
                    return;
                }
                AnonymousClass1MI r32 = this.A04;
                r32.update(getPaddingLeft() + iArr[0], iArr[1] + this.A00, (i3 - i) - getPaddingRight(), r32.A01);
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass1MI r0;
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        if (!this.A06) {
            int size = View.MeasureSpec.getSize(i2);
            Context A0O = C002001d.A0O(getContext());
            if (!(A0O instanceof Activity) || Build.VERSION.SDK_INT < 24 || !((Activity) A0O).isInMultiWindowMode()) {
                if (this.A08 != null && C06170Sb.A01(this) && ((r0 = this.A04) == null || !r0.isShowing())) {
                    int i5 = getResources().getConfiguration().orientation;
                    if (i5 == 1) {
                        this.A02 = size;
                    } else if (i5 == 2) {
                        this.A01 = size;
                    }
                }
                int sizeWithKeyboard = getSizeWithKeyboard();
                if (sizeWithKeyboard != -1) {
                    i3 = size - sizeWithKeyboard;
                }
            }
            this.A00 = size;
            AnonymousClass1MI r1 = this.A04;
            if (r1 != null) {
                r1.A01 = r1.A01(i3);
                int mode = View.MeasureSpec.getMode(i2);
                if (!(mode == 0 || this.A08 == null || C06170Sb.A01(this))) {
                    this.A00 -= this.A04.A01;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A00, mode));
                setMeasuredDimension(getMeasuredWidth(), size);
                return;
            }
            super.onMeasure(i, i2);
        } else if (this.A04 != null) {
            if (this.A08 == null || C06170Sb.A01(this)) {
                z = false;
            }
            int size2 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            AnonymousClass1MI r12 = this.A04;
            r12.A01 = r12.A01(-1);
            int i6 = this.A04.A01;
            if (mode2 == 1073741824) {
                if (z) {
                    size2 -= i6;
                }
                this.A00 = size2;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, mode2));
                setMeasuredDimension(getMeasuredWidth(), this.A00);
            } else if (mode2 == Integer.MIN_VALUE) {
                int i7 = size2;
                if (z) {
                    i7 = size2 - i6;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i7, mode2));
                this.A00 = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (z) {
                    measuredHeight += i6;
                }
                setMeasuredDimension(measuredWidth, Math.min(measuredHeight, size2));
            } else {
                if (z) {
                    size2 -= i6;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, mode2));
                int measuredHeight2 = getMeasuredHeight();
                if (z) {
                    i4 = i6;
                }
                this.A00 = measuredHeight2 + i4;
                setMeasuredDimension(getMeasuredWidth(), this.A00);
            }
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void requestLayout() {
        if (!this.A05) {
            super.requestLayout();
        }
    }

    public void setHeightShouldWrap(boolean z) {
        this.A06 = z;
    }

    @Override // X.AnonymousClass1MF
    public void setKeyboardPopup(AnonymousClass1MI r2) {
        if (this.A04 != r2) {
            this.A04 = r2;
            requestLayout();
        }
    }

    public void setKeyboardPopupBackgroundColor(int i) {
        if (this.A03 == null) {
            this.A03 = new Paint(1);
        }
        setWillNotDraw(false);
        this.A03.setColor(i);
    }

    @Override // X.AnonymousClass1MF
    public void unlock() {
        this.A05 = false;
    }
}
