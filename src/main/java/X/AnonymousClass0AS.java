package X;

/* renamed from: X.0AS  reason: invalid class name */
public class AnonymousClass0AS {
    public static volatile AnonymousClass0AS A05;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public final AnonymousClass00Y A04;

    public AnonymousClass0AS(AnonymousClass00Y r1) {
        this.A04 = r1;
    }

    public static AnonymousClass0AS A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0AS.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0AS(AnonymousClass00Y.A00());
                }
            }
        }
        return A05;
    }

    public void A01(int i, AnonymousClass02N r6) {
        this.A00 = i;
        int i2 = 1;
        if (AnonymousClass1VY.A0Y(r6)) {
            i2 = 2;
        }
        this.A02 = i2;
        C44161zb r3 = new C44161zb();
        int i3 = this.A01;
        if (i3 > 0) {
            r3.A01 = Integer.valueOf(i3);
        }
        r3.A02 = Integer.valueOf(i);
        r3.A00 = Integer.valueOf(i2);
        if (i == 1) {
            r3.A03 = Long.valueOf(this.A03);
        }
        this.A04.A0B(r3, null, false);
    }
}
