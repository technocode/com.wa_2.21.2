package X;

/* renamed from: X.0DX  reason: invalid class name */
public class AnonymousClass0DX {
    public static volatile AnonymousClass0DX A05;
    public final C02410Bw A00;
    public final AnonymousClass00S A01;
    public final C001000o A02;
    public final AnonymousClass0DU A03;
    public final AnonymousClass00Y A04;

    public AnonymousClass0DX(AnonymousClass00S r1, AnonymousClass00Y r2, C001000o r3, AnonymousClass0DU r4, C02410Bw r5) {
        this.A01 = r1;
        this.A04 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r5;
    }

    public static AnonymousClass0DX A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0DX.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0DX(AnonymousClass00S.A00(), AnonymousClass00Y.A00(), C001000o.A00(), AnonymousClass0DU.A00(), C02410Bw.A00());
                }
            }
        }
        return A05;
    }

    public void A01(String str, int i) {
        if (str != null) {
            AnonymousClass20S r3 = new AnonymousClass20S();
            r3.A00 = Integer.valueOf(i);
            r3.A02 = str;
            r3.A01 = Long.valueOf(this.A01.A05());
            this.A04.A0B(r3, null, false);
        }
    }
}
