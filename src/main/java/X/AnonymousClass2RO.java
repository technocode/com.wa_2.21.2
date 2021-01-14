package X;

import java.util.regex.Pattern;

/* renamed from: X.2RO  reason: invalid class name */
public class AnonymousClass2RO {
    public static final AbstractC02190Az A03 = new C02180Ay(C55352gP.A00, null);
    public static volatile AnonymousClass2RO A04;
    public final C12420i4 A00;
    public final AnonymousClass01T A01;
    public final C28631Vd A02;

    public AnonymousClass2RO(C28631Vd r1, C12420i4 r2, AnonymousClass01T r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static AnonymousClass2RO A00() {
        if (A04 == null) {
            synchronized (AnonymousClass2RO.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass2RO(C28631Vd.A00(), C12420i4.A00, AnonymousClass01T.A00());
                }
            }
        }
        return A04;
    }

    public static boolean A01(String str) {
        if (str == null) {
            return false;
        }
        return ((Pattern) A03.get()).matcher(str).matches();
    }

    public boolean A02(C007003k r4) {
        if (this.A02.A00.A06(AbstractC000400g.A3y) == 20) {
            return true;
        }
        if (this.A00 != null) {
            return A01(C12420i4.A01((AnonymousClass02N) r4.A02(AnonymousClass02N.class)));
        }
        throw null;
    }
}
