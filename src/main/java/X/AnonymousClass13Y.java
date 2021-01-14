package X;

import android.text.TextUtils;

/* renamed from: X.13Y  reason: invalid class name */
public final class AnonymousClass13Y {
    public final String A00;
    public final boolean A01;

    public AnonymousClass13Y(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != AnonymousClass13Y.class) {
            return false;
        }
        AnonymousClass13Y r5 = (AnonymousClass13Y) obj;
        if (!TextUtils.equals(this.A00, r5.A00) || this.A01 != r5.A01) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode + 31) * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }
}
