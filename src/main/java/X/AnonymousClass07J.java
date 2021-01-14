package X;

import java.util.Set;

/* renamed from: X.07J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass07J implements AbstractC008705g {
    public static final AnonymousClass07J A00 = new AnonymousClass07J();

    @Override // X.AbstractC008705g
    public Object A3D(AnonymousClass07F r5) {
        Set A03 = r5.A03(AnonymousClass06H.class);
        AnonymousClass07Y r2 = AnonymousClass07Y.A01;
        if (r2 == null) {
            synchronized (AnonymousClass07Y.class) {
                r2 = AnonymousClass07Y.A01;
                if (r2 == null) {
                    r2 = new AnonymousClass07Y();
                    AnonymousClass07Y.A01 = r2;
                }
            }
        }
        return new AnonymousClass07Z(A03, r2);
    }
}
