package X;

/* renamed from: X.0H3  reason: invalid class name */
public class AnonymousClass0H3 {
    public static volatile AnonymousClass0H3 A02;
    public final AnonymousClass08V A00 = new AnonymousClass08V(30);
    public final AnonymousClass0BX A01;

    public AnonymousClass0H3(AnonymousClass0BX r3) {
        this.A01 = r3;
    }

    public static AnonymousClass0H3 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0H3.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0H3(AnonymousClass0BX.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C49932St A01(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0H3.A01(java.lang.String):X.2St");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r1.inTransaction() != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r1.inTransaction() != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0H3.A02(java.lang.String):void");
    }
}
