package X;

/* renamed from: X.2d7  reason: invalid class name */
public class AnonymousClass2d7 implements AbstractC26561Lk {
    public final /* synthetic */ C53392d8 A00;

    public AnonymousClass2d7(C53392d8 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        C53392d8 r0 = this.A00;
        r0.A06();
        AbstractC26561Lk r1 = r0.A05;
        if (r1 != null) {
            AbstractC48622Na r02 = r0.A08;
            if (r02 == null || r02.AB8()) {
                r1.ADI();
            }
        }
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C53392d8 r0 = this.A00;
        r0.A06();
        AbstractC26561Lk r1 = r0.A05;
        if (r1 != null) {
            AbstractC48622Na r02 = r0.A08;
            if (r02 == null || r02.AB8()) {
                r1.AFR(iArr);
            }
        }
    }
}
