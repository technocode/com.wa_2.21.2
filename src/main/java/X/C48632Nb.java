package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.2Nb  reason: invalid class name and case insensitive filesystem */
public class C48632Nb extends Drawable {
    public final float A00;
    public final Paint A01 = new Paint();
    public final int[] A02;

    public int getOpacity() {
        return -1;
    }

    public C48632Nb(int[] iArr, float f) {
        this.A02 = iArr;
        this.A00 = f;
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width();
        int height = getBounds().height();
        Paint paint = this.A01;
        paint.setTextSize(((float) width) * this.A00);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(255);
        paint.setTextAlign(Paint.Align.CENTER);
        int i = width >> 1;
        int ascent = (int) (((float) (height >> 1)) - ((paint.ascent() + paint.descent()) / 2.0f));
        int[] iArr = this.A02;
        StringBuilder sb = new StringBuilder();
        for (int i2 : iArr) {
            sb.appendCodePoint(i2);
        }
        String obj = sb.toString();
        if (!C05280Nx.A00(paint, obj)) {
            obj = "□";
        }
        canvas.drawText(obj, (float) i, (float) ascent, paint);
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
