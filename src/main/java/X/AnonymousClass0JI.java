package X;

/* renamed from: X.0JI  reason: invalid class name */
public class AnonymousClass0JI {
    public static volatile AnonymousClass0JI A08;
    public AnonymousClass30B A00;
    public String A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass03S A04;
    public final AnonymousClass00D A05;
    public final AnonymousClass0KP A06;
    public final AnonymousClass00T A07;

    public AnonymousClass0JI(AnonymousClass00G r1, AnonymousClass00T r2, AnonymousClass03P r3, AnonymousClass03S r4, AnonymousClass00D r5, AnonymousClass0KP r6) {
        this.A03 = r1;
        this.A07 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
    }

    public static AnonymousClass0JI A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0JI.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass0JI(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass03P.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00(), AnonymousClass0KP.A00());
                }
            }
        }
        return A08;
    }

    public void A01() {
        AnonymousClass30B r1 = this.A00;
        if (r1 != null) {
            this.A03.A00.unregisterReceiver(r1);
            this.A00 = null;
        }
    }
}
