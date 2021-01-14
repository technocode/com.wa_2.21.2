package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* renamed from: X.1ee  reason: invalid class name and case insensitive filesystem */
public final class C32291ee implements AbstractC19580vG {
    public final /* synthetic */ float A00 = 240.0f;

    @Override // X.AbstractC19580vG
    public Bitmap A3E() {
        float f = this.A00;
        Paint paint = new Paint(1);
        float f2 = C19590vH.A00 * 10.0f;
        int round = Math.round(2.0f * f2);
        int round2 = Math.round(3.0f * f2);
        Bitmap createBitmap = Bitmap.createBitmap(round + 10, round2 + 10, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        float[] fArr = {f, 1.0f, 1.0f};
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = 0.8f;
        int HSVToColor2 = Color.HSVToColor(fArr);
        fArr[2] = 0.5f;
        int HSVToColor3 = Color.HSVToColor(fArr);
        paint.setColor(HSVToColor);
        float f3 = 5.0f + f2;
        float f4 = (float) (round2 + 5);
        C19590vH.A02(canvas, paint, f3, f4, f2);
        paint.setColor(HSVToColor3);
        canvas.drawCircle(f3, f3, f2 / 2.5f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C19590vH.A00);
        paint.setColor(HSVToColor2);
        C19590vH.A02(canvas, paint, f3, f4, f2);
        return createBitmap;
    }
}
