package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.06S  reason: invalid class name */
public final class AnonymousClass06S implements AnonymousClass06R {
    public Integer A00;

    @Override // X.AnonymousClass06R
    public boolean AMv() {
        return false;
    }

    public static Drawable A00(AnonymousClass05r r5, int i, AnonymousClass06Q r7) {
        float f;
        int A002;
        AnonymousClass1Gk r4 = new AnonymousClass1Gk();
        float f2 = 0.0f;
        if (r7 == null) {
            f = 0.0f;
            A002 = 0;
        } else {
            f = r7.A01;
            A002 = r7.A00(r5);
            f2 = r7.A00;
        }
        r4.A04.setColor(i);
        Paint paint = r4.A03;
        paint.setColor(A002);
        paint.setStrokeWidth(f2);
        r4.A02 = f;
        float f3 = f2 / 2.0f;
        r4.A00 = f3;
        r4.A01 = f - f3;
        return r4;
    }

    @Override // X.AnonymousClass06R
    public Drawable A3G(AnonymousClass05r r2, AnonymousClass06Q r3) {
        return A00(r2, this.A00.intValue(), r3);
    }
}
