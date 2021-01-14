package X;

/* renamed from: X.2iV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56362iV implements AbstractC03150Ez {
    public final /* synthetic */ C56862jJ A00;

    public /* synthetic */ C56362iV(C56862jJ r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C56862jJ r3 = this.A00;
        C50152Tp r5 = (C50152Tp) obj;
        C56872jK r0 = r3.A01;
        if (r0 != null) {
            AnonymousClass2T3 r2 = r0.A01;
            synchronized (r2) {
                r2.A09 = true;
            }
        }
        int i = r5.A00;
        if (i == 0) {
            r3.A04(0);
        } else {
            r3.A04(i);
        }
    }
}
