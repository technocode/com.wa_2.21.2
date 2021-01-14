package X;

/* renamed from: X.0OC  reason: invalid class name */
public class AnonymousClass0OC {
    public final int A00;
    public final String A01;

    public AnonymousClass0OC(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass0OC)) {
            return false;
        }
        AnonymousClass0OC r4 = (AnonymousClass0OC) obj;
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
        sb.append(this.A01);
        sb.append(":");
        sb.append(this.A00);
        return sb.toString();
    }
}
