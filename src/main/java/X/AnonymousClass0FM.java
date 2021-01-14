package X;

/* renamed from: X.0FM  reason: invalid class name */
public class AnonymousClass0FM {
    public static volatile AnonymousClass0FM A04;
    public final AnonymousClass04j A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass00Y A02;
    public final AnonymousClass0FN A03;

    public AnonymousClass0FM(AnonymousClass00S r1, AnonymousClass00Y r2, AnonymousClass04j r3, AnonymousClass0FN r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }

    public static AnonymousClass0FM A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0FM.class) {
                if (A04 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass00Y A003 = AnonymousClass00Y.A00();
                    AnonymousClass04j A004 = AnonymousClass04j.A00();
                    if (AnonymousClass0FN.A01 == null) {
                        synchronized (AnonymousClass0FN.class) {
                            if (AnonymousClass0FN.A01 == null) {
                                AnonymousClass0FN.A01 = new AnonymousClass0FN(AnonymousClass022.A00());
                            }
                        }
                    }
                    A04 = new AnonymousClass0FM(A002, A003, A004, AnonymousClass0FN.A01);
                }
            }
        }
        return A04;
    }

    public final int A01() {
        Integer A012 = AnonymousClass0ET.A01(this.A00.A04());
        if (A012 == null) {
            return 0;
        }
        return A012.intValue();
    }

    public final long A02() {
        long A05 = this.A01.A05();
        return A05 - (A05 % 86400000);
    }

    public synchronized void A03(double d, int i, int i2, boolean z, boolean z2) {
        long A022 = A02();
        int A012 = A01();
        C49922Ss A013 = this.A03.A01(A022, i, A012, i2, z2);
        double d2 = (double) A013.A00;
        Double.isNaN(d2);
        A013.A00 = (long) (d2 + d);
        if (z) {
            A013.A02++;
        }
        this.A03.A02(A022, i, A012, i2, z2, A013);
    }

    public synchronized void A04(double d, boolean z, int i, int i2) {
        long A022 = A02();
        int A012 = A01();
        C49922Ss A013 = this.A03.A01(A022, i, A012, i2, false);
        double d2 = (double) A013.A01;
        Double.isNaN(d2);
        A013.A01 = (long) (d2 + d);
        if (z) {
            A013.A07++;
        }
        this.A03.A02(A022, i, A012, i2, false, A013);
    }

    public synchronized void A05(int i, int i2) {
        long A022 = A02();
        int A012 = A01();
        AnonymousClass0FN r4 = this.A03;
        C49922Ss A013 = r4.A01(A022, i2, A012, i, false);
        A013.A05++;
        r4.A02(A022, i2, A012, i, false, A013);
    }

    public synchronized void A06(int i, int i2) {
        long A022 = A02();
        int A012 = A01();
        AnonymousClass0FN r4 = this.A03;
        C49922Ss A013 = r4.A01(A022, i, A012, i2, false);
        A013.A08++;
        r4.A02(A022, i, A012, i2, false, A013);
    }
}
