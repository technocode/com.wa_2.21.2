package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.1Mu  reason: invalid class name and case insensitive filesystem */
public class C26831Mu implements InputFilter {
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (Character.isWhitespace(charSequence.charAt(i))) {
                return "";
            }
            i++;
        }
        return null;
    }
}
