package X;

/* renamed from: X.07S  reason: invalid class name */
public class AnonymousClass07S {
    public final Class A00;
    public final boolean A01;

    public AnonymousClass07S(Class cls, boolean z) {
        this.A00 = cls;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass07S)) {
            return false;
        }
        AnonymousClass07S r4 = (AnonymousClass07S) obj;
        if (!r4.A00.equals(this.A00) || r4.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A01).hashCode();
    }
}
