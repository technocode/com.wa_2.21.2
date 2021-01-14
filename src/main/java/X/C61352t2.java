package X;

/* renamed from: X.2t2  reason: invalid class name and case insensitive filesystem */
public class C61352t2 {
    public static volatile C61352t2 A08;
    public final AnonymousClass02M A00;
    public final AnonymousClass04j A01;
    public final AnonymousClass00G A02;
    public final C449222e A03;
    public final C60922sD A04;
    public final AnonymousClass0GP A05;
    public final C03340Fu A06;
    public final C63842x6 A07;

    public C61352t2(AnonymousClass00G r1, AnonymousClass02M r2, C63842x6 r3, AnonymousClass04j r4, C60922sD r5, C03340Fu r6, C449222e r7, AnonymousClass0GP r8) {
        this.A02 = r1;
        this.A00 = r2;
        this.A07 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A03 = r7;
        this.A05 = r8;
    }

    public static C61352t2 A00() {
        if (A08 == null) {
            synchronized (C61352t2.class) {
                if (A08 == null) {
                    A08 = new C61352t2(AnonymousClass00G.A01, AnonymousClass02M.A00(), C63842x6.A00(), AnonymousClass04j.A00(), C60922sD.A00(), C03340Fu.A00(), C449222e.A00(), AnonymousClass0GP.A00());
                }
            }
        }
        return A08;
    }
}
