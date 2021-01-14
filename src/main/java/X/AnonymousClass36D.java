package X;

import android.text.TextUtils;

/* renamed from: X.36D  reason: invalid class name */
public final class AnonymousClass36D {
    public final CharSequence A00;
    public final CharSequence A01;

    public AnonymousClass36D(CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass36D.class != obj.getClass()) {
            return false;
        }
        AnonymousClass36D r5 = (AnonymousClass36D) obj;
        if (!TextUtils.equals(this.A00, r5.A00) || !TextUtils.equals(this.A01, r5.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        CharSequence charSequence = this.A00;
        int i2 = 0;
        if (charSequence != null) {
            i = charSequence.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 0) * 31;
        CharSequence charSequence2 = this.A01;
        if (charSequence2 != null) {
            i2 = charSequence2.hashCode();
        }
        return i3 + i2;
    }
}
