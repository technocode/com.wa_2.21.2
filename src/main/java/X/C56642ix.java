package X;

/* renamed from: X.2ix  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56642ix implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0CH A00;
    public final /* synthetic */ AnonymousClass1WA A01;
    public final /* synthetic */ AnonymousClass0M3 A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C56642ix(AnonymousClass0CH r1, AnonymousClass0M3 r2, AnonymousClass1WA r3, boolean z) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = z;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0CH r2 = this.A00;
        AnonymousClass0M3 r4 = this.A02;
        AnonymousClass1WA r6 = this.A01;
        boolean z = this.A03;
        C49982Sy r3 = (C49982Sy) obj;
        r2.A0e.A08(r4);
        r2.A09(false, r3, r4, r6);
        if (r4 != null) {
            AnonymousClass0FQ r1 = r2.A0R;
            synchronized (r1) {
                r1.remove(r4.A0n);
            }
        }
        r2.A0l.execute(new RunnableEBaseShape0S0410000_I0(r2, r3, r4, z, r6, 1));
    }
}
