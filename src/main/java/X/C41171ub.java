package X;

/* renamed from: X.1ub  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41171ub implements AbstractC03150Ez {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C459427d A01;

    public /* synthetic */ C41171ub(C459427d r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        int i;
        C459427d r2 = this.A01;
        int i2 = this.A00;
        synchronized (r2) {
            r2.A03.set(i2, obj);
            i = r2.A00 - 1;
            r2.A00 = i;
        }
        if (i == 0) {
            r2.A03();
        }
    }
}
