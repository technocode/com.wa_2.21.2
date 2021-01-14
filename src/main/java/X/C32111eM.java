package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.1eM  reason: invalid class name and case insensitive filesystem */
public class C32111eM extends AbstractC19160uZ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public Bitmap A08;
    public final float A09;

    public C32111eM(C32031eE r16) {
        super(r16);
        float f = super.A06;
        float f2 = f * 12.0f;
        this.A05 = f2;
        this.A00 = 0.4f * f;
        float f3 = 16.0f * f;
        this.A03 = f3;
        this.A06 = f2;
        this.A07 = 4.8f * f;
        this.A04 = 1.6f * f;
        this.A09 = f * 44.0f;
        super.A03 = 5;
        super.A02 = 1.0f;
        super.A05 = false;
        int ceil = (int) Math.ceil((double) (f3 * 1.08f * 2.0f));
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        this.A08 = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        float f4 = ((float) ceil) / 2.0f;
        float f5 = this.A04;
        float f6 = f4 - f5;
        float f7 = f5 + f4;
        RectF rectF = new RectF(f6, f6, f7, f7);
        float f8 = 1.08f * this.A03;
        RadialGradient radialGradient = new RadialGradient(f4, f4, f8, new int[]{570425344, 570425344, 0}, new float[]{0.9259259f, 0.9259259f, 1.0f}, Shader.TileMode.CLAMP);
        Path path = new Path();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setShader(radialGradient);
        canvas.drawCircle(f4, f4, f8, paint);
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(style);
        paint.setColor(-2046820353);
        canvas.drawCircle(f4, f4, this.A03, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-6118750);
        paint.setStrokeWidth(this.A00);
        canvas.drawCircle(f4, f4, this.A03, paint);
        paint.setFlags(1);
        paint.setStyle(style);
        paint.setColor(-1365724);
        path.reset();
        path.moveTo(f4 - this.A07, f4);
        path.lineTo(f4 - this.A04, f4);
        path.addArc(rectF, 180.0f, 90.0f);
        path.lineTo(f4, f4 - this.A06);
        path.lineTo(f4 - this.A07, f4);
        path.close();
        canvas.drawPath(path, paint);
        paint.setStyle(style);
        paint.setColor(-2811114);
        path.reset();
        path.moveTo(this.A07 + f4, f4);
        path.lineTo(this.A04 + f4, f4);
        path.addArc(rectF, 0.0f, -90.0f);
        path.lineTo(f4, f4 - this.A06);
        path.lineTo(this.A07 + f4, f4);
        path.close();
        canvas.drawPath(path, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-4013374);
        path.reset();
        path.moveTo(f4 - this.A07, f4);
        path.lineTo(f4 - this.A04, f4);
        path.addArc(rectF, 180.0f, -90.0f);
        path.lineTo(f4, this.A06 + f4);
        path.lineTo(f4 - this.A07, f4);
        path.close();
        canvas.drawPath(path, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-2434342);
        path.reset();
        path.moveTo(this.A07 + f4, f4);
        path.lineTo(this.A04 + f4, f4);
        path.addArc(rectF, 0.0f, 90.0f);
        path.lineTo(f4, this.A06 + f4);
        path.lineTo(this.A07 + f4, f4);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override // X.AbstractC19160uZ
    public void A02(Canvas canvas) {
        canvas.save();
        float f = this.A0A.A0R.A00.A0E.A0B;
        if (f < 0.0f) {
            f += 360.0f;
        }
        canvas.rotate(f, this.A01, this.A02);
        Bitmap bitmap = this.A08;
        float f2 = this.A01;
        float f3 = this.A03;
        canvas.drawBitmap(bitmap, f2 - f3, this.A02 - f3, (Paint) null);
        canvas.restore();
    }
}
