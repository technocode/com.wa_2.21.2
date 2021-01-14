package X;

/* renamed from: X.0AI  reason: invalid class name */
public class AnonymousClass0AI {
    public static volatile AnonymousClass0AI A01;
    public final AnonymousClass0AJ A00;

    public AnonymousClass0AI(AnonymousClass08H r2) {
        this.A00 = new AnonymousClass0AJ(r2);
    }

    public static AnonymousClass0AI A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0AI.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0AI(AnonymousClass08H.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        if (r2 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28241Tl A01(X.AnonymousClass02N r12) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AI.A01(X.02N):X.1Tl");
    }
}
