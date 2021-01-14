package X;

/* renamed from: X.1PG  reason: invalid class name */
public class AnonymousClass1PG {
    public static volatile AnonymousClass1PG A03;
    public final C000300f A00;
    public final C41151uZ A01 = new C41151uZ();
    public volatile boolean A02;

    public AnonymousClass1PG(C000300f r2) {
        this.A00 = r2;
    }

    public static AnonymousClass1PG A00() {
        if (A03 == null) {
            synchronized (AnonymousClass1PG.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass1PG(C000300f.A00());
                }
            }
        }
        return A03;
    }

    public void A01(boolean z) {
        if (this.A02 == z) {
            return;
        }
        if (!z || this.A00.A0D(AbstractC000400g.A1H)) {
            this.A02 = z;
            for (AnonymousClass1PF r0 : this.A01.A00) {
                r0.AK8();
            }
        }
    }
}
