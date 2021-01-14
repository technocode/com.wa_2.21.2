package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.1Mt  reason: invalid class name */
public class AnonymousClass1Mt implements InputFilter {
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            int codePointAt = Character.codePointAt(charSequence, i);
            int type = Character.getType(codePointAt);
            if (codePointAt >= 128512 && codePointAt <= 128591) {
                return "";
            }
            if (codePointAt >= 127744 && codePointAt <= 128511) {
                return "";
            }
            if (codePointAt >= 128640 && codePointAt <= 128767) {
                return "";
            }
            if (codePointAt >= 9984 && codePointAt <= 10175) {
                return "";
            }
            if (codePointAt >= 65024 && codePointAt <= 65039) {
                return "";
            }
            if (codePointAt >= 9728 && codePointAt <= 9983) {
                return "";
            }
            if (codePointAt >= 129280 && codePointAt <= 129535) {
                return "";
            }
            if ((codePointAt >= 8400 && codePointAt <= 8447) || type == 19 || type == 28) {
                return "";
            }
            i += Character.charCount(codePointAt);
        }
        return null;
    }
}
