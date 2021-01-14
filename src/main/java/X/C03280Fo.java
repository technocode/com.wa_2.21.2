package X;

/* renamed from: X.0Fo  reason: invalid class name and case insensitive filesystem */
public class C03280Fo {
    public static volatile C03280Fo A00;

    public static C03280Fo A00() {
        if (A00 == null) {
            synchronized (C03280Fo.class) {
                if (A00 == null) {
                    A00 = new C03280Fo();
                }
            }
        }
        return A00;
    }
}
