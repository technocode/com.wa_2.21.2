package X;

/* renamed from: X.2dM  reason: invalid class name and case insensitive filesystem */
public final class C53492dM extends AnonymousClass2QB {
    public static volatile C53492dM A00;

    public C53492dM(C53422dF r1) {
        super(r1);
    }

    public static C53492dM A00() {
        if (A00 == null) {
            synchronized (C53492dM.class) {
                if (A00 == null) {
                    if (C53422dF.A01 == null) {
                        synchronized (C53422dF.class) {
                            if (C53422dF.A01 == null) {
                                C53422dF.A01 = new C53422dF(AnonymousClass00S.A00(), C002101e.A00(), AnonymousClass00Y.A00(), AnonymousClass01X.A00(), AnonymousClass04j.A00(), AnonymousClass00D.A00(), C03910Ig.A00(), C53442dH.A00(), C53432dG.A00(), new C48692Ni(AnonymousClass03P.A00()));
                            }
                        }
                    }
                    A00 = new C53492dM(C53422dF.A01);
                }
            }
        }
        return A00;
    }
}
