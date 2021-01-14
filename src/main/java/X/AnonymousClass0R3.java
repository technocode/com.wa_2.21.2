package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.0R3  reason: invalid class name */
public class AnonymousClass0R3 extends MetricAffectingSpan {
    public final Typeface A00;

    public AnonymousClass0R3(Typeface typeface) {
        this.A00 = typeface;
    }

    public final void A00(Paint paint) {
        int style;
        Typeface typeface = paint.getTypeface();
        if (typeface == null) {
            style = 0;
        } else {
            style = typeface.getStyle();
        }
        Typeface typeface2 = this.A00;
        int style2 = style & (typeface2.getStyle() ^ -1);
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface2);
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint);
    }
}
