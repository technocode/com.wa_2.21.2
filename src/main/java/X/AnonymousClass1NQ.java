package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.TextData;

/* renamed from: X.1NQ  reason: invalid class name */
public class AnonymousClass1NQ extends Drawable {
    public static final AnonymousClass1NP A08;
    public float A00;
    public int A01;
    public int A02;
    public Layout A03;
    public final Paint A04 = new Paint(1);
    public final Typeface A05;
    public final TextData A06;
    public final CharSequence A07;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            A08 = new C40511tO();
        } else {
            A08 = new C40521tP();
        }
    }

    public AnonymousClass1NQ(Context context, C02590Cr r4, AnonymousClass03P r5, AnonymousClass022 r6, String str, TextData textData) {
        this.A07 = C003701u.A00(C002001d.A1C(r5, r6, C002001d.A1J(str, context, r4)));
        this.A06 = textData;
        this.A05 = textData != null ? C660232m.A01(context, textData.fontStyle) : Typeface.SANS_SERIF;
    }

    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        Paint paint = this.A04;
        TextData textData = this.A06;
        if (textData == null || (i = textData.backgroundColor) == 0) {
            i = 1711276032;
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), ((float) (bounds.width() >> 1)) - this.A00, paint);
        if (this.A03 != null) {
            canvas.translate((float) ((bounds.width() - this.A03.getWidth()) >> 1), (float) ((bounds.height() - this.A03.getHeight()) >> 1));
            this.A03.draw(canvas);
        }
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        float f = this.A00 * 2.0f;
        double sqrt = Math.sqrt(2.0d);
        int i6 = (int) (((double) (((float) (i3 - i)) - f)) / sqrt);
        int i7 = (int) (((double) (((float) (i4 - i2)) - f)) / sqrt);
        if (this.A01 != i7 || this.A02 != i6) {
            this.A02 = i6;
            this.A01 = i7;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize((float) (i7 >> 1));
            TextData textData = this.A06;
            if (textData == null || (i5 = textData.textColor) == 0) {
                i5 = -1;
            }
            textPaint.setColor(i5);
            textPaint.setTypeface(this.A05);
            CharSequence charSequence = this.A07;
            if (charSequence != null && charSequence.length() > 100) {
                charSequence = charSequence.subSequence(0, 100);
            }
            while (!TextUtils.isEmpty(charSequence)) {
                C05240Nt.A00(charSequence, textPaint);
                Layout A3L = A08.A3L(charSequence, textPaint, i6);
                this.A03 = A3L;
                if (A3L.getHeight() <= i7) {
                    return;
                }
                if (textPaint.getTextSize() < ((float) Math.max(2, i7 >> 3))) {
                    charSequence = charSequence.subSequence(0, charSequence.length() / 2);
                } else {
                    textPaint.setTextSize(textPaint.getTextSize() - 1.0f);
                }
            }
        }
    }
}
