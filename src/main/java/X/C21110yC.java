package X;

/* renamed from: X.0yC  reason: invalid class name and case insensitive filesystem */
public class C21110yC {
    public static volatile C21110yC A02;
    public final C22150zx A00;
    public final C22170zz A01;

    public C21110yC() {
        C22170zz r1 = new C22170zz();
        this.A01 = r1;
        this.A00 = new C22150zx(r1);
    }

    public static C21110yC A00() {
        if (A02 == null) {
            synchronized (C21110yC.class) {
                if (A02 == null) {
                    A02 = new C21110yC();
                }
            }
        }
        return A02;
    }
}
