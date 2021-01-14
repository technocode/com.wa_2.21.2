package X;

/* renamed from: X.25T  reason: invalid class name */
public final class AnonymousClass25T implements AbstractC34201i4, AbstractC34191i3 {
    public long A00;
    public long A01 = 0;
    public AbstractC34191i3 A02;
    public C34141hy[] A03 = new C34141hy[0];
    public final AbstractC34201i4 A04;

    public AnonymousClass25T(AbstractC34201i4 r3, long j) {
        this.A04 = r3;
        this.A00 = j;
    }

    public boolean A00() {
        return this.A01 != -9223372036854775807L;
    }

    @Override // X.AbstractC34201i4
    public boolean A32(long j) {
        return this.A04.A32(j);
    }

    @Override // X.AbstractC34201i4
    public void A3j(long j, boolean z) {
        this.A04.A3j(j, z);
    }

    @Override // X.AbstractC34201i4
    public long A4h(long j, AnonymousClass12O r20) {
        long j2;
        AnonymousClass12O r10 = r20;
        if (j == 0) {
            return 0;
        }
        long j3 = r10.A01;
        long max = Math.max(0L, Math.min(j3, j - 0));
        long j4 = r10.A00;
        long j5 = this.A00;
        if (j5 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j5 - j;
        }
        long max2 = Math.max(0L, Math.min(j4, j2));
        if (!(max == j3 && max2 == j4)) {
            r10 = new AnonymousClass12O(max, max2);
        }
        return this.A04.A4h(j, r10);
    }

    @Override // X.AbstractC34201i4
    public long A51() {
        long A51 = this.A04.A51();
        if (A51 != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || A51 < j) {
                return A51;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // X.AbstractC34201i4
    public long A7f() {
        long A7f = this.A04.A7f();
        if (A7f != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || A7f < j) {
                return A7f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // X.AbstractC34201i4
    public AnonymousClass14A A9R() {
        return this.A04.A9R();
    }

    @Override // X.AbstractC34201i4
    public void AC5() {
        this.A04.AC5();
    }

    @Override // X.AnonymousClass144
    public void AEd(AnonymousClass145 r2) {
        this.A02.AEd(this);
    }

    @Override // X.AbstractC34191i3
    public void AIj(AbstractC34201i4 r2) {
        this.A02.AIj(this);
    }

    @Override // X.AbstractC34201i4
    public void AM6(AbstractC34191i3 r2, long j) {
        this.A02 = r2;
        this.A04.AM6(this, j);
    }

    @Override // X.AbstractC34201i4
    public long AMN() {
        if (A00()) {
            long j = this.A01;
            this.A01 = -9223372036854775807L;
            long AMN = AMN();
            return AMN != -9223372036854775807L ? AMN : j;
        }
        long AMN2 = this.A04.AMN();
        if (AMN2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        boolean z2 = false;
        if (AMN2 >= 0) {
            z2 = true;
        }
        C002001d.A3A(z2);
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && AMN2 > j2) {
            z = false;
        }
        C002001d.A3A(z);
        return AMN2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5 > r3) goto L_0x0034;
     */
    @Override // X.AbstractC34201i4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long ANY(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A01 = r0
            X.1hy[] r3 = r8.A03
            int r2 = r3.length
            r7 = 0
            r1 = 0
        L_0x000c:
            if (r1 >= r2) goto L_0x0017
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0014
            r0.A00 = r7
        L_0x0014:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0017:
            X.1i4 r0 = r8.A04
            long r5 = r0.ANY(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0034
        L_0x0033:
            r7 = 1
        L_0x0034:
            X.C002001d.A3A(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25T.ANY(long):long");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: X.1hy[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: X.1hy */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r11 > r0) goto L_0x007b;
     */
    @Override // X.AbstractC34201i4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long ANZ(X.AbstractC232114v[] r18, boolean[] r19, X.AnonymousClass143[] r20, boolean[] r21, long r22) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25T.ANZ(X.14v[], boolean[], X.143[], boolean[], long):long");
    }
}
