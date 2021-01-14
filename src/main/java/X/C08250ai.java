package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.0ai  reason: invalid class name and case insensitive filesystem */
public class C08250ai extends C08260aj {
    public static final double A0F = Math.cos(Math.toRadians(45.0d));
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Path A05;
    public boolean A06 = true;
    public boolean A07 = true;
    public boolean A08 = false;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final RectF A0E;

    @Override // X.C08260aj
    public int getOpacity() {
        return -3;
    }

    public C08250ai(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.A0B = C004302a.A00(context, R.color.design_fab_shadow_start_color);
        this.A0A = C004302a.A00(context, R.color.design_fab_shadow_mid_color);
        this.A09 = C004302a.A00(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.A0C = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A00 = (float) Math.round(f);
        this.A0E = new RectF();
        Paint paint2 = new Paint(this.A0C);
        this.A0D = paint2;
        paint2.setAntiAlias(false);
        A00(f2, f3);
    }

    public void A00(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        int round = Math.round(f);
        if (round % 2 == 1) {
            round--;
        }
        float f3 = (float) round;
        int round2 = Math.round(f2);
        if (round2 % 2 == 1) {
            round2--;
        }
        float f4 = (float) round2;
        if (f3 > f4) {
            if (!this.A08) {
                this.A08 = true;
            }
            f3 = f4;
        }
        if (this.A02 != f3 || this.A01 != f4) {
            this.A02 = f3;
            this.A01 = f4;
            this.A04 = (float) Math.round(f3 * 1.5f);
            this.A07 = true;
            invalidateSelf();
        }
    }

    @Override // X.C08260aj
    public void draw(Canvas canvas) {
        boolean z;
        if (this.A07) {
            Rect bounds = getBounds();
            float f = this.A01;
            float f2 = 1.5f * f;
            RectF rectF = this.A0E;
            rectF.set(((float) bounds.left) + f, ((float) bounds.top) + f2, ((float) bounds.right) - f, ((float) bounds.bottom) - f2);
            super.A00.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            float f3 = this.A00;
            float f4 = -f3;
            RectF rectF2 = new RectF(f4, f4, f3, f3);
            RectF rectF3 = new RectF(rectF2);
            float f5 = -this.A04;
            rectF3.inset(f5, f5);
            Path path = this.A05;
            if (path == null) {
                this.A05 = new Path();
            } else {
                path.reset();
            }
            this.A05.setFillType(Path.FillType.EVEN_ODD);
            this.A05.moveTo(-this.A00, 0.0f);
            this.A05.rLineTo(-this.A04, 0.0f);
            this.A05.arcTo(rectF3, 180.0f, 90.0f, false);
            this.A05.arcTo(rectF2, 270.0f, -90.0f, false);
            this.A05.close();
            float f6 = -rectF3.top;
            if (f6 > 0.0f) {
                float f7 = this.A00 / f6;
                this.A0C.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{0, this.A0B, this.A0A, this.A09}, new float[]{0.0f, f7, ((1.0f - f7) / 2.0f) + f7, 1.0f}, Shader.TileMode.CLAMP));
            }
            Paint paint = this.A0D;
            z = true;
            paint.setShader(new LinearGradient(0.0f, rectF2.top, 0.0f, rectF3.top, new int[]{this.A0B, this.A0A, this.A09}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAntiAlias(false);
            this.A07 = false;
        } else {
            z = true;
        }
        int save = canvas.save();
        float f8 = this.A03;
        RectF rectF4 = this.A0E;
        canvas.rotate(f8, rectF4.centerX(), rectF4.centerY());
        float f9 = this.A00;
        float f10 = (-f9) - this.A04;
        float f11 = f9 * 2.0f;
        boolean z2 = false;
        if (rectF4.width() - f11 > 0.0f) {
            z2 = true;
        }
        if (rectF4.height() - f11 <= 0.0f) {
            z = false;
        }
        float f12 = this.A02;
        float f13 = f12 - (0.25f * f12);
        float f14 = f12 - (0.5f * f12);
        float f15 = f9 / (f14 + f9);
        float f16 = f9 / (f13 + f9);
        float f17 = f9 / ((f12 - (f12 * 1.0f)) + f9);
        int save2 = canvas.save();
        canvas.translate(rectF4.left + f9, rectF4.top + f9);
        canvas.scale(f15, f16);
        Path path2 = this.A05;
        Paint paint2 = this.A0C;
        canvas.drawPath(path2, paint2);
        if (z2) {
            canvas.scale(1.0f / f15, 1.0f);
            canvas.drawRect(0.0f, f10, rectF4.width() - f11, -this.A00, this.A0D);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(rectF4.right - f9, rectF4.bottom - f9);
        canvas.scale(f15, f17);
        canvas.rotate(180.0f);
        canvas.drawPath(this.A05, paint2);
        if (z2) {
            canvas.scale(1.0f / f15, 1.0f);
            canvas.drawRect(0.0f, f10, rectF4.width() - f11, (-this.A00) + this.A04, this.A0D);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(rectF4.left + f9, rectF4.bottom - f9);
        canvas.scale(f15, f17);
        canvas.rotate(270.0f);
        canvas.drawPath(this.A05, paint2);
        if (z) {
            canvas.scale(1.0f / f17, 1.0f);
            canvas.drawRect(0.0f, f10, rectF4.height() - f11, -this.A00, this.A0D);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        canvas.translate(rectF4.right - f9, rectF4.top + f9);
        canvas.scale(f15, f16);
        canvas.rotate(90.0f);
        canvas.drawPath(this.A05, paint2);
        if (z) {
            canvas.scale(1.0f / f16, 1.0f);
            canvas.drawRect(0.0f, f10, rectF4.height() - f11, -this.A00, this.A0D);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(save);
        super.A00.draw(canvas);
    }

    @Override // X.C08260aj
    public boolean getPadding(Rect rect) {
        float f = this.A01;
        float f2 = this.A00;
        boolean z = this.A06;
        float f3 = 1.5f * f;
        if (z) {
            f3 = (float) (((1.0d - A0F) * ((double) f2)) + ((double) f3));
        }
        int ceil = (int) Math.ceil((double) f3);
        if (z) {
            f = (float) (((1.0d - A0F) * ((double) f2)) + ((double) f));
        }
        int ceil2 = (int) Math.ceil((double) f);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // X.C08260aj
    public void onBoundsChange(Rect rect) {
        this.A07 = true;
    }

    @Override // X.C08260aj
    public void setAlpha(int i) {
        super.A00.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A0D.setAlpha(i);
    }
}
