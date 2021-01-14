package X;

/* renamed from: X.0XR  reason: invalid class name */
public class AnonymousClass0XR {
    public static volatile AnonymousClass0XR A09;
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public final AnonymousClass00Y A07;
    public final boolean A08;

    public AnonymousClass0XR(C002701k r3, AnonymousClass00Y r4) {
        this.A07 = r4;
        this.A08 = r3.A0F(125);
    }

    public static AnonymousClass0XR A00() {
        if (A09 == null) {
            synchronized (AnonymousClass0L6.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0XR(C002701k.A00(), AnonymousClass00Y.A00());
                }
            }
        }
        return A09;
    }

    public final void A01(AnonymousClass00X r4) {
        if (this.A08) {
            this.A07.A0B(r4, null, false);
        }
    }
}
