package X;

/* renamed from: X.0Ek  reason: invalid class name and case insensitive filesystem */
public class C03000Ek {
    public static volatile C03000Ek A04;
    public C03060Eq A00;
    public C03060Eq A01 = new C03060Eq(this.A03, new C02180Ay(new C03070Er(this.A02), null));
    public final C03040Eo A02;
    public final C03010El A03;

    public C03000Ek(AnonymousClass00T r5, C03010El r6) {
        this.A03 = r6;
        C03040Eo r1 = new C03040Eo(r5);
        this.A02 = r1;
        this.A00 = new C03060Eq(r6, new C02180Ay(new C03050Ep(r1), null));
    }

    public final C03060Eq A00(AnonymousClass1XO r2) {
        if (r2 == AnonymousClass1XO.A0A || r2 == AnonymousClass1XO.A0P || r2 == AnonymousClass1XO.A0C || r2 == AnonymousClass1XO.A0H || r2 == AnonymousClass1XO.A06) {
            return this.A00;
        }
        return this.A01;
    }

    public void A01(AnonymousClass2TS r3, AnonymousClass1XO r4) {
        A00(r4).A01(r3.A02, r3);
    }
}
