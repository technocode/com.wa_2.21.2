package X;

/* renamed from: X.0ZL  reason: invalid class name */
public abstract class AnonymousClass0ZL extends AbstractC007503q implements AbstractC02880Dv {
    public String A00;

    public AnonymousClass0ZL(C007303n r2, long j, byte b) {
        super(r2, j, b);
        this.A01 = 0;
    }

    public void A0u(AnonymousClass0NK r2) {
        AnonymousClass02N r0 = this.A0n.A00;
        if (r0 != null) {
            r2.A06(r0.getRawString());
            r2.A07(false);
            String str = this.A00;
            if (str != null) {
                r2.A04(str);
            }
            AnonymousClass02N r02 = this.A0G;
            if (r02 != null) {
                r2.A05(r02.getRawString());
                return;
            }
            return;
        }
        throw null;
    }
}
