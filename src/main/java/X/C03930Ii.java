package X;

/* renamed from: X.0Ii  reason: invalid class name and case insensitive filesystem */
public class C03930Ii extends C03410Gc {
    public static volatile C03930Ii A00;

    public C03930Ii(C03940Ij r2) {
        super(r2, 36);
    }

    public static C03930Ii A00() {
        if (A00 == null) {
            synchronized (C03930Ii.class) {
                if (A00 == null) {
                    if (C03940Ij.A01 == null) {
                        synchronized (C03940Ij.class) {
                            if (C03940Ij.A01 == null) {
                                C03940Ij.A01 = new C03940Ij(AnonymousClass00G.A01);
                            }
                        }
                    }
                    A00 = new C03930Ii(C03940Ij.A01);
                }
            }
        }
        return A00;
    }
}
