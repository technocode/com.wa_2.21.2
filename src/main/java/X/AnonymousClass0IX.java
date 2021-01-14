package X;

/* renamed from: X.0IX  reason: invalid class name */
public class AnonymousClass0IX {
    public static volatile AnonymousClass0IX A05;
    public final AnonymousClass03R A00;
    public final AnonymousClass00C A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass0BD A03;
    public final AnonymousClass0BC A04;

    public AnonymousClass0IX(AnonymousClass0BC r1, AnonymousClass00G r2, AnonymousClass03R r3, AnonymousClass0BD r4, AnonymousClass00C r5) {
        this.A04 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
        this.A01 = r5;
    }

    public static AnonymousClass0IX A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0IX.class) {
                if (A05 == null) {
                    AnonymousClass0BC A002 = AnonymousClass0BC.A00();
                    AnonymousClass00G r4 = AnonymousClass00G.A01;
                    AnonymousClass03R A003 = AnonymousClass03R.A00();
                    AnonymousClass04q.A00();
                    A05 = new AnonymousClass0IX(A002, r4, A003, AnonymousClass0BD.A00(), AnonymousClass00C.A00());
                }
            }
        }
        return A05;
    }
}
