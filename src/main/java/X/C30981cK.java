package X;

/* renamed from: X.1cK  reason: invalid class name and case insensitive filesystem */
public final class C30981cK extends AbstractC17600ro {
    public final C17550rj A00;

    public C30981cK() {
        this.A00 = C17550rj.A01;
    }

    public C30981cK(C17550rj r1) {
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30981cK.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C30981cK) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode() - 1876823561;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Success {mOutputData=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
