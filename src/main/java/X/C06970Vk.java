package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.0Vk  reason: invalid class name and case insensitive filesystem */
public final class C06970Vk {
    public final int A00;
    public final int A01;
    public final TextDirectionHeuristic A02;
    public final TextPaint A03;

    public C06970Vk(PrecomputedText.Params params) {
        this.A03 = params.getTextPaint();
        this.A02 = params.getTextDirection();
        this.A00 = params.getBreakStrategy();
        this.A01 = params.getHyphenationFrequency();
    }

    public C06970Vk(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.A03 = textPaint;
        this.A02 = textDirectionHeuristic;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean A00(C06970Vk r6) {
        if (Build.VERSION.SDK_INT >= 23 && (this.A00 != r6.A00 || this.A01 != r6.A01)) {
            return false;
        }
        TextPaint textPaint = this.A03;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = r6.A03;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX()) {
            return false;
        }
        if ((Build.VERSION.SDK_INT >= 21 && (textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()))) || textPaint.getFlags() != textPaint2.getFlags()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            if (!textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return false;
            }
        } else if (i >= 17 && !textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
            return true;
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        } else {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C06970Vk)) {
            return false;
        }
        C06970Vk r5 = (C06970Vk) obj;
        if (!A00(r5)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 18 || this.A02 == r5.A02;
    }

    public int hashCode() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            TextPaint textPaint = this.A03;
            return C002001d.A0K(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        } else if (i >= 21) {
            TextPaint textPaint2 = this.A03;
            return C002001d.A0K(Float.valueOf(textPaint2.getTextSize()), Float.valueOf(textPaint2.getTextScaleX()), Float.valueOf(textPaint2.getTextSkewX()), Float.valueOf(textPaint2.getLetterSpacing()), Integer.valueOf(textPaint2.getFlags()), textPaint2.getTextLocale(), textPaint2.getTypeface(), Boolean.valueOf(textPaint2.isElegantTextHeight()), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        } else if (i >= 18) {
            TextPaint textPaint3 = this.A03;
            return C002001d.A0K(Float.valueOf(textPaint3.getTextSize()), Float.valueOf(textPaint3.getTextScaleX()), Float.valueOf(textPaint3.getTextSkewX()), Integer.valueOf(textPaint3.getFlags()), textPaint3.getTextLocale(), textPaint3.getTypeface(), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        } else if (i >= 17) {
            TextPaint textPaint4 = this.A03;
            return C002001d.A0K(Float.valueOf(textPaint4.getTextSize()), Float.valueOf(textPaint4.getTextScaleX()), Float.valueOf(textPaint4.getTextSkewX()), Integer.valueOf(textPaint4.getFlags()), textPaint4.getTextLocale(), textPaint4.getTypeface(), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        } else {
            TextPaint textPaint5 = this.A03;
            return C002001d.A0K(Float.valueOf(textPaint5.getTextSize()), Float.valueOf(textPaint5.getTextScaleX()), Float.valueOf(textPaint5.getTextSkewX()), Integer.valueOf(textPaint5.getFlags()), textPaint5.getTypeface(), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder A0S = AnonymousClass008.A0S("textSize=");
        TextPaint textPaint = this.A03;
        A0S.append(textPaint.getTextSize());
        sb.append(A0S.toString());
        StringBuilder sb2 = new StringBuilder(", textScaleX=");
        sb2.append(textPaint.getTextScaleX());
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder(", textSkewX=");
        sb3.append(textPaint.getTextSkewX());
        sb.append(sb3.toString());
        if (Build.VERSION.SDK_INT >= 21) {
            StringBuilder A0S2 = AnonymousClass008.A0S(", letterSpacing=");
            A0S2.append(textPaint.getLetterSpacing());
            sb.append(A0S2.toString());
            StringBuilder sb4 = new StringBuilder(", elegantTextHeight=");
            sb4.append(textPaint.isElegantTextHeight());
            sb.append(sb4.toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            StringBuilder A0S3 = AnonymousClass008.A0S(", textLocale=");
            A0S3.append(textPaint.getTextLocales());
            sb.append(A0S3.toString());
        } else if (i >= 17) {
            StringBuilder A0S4 = AnonymousClass008.A0S(", textLocale=");
            A0S4.append(textPaint.getTextLocale());
            sb.append(A0S4.toString());
        }
        StringBuilder A0S5 = AnonymousClass008.A0S(", typeface=");
        A0S5.append(textPaint.getTypeface());
        sb.append(A0S5.toString());
        if (i >= 26) {
            StringBuilder A0S6 = AnonymousClass008.A0S(", variationSettings=");
            A0S6.append(textPaint.getFontVariationSettings());
            sb.append(A0S6.toString());
        }
        StringBuilder A0S7 = AnonymousClass008.A0S(", textDir=");
        A0S7.append(this.A02);
        sb.append(A0S7.toString());
        StringBuilder sb5 = new StringBuilder(", breakStrategy=");
        sb5.append(this.A00);
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder(", hyphenationFrequency=");
        sb6.append(this.A01);
        sb.append(sb6.toString());
        sb.append("}");
        return sb.toString();
    }
}
