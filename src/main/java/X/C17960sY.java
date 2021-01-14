package X;

/* renamed from: X.0sY  reason: invalid class name and case insensitive filesystem */
public class C17960sY {
    public final int A00;
    public final String A01;

    public C17960sY(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17960sY)) {
            return false;
        }
        C17960sY r4 = (C17960sY) obj;
        if (this.A00 != r4.A00) {
            return false;
        }
        return this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }
}
