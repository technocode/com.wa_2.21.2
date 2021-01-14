package X;

import java.util.Arrays;

/* renamed from: X.1F6  reason: invalid class name */
public final class AnonymousClass1F6 {
    public final int A00;
    public final C12490iB A01;
    public final String A02;

    public AnonymousClass1F6(int i, String str, C12490iB r5) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        } else if (str != null) {
            this.A00 = i;
            this.A02 = str;
            this.A01 = r5;
        } else {
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1F6)) {
            return false;
        }
        AnonymousClass1F6 r4 = (AnonymousClass1F6) obj;
        if (!this.A02.equals(r4.A02) || this.A00 != r4.A00 || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A02, this.A01});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("PhoneNumberMatch [");
        int i = this.A00;
        A0S.append(i);
        A0S.append(",");
        String str = this.A02;
        A0S.append(str.length() + i);
        A0S.append(") ");
        A0S.append(str);
        return A0S.toString();
    }
}
