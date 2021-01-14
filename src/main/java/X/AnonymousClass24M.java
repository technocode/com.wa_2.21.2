package X;

/* renamed from: X.24M  reason: invalid class name */
public class AnonymousClass24M extends C30861c4 {
    public C09360cl A00;

    public AnonymousClass24M(C09360cl r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC09420cr
    public void ALG(AbstractC09350ck r3) {
        C09360cl r1 = this.A00;
        int i = r1.A01 - 1;
        r1.A01 = i;
        if (i == 0) {
            r1.A04 = false;
            r1.A0C();
        }
        r3.A08(this);
    }
}
