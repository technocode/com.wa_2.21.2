package X;

/* renamed from: X.13I  reason: invalid class name */
public final class AnonymousClass13I {
    public static final AnonymousClass13I A02 = new AnonymousClass13I(0, 0);
    public final long A00;
    public final long A01;

    public AnonymousClass13I(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass13I.class != obj.getClass()) {
            return false;
        }
        AnonymousClass13I r7 = (AnonymousClass13I) obj;
        if (this.A01 == r7.A01 && this.A00 == r7.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[timeUs=");
        A0S.append(this.A01);
        A0S.append(", position=");
        A0S.append(this.A00);
        A0S.append("]");
        return A0S.toString();
    }
}
