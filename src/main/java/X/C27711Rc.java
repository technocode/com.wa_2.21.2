package X;

/* renamed from: X.1Rc  reason: invalid class name and case insensitive filesystem */
public final class C27711Rc {
    public long A00;
    public final C48052Ks A01;

    public C27711Rc(C48052Ks r3) {
        this.A01 = r3;
        this.A00 = 1;
    }

    public C27711Rc(C48052Ks r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27711Rc)) {
            return false;
        }
        C27711Rc r7 = (C27711Rc) obj;
        if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return ((this.A01.hashCode() + 527) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
