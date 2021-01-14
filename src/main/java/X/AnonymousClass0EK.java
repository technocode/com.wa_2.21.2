package X;

/* renamed from: X.0EK  reason: invalid class name */
public class AnonymousClass0EK {
    public static volatile AnonymousClass0EK A04;
    public final C000300f A00;
    public final AnonymousClass03P A01;
    public final C02460Cc A02;
    public final AnonymousClass022 A03;

    public AnonymousClass0EK(C000300f r1, AnonymousClass03P r2, C02460Cc r3, AnonymousClass022 r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static AnonymousClass0EK A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0EK.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0EK(C000300f.A00(), AnonymousClass03P.A00(), C02460Cc.A01(), AnonymousClass022.A00());
                }
            }
        }
        return A04;
    }

    public AnonymousClass2TP A01(byte b, boolean z) {
        if (b != 1 && b != 23 && b != 37 && b != 42) {
            return null;
        }
        AnonymousClass2TP A022 = A02(z);
        if (!z) {
            C000300f r6 = this.A00;
            if (r6.A0D(AbstractC000400g.A1E)) {
                int A06 = r6.A06(AbstractC000400g.A3D);
                int A062 = r6.A06(AbstractC000400g.A3E);
                if (500 <= A06 && A06 <= 4000 && 20 <= A062 && A062 <= 100 && C002001d.A0B(this.A03, this.A01) >= 2013 && A03(0)) {
                    return new AnonymousClass2TP(r6.A06(AbstractC000400g.A3G), A062, A06, A022.A00);
                }
            }
        }
        return A022;
    }

    public final AnonymousClass2TP A02(boolean z) {
        C000300f r1 = this.A00;
        if (z) {
            return new AnonymousClass2TP(r1.A06(AbstractC000400g.A3G), r1.A06(AbstractC000400g.A3w), r1.A06(AbstractC000400g.A3v));
        }
        return new AnonymousClass2TP(r1.A06(AbstractC000400g.A3G), r1.A06(AbstractC000400g.A3H), r1.A06(AbstractC000400g.A3F));
    }

    public final boolean A03(int i) {
        Float A022 = this.A02.A02(i);
        if (A022 == null) {
            return false;
        }
        float floatValue = A022.floatValue();
        if (floatValue <= 20.0f) {
            return false;
        }
        if (i != 0) {
            if (i == 1 && floatValue >= ((float) this.A00.A06(AbstractC000400g.A3h))) {
                return true;
            }
            return false;
        } else if (floatValue >= ((float) this.A00.A06(AbstractC000400g.A3C))) {
            return true;
        } else {
            return false;
        }
    }
}
