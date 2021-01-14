package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.2Ml  reason: invalid class name */
public class AnonymousClass2Ml extends Drawable {
    public final AbstractC48582Mw A00;
    public final boolean A01;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass2Ml(AbstractC48582Mw r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void draw(Canvas canvas) {
        AbstractC48582Mw r3;
        float A002;
        Rect bounds = getBounds();
        if (this.A01) {
            r3 = this.A00;
            A002 = r3.A00() / 2.0f;
        } else {
            r3 = this.A00;
            A002 = r3.A00();
        }
        r3.A0E(new RectF(), ((float) bounds.left) + A002, ((float) bounds.top) + A002, ((float) bounds.right) - A002, ((float) bounds.bottom) - A002);
        r3.A09(canvas);
    }
}
