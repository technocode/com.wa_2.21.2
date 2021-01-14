package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.1tJ  reason: invalid class name and case insensitive filesystem */
public class C40461tJ extends C06480Tk {
    public final AnonymousClass01X A00;

    public C40461tJ(AnonymousClass01X r2, Drawable drawable) {
        super(drawable, A00(r2));
        this.A00 = r2;
    }

    public static boolean A00(AnonymousClass01X r1) {
        return r1.A02().A06 && !r1.A04().equals("iw");
    }

    @Override // X.C06480Tk
    public void draw(Canvas canvas) {
        boolean A002 = A00(this.A00);
        if (super.A00 != A002) {
            super.A00 = A002;
            invalidateSelf();
        }
        super.draw(canvas);
    }

    @Override // X.C06480Tk
    public boolean getPadding(Rect rect) {
        boolean A002 = A00(this.A00);
        if (super.A00 != A002) {
            super.A00 = A002;
            invalidateSelf();
        }
        return super.getPadding(rect);
    }
}
