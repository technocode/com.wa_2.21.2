package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* renamed from: X.1mu  reason: invalid class name and case insensitive filesystem */
public class C36801mu extends LinearLayoutCompat {
    public int A00 = 119;
    public Drawable A01;
    public boolean A02 = false;
    public boolean A03 = true;
    public final Rect A04 = new Rect();
    public final Rect A05 = new Rect();

    public C36801mu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        TypedArray A002 = C08040aN.A00(context, attributeSet, C08030aM.A0Y, 0, 0, new int[0]);
        this.A00 = A002.getInt(1, this.A00);
        Drawable drawable = A002.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A03 = A002.getBoolean(2, true);
        A002.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            if (this.A02) {
                this.A02 = false;
                Rect rect = this.A05;
                Rect rect2 = this.A04;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A03) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.A00, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful()) {
            this.A01.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.A01;
    }

    public int getForegroundGravity() {
        return this.A00;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02 = z | this.A02;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A02 = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.A01);
            }
            this.A01 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.A00 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.A00 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A00 = i;
            if (i == 119 && this.A01 != null) {
                this.A01.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A01;
    }
}
