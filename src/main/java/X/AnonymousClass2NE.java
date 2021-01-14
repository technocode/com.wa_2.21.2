package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.2NE  reason: invalid class name */
public class AnonymousClass2NE extends Drawable {
    public int A00;
    public final Paint A01 = new Paint(1);

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void draw(Canvas canvas) {
        Paint paint = this.A01;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.A00);
        Rect bounds = getBounds();
        canvas.drawCircle(0.0f, 0.0f, (float) Math.min(bounds.width(), bounds.height()), paint);
    }
}
