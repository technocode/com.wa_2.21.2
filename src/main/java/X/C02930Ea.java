package X;

/* renamed from: X.0Ea  reason: invalid class name and case insensitive filesystem */
public class C02930Ea {
    public static volatile C02930Ea A06;
    public final AnonymousClass01I A00;
    public final AnonymousClass09V A01;
    public final AnonymousClass01K A02;
    public final C018509r A03;
    public final AnonymousClass0AR A04;
    public final AnonymousClass00T A05;

    public C02930Ea(AnonymousClass01I r1, AnonymousClass00T r2, AnonymousClass0AR r3, AnonymousClass01K r4, AnonymousClass09V r5, C018509r r6) {
        this.A00 = r1;
        this.A05 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A01 = r5;
        this.A03 = r6;
    }

    public static C02930Ea A00() {
        if (A06 == null) {
            synchronized (C02930Ea.class) {
                if (A06 == null) {
                    A06 = new C02930Ea(AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass0AR.A00(), AnonymousClass01K.A00(), AnonymousClass09V.A00(), C018509r.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        if (r2 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(X.AnonymousClass02U r8, long r9) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02930Ea.A01(X.02U, long):java.util.List");
    }
}
