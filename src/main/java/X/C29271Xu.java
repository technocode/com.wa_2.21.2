package X;

import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.SuperscriptSpan;

/* renamed from: X.1Xu  reason: invalid class name and case insensitive filesystem */
public class C29271Xu extends SuperscriptSpan {
    public float A00;
    public Rect A01;
    public String A02;
    public boolean A03;

    public C29271Xu(String str) {
        this.A02 = str.equals(".") ? ".1" : str;
        this.A00 = 0.5f;
        this.A03 = true;
        this.A01 = new Rect();
    }

    public final void A00(TextPaint textPaint) {
        if (this.A03) {
            textPaint.setFakeBoldText(true);
        }
        String str = this.A02;
        textPaint.getTextBounds(str, 0, str.length(), this.A01);
        int i = this.A01.top;
        float ascent = textPaint.ascent();
        textPaint.setTextSize(textPaint.getTextSize() * this.A00);
        String str2 = this.A02;
        textPaint.getTextBounds(str2, 0, str2.length(), this.A01);
        int i2 = this.A01.top;
        float ascent2 = (((float) i) - ascent) - (((float) i2) - textPaint.ascent());
        textPaint.baselineShift = (int) ((ascent2 * this.A00) + ((float) (i - i2)) + ((float) textPaint.baselineShift));
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint);
    }
}
