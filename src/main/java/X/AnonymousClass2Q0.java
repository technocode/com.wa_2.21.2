package X;

/* renamed from: X.2Q0  reason: invalid class name */
public class AnonymousClass2Q0 {
    public final String A00;

    public AnonymousClass2Q0(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass2Q0)) {
            return false;
        }
        return ((AnonymousClass2Q0) obj).A00.equals(this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("RecentGifIdentifier{fileHash='");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
