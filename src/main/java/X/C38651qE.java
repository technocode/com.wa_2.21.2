package X;

/* renamed from: X.1qE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38651qE implements AbstractC02170Ax {
    public static final /* synthetic */ C38651qE A00 = new C38651qE();

    @Override // X.AbstractC02170Ax
    public final Object get() {
        if (AnonymousClass0P3.A0B == null) {
            synchronized (AnonymousClass0P3.class) {
                if (AnonymousClass0P3.A0B == null) {
                    AnonymousClass0P3.A0B = new AnonymousClass0P3(AnonymousClass009.A00(), AnonymousClass00Y.A00(), AnonymousClass0P4.A00(), AnonymousClass0P5.A00(), AnonymousClass0P6.A00(), AnonymousClass0P7.A00(), AnonymousClass0P8.A00());
                }
            }
        }
        return AnonymousClass0P3.A0B;
    }
}
