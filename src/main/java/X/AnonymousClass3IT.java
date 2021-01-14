package X;

/* renamed from: X.3IT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IT implements AnonymousClass1KW {
    public final /* synthetic */ AnonymousClass3IZ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass3IT(AnonymousClass3IZ r1, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
    }

    @Override // X.AnonymousClass1KW
    public final void AJg(boolean z) {
        AnonymousClass3IZ r1 = this.A00;
        boolean z2 = this.A03;
        C69693Ia r2 = r1.A00;
        if (z) {
            C61992u4 A022 = r2.A02();
            A022.A0A = z2;
            r2.A00.A07(A022);
            C69693Ia.A00(r2);
            return;
        }
        r2.A01.A07(Boolean.FALSE);
        r2.A02.A07(new C63872x9(2));
    }
}
