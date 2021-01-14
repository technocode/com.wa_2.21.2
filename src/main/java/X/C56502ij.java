package X;

/* renamed from: X.2ij  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56502ij implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass02N A00;
    public final /* synthetic */ C04420Kh A01;
    public final /* synthetic */ C56862jJ A02;

    public /* synthetic */ C56502ij(C04420Kh r1, C56862jJ r2, AnonymousClass02N r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C04420Kh r2 = this.A01;
        C56862jJ r5 = this.A02;
        AnonymousClass02N r1 = this.A00;
        Number number = (Number) obj;
        if (!r2.A0H.containsValue(r5)) {
            AnonymousClass00Y r4 = r2.A06;
            AnonymousClass0EJ r3 = r2.A07;
            int intValue = number.intValue();
            int i = 2;
            if (AnonymousClass1VY.A0Y(r1)) {
                i = 3;
            }
            r4.A07(r3.A04(r5, intValue, i));
            r5.A03();
        }
    }
}
