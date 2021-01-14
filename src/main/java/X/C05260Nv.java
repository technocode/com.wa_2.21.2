package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Nv  reason: invalid class name and case insensitive filesystem */
public class C05260Nv extends C05270Nw {
    public Paint.FontMetricsInt A00;
    public C48642Nc A01;
    public boolean A02;
    public final int A03;
    public final CharSequence A04;

    public C05260Nv(Context context, Drawable drawable, Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence) {
        super(drawable);
        this.A04 = charSequence;
        this.A03 = C004302a.A00(context, R.color.link_color);
        this.A00 = fontMetricsInt;
    }

    public final boolean A04(CharSequence charSequence, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            CharSequence charSequence2 = this.A04;
            if (i3 >= charSequence2.length() || (i2 = i + i3) >= charSequence.length()) {
                return true;
            }
            if (charSequence2.charAt(i3) != charSequence.charAt(i2)) {
                return false;
            }
            i3++;
        }
    }

    @Override // X.C05270Nw
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (A04(charSequence, i)) {
            if (this.A02) {
                C48642Nc r4 = this.A01;
                if (r4 == null) {
                    r4 = new C48642Nc(paint, this.A03);
                    this.A01 = r4;
                }
                float f2 = (float) (A03().getBounds().right + ((int) C002301g.A0K.A00));
                float f3 = (r4.A01 / 2.0f) + ((float) i4) + r4.A00;
                canvas.drawLine(f, f3, f + f2, f3, r4);
            }
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = A03().getBounds();
        if (fontMetricsInt != null) {
            int height = bounds.height();
            Paint.FontMetricsInt fontMetricsInt2 = this.A00;
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int max = Math.max(0, (height - i3) + i4);
            fontMetricsInt.ascent = i4 - max;
            fontMetricsInt.descent = i3 + max;
            fontMetricsInt.top = fontMetricsInt2.top - max;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + max;
        }
        if (A04(charSequence, i)) {
            return bounds.right + ((int) C002301g.A0K.A00);
        }
        return 0;
    }
}
