package X;

/* renamed from: X.1gr  reason: invalid class name and case insensitive filesystem */
public class C33491gr {
    public AnonymousClass118 A00;
    public AnonymousClass119 A01;
    public boolean A02;
    public final AnonymousClass0WM A03;
    public final C33461go A04;

    public C33491gr(AnonymousClass0WM r2) {
        this.A03 = r2;
        this.A04 = new C33461go(r2);
    }

    public void A00(AnonymousClass119 r2) {
        if (this.A01 != r2) {
            if (r2 == null) {
                this.A04.A01();
            }
            this.A01 = r2;
            this.A03.requestLayout();
        }
    }
}
