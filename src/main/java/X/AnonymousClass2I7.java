package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.2I7  reason: invalid class name */
public class AnonymousClass2I7 extends Drawable {
    public void draw(Canvas canvas) {
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onLevelChange(int i) {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        return true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean setState(int[] iArr) {
        invalidateSelf();
        return true;
    }
}
