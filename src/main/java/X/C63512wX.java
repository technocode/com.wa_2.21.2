package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;

/* renamed from: X.2wX  reason: invalid class name and case insensitive filesystem */
public class C63512wX extends BulletSpan {
    public static Path A01;
    public final int A00;

    public C63512wX(int i) {
        super(i);
        this.A00 = i;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            if (canvas.isHardwareAccelerated()) {
                if (A01 == null) {
                    Path path = new Path();
                    A01 = path;
                    path.addCircle(0.0f, 0.0f, 7.2000003f, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate((float) ((i2 * 6) + i + 6), ((float) (i3 + i5)) / 2.0f);
                canvas.drawPath(A01, paint);
                canvas.restore();
            } else {
                canvas.drawCircle((float) ((i2 * 6) + i + 6), ((float) (i3 + i5)) / 2.0f, 6.0f, paint);
            }
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z) {
        return this.A00 + 12;
    }
}
