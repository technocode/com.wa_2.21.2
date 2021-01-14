package X;

/* renamed from: X.2j1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56682j1 implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass1W7 A00;
    public final /* synthetic */ AnonymousClass0CH A01;
    public final /* synthetic */ AnonymousClass1WA A02;
    public final /* synthetic */ AnonymousClass0M3 A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C56682j1(AnonymousClass0CH r1, AnonymousClass0M3 r2, AnonymousClass1WA r3, AnonymousClass1W7 r4, boolean z) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A04 = z;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0CH r2 = this.A01;
        AnonymousClass0M3 r4 = this.A03;
        AnonymousClass1WA r5 = this.A02;
        AnonymousClass1W7 r6 = this.A00;
        boolean z = this.A04;
        C49982Sy r3 = (C49982Sy) obj;
        r2.A0e.A08(r4);
        r2.A09(true, r3, r4, r5);
        if (r4 != null) {
            AnonymousClass0FQ r1 = r2.A0R;
            synchronized (r1) {
                r1.remove(r4.A0n);
            }
        }
        r2.A0l.execute(new RunnableEBaseShape0S0510000_I0(r2, r3, r4, r5, r6, z, 4));
    }
}
