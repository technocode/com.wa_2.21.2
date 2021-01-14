package X;

/* renamed from: X.09T  reason: invalid class name */
public class AnonymousClass09T {
    public static volatile AnonymousClass09T A03;
    public final AnonymousClass00D A00;
    public final AnonymousClass01L A01;
    public final C015808q A02;

    public AnonymousClass09T(C015808q r1, AnonymousClass01L r2, AnonymousClass00D r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public static AnonymousClass09T A00() {
        if (A03 == null) {
            synchronized (AnonymousClass09T.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass09T(C015808q.A00(), AnonymousClass01L.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A03;
    }

    public boolean A01(AnonymousClass02N r2) {
        if (!A02(r2)) {
            return this.A02.A03() && !this.A01.A02().A00.isEmpty();
        }
        return true;
    }

    public boolean A02(AnonymousClass02N r3) {
        return AnonymousClass1VY.A0Y(r3) || this.A00.A0k();
    }

    public boolean A03(AbstractC007503q r7) {
        return A02(r7.A0n.A00) && r7.A0E >= 1415214000000L;
    }
}
