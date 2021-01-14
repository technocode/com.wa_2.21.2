package X;

/* renamed from: X.1qI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38691qI implements AnonymousClass1XK {
    public final /* synthetic */ C40091sc A00;

    public /* synthetic */ C38691qI(C40091sc r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass1XK
    public final void AN9(int i) {
        C40091sc r3 = this.A00;
        AnonymousClass008.A0u("send-get-gdpr-report/failed/error ", i);
        if (i == 404) {
            r3.A00.A05();
            return;
        }
        AnonymousClass02M r2 = r3.A01;
        r2.A02.post(new RunnableEBaseShape6S0100000_I1_1(r3, 10));
    }
}
