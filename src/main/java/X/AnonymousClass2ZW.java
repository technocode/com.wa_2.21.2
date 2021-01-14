package X;

/* renamed from: X.2ZW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZW implements AbstractC47552Ik {
    public final /* synthetic */ C60742q3 A00;
    public final /* synthetic */ C28301Tu A01;
    public final /* synthetic */ AnonymousClass0MP A02;

    public /* synthetic */ AnonymousClass2ZW(C60742q3 r1, AnonymousClass0MP r2, C28301Tu r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    @Override // X.AbstractC47552Ik
    public final void AIU(int i) {
        C60742q3 r0 = this.A00;
        AnonymousClass0MP r3 = this.A02;
        C28301Tu r2 = this.A01;
        AbstractC43421yL rowsContainer = r0.getRowsContainer();
        if (rowsContainer instanceof AbstractC03670He) {
            AbstractC03670He r1 = (AbstractC03670He) rowsContainer;
            if (r1.A2e(r3, r2.A0N) && r1.A34(r3, i, r2.A0N)) {
                r2.A0M = true;
            }
        }
    }
}
