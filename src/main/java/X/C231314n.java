package X;

import android.text.TextUtils;

/* renamed from: X.14n  reason: invalid class name and case insensitive filesystem */
public final class C231314n {
    public final int A00;
    public final int A01;
    public final String A02;

    public C231314n(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C231314n.class != obj.getClass()) {
            return false;
        }
        C231314n r5 = (C231314n) obj;
        if (this.A00 == r5.A00 && this.A01 == r5.A01 && TextUtils.equals(this.A02, r5.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.A00 * 31) + this.A01) * 31;
        String str = this.A02;
        return i + (str != null ? str.hashCode() : 0);
    }
}
