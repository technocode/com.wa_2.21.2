package X;

import android.text.TextUtils;

/* renamed from: X.0QW  reason: invalid class name */
public class AnonymousClass0QW {
    public final long A00;
    public final String A01;

    public AnonymousClass0QW(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != AnonymousClass0QW.class) {
            return false;
        }
        AnonymousClass0QW r7 = (AnonymousClass0QW) obj;
        if (this.A00 != r7.A00 || !TextUtils.equals(this.A01, r7.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.A01;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(":");
        sb.append(C003701u.A06(this.A01, 4));
        return sb.toString();
    }
}
