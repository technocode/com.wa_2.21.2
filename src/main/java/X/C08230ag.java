package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.0ag  reason: invalid class name and case insensitive filesystem */
public class C08230ag extends Drawable {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public boolean A08 = true;
    public final Paint A09;
    public final Rect A0A = new Rect();
    public final RectF A0B = new RectF();
    public final C08240ah A0C = new C08240ah(this);

    public C08230ag() {
        Paint paint = new Paint(1);
        this.A09 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public void draw(Canvas canvas) {
        if (this.A08) {
            Paint paint = this.A09;
            Rect rect = this.A0A;
            copyBounds(rect);
            float height = this.A00 / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C004402b.A02(this.A06, this.A04), C004402b.A02(this.A05, this.A04), C004402b.A02(C004402b.A03(this.A05, 0), this.A04), C004402b.A02(C004402b.A03(this.A02, 0), this.A04), C004402b.A02(this.A02, this.A04), C004402b.A02(this.A03, this.A04)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.A08 = false;
        }
        Paint paint2 = this.A09;
        float strokeWidth = paint2.getStrokeWidth() / 2.0f;
        RectF rectF = this.A0B;
        Rect rect2 = this.A0A;
        copyBounds(rect2);
        rectF.set(rect2);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.A01, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, paint2);
        canvas.restore();
    }

    public Drawable.ConstantState getConstantState() {
        return this.A0C;
    }

    public int getOpacity() {
        return this.A00 > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.A00);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.A07;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        this.A08 = true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.A07;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.A04)) == this.A04)) {
            this.A08 = true;
            this.A04 = colorForState;
        }
        if (this.A08) {
            invalidateSelf();
        }
        return this.A08;
    }

    public void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
