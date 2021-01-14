package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.2IJ  reason: invalid class name */
public class AnonymousClass2IJ extends InsetDrawable {
    public int A00 = -1;
    public final Drawable A01;
    public final boolean A02;

    public AnonymousClass2IJ(Drawable drawable, boolean z) {
        super(drawable, 0);
        this.A01 = drawable;
        this.A02 = z;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        int i = this.A00;
        if (i >= 0) {
            int width = (i - bounds.width()) >> 1;
            if (this.A02) {
                drawable = this.A01;
                drawable.setBounds(bounds.left, bounds.top, (width << 1) + bounds.right, bounds.bottom);
            } else {
                drawable = this.A01;
                drawable.setBounds(bounds.left - width, bounds.top, bounds.right + width, bounds.bottom);
            }
            drawable.draw(canvas);
            return;
        }
        this.A01.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
        super.draw(canvas);
    }
}
