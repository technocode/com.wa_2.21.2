package X;

/* renamed from: X.09f  reason: invalid class name and case insensitive filesystem */
public class C017309f {
    public static volatile C017309f A03;
    public final C014508d A00;
    public final C015408m A01;
    public final C015708p A02;

    public C017309f(C015408m r1, C015708p r2, C014508d r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public static C017309f A00() {
        if (A03 == null) {
            synchronized (C017309f.class) {
                if (A03 == null) {
                    C000300f.A00();
                    A03 = new C017309f(C015408m.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A03;
    }

    public static final void A01(AbstractC007503q r7) {
        boolean z = false;
        boolean z2 = false;
        if (r7.A0p > 0) {
            z2 = true;
        }
        StringBuilder A0S = AnonymousClass008.A0S("FutureMessageStore/validateMessage/message must have row_id set; key=");
        C007303n r1 = r7.A0n;
        AnonymousClass008.A1R(A0S, r1, z2);
        if (r7.A09 == 1) {
            z = true;
        }
        AnonymousClass008.A1R(AnonymousClass008.A0S("FutureMessageStore/validateMessage/message in main storage; key="), r1, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass0ZI r10) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017309f.A02(X.0ZI):void");
    }

    public final boolean A03() {
        String A012 = this.A01.A01("future_ready");
        return A012 != null && Long.parseLong(A012) == 1;
    }
}
