package X;

/* renamed from: X.0y6  reason: invalid class name and case insensitive filesystem */
public class C21060y6 {
    public final int A00 = 1080;
    public final int A01 = 1920;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21060y6.class != obj.getClass()) {
            return false;
        }
        C21060y6 r5 = (C21060y6) obj;
        if (this.A01 == r5.A01 && this.A00 == r5.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
