package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.34d  reason: invalid class name and case insensitive filesystem */
public class C664134d extends ReplacementSpan {
    public int A00;
    public int A01;
    public int A02;
    public final AnonymousClass0YH A03;
    public final String A04;
    public final String A05;

    public C664134d(String str, String str2, int i) {
        this.A03 = new AnonymousClass0YH(i);
        this.A05 = str;
        this.A04 = str2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        AnonymousClass0YH r3 = this.A03;
        int i6 = this.A02;
        r3.setBounds((int) f, i3 + i6, (int) (((float) this.A01) + f), i5 - i6);
        r3.draw(canvas);
        canvas.drawText(this.A05, f + ((float) this.A00), (float) i4, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt A002 = C05250Nu.A00(paint);
            int i3 = A002.descent - A002.ascent;
            this.A00 = i3 >> 1;
            int max = Math.max(1, i3 >> 4);
            this.A02 = max;
            int i4 = A002.top - max;
            fontMetricsInt.top = i4;
            int i5 = A002.bottom + max;
            fontMetricsInt.bottom = i5;
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = i5;
        }
        String str = this.A05;
        int ceil = (int) Math.ceil((double) (paint.measureText(str, 0, str.length()) + ((float) (this.A00 << 1))));
        this.A01 = ceil;
        return ceil;
    }
}
