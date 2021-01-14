package X;

/* renamed from: X.08n  reason: invalid class name and case insensitive filesystem */
public class C015508n {
    public static volatile C015508n A04;
    public long A00 = -1;
    public final C014508d A01;
    public final AnonymousClass00Y A02;
    public final AnonymousClass00Z A03;

    public C015508n(AnonymousClass00Y r3, C014508d r4) {
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = new C015608o().samplingRate;
    }

    public static C015508n A00() {
        if (A04 == null) {
            synchronized (C015508n.class) {
                if (A04 == null) {
                    AnonymousClass00S.A00();
                    A04 = new C015508n(AnonymousClass00Y.A00(), C014508d.A00());
                }
            }
        }
        return A04;
    }

    public void A01(String str, long j) {
        Boolean bool;
        AnonymousClass00Z r7 = this.A03;
        if (r7.A00()) {
            C015608o r6 = new C015608o();
            r6.A04 = str;
            r6.A02 = Long.valueOf(j);
            r6.A01 = Boolean.valueOf(C003701u.A0D());
            C014508d r8 = this.A01;
            r8.A05();
            C015108j r1 = r8.A07;
            synchronized (r1) {
                bool = r1.A01;
                if (bool == null) {
                    bool = Boolean.valueOf(C015108j.A08(r1.A00.A00));
                    r1.A01 = bool;
                }
            }
            r6.A00 = bool;
            long j2 = this.A00;
            if (j2 == -1) {
                j2 = r8.A02() / 1048576;
                this.A00 = j2;
            }
            r6.A03 = Long.valueOf(j2);
            this.A02.A08(r6, r7.A00);
        }
    }
}
