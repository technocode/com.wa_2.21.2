package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.2HU  reason: invalid class name */
public final class AnonymousClass2HU extends SpannableStringBuilder {
    public AnonymousClass2HU(CharSequence charSequence) {
        super(charSequence);
    }

    public char charAt(int i) {
        if (i >= 0 && i < length()) {
            return super.charAt(i);
        }
        return ' ';
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        int length;
        if (i2 >= i && i <= (length = length()) && i2 <= length && i >= 0 && i2 >= 0) {
            super.getChars(i, i2, cArr, i3);
        }
    }
}
