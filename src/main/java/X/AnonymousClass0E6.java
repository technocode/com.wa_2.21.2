package X;

/* renamed from: X.0E6  reason: invalid class name */
public class AnonymousClass0E6 {
    public final int A00;
    public final String A01;

    public AnonymousClass0E6(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass0E6)) {
            return false;
        }
        AnonymousClass0E6 r4 = (AnonymousClass0E6) obj;
        if (!this.A01.equals(r4.A01) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C003701u.A06(this.A01, 4));
        sb.append(":");
        sb.append(this.A00);
        return sb.toString();
    }
}
