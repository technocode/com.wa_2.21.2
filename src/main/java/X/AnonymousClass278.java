package X;

/* renamed from: X.278  reason: invalid class name */
public class AnonymousClass278 extends AbstractC07100Vx {
    public AnonymousClass29W A00;
    public final long A01;
    public final AbstractC25311Gi A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass278(long j, AnonymousClass29W r8, AnonymousClass05q r9, AbstractC25311Gi r10) {
        super(AnonymousClass11D.VIEW);
        if (r10 != null) {
            this.A01 = j;
            this.A00 = r8;
            this.A02 = r10;
            AnonymousClass11C[] r3 = {new AnonymousClass11C(this, new C37911oz(r10, r9)), new AnonymousClass11C(this, new C37901oy(r10, r9))};
            for (int i = 0; i < 2; i++) {
                A07(r3[i]);
            }
            return;
        }
        throw null;
    }

    @Override // X.AbstractC07100Vx, X.AbstractC009105u
    public /* bridge */ /* synthetic */ AbstractC009105u ABr() {
        return super.ABr();
    }
}
