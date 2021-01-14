package X;

/* renamed from: X.09w  reason: invalid class name and case insensitive filesystem */
public class C019009w {
    public static volatile C019009w A03;
    public final C014508d A00;
    public final C015408m A01;
    public final C015708p A02;

    public C019009w(C015408m r1, C015708p r2, C014508d r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public static C019009w A00() {
        if (A03 == null) {
            synchronized (C019009w.class) {
                if (A03 == null) {
                    A03 = new C019009w(C015408m.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass0ZJ r11) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019009w.A01(X.0ZJ):void");
    }

    public boolean A02() {
        String A012 = this.A01.A01("revoked_ready");
        return A012 != null && Long.parseLong(A012) == 1;
    }
}
