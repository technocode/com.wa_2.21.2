package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: X.0Nw  reason: invalid class name and case insensitive filesystem */
public class C05270Nw extends ImageSpan {
    public WeakReference A00;

    public C05270Nw(Drawable drawable) {
        super(drawable);
    }

    public static CharSequence A00(CharSequence charSequence, Drawable drawable, Paint paint) {
        int indexOf = TextUtils.indexOf(charSequence, "%s");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        A02(spannableStringBuilder, drawable, paint, -1, indexOf, "%s".length() + indexOf);
        return spannableStringBuilder;
    }

    public static CharSequence A01(CharSequence charSequence, Drawable drawable, Paint paint) {
        StringBuilder sb = new StringBuilder("  ");
        sb.append((Object) charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        A02(spannableStringBuilder, drawable, paint, -1, 0, 1);
        return spannableStringBuilder;
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, Drawable drawable, Paint paint, int i, int i2, int i3) {
        if (i <= 0) {
            i = (int) paint.getTextSize();
        }
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * i) / drawable.getIntrinsicHeight(), i);
        spannableStringBuilder.setSpan(new C05270Nw(drawable), i2, i3, 33);
    }

    public Drawable A03() {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.A00 = new WeakReference(drawable2);
        return drawable2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable A03 = A03();
        canvas.save();
        Rect bounds = A03.getBounds();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.translate(f, (((fontMetrics.ascent + fontMetrics.descent) - ((float) bounds.height())) / 2.0f) + ((float) i4));
        A03.draw(canvas);
        canvas.restore();
    }
}
