package X;

/* renamed from: X.3MK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3MK implements AbstractC02170Ax {
    public static final /* synthetic */ AnonymousClass3MK A00 = new AnonymousClass3MK();

    @Override // X.AbstractC02170Ax
    public final Object get() {
        if (RunnableC64882yx.A05 == null) {
            synchronized (RunnableC64882yx.class) {
                if (RunnableC64882yx.A05 == null) {
                    RunnableC64882yx.A05 = new RunnableC64882yx(AnonymousClass3MM.A00(), C64892yy.A00(), AnonymousClass3MN.A00(), AnonymousClass3ZE.A00(), AnonymousClass3MO.A00());
                }
            }
        }
        return RunnableC64882yx.A05;
    }
}
