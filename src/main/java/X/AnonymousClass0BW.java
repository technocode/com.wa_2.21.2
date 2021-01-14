package X;

/* renamed from: X.0BW  reason: invalid class name */
public class AnonymousClass0BW {
    public static volatile AnonymousClass0BW A02;
    public final AnonymousClass021 A00;
    public final AnonymousClass0BX A01;

    public AnonymousClass0BW(AnonymousClass021 r1, AnonymousClass0BX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static AnonymousClass0BW A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0BW.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0BW(new AnonymousClass021(), AnonymousClass0BX.A00());
                }
            }
        }
        return A02;
    }
}
