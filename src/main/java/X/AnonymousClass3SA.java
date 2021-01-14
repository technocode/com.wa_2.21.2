package X;

/* renamed from: X.3SA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3SA implements AnonymousClass0SG {
    public final /* synthetic */ AnonymousClass0SG A00;
    public final /* synthetic */ C08580bN A01;

    public /* synthetic */ AnonymousClass3SA(C08580bN r1, AnonymousClass0SG r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        C08580bN r0 = this.A01;
        AnonymousClass0SG r3 = this.A00;
        if (r0.A00.compareAndSet(true, false)) {
            r3.ADy(obj);
        }
    }
}
