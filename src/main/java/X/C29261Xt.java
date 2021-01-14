package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: X.1Xt  reason: invalid class name and case insensitive filesystem */
public class C29261Xt extends TypefaceSpan {
    public final Typeface A00;

    public C29261Xt(Context context) {
        super("");
        this.A00 = C002301g.A01(context);
    }

    public static void A00(Paint paint, Typeface typeface) {
        int style;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            style = 0;
        } else {
            style = typeface2.getStyle();
        }
        if ((style & (typeface.getStyle() ^ -1) & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }
}
