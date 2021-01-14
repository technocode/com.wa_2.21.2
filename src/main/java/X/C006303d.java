package X;

/* renamed from: X.03d  reason: invalid class name and case insensitive filesystem */
public class C006303d extends AnonymousClass01G {
    public static volatile C006303d A00;

    public static C006303d A00() {
        if (A00 == null) {
            synchronized (C006303d.class) {
                if (A00 == null) {
                    A00 = new C006303d();
                }
            }
        }
        return A00;
    }
}
