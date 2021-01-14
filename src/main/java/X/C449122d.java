package X;

/* renamed from: X.22d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C449122d implements AbstractC02170Ax {
    public static final /* synthetic */ C449122d A00 = new C449122d();

    @Override // X.AbstractC02170Ax
    public final Object get() {
        try {
            Class.forName("androidx.test.espresso.Espresso");
            return Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            return Boolean.FALSE;
        }
    }
}
