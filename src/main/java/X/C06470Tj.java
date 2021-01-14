package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Tj  reason: invalid class name and case insensitive filesystem */
public class C06470Tj extends C06480Tk {
    public final AnonymousClass01X A00;

    public C06470Tj(AnonymousClass01X r2, Drawable drawable) {
        super(drawable, r2.A02().A06);
        this.A00 = r2;
    }

    @Override // X.C06480Tk
    public void draw(Canvas canvas) {
        boolean z = this.A00.A02().A06;
        if (super.A00 != z) {
            super.A00 = z;
            invalidateSelf();
        }
        super.draw(canvas);
    }

    @Override // X.C06480Tk
    public boolean getPadding(Rect rect) {
        boolean z = this.A00.A02().A06;
        if (super.A00 != z) {
            super.A00 = z;
            invalidateSelf();
        }
        return super.getPadding(rect);
    }
}
