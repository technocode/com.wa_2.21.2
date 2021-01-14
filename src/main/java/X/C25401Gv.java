package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.1Gv  reason: invalid class name and case insensitive filesystem */
public final class C25401Gv {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public boolean A04;
    public final Paint A05 = new Paint(1);
    public final Paint A06 = new Paint(1);
    public final Path A07 = new Path();
    public final Path A08 = new Path();
    public final RectF A09 = new RectF();
    public final RectF A0A = new RectF();
    public final View A0B;
    public final float[] A0C = new float[8];

    public C25401Gv(View view) {
        this.A0B = view;
    }

    public void A00(int i, int i2, float f, float f2, int i3) {
        this.A03 = i3;
        this.A01 = f;
        this.A02 = f2;
        Paint paint = this.A06;
        paint.setColor(i);
        if (i == 0) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        Paint paint2 = this.A05;
        paint2.setColor(i2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.A01);
        this.A08.setFillType(Path.FillType.EVEN_ODD);
    }

    public final void A01(Path path, RectF rectF, Float f, int i) {
        float[] fArr = this.A0C;
        float floatValue = f.floatValue();
        if ((i & 1) != 0) {
            fArr[0] = floatValue;
            fArr[1] = floatValue;
        }
        if ((i & 2) != 0) {
            fArr[2] = floatValue;
            fArr[3] = floatValue;
        }
        if ((i & 4) != 0) {
            fArr[4] = floatValue;
            fArr[5] = floatValue;
        }
        if ((i & 8) != 0) {
            fArr[6] = floatValue;
            fArr[7] = floatValue;
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }
}
