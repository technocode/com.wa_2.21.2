package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.2Ia  reason: invalid class name and case insensitive filesystem */
public class C47482Ia extends Drawable {
    public final Paint A00;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C47482Ia(int i) {
        Paint paint = new Paint(1);
        this.A00 = paint;
        if (paint.getColor() != i) {
            this.A00.setColor(i);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), this.A00);
    }
}
