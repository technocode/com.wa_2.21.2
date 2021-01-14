package X;

/* renamed from: X.2gg  reason: invalid class name and case insensitive filesystem */
public class C55522gg extends C49352Qd {
    public C55522gg(AnonymousClass01I r1, C014308b r2) {
        super(r1, r2);
    }

    @Override // X.C49352Qd
    public int A00(C007003k r3, C007003k r4) {
        String str = r3.A0F;
        if (str == null && r4.A0F != null) {
            return 1;
        }
        if (str == null || r4.A0F != null) {
            return super.compare(r3, r4);
        }
        return -1;
    }
}
