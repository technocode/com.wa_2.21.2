package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;

/* renamed from: X.2c8  reason: invalid class name */
public class AnonymousClass2c8 extends AnonymousClass2MZ {
    public final int A00;
    public final Path A01;

    public AnonymousClass2c8(int i, Handler handler, ViewGroup viewGroup, RectF rectF, Vibrator vibrator) {
        super(handler, viewGroup, rectF, vibrator);
        float f;
        float centerY;
        float f2;
        float centerY2;
        this.A00 = i;
        if (i == 1) {
            RectF rectF2 = this.A03;
            f = rectF2.left;
            centerY = rectF2.centerY();
            f2 = rectF2.right;
            centerY2 = rectF2.centerY();
        } else if (i == 2) {
            RectF rectF3 = this.A03;
            f = rectF3.centerX();
            centerY = rectF3.top;
            f2 = rectF3.centerX();
            centerY2 = rectF3.bottom;
        } else {
            throw new IllegalArgumentException("Unknown guideline type.");
        }
        Path path = new Path();
        path.rewind();
        path.moveTo(f, centerY);
        path.lineTo(f2, centerY2);
        this.A01 = path;
    }
}
