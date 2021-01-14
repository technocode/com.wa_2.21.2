package X;

/* renamed from: X.0sd  reason: invalid class name and case insensitive filesystem */
public class C18010sd {
    public AnonymousClass0VU A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18010sd)) {
            return false;
        }
        C18010sd r4 = (C18010sd) obj;
        if (this.A00 != r4.A00) {
            return false;
        }
        return this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
