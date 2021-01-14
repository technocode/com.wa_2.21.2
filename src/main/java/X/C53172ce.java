package X;

import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.2ce  reason: invalid class name and case insensitive filesystem */
public class C53172ce extends AbstractC48582Mw {
    public C53172ce() {
        this.A03.setStyle(Paint.Style.STROKE);
    }

    @Override // X.AbstractC48582Mw
    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float min = Math.min(f5, f6);
        RectF rectF2 = this.A04;
        float f7 = (f5 - min) / 2.0f;
        float f8 = (f6 - min) / 2.0f;
        rectF2.set(f + f7, f2 + f8, f3 - f7, f4 - f8);
        rectF2.sort();
    }
}
