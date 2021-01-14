package X;

/* renamed from: X.06G  reason: invalid class name */
public final class AnonymousClass06G extends AnonymousClass06H {
    public final String A00;
    public final String A01;

    public AnonymousClass06G(String str, String str2) {
        if (str != null) {
            this.A00 = str;
            if (str2 != null) {
                this.A01 = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass06H)) {
            return false;
        }
        AnonymousClass06G r4 = (AnonymousClass06G) ((AnonymousClass06H) obj);
        if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("LibraryVersion{libraryName=");
        A0S.append(this.A00);
        A0S.append(", version=");
        return AnonymousClass008.A0O(A0S, this.A01, "}");
    }
}
