package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.11P  reason: invalid class name */
public final class AnonymousClass11P extends Drawable {
    public ValueAnimator A00;
    public AnonymousClass11N A01;
    public final ValueAnimator.AnimatorUpdateListener A02 = new AnonymousClass11O(this);
    public final Matrix A03 = new Matrix();
    public final Paint A04 = new Paint();
    public final Rect A05 = new Rect();

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass11P() {
        this.A04.setAntiAlias(true);
    }

    public void A00() {
        AnonymousClass11N r0;
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null && !valueAnimator.isStarted() && (r0 = this.A01) != null && r0.A0G && getCallback() != null) {
            this.A00.start();
        }
    }

    public final void A01() {
        AnonymousClass11N r2;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (r2 = this.A01) != null) {
            int i = r2.A08;
            if (i <= 0) {
                i = Math.round(r2.A04 * ((float) width));
            }
            int i2 = r2.A07;
            if (i2 <= 0) {
                i2 = Math.round(r2.A01 * ((float) height));
            }
            if (r2.A0C != 1) {
                int i3 = r2.A06;
                if (i3 == 1 || i3 == 3) {
                    i = 0;
                } else {
                    i2 = 0;
                }
                radialGradient = new LinearGradient(0.0f, 0.0f, (float) i, (float) i2, r2.A0J, r2.A0I, Shader.TileMode.CLAMP);
            } else {
                radialGradient = new RadialGradient(((float) i) / 2.0f, ((float) i2) / 2.0f, (float) (((double) Math.max(i, i2)) / Math.sqrt(2.0d)), r2.A0J, r2.A0I, Shader.TileMode.CLAMP);
            }
            this.A04.setShader(radialGradient);
        }
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (this.A01 != null) {
            Paint paint = this.A04;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians((double) this.A01.A03));
                Rect rect = this.A05;
                float width = (((float) rect.width()) * tan) + ((float) rect.height());
                float height = (tan * ((float) rect.height())) + ((float) rect.width());
                ValueAnimator valueAnimator = this.A00;
                float f4 = 0.0f;
                if (valueAnimator != null) {
                    f = valueAnimator.getAnimatedFraction();
                } else {
                    f = 0.0f;
                }
                int i = this.A01.A06;
                if (i != 1) {
                    if (i == 2) {
                        f3 = height + (((-height) - height) * f);
                    } else if (i != 3) {
                        float f5 = -height;
                        f3 = ((height - f5) * f) + f5;
                    } else {
                        f2 = (((-width) - width) * f) + width;
                    }
                    f4 = f3;
                    f2 = 0.0f;
                } else {
                    float f6 = -width;
                    f2 = ((width - f6) * f) + f6;
                }
                Matrix matrix = this.A03;
                matrix.reset();
                matrix.setRotate(this.A01.A03, ((float) rect.width()) / 2.0f, ((float) rect.height()) / 2.0f);
                matrix.postTranslate(f4, f2);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    public int getOpacity() {
        AnonymousClass11N r1 = this.A01;
        if (r1 != null) {
            return (r1.A0H || r1.A0F) ? -3 : -1;
        }
        return -1;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A05.set(0, 0, rect.width(), rect.height());
        A01();
        A00();
    }
}
