package X;

/* renamed from: X.0uk  reason: invalid class name and case insensitive filesystem */
public final class C19270uk {
    public C32031eE A00;
    public boolean A01 = true;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public C19270uk(C32031eE r2) {
        this.A00 = r2;
    }

    public void A00() {
        if (this.A01) {
            C32031eE r1 = this.A00;
            if (r1.A0N && r1.A0H != null) {
                if (r1.A0G == null) {
                    r1.A0G = new C32221eX(r1);
                    C32031eE r12 = this.A00;
                    r12.A09(r12.A0G);
                    return;
                }
                return;
            }
        }
        C32031eE r13 = this.A00;
        C32221eX r0 = r13.A0G;
        if (r0 != null) {
            r13.A0A(r0);
            this.A00.A0G = null;
        }
    }

    public void A01(boolean z) {
        if (z) {
            C32031eE r1 = this.A00;
            if (r1.A0F == null) {
                r1.A0F = new C32111eM(r1);
                C32031eE r12 = this.A00;
                r12.A09(r12.A0F);
                return;
            }
            return;
        }
        C32031eE r13 = this.A00;
        C32111eM r0 = r13.A0F;
        if (r0 != null) {
            r13.A0A(r0);
            this.A00.A0F = null;
        }
    }
}
