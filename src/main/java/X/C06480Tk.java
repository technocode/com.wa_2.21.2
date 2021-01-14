package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.0Tk  reason: invalid class name and case insensitive filesystem */
public class C06480Tk extends InsetDrawable {
    public boolean A00;
    public boolean A01 = true;

    public C06480Tk(Drawable drawable, boolean z) {
        super(drawable, 0);
        this.A00 = z;
    }

    public void draw(Canvas canvas) {
        if (!this.A00) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().exactCenterX(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        boolean padding = super.getPadding(rect);
        if (this.A00) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        return padding;
    }
}
