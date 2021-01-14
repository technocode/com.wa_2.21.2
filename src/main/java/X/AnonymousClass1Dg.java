package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: X.1Dg  reason: invalid class name */
public class AnonymousClass1Dg {
    public Typeface A00;
    public boolean A01 = false;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final ColorStateList A09;
    public final ColorStateList A0A;
    public final ColorStateList A0B;
    public final ColorStateList A0C;
    public final String A0D;

    public AnonymousClass1Dg(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C08030aM.A0w);
        this.A05 = obtainStyledAttributes.getDimension(0, 0.0f);
        this.A0A = C008805h.A08(context, obtainStyledAttributes, 3);
        this.A0B = C008805h.A08(context, obtainStyledAttributes, 4);
        this.A0C = C008805h.A08(context, obtainStyledAttributes, 5);
        this.A07 = obtainStyledAttributes.getInt(2, 0);
        this.A08 = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.A06 = obtainStyledAttributes.getResourceId(i2, 0);
        this.A0D = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.A09 = C008805h.A08(context, obtainStyledAttributes, 6);
        this.A02 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.A03 = obtainStyledAttributes.getFloat(8, 0.0f);
        this.A04 = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void A00() {
        Typeface typeface;
        Typeface typeface2 = this.A00;
        if (typeface2 == null) {
            typeface2 = Typeface.create(this.A0D, this.A07);
            this.A00 = typeface2;
        }
        if (typeface2 == null) {
            int i = this.A08;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
                this.A00 = typeface;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
                this.A00 = typeface;
            } else if (i != 3) {
                typeface = Typeface.DEFAULT;
                this.A00 = typeface;
            } else {
                typeface = Typeface.MONOSPACE;
                this.A00 = typeface;
            }
            if (typeface != null) {
                this.A00 = Typeface.create(typeface, this.A07);
            }
        }
    }

    public void A01(Context context, TextPaint textPaint, AbstractC04990Mq r9) {
        int i;
        int i2;
        A02(context, textPaint, r9);
        ColorStateList colorStateList = this.A0A;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.A04;
        float f2 = this.A02;
        float f3 = this.A03;
        ColorStateList colorStateList2 = this.A09;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public void A02(Context context, TextPaint textPaint, AbstractC04990Mq r10) {
        if (this.A01) {
            A03(textPaint, this.A00);
        } else {
            A00();
            if (context.isRestricted()) {
                this.A01 = true;
                A03(textPaint, this.A00);
            } else {
                try {
                    int i = this.A06;
                    C36821mw r5 = new C36821mw(this, textPaint, r10);
                    if (context.isRestricted()) {
                        r5.A01(-4);
                    } else {
                        C002001d.A0a(context, i, new TypedValue(), 0, r5, false);
                    }
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                } catch (Exception e) {
                    StringBuilder A0S = AnonymousClass008.A0S("Error loading font ");
                    A0S.append(this.A0D);
                    Log.d("TextAppearance", A0S.toString(), e);
                }
            }
        }
        if (!this.A01) {
            A03(textPaint, this.A00);
        }
    }

    public void A03(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.A07;
        boolean z = false;
        if ((style & 1) != 0) {
            z = true;
        }
        textPaint.setFakeBoldText(z);
        float f = 0.0f;
        if ((style & 2) != 0) {
            f = -0.25f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.A05);
    }
}
