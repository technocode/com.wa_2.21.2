package X;

/* renamed from: X.28o  reason: invalid class name and case insensitive filesystem */
public final class C461928o extends C454925a implements Comparable {
    public long A00;

    public C461928o() {
    }

    public C461928o(AnonymousClass14N r1) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C461928o r8 = (C461928o) obj;
        boolean A01 = A01();
        if (A01 == r8.A01()) {
            long j = ((C33961hf) this).A00 - ((C33961hf) r8).A00;
            if (j == 0) {
                j = this.A00 - r8.A00;
                if (j == 0) {
                    return 0;
                }
            }
            if (j > 0) {
                return 1;
            }
            return -1;
        } else if (A01) {
            return 1;
        } else {
            return -1;
        }
    }
}
