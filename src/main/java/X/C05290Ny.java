package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.0Ny  reason: invalid class name and case insensitive filesystem */
public class C05290Ny extends ReplacementSpan {
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText("□", f, (float) i4, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil((double) paint.measureText("□"));
    }
}
