package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.1Kp  reason: invalid class name and case insensitive filesystem */
public class C26371Kp extends ReplacementSpan {
    public int A00;

    public C26371Kp(int i) {
        this.A00 = i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.setColor(this.A00);
        canvas.drawText(charSequence, i, i2, (float) ((int) ((f + ((float) (getSize(paint, charSequence, i, i2, null) >> 1))) - (paint.measureText(charSequence, i, i2) / 2.0f))), (float) i4, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return Math.round((C002301g.A0K.A00 * 2.0f * 10.0f) + paint.measureText(charSequence, charSequence.length(), charSequence.length()));
    }
}
