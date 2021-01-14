package X;

/* renamed from: X.0B1  reason: invalid class name */
public class AnonymousClass0B1 {
    public static volatile AnonymousClass0B1 A03;
    public final C014508d A00;
    public final C015408m A01;
    public final C015708p A02;

    public AnonymousClass0B1(C015408m r1, C015708p r2, C014508d r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public static AnonymousClass0B1 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0B1.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0B1(C015408m.A00(), C015708p.A00(), C014508d.A00());
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
        StringBuilder A0S = AnonymousClass008.A0S("SendCountMessageStore/validateMessage/message must have row_id set; key=");
        C007303n r1 = r7.A0n;
        AnonymousClass008.A1R(A0S, r1, z2);
        if (r7.A09 == 1) {
            z = true;
        }
        AnonymousClass008.A1R(AnonymousClass008.A0S("SendCountMessageStore/validateMessage/message in main storage; key="), r1, z);
    }

    public boolean A02() {
        String A012 = this.A01.A01("send_count_ready");
        return A012 != null && Long.parseLong(A012) == 1;
    }
}
