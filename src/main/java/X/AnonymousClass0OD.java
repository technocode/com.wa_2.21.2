package X;

/* renamed from: X.0OD  reason: invalid class name */
public class AnonymousClass0OD {
    public final String A00;
    public final AnonymousClass0OC A01;

    public AnonymousClass0OD(String str, AnonymousClass0OC r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass0OD)) {
            return false;
        }
        AnonymousClass0OD r4 = (AnonymousClass0OD) obj;
        if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }
}
