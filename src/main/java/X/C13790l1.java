package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.0l1  reason: invalid class name and case insensitive filesystem */
public class C13790l1 extends Drawable {
    public float A00;
    public float A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04 = PorterDuff.Mode.SRC_IN;
    public PorterDuffColorFilter A05;
    public boolean A06 = false;
    public boolean A07 = true;
    public final Paint A08;
    public final Rect A09;
    public final RectF A0A;

    public int getOpacity() {
        return -3;
    }

    public C13790l1(ColorStateList colorStateList, float f) {
        this.A01 = f;
        this.A08 = new Paint(5);
        A01(colorStateList);
        this.A0A = new RectF();
        this.A09 = new Rect();
    }

    public final PorterDuffColorFilter A00(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void A01(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.A02 = colorStateList;
        this.A08.setColor(colorStateList.getColorForState(getState(), this.A02.getDefaultColor()));
    }

    public final void A02(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.A0A;
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        Rect rect2 = this.A09;
        rect2.set(rect);
        if (this.A06) {
            float f = this.A00;
            float f2 = this.A01;
            boolean z = this.A07;
            float A002 = C13810l3.A00(f, f2, z);
            if (z) {
                f = (float) (((1.0d - C13810l3.A0H) * ((double) f2)) + ((double) f));
            }
            rect2.inset((int) Math.ceil((double) f), (int) Math.ceil((double) A002));
            rectF.set(rect2);
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.A08;
        if (this.A05 == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.A05);
            z = true;
        }
        RectF rectF = this.A0A;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.A09, this.A01);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A03;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.A02) != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A02(rect);
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.A02;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.A08;
        boolean z = false;
        if (colorForState != paint.getColor()) {
            z = true;
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.A03;
        if (colorStateList2 == null || (mode = this.A04) == null) {
            return z;
        }
        this.A05 = A00(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.A08.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A03 = colorStateList;
        this.A05 = A00(colorStateList, this.A04);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.A04 = mode;
        this.A05 = A00(this.A03, mode);
        invalidateSelf();
    }
}
