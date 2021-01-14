package X;

/* renamed from: X.12M  reason: invalid class name */
public final class AnonymousClass12M {
    public static final AnonymousClass12M A01 = new AnonymousClass12M(0);
    public final int A00;

    public AnonymousClass12M(int i) {
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AnonymousClass12M.class == obj.getClass() && this.A00 == ((AnonymousClass12M) obj).A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.A00;
    }
}
