package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.1eX  reason: invalid class name and case insensitive filesystem */
public class C32221eX extends AbstractC19160uZ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public boolean A0D;
    public final float A0E;
    public final Paint A0F = new Paint(1);

    public C32221eX(C32031eE r6) {
        super(r6);
        float f = super.A06;
        this.A08 = 12.0f * f;
        float f2 = 37.0f * f;
        this.A05 = f2;
        this.A00 = 0.5f * f;
        this.A0B = f * 2.0f;
        this.A07 = 5.0f * f;
        this.A09 = 8.0f * f;
        this.A0A = f * 3.0f;
        float f3 = f * 48.0f;
        this.A0E = f3;
        super.A03 = 5;
        super.A02 = 3.0f;
        this.A03 = (f3 - f2) / 2.0f;
        super.A05 = false;
    }

    @Override // X.AbstractC19160uZ
    public void A02(Canvas canvas) {
        C32031eE r1 = super.A0A;
        float f = this.A08;
        float width = (((float) r1.A0E.getWidth()) - f) - ((float) r1.A05);
        this.A04 = width;
        float f2 = f + ((float) r1.A06);
        this.A06 = f2;
        float f3 = this.A05 / 2.0f;
        this.A01 = width - f3;
        this.A02 = f3 + f2;
        this.A0C = this.A09 + this.A0A;
        Paint paint = this.A0F;
        paint.setStyle(Paint.Style.FILL);
        int i = -1;
        if (this.A0D) {
            i = -2236963;
        }
        paint.setColor(i);
        paint.setAlpha(230);
        float f4 = this.A04;
        float f5 = this.A05;
        float f6 = this.A06;
        canvas.drawRect(f4 - f5, f6, f4, f6 + f5, paint);
        paint.setColor(-7829368);
        canvas.drawCircle(this.A01, this.A02, this.A07, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.A0B);
        canvas.drawCircle(this.A01, this.A02, this.A09, paint);
        float f7 = this.A01;
        float f8 = this.A02;
        canvas.drawLine(f7, f8 - this.A09, f7, f8 - this.A0C, paint);
        float f9 = this.A01;
        float f10 = this.A02;
        canvas.drawLine(f9, f10 + this.A09, f9, f10 + this.A0C, paint);
        float f11 = this.A01;
        float f12 = this.A02;
        canvas.drawLine(f11 - this.A09, f12, f11 - this.A0C, f12, paint);
        float f13 = this.A01;
        float f14 = this.A02;
        canvas.drawLine(f13 + this.A09, f14, f13 + this.A0C, f14, paint);
        paint.setStrokeWidth(this.A00);
        paint.setColor(-3355444);
        float f15 = this.A04;
        float f16 = this.A05;
        float f17 = this.A06;
        canvas.drawRect(f15 - f16, f17, f15, f17 + f16, paint);
    }
}
