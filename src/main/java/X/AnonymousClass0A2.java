package X;

/* renamed from: X.0A2  reason: invalid class name */
public class AnonymousClass0A2 {
    public static volatile AnonymousClass0A2 A01;
    public final C014508d A00;

    public AnonymousClass0A2(C014508d r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0A2 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0A2.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0A2(C014508d.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AbstractC007503q r14) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A2.A01(X.03q):void");
    }
}
