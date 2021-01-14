package X;

/* renamed from: X.0HC  reason: invalid class name */
public class AnonymousClass0HC {
    public static volatile AnonymousClass0HC A08;
    public final AnonymousClass02M A00;
    public final AnonymousClass0B3 A01;
    public final C000300f A02;
    public final AnonymousClass0CL A03;
    public final AnonymousClass00C A04;
    public final AnonymousClass0CW A05;
    public final AnonymousClass0CH A06;
    public final AnonymousClass0CT A07;

    public AnonymousClass0HC(AnonymousClass02M r1, AnonymousClass0CL r2, C000300f r3, AnonymousClass0CT r4, AnonymousClass00C r5, AnonymousClass0CH r6, AnonymousClass0CW r7, AnonymousClass0B3 r8) {
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A07 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A05 = r7;
        this.A01 = r8;
    }

    public static AnonymousClass0HC A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0HC.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass0HC(AnonymousClass02M.A00(), AnonymousClass0CL.A00(), C000300f.A00(), AnonymousClass0CT.A00(), AnonymousClass00C.A00(), AnonymousClass0CH.A00(), AnonymousClass0CW.A00(), AnonymousClass0B3.A00());
                }
            }
        }
        return A08;
    }
}
