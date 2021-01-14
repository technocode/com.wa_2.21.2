package X;

/* renamed from: X.0Bp  reason: invalid class name and case insensitive filesystem */
public class C02340Bp {
    public static volatile C02340Bp A04;
    public final AnonymousClass08V A00 = new AnonymousClass08V(250);
    public final C015308l A01;
    public final C014508d A02;
    public final C015408m A03;

    public C02340Bp(C015308l r3, C015408m r4, C014508d r5) {
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public static C02340Bp A00() {
        if (A04 == null) {
            synchronized (C02340Bp.class) {
                if (A04 == null) {
                    A04 = new C02340Bp(C015308l.A00(), C015408m.A00(), C014508d.A00());
                }
            }
        }
        return A04;
    }

    public static AnonymousClass0PN A01(AnonymousClass0PQ r9) {
        return new C52622bQ(r9.A0I, r9.A01, r9.A02, r9.A0c, r9.A0Z, r9.A06, r9.A0Q, r9.A0d, r9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r4 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2L0 A02(long r23) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02340Bp.A02(long):X.2L0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0163, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0167, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(long r29, com.whatsapp.jid.UserJid r31, int r32, long r33) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02340Bp.A03(long, com.whatsapp.jid.UserJid, int, long):void");
    }

    public boolean A04() {
        String A012 = this.A03.A01("receipt_user_ready");
        if (A012 == null || Integer.parseInt(A012) != 2) {
            return false;
        }
        return true;
    }
}
