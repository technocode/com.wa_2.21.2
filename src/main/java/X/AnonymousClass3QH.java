package X;

/* renamed from: X.3QH  reason: invalid class name */
public class AnonymousClass3QH implements AnonymousClass1W7 {
    public final /* synthetic */ C75043c2 A00;

    public AnonymousClass3QH(C75043c2 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass1W7
    public void AFF(boolean z) {
        if (z) {
            AnonymousClass0I1 r2 = this.A00.A01;
            r2.A01 = new AnonymousClass1W8(0);
            r2.A02 = true;
            r2.A03.countDown();
            return;
        }
        AnonymousClass0I1 r1 = this.A00.A01;
        r1.A01 = new AnonymousClass1W8(1);
        r1.A02 = true;
        r1.A03.countDown();
    }

    @Override // X.AnonymousClass1W7
    public void AFG(AnonymousClass1W8 r3, C49982Sy r4) {
        AnonymousClass0I1 r1 = this.A00.A01;
        r1.A01 = r3;
        r1.A02 = true;
        r1.A03.countDown();
    }
}
