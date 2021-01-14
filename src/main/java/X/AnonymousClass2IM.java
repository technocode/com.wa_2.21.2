package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.2IM  reason: invalid class name */
public class AnonymousClass2IM extends Drawable {
    public final Paint A00 = new Paint(1);
    public final /* synthetic */ AnonymousClass2IO A01;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass2IM(AnonymousClass2IO r3) {
        this.A01 = r3;
    }

    public void draw(Canvas canvas) {
        AnonymousClass2IO r2 = this.A01;
        float f = r2.A00;
        if (f > 0.0f) {
            int i = ((AnonymousClass2I2) r2.A09).A0T.A00;
            int i2 = (i & 16777215) | (((int) (((float) (i >> 24)) * f)) << 24);
            Paint paint = this.A00;
            paint.setColor(i2);
            canvas.drawRect(getBounds(), paint);
        }
    }
}
