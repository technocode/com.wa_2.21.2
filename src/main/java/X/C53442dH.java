package X;

/* renamed from: X.2dH  reason: invalid class name and case insensitive filesystem */
public class C53442dH {
    public static volatile C53442dH A01;
    public final AnonymousClass00D A00;

    public C53442dH(AnonymousClass00D r1) {
        this.A00 = r1;
    }

    public static C53442dH A00() {
        if (A01 == null) {
            synchronized (C53442dH.class) {
                if (A01 == null) {
                    A01 = new C53442dH(AnonymousClass00D.A00());
                }
            }
        }
        return A01;
    }
}
