package X;

/* renamed from: X.1cI  reason: invalid class name and case insensitive filesystem */
public final class C30961cI extends AbstractC17600ro {
    public final C17550rj A00 = C17550rj.A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30961cI.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C30961cI) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode() + 846803280;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Failure {mOutputData=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
