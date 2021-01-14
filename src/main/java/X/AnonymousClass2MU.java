package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.2MU  reason: invalid class name */
public class AnonymousClass2MU extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public boolean A04;
    public final int A05;
    public final Paint A06;
    public final Paint A07;
    public final Drawable A08;
    public final C002701k A09 = C002701k.A00();
    public final boolean A0A;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass2MU(Context context, int i) {
        boolean z = true;
        this.A07 = new Paint(1);
        this.A06 = new Paint(1);
        this.A01 = 1.0f;
        this.A07.setStyle(Paint.Style.FILL);
        this.A00 = (context.getResources().getDisplayMetrics().density * 3.0f) / 4.0f;
        this.A05 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        if (!C000300f.A00().A0D(AbstractC000400g.A24) && !this.A09.A0E(279)) {
            z = false;
        }
        this.A0A = z;
        if (!z) {
            this.A06.setColor(1073741824);
            this.A06.setStyle(Paint.Style.FILL);
            this.A06.setMaskFilter(new BlurMaskFilter(this.A00, BlurMaskFilter.Blur.OUTER));
        }
        if (i != 0) {
            this.A08 = C004302a.A03(context, i);
        }
    }

    public void A00(float f, int i) {
        this.A02 = f;
        this.A03 = i;
        this.A01 = 1.0f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float min = (float) ((Math.min(bounds.width(), bounds.height()) * 7) >> 4);
        if (this.A04) {
            if (!this.A0A) {
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), this.A00 + min, this.A06);
            }
            Paint paint = this.A07;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A03);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), min, paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-1);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A02 * 1.2f) / 2.0f, paint);
            if (Color.red(this.A03) > 240 && Color.green(this.A03) > 240 && Color.blue(this.A03) > 240) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.A00);
                int min2 = 255 - ((Math.min(Math.min(Color.red(this.A03), Color.green(this.A03)), Color.blue(this.A03)) - 240) * 3);
                paint.setColor(Color.argb(255, min2, min2, min2));
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A02 * 1.2f) / 2.0f, paint);
                return;
            }
            return;
        }
        if (this.A03 != 0) {
            if (!this.A0A) {
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), this.A00 + min, this.A06);
            }
            Paint paint2 = this.A07;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.A03);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), this.A01 * min, paint2);
        }
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setBounds(bounds.centerX() - (drawable.getIntrinsicWidth() >> 1), bounds.centerY() - (drawable.getIntrinsicHeight() >> 1), (drawable.getIntrinsicWidth() >> 1) + bounds.centerX(), (drawable.getIntrinsicHeight() >> 1) + bounds.centerY());
            drawable.draw(canvas);
        }
    }

    public int getIntrinsicHeight() {
        return this.A05;
    }

    public int getIntrinsicWidth() {
        return this.A05;
    }
}
