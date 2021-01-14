package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.1M3  reason: invalid class name */
public final class AnonymousClass1M3 implements InputFilter {
    public final int A00;

    public AnonymousClass1M3(int i) {
        this.A00 = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int A0C = C28051Sr.A0C(spanned, 0, spanned.length());
        int A0C2 = C28051Sr.A0C(spanned, i3, i4);
        int A0C3 = C28051Sr.A0C(charSequence, i, i2);
        int i5 = (this.A00 - A0C) + A0C2;
        if (i5 <= 0) {
            return "";
        }
        if (i5 >= A0C3) {
            return null;
        }
        return C002001d.A1G(charSequence, i, i2, i5);
    }
}
