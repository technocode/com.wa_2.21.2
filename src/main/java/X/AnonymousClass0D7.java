package X;

/* renamed from: X.0D7  reason: invalid class name */
public class AnonymousClass0D7 {
    public static volatile AnonymousClass0D7 A01;
    public final C02110Ar A00;

    public AnonymousClass0D7(C02110Ar r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0D7 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0D7.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0D7(C02110Ar.A00());
                }
            }
        }
        return A01;
    }

    public synchronized void A01(C05450Op r4) {
        AnonymousClass0M3 r2 = r4.A04;
        if (!r4.A04()) {
            AnonymousClass1XF A012 = this.A00.A01(r2.A0n);
            if (A012 != null) {
                byte[] bArr = A012.A00;
                int[] iArr = A012.A01;
                synchronized (r4) {
                    if (!r4.A00) {
                        r4.A02(bArr, iArr);
                    }
                }
            }
        }
    }

    public synchronized boolean A02(AbstractC007503q r2) {
        C05450Op A0u;
        if (r2 == null) {
            return false;
        }
        if (!(r2 instanceof AnonymousClass0M3) || (A0u = ((AnonymousClass0M3) r2).A0u()) == null || A0u.A04()) {
            return A02(r2.A09());
        }
        return true;
    }
}
