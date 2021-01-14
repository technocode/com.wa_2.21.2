package X;

/* renamed from: X.1Vj  reason: invalid class name and case insensitive filesystem */
public class C28691Vj {
    public static volatile C28691Vj A02;
    public final AnonymousClass01A A00;
    public final C28701Vk A01;

    public C28691Vj(AnonymousClass01A r1, C28701Vk r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C28691Vj A00() {
        if (A02 == null) {
            synchronized (C28691Vj.class) {
                if (A02 == null) {
                    A02 = new C28691Vj(AnonymousClass01A.A00(), C28701Vk.A00());
                }
            }
        }
        return A02;
    }

    public C007003k A01(C28831Vx r3, String str) {
        try {
            C007003k A09 = this.A00.A09(AnonymousClass02N.A00(this.A01.A03(r3, str)));
            if (A09 != null) {
                return A09;
            }
            throw new SecurityException("Invalid contact ID");
        } catch (AnonymousClass02Y e) {
            throw new SecurityException(e);
        }
    }
}
