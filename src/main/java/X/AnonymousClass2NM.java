package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.2NM  reason: invalid class name */
public final class AnonymousClass2NM extends InsetDrawable {
    public int A00;
    public final Drawable A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2NM(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r1 = X.C002001d.A0d(r3)
            r0 = 0
            r2.<init>(r1, r0)
            r2.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2NM.<init>(android.graphics.drawable.Drawable):void");
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.A01;
        drawable.setBounds(bounds.left + 0, bounds.top + this.A00, bounds.right - 0, bounds.bottom - 0);
        drawable.draw(canvas);
    }

    public void setTint(int i) {
        C002001d.A2Z(this.A01, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C002001d.A2b(this.A01, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A01;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        C002001d.A2c(drawable, mode);
    }
}
