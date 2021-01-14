package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.1Gk  reason: invalid class name */
public class AnonymousClass1Gk extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public final Paint A03;
    public final Paint A04 = new Paint(5);
    public final Rect A05;
    public final RectF A06;
    public final RectF A07;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass1Gk() {
        Paint paint = new Paint(1);
        this.A03 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A07 = new RectF();
        this.A05 = new Rect();
        this.A06 = new RectF();
    }

    public void draw(Canvas canvas) {
        RectF rectF = this.A07;
        float f = this.A02;
        canvas.drawRoundRect(rectF, f, f, this.A04);
        Paint paint = this.A03;
        if (paint.getStrokeWidth() != 0.0f) {
            RectF rectF2 = this.A06;
            float f2 = this.A01;
            canvas.drawRoundRect(rectF2, f2, f2, paint);
        }
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.A05, this.A02);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A07.set(rect);
        this.A05.set(rect.left, rect.top, rect.right, rect.bottom);
        RectF rectF = this.A06;
        float f = this.A00;
        rectF.set(((float) rect.left) + f, ((float) rect.top) + f, ((float) rect.right) - f, ((float) rect.bottom) - f);
    }
}
