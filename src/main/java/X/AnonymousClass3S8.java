package X;

/* renamed from: X.3S8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3S8 implements AnonymousClass1MK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Runnable[] A01;

    public /* synthetic */ AnonymousClass3S8(Runnable[] runnableArr, int i) {
        this.A01 = runnableArr;
        this.A00 = i;
    }

    @Override // X.AnonymousClass1MK
    public final void A2l() {
        this.A01[this.A00].run();
    }
}
