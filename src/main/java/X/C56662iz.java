package X;

/* renamed from: X.2iz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56662iz implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0CH A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ C56662iz(AnonymousClass0CH r1, AnonymousClass0M3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0CH r8 = this.A00;
        AnonymousClass0M3 r7 = this.A01;
        Number number = (Number) obj;
        AnonymousClass0M4 r6 = r7.A02;
        if (r6 != null) {
            long j = r7.A01;
            long j2 = 0;
            if (j != 0) {
                j2 = (number.longValue() * 100) / j;
            }
            r6.A0C = j2;
            r6.A09 = number.longValue();
            r8.A0G.A06(r7, 8);
            return;
        }
        throw null;
    }
}
