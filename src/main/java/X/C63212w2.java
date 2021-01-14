package X;

/* renamed from: X.2w2  reason: invalid class name and case insensitive filesystem */
public class C63212w2 {
    public static volatile C63212w2 A04;
    public final AnonymousClass01I A00;
    public final AnonymousClass01X A01;
    public final C01970Ad A02;
    public final C02150Av A03;

    public C63212w2(AnonymousClass01I r1, C02150Av r2, AnonymousClass01X r3, C01970Ad r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static C63212w2 A00() {
        if (A04 == null) {
            synchronized (C63212w2.class) {
                if (A04 == null) {
                    A04 = new C63212w2(AnonymousClass01I.A00(), C02150Av.A02(), AnonymousClass01X.A00(), C01970Ad.A00());
                }
            }
        }
        return A04;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c1, code lost:
        if (r1 == 200) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        if (r0 == 200) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(X.AnonymousClass0MH r16, X.AbstractC29081Wy r17) {
        /*
        // Method dump skipped, instructions count: 1122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63212w2.A01(X.0MH, X.1Wy):java.lang.String");
    }
}
