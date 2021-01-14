package X;

/* renamed from: X.02R  reason: invalid class name */
public class AnonymousClass02R {
    public final Object A00;
    public final Object A01;

    public AnonymousClass02R(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass02R)) {
            return false;
        }
        AnonymousClass02R r4 = (AnonymousClass02R) obj;
        if (!C002001d.A3b(r4.A00, this.A00) || !C002001d.A3b(r4.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.A00;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.A01;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Pair{");
        A0S.append(String.valueOf(this.A00));
        A0S.append(" ");
        A0S.append(String.valueOf(this.A01));
        A0S.append("}");
        return A0S.toString();
    }
}
