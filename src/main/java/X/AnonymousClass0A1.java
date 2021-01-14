package X;

/* renamed from: X.0A1  reason: invalid class name */
public class AnonymousClass0A1 {
    public static volatile AnonymousClass0A1 A03;
    public final C000300f A00;
    public final C014508d A01;
    public final C015708p A02;

    public AnonymousClass0A1(C000300f r1, C015708p r2, C014508d r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static AnonymousClass0A1 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0A1.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0A1(C000300f.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r8 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1V6 A01(long r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A1.A01(long):X.1V6");
    }

    public void A02(AbstractC007503q r3) {
        AnonymousClass1V6 A012;
        if (this.A00.A0D(AbstractC000400g.A0Z) && (A012 = A01(r3.A0p)) != null) {
            r3.A0Y = A012.A01;
            r3.A0O = A012.A00;
        }
    }
}
