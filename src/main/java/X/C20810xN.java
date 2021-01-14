package X;

/* renamed from: X.0xN  reason: invalid class name and case insensitive filesystem */
public class C20810xN {
    public static volatile C32951fs A00;

    public static void A00() {
        if (A00 == null) {
            synchronized (C20810xN.class) {
                if (A00 == null) {
                    A00 = new C32951fs();
                }
            }
        }
        if (A00 == null) {
            throw null;
        }
    }
}
