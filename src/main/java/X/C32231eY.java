package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.location.Location;

/* renamed from: X.1eY  reason: invalid class name and case insensitive filesystem */
public class C32231eY extends AbstractC19160uZ implements AbstractC19530vB {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final Paint A0B = new Paint(1);
    public final Path A0C = new Path();
    public final C19480v6 A0D = new C19480v6();
    public final C19540vC A0E;

    public C32231eY(C32031eE r5) {
        super(r5);
        super.A03 = 3;
        super.A02 = 0.0f;
        float f = super.A06;
        this.A08 = 8.0f * f;
        float f2 = 11.0f * f;
        this.A0A = f2;
        this.A09 = f2 + 1.5f;
        this.A07 = 12.0f * f;
        this.A06 = 10.0f * f;
        float f3 = f * 24.0f;
        this.A05 = f3;
        this.A04 = f3 * 2.0f;
        C19540vC A002 = C19540vC.A00(0.0f, 1.0f);
        this.A0E = A002;
        A002.A05 = -1;
        A002.A07(this);
        A002.A05(2100);
    }

    @Override // X.AbstractC19160uZ
    public void A02(Canvas canvas) {
        Location location = super.A0A.A0U.A00;
        if (location != null) {
            float max = Math.max(this.A05, Math.min(this.A04, location.getAccuracy()));
            Paint paint = this.A0B;
            paint.setColor(-12888163);
            paint.setAlpha((int) ((1.0f - this.A01) * 255.0f));
            C19250ui r11 = super.A0B;
            C19480v6 r9 = this.A0D;
            r11.A0A(r9);
            double A022 = (double) C19250ui.A02(location.getLongitude());
            double A012 = (double) C19250ui.A01(location.getLatitude());
            float[] fArr = super.A0D;
            r11.A08(((double) ((int) Math.ceil(r9.A01 - A022))) + A022, A012, fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            canvas.drawCircle(f, f2, max * this.A01, paint);
            paint.setColor(-3355444);
            float f3 = this.A09;
            canvas.drawCircle(f, f2, f3, paint);
            paint.setColor(-1);
            canvas.drawCircle(f, f2, this.A0A, paint);
            paint.setColor(-12888163);
            paint.setAlpha((int) (this.A00 * 255.0f));
            canvas.drawCircle(f, f2, this.A00 * this.A08, paint);
            if (location.hasBearing()) {
                canvas.save();
                float f4 = r11.A00.A0E.A0B;
                if (f4 < 0.0f) {
                    f4 += 360.0f;
                }
                canvas.rotate(location.getBearing() + f4, f, f2);
                float f5 = this.A07;
                float f6 = f5 / 2.0f;
                float f7 = f - f6;
                float f8 = f2 - f3;
                Path path = this.A0C;
                path.reset();
                path.moveTo(f7, f8);
                float f9 = this.A06;
                path.lineTo(f6 + f7, f8 - f9);
                path.lineTo(f5 + f7, f8);
                path.lineTo((f5 * 0.5f) + f7, f8 - (f9 * 0.25f));
                path.lineTo(f7, f8);
                path.close();
                canvas.drawPath(path, paint);
                canvas.restore();
            }
        }
    }

    @Override // X.AbstractC19530vB
    public void ACr(C19540vC r5) {
        float f = r5.A00;
        this.A01 = f;
        if (f < this.A02) {
            this.A03 = !this.A03;
        }
        if (this.A03) {
            this.A00 = 1.0f - ((1.0f - f) * 0.25f);
        } else {
            this.A00 = 1.0f - (f * 0.25f);
        }
        this.A02 = f;
        A00();
    }
}
