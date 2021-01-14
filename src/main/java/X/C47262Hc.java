package X;

/* renamed from: X.2Hc  reason: invalid class name and case insensitive filesystem */
public class C47262Hc {
    public C10750f8 A00;
    public String A01;
    public final C014308b A02;
    public final AbstractC47252Hb A03;
    public final AnonymousClass02X A04;
    public final AnonymousClass00T A05;

    public C47262Hc(AnonymousClass00T r1, C014308b r2, AnonymousClass02X r3, AbstractC47252Hb r4) {
        this.A05 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
    }

    public void A00() {
        C10750f8 r0 = this.A00;
        boolean z = false;
        if (r0 == null) {
            z = true;
        }
        if (r0 != null) {
            r0.A04();
            this.A00 = null;
        }
        C10750f8 r2 = new C10750f8(this.A02, this, this.A04, z);
        this.A00 = r2;
        this.A05.ANC(r2, new Void[0]);
    }
}
