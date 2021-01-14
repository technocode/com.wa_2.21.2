package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.0l3  reason: invalid class name and case insensitive filesystem */
public class C13810l3 extends Drawable {
    public static AbstractC13800l2 A0G;
    public static final double A0H = Math.cos(Math.toRadians(45.0d));
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public ColorStateList A04;
    public Paint A05;
    public Paint A06;
    public Paint A07;
    public Path A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B = false;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final RectF A0F;

    public int getOpacity() {
        return -3;
    }

    public C13810l3(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.A0E = resources.getColor(R.color.cardview_shadow_start_color);
        this.A0D = resources.getColor(R.color.cardview_shadow_end_color);
        this.A0C = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        this.A07 = new Paint(5);
        A02(colorStateList);
        Paint paint = new Paint(5);
        this.A05 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A00 = (float) ((int) (f + 0.5f));
        this.A0F = new RectF();
        Paint paint2 = new Paint(this.A05);
        this.A06 = paint2;
        paint2.setAntiAlias(false);
        A01(f2, f3);
    }

    public static float A00(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        return (float) (((1.0d - A0H) * ((double) f2)) + ((double) f3));
    }

    public final void A01(float f, float f2) {
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            int i = (int) (f + 0.5f);
            if (i % 2 == 1) {
                i--;
            }
            float f3 = (float) i;
            int i2 = (int) (f2 + 0.5f);
            if (i2 % 2 == 1) {
                i2--;
            }
            float f4 = (float) i2;
            if (f3 > f4) {
                if (!this.A0B) {
                    this.A0B = true;
                }
                f3 = f4;
            }
            if (this.A02 != f3 || this.A01 != f4) {
                this.A02 = f3;
                this.A01 = f4;
                this.A03 = (float) ((int) ((f3 * 1.5f) + ((float) this.A0C) + 0.5f));
                this.A0A = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final void A02(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.A04 = colorStateList;
        this.A07.setColor(colorStateList.getColorForState(getState(), this.A04.getDefaultColor()));
    }

    public void draw(Canvas canvas) {
        if (this.A0A) {
            Rect bounds = getBounds();
            float f = this.A01;
            float f2 = 1.5f * f;
            this.A0F.set(((float) bounds.left) + f, ((float) bounds.top) + f2, ((float) bounds.right) - f, ((float) bounds.bottom) - f2);
            float f3 = this.A00;
            float f4 = -f3;
            RectF rectF = new RectF(f4, f4, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f5 = -this.A03;
            rectF2.inset(f5, f5);
            Path path = this.A08;
            if (path == null) {
                this.A08 = new Path();
            } else {
                path.reset();
            }
            this.A08.setFillType(Path.FillType.EVEN_ODD);
            this.A08.moveTo(-this.A00, 0.0f);
            this.A08.rLineTo(-this.A03, 0.0f);
            this.A08.arcTo(rectF2, 180.0f, 90.0f, false);
            this.A08.arcTo(rectF, 270.0f, -90.0f, false);
            this.A08.close();
            float f6 = this.A00;
            float f7 = this.A03 + f6;
            Paint paint = this.A05;
            int i = this.A0E;
            int i2 = this.A0D;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f7, new int[]{i, i, i2}, new float[]{0.0f, f6 / f7, 1.0f}, tileMode));
            Paint paint2 = this.A06;
            float f8 = -this.A00;
            float f9 = this.A03;
            paint2.setShader(new LinearGradient(0.0f, f8 + f9, 0.0f, f8 - f9, new int[]{i, i, i2}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
            this.A06.setAntiAlias(false);
            this.A0A = false;
        }
        canvas.translate(0.0f, this.A02 / 2.0f);
        float f10 = this.A00;
        float f11 = (-f10) - this.A03;
        float f12 = (this.A02 / 2.0f) + f10 + ((float) this.A0C);
        RectF rectF3 = this.A0F;
        float f13 = f12 * 2.0f;
        boolean z = false;
        if (rectF3.width() - f13 > 0.0f) {
            z = true;
        }
        boolean z2 = false;
        if (rectF3.height() - f13 > 0.0f) {
            z2 = true;
        }
        int save = canvas.save();
        canvas.translate(rectF3.left + f12, rectF3.top + f12);
        canvas.drawPath(this.A08, this.A05);
        if (z) {
            canvas.drawRect(0.0f, f11, rectF3.width() - f13, -this.A00, this.A06);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(rectF3.right - f12, rectF3.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z) {
            canvas.drawRect(0.0f, f11, rectF3.width() - f13, (-this.A00) + this.A03, this.A06);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z2) {
            canvas.drawRect(0.0f, f11, rectF3.height() - f13, -this.A00, this.A06);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(rectF3.right - f12, rectF3.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z2) {
            canvas.drawRect(0.0f, f11, rectF3.height() - f13, -this.A00, this.A06);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.A02) / 2.0f);
        A0G.A3w(canvas, rectF3, this.A00, this.A07);
    }

    public boolean getPadding(Rect rect) {
        float f = this.A01;
        float f2 = this.A00;
        boolean z = this.A09;
        int ceil = (int) Math.ceil((double) A00(f, f2, z));
        if (z) {
            f = (float) (((1.0d - A0H) * ((double) f2)) + ((double) f));
        }
        int ceil2 = (int) Math.ceil((double) f);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.A04;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0A = true;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.A04;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.A07.getColor() == colorForState) {
            return false;
        }
        this.A07.setColor(colorForState);
        this.A0A = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A05.setAlpha(i);
        this.A06.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }
}
