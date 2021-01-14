package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.2Mk  reason: invalid class name and case insensitive filesystem */
public class C48482Mk extends Drawable {
    public final Paint A00;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C48482Mk() {
        Paint paint = new Paint(1);
        this.A00 = paint;
        paint.setColor(285212672);
        this.A00.setStyle(Paint.Style.FILL);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (bounds.width() >> 1), this.A00);
    }
}
