package X;

/* renamed from: X.2YS  reason: invalid class name */
public class AnonymousClass2YS extends C26381Kq {
    public AnonymousClass2YS(C014308b r1, AnonymousClass01X r2) {
        super(r1, r2);
    }

    @Override // X.C26381Kq
    public int A00(C007003k r5, C007003k r6) {
        boolean z = false;
        boolean z2 = false;
        if (r5.A08 != null) {
            z2 = true;
        }
        if (r6.A08 != null) {
            z = true;
        }
        if (z2 == z) {
            return super.compare(r5, r6);
        }
        if (z2) {
            return -1;
        }
        return 1;
    }
}
