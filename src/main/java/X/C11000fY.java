package X;

/* renamed from: X.0fY  reason: invalid class name and case insensitive filesystem */
public class C11000fY extends AnonymousClass0JW {
    public final AnonymousClass02M A00;
    public final AnonymousClass1Sv A01;
    public final AbstractC28091Sw A02;
    public final C02660Cy A03;
    public final AnonymousClass03U A04;
    public final AnonymousClass0CZ A05 = new AnonymousClass0CZ(1, 1000);

    public C11000fY(AnonymousClass02M r6, AnonymousClass03U r7, AbstractC28091Sw r8, C02660Cy r9, AnonymousClass1Sv r10) {
        this.A00 = r6;
        this.A04 = r7;
        this.A02 = r8;
        this.A03 = r9;
        this.A01 = r10;
        C42931xW r82 = (C42931xW) r8;
        r82.A00 = r82.A03();
        r82.A01 = Long.valueOf(r82.A08.A05());
        r82.A0C.A07(r82.A00);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        this.A02.A07 = false;
        if (((Boolean) obj).booleanValue()) {
            AnonymousClass1Sv r2 = this.A01;
            if (r2 != null) {
                AnonymousClass3H3 r22 = (AnonymousClass3H3) r2;
                r22.A00.setVisibility(8);
                r22.A01.A0U();
                return;
            }
            return;
        }
        AnonymousClass1Sv r0 = this.A01;
        if (r0 != null) {
            ((AnonymousClass3H3) r0).A01.finish();
        }
    }
}
