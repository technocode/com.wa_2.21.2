package X;

/* renamed from: X.3EU  reason: invalid class name */
public class AnonymousClass3EU implements AbstractC61192se {
    public final /* synthetic */ C61602tR A00;
    public final /* synthetic */ C61952u0 A01;
    public final /* synthetic */ AnonymousClass3FO A02;

    public AnonymousClass3EU(C61602tR r1, C61952u0 r2, AnonymousClass3FO r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC61192se
    public void AFb(C61072sS r2) {
        AnonymousClass3FO r0 = this.A02;
        if (r0 != null) {
            r0.A00(r2);
        }
    }

    @Override // X.AbstractC61192se
    public void AKl(String[] strArr) {
        C61602tR r9 = this.A00;
        C03340Fu r0 = r9.A04;
        AnonymousClass0OS[] r4 = {new AnonymousClass0OS("action", "reset-payment-pin", null, (byte) 0), new AnonymousClass0OS("country", r9.A0B, null, (byte) 0), new AnonymousClass0OS("token", strArr[0], null, (byte) 0), new AnonymousClass0OS("credential-id", r9.A0C, null, (byte) 0), new AnonymousClass0OS("device-id", r9.A0A.A02(), null, (byte) 0)};
        C61962u1 r1 = r9.A09;
        C61952u0 r15 = this.A01;
        r0.A09(true, new AnonymousClass0M5("account", r4, r15.A00(C61962u1.A00("RESET", null, null, r1.A00.A05() / 1000, strArr[1], null, new Object[0]))), new AnonymousClass3Y0(r9, r9.A00, r9.A01, r9.A02, r9.A03, this.A02, r15), 30000);
    }
}
