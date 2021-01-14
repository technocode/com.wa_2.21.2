package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.2ch  reason: invalid class name and case insensitive filesystem */
public class C53202ch extends AbstractC48582Mw {
    public final Matrix A00 = new Matrix();
    public final Paint A01 = new Paint(1);
    public final Path A02 = new Path();
    public final Path A03 = new Path();

    public C53202ch() {
        double radians = Math.toRadians(35.0d);
        float cos = (float) (Math.cos(radians) * 1000.0d);
        float sin = (float) (Math.sin(radians) * 1000.0d);
        double radians2 = Math.toRadians(55.0d);
        float cos2 = (float) (Math.cos(radians2) * 1000.0d);
        float sin2 = (float) (Math.sin(radians2) * 1000.0d);
        this.A02.addArc(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), 55.0f, 340.0f);
        this.A02.moveTo(cos, sin);
        this.A02.lineTo(1200.0f, 1200.0f);
        this.A02.lineTo(cos2, sin2);
    }

    @Override // X.AbstractC48582Mw
    public float A00() {
        return (super.A00() * 3.0f) / 2.0f;
    }

    @Override // X.AbstractC48582Mw
    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = (f2 + f4) / 2.0f;
        float f6 = (((f3 - f) * 2.0f) / 3.0f) / 2.0f;
        super.A0E(rectF, f, f5 - f6, f3, f5 + f6);
    }
}
