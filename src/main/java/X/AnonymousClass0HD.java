package X;

/* renamed from: X.0HD  reason: invalid class name */
public class AnonymousClass0HD {
    public static volatile AnonymousClass0HD A06;
    public final AnonymousClass04j A00;
    public final AnonymousClass00D A01;
    public final AnonymousClass0HA A02;
    public final AnonymousClass0H1 A03;
    public final AnonymousClass0BZ A04;
    public final AnonymousClass00T A05;

    public AnonymousClass0HD(AnonymousClass00T r1, AnonymousClass0BZ r2, AnonymousClass04j r3, AnonymousClass00D r4, AnonymousClass0H1 r5, AnonymousClass0HA r6) {
        this.A05 = r1;
        this.A04 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r6;
    }

    public static AnonymousClass0HD A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0HD.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0HD(C002101e.A00(), AnonymousClass0BZ.A00(), AnonymousClass04j.A00(), AnonymousClass00D.A00(), AnonymousClass0H1.A00(), AnonymousClass0HA.A00());
                }
            }
        }
        return A06;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d4, code lost:
        if (r6 != null) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02d9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01() {
        /*
        // Method dump skipped, instructions count: 736
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HD.A01():java.util.List");
    }
}
