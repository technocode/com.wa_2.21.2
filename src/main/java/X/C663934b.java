package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* renamed from: X.34b  reason: invalid class name and case insensitive filesystem */
public class C663934b extends Drawable {
    public final int A00;
    public final int A01;
    public final Typeface A02;
    public final TextPaint A03 = new TextPaint();
    public final CharSequence A04;

    public int getOpacity() {
        return -3;
    }

    public C663934b(CharSequence charSequence, Typeface typeface, int i, int i2) {
        this.A04 = charSequence;
        this.A02 = typeface;
        this.A00 = i;
        this.A01 = i2;
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width();
        int height = getBounds().height();
        TextPaint textPaint = this.A03;
        textPaint.setTextSize((float) this.A01);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(this.A00);
        textPaint.setAlpha(255);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        int i = width >> 1;
        int ascent = (int) (((float) (height >> 1)) - ((textPaint.ascent() + textPaint.descent()) / 2.0f));
        Typeface typeface = this.A02;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        CharSequence charSequence = this.A04;
        canvas.drawText(charSequence, 0, charSequence.length(), (float) i, (float) ascent, textPaint);
    }

    public void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }
}
