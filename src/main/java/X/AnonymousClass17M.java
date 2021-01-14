package X;

/* renamed from: X.17M  reason: invalid class name */
public final class AnonymousClass17M {
    public final Object A00;
    public final String A01 = "LocationListener";

    public AnonymousClass17M(Object obj) {
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass17M)) {
            return false;
        }
        AnonymousClass17M r5 = (AnonymousClass17M) obj;
        return this.A00 == r5.A00 && this.A01.equals(r5.A01);
    }

    public final int hashCode() {
        return this.A01.hashCode() + (System.identityHashCode(this.A00) * 31);
    }
}
