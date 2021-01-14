package X;

/* renamed from: X.27G  reason: invalid class name */
public class AnonymousClass27G implements AbstractC011306t {
    public final Object A00;

    public AnonymousClass27G(Object obj) {
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass27G)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass27G) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
