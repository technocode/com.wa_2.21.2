package X;

/* renamed from: X.234  reason: invalid class name */
public final /* synthetic */ class AnonymousClass234 implements AbstractC000900m {
    public final /* synthetic */ AnonymousClass00L A00;

    public /* synthetic */ AnonymousClass234(AnonymousClass00L r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC000900m
    public final void AEa(AnonymousClass0JF r5) {
        AnonymousClass00L r3 = this.A00;
        StringBuilder A0S = AnonymousClass008.A0S("crashlogs/event connected=");
        boolean z = r5.A02;
        AnonymousClass008.A1Z(A0S, z);
        if (z) {
            r3.A0D.ANF(new RunnableEBaseShape4S0100000_I0_4(r3, 37));
        }
    }
}
