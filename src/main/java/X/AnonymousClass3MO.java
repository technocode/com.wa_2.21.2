package X;

/* renamed from: X.3MO  reason: invalid class name */
public class AnonymousClass3MO {
    public static volatile AnonymousClass3MO A01;
    public final AnonymousClass3MP A00;

    public AnonymousClass3MO(AnonymousClass3MP r1) {
        this.A00 = r1;
    }

    public static AnonymousClass3MO A00() {
        if (A01 == null) {
            synchronized (AnonymousClass3MO.class) {
                if (A01 == null) {
                    C64932z2.A00();
                    AnonymousClass03P.A00();
                    AnonymousClass3MP A002 = C64892yy.A00();
                    AnonymousClass022.A00();
                    A01 = new AnonymousClass3MO(A002);
                }
            }
        }
        return A01;
    }
}
