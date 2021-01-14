package X;

/* renamed from: X.2Xb  reason: invalid class name and case insensitive filesystem */
public class C51032Xb implements AnonymousClass0KL {
    public final /* synthetic */ AbstractActivityC60812rK A00;

    @Override // X.AnonymousClass0KL
    public void ALo(int i) {
    }

    @Override // X.AnonymousClass0KL
    public void ALp(AnonymousClass0K4 r1) {
    }

    public C51032Xb(AbstractActivityC60812rK r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0KL
    public void ALq() {
        AbstractActivityC60812rK r1 = this.A00;
        if (!r1.isFinishing()) {
            AnonymousClass02M r2 = ((ActivityC004702f) r1).A0F;
            r2.A02.post(new RunnableEBaseShape8S0100000_I1_3(this, 32));
        }
    }
}
