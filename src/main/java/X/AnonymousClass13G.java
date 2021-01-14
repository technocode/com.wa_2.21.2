package X;

/* renamed from: X.13G  reason: invalid class name */
public final class AnonymousClass13G {
    public final AnonymousClass13I A00;
    public final AnonymousClass13I A01;

    public AnonymousClass13G(AnonymousClass13I r1) {
        this.A00 = r1;
        this.A01 = r1;
    }

    public AnonymousClass13G(AnonymousClass13I r1, AnonymousClass13I r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass13G.class != obj.getClass()) {
            return false;
        }
        AnonymousClass13G r5 = (AnonymousClass13G) obj;
        if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    public String toString() {
        String obj;
        StringBuilder A0S = AnonymousClass008.A0S("[");
        AnonymousClass13I r0 = this.A00;
        A0S.append(r0);
        AnonymousClass13I r1 = this.A01;
        if (r0.equals(r1)) {
            obj = "";
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S(", ");
            A0S2.append(r1);
            obj = A0S2.toString();
        }
        return AnonymousClass008.A0O(A0S, obj, "]");
    }
}
