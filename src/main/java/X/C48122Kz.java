package X;

/* renamed from: X.2Kz  reason: invalid class name and case insensitive filesystem */
public class C48122Kz {
    public static final C48122Kz A03 = new C48122Kz(0, 0, 0);
    public final long A00;
    public final long A01;
    public final long A02;

    public C48122Kz(long j, long j2, long j3) {
        this.A00 = j;
        this.A02 = j2;
        this.A01 = j3;
    }

    public int A00() {
        if (this.A01 > 0) {
            return 8;
        }
        if (this.A02 > 0) {
            return 13;
        }
        return this.A00 > 0 ? 5 : 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r6 != 13) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(int r6) {
        /*
            r5 = this;
            r0 = 5
            r3 = 0
            if (r6 == r0) goto L_0x000e
            r0 = 8
            if (r6 == r0) goto L_0x001c
            r0 = 13
            if (r6 == r0) goto L_0x0015
        L_0x000d:
            return r3
        L_0x000e:
            long r1 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            return r1
        L_0x0015:
            long r1 = r5.A02
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            return r1
        L_0x001c:
            long r1 = r5.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48122Kz.A01(int):long");
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("(");
        A0S.append(this.A00);
        A0S.append("/");
        A0S.append(this.A02);
        A0S.append("/");
        A0S.append(this.A01);
        A0S.append(")");
        return A0S.toString();
    }
}
