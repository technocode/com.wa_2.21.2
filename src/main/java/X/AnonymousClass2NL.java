package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.InsetDrawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.2NL  reason: invalid class name */
public class AnonymousClass2NL extends InsetDrawable {
    public int A00;
    public int A01;
    public final Rect A02 = new Rect();
    public final TextPaint A03 = new TextPaint();
    public final String A04;

    public AnonymousClass2NL(Context context, int i, String str, int i2) {
        super(C004302a.A03(context, i), 0);
        this.A04 = str;
        this.A03.setAntiAlias(true);
        this.A03.setColor(C004302a.A00(context, 17170443));
        this.A03.setTextSize((float) i2);
        this.A03.setTextAlign(Paint.Align.CENTER);
        this.A03.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            if (!(this.A01 == getBounds().width() && this.A00 == getBounds().height())) {
                this.A01 = getBounds().width();
                int height = getBounds().height();
                this.A00 = height;
                float f = (float) (height >> 1);
                TextPaint textPaint = this.A03;
                textPaint.setTextSize(f);
                int length = str.length();
                Rect rect = this.A02;
                textPaint.getTextBounds(str, 0, length, rect);
                float f2 = f;
                float f3 = f;
                float f4 = 2.0f;
                while (f2 - f4 > 2.0f) {
                    textPaint.setTextSize(f3);
                    textPaint.getTextBounds(str, 0, length, rect);
                    if (rect.width() >= (this.A01 << 3) / 10 || rect.height() >= (this.A00 >> 1)) {
                        f2 = f3;
                    } else {
                        f4 = f3;
                        if (f == f3) {
                            break;
                        }
                    }
                    f3 = (f4 + f2) / 2.0f;
                }
                textPaint.setTextSize(f4);
            }
            float centerX = (float) getBounds().centerX();
            int centerY = getBounds().centerY();
            canvas.drawText(str, centerX, (float) ((this.A00 / 10) + (this.A02.height() >> 1) + centerY), this.A03);
        }
    }
}
