package X;

/* renamed from: X.3DC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DC implements AbstractC61022sN {
    public final /* synthetic */ C10190eE A00;

    public /* synthetic */ AnonymousClass3DC(C10190eE r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC61022sN
    public final void AJE(C61072sS r6) {
        int i;
        C10190eE r4 = this.A00;
        if (r6 == null || (i = r6.code) != 11495) {
            AbstractC61022sN r0 = r4.A02;
            if (r0 != null) {
                r0.AJE(r6);
                return;
            }
            return;
        }
        AnonymousClass008.A1L(AnonymousClass008.A0S("PAY: reject collect; error code: "), i);
        AnonymousClass3DV r3 = r4.A03;
        r3.A0A.ANF(new RunnableEBaseShape3S0100000_I0_3(r4, 30));
        r3.A00.A02();
        C002001d.A2O(r4.A00, 100);
    }
}
