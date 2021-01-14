package X;

/* renamed from: X.0Ck  reason: invalid class name and case insensitive filesystem */
public class C02520Ck {
    public static volatile C02520Ck A08;
    public final AnonymousClass009 A00;
    public final C000300f A01;
    public final C002701k A02;
    public final AnonymousClass0CW A03;
    public final AnonymousClass0CX A04;
    public final C02450Cb A05;
    public final AnonymousClass0CK A06;
    public final AnonymousClass09H A07;

    public C02520Ck(C002701k r1, AnonymousClass009 r2, AnonymousClass0CK r3, C000300f r4, AnonymousClass09H r5, C02450Cb r6, AnonymousClass0CW r7, AnonymousClass0CX r8) {
        this.A02 = r1;
        this.A00 = r2;
        this.A06 = r3;
        this.A01 = r4;
        this.A07 = r5;
        this.A05 = r6;
        this.A03 = r7;
        this.A04 = r8;
    }

    public static C02520Ck A00() {
        if (A08 == null) {
            synchronized (C02520Ck.class) {
                if (A08 == null) {
                    A08 = new C02520Ck(C002701k.A00(), AnonymousClass009.A00(), AnonymousClass0CK.A00(), C000300f.A00(), AnonymousClass09H.A01(), C02450Cb.A00(), AnonymousClass0CW.A00(), AnonymousClass0CX.A00());
                }
            }
        }
        return A08;
    }
}
