package X;

/* renamed from: X.0B0  reason: invalid class name */
public class AnonymousClass0B0 {
    public static volatile AnonymousClass0B0 A06;
    public final AnonymousClass00S A00;
    public final AnonymousClass09A A01;
    public final C014408c A02;
    public final C006903j A03;
    public final C014508d A04;
    public final AnonymousClass01R A05;

    public AnonymousClass0B0(AnonymousClass00S r1, C014408c r2, C006903j r3, AnonymousClass09A r4, C014508d r5, AnonymousClass01R r6) {
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static AnonymousClass0B0 A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0B0.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0B0(AnonymousClass00S.A00(), C014408c.A00(), C006903j.A00(), AnonymousClass09A.A02, C014508d.A00(), AnonymousClass01R.A01());
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass02N r8, java.lang.Runnable r9) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B0.A01(X.02N, java.lang.Runnable):void");
    }
}
