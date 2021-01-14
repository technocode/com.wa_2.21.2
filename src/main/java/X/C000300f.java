package X;

/* renamed from: X.00f  reason: invalid class name and case insensitive filesystem */
public class C000300f extends AbstractC000400g {
    public static final C006003a A00 = AbstractC000400g.A03("web_sync_max_unread_count", "web_sync_max_unread_count", 200, 1, 200);
    public static volatile C000300f A01;

    public C000300f(AnonymousClass00G r1, AnonymousClass03X r2, AnonymousClass038 r3, C006303d r4, AnonymousClass022 r5) {
        super(r1, r2, r3, r4, r5);
    }

    public static C000300f A00() {
        if (A01 == null) {
            synchronized (C000300f.class) {
                if (A01 == null) {
                    A01 = new C000300f(AnonymousClass00G.A01, AnonymousClass03X.A00(), AnonymousClass038.A00(), C006303d.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A01;
    }
}
