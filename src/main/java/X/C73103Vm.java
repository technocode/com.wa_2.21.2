package X;

/* renamed from: X.3Vm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73103Vm implements AbstractC02170Ax {
    public static final /* synthetic */ C73103Vm A00 = new C73103Vm();

    @Override // X.AbstractC02170Ax
    public final Object get() {
        if (C26671Lx.A00 == null) {
            synchronized (C26671Lx.class) {
                if (C26671Lx.A00 == null) {
                    C26671Lx.A00 = new C26671Lx();
                }
            }
        }
        return C26671Lx.A00;
    }
}
