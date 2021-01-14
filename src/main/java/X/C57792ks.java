package X;

/* renamed from: X.2ks  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57792ks implements AbstractC02170Ax {
    public static final /* synthetic */ C57792ks A00 = new C57792ks();

    @Override // X.AbstractC02170Ax
    public final Object get() {
        if (C07410Xn.A01 == null) {
            synchronized (C07410Xn.class) {
                if (C07410Xn.A01 == null) {
                    C07410Xn.A01 = new C07410Xn(AnonymousClass0HM.A00());
                }
            }
        }
        return C07410Xn.A01;
    }
}
