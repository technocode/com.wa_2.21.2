package X;

/* renamed from: X.3ET  reason: invalid class name */
public class AnonymousClass3ET implements AbstractC61182sd {
    public final /* synthetic */ C61602tR A00;
    public final /* synthetic */ AnonymousClass3FO A01;

    public AnonymousClass3ET(C61602tR r1, AnonymousClass3FO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC61182sd
    public void AFb(C61072sS r2) {
        AnonymousClass3FO r0 = this.A01;
        if (r0 != null) {
            r0.A00(r2);
        }
    }

    @Override // X.AbstractC61182sd
    public void AKj(String str) {
        C61602tR r3 = this.A00;
        r3.A04.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "pin-credential-check", null, (byte) 0), new AnonymousClass0OS("country", r3.A0B, null, (byte) 0), new AnonymousClass0OS("token", str, null, (byte) 0), new AnonymousClass0OS("credential-id", r3.A0C, null, (byte) 0), new AnonymousClass0OS("device-id", r3.A0A.A02(), null, (byte) 0)}, null, null), new AnonymousClass3Y1(r3.A00, r3.A01, r3.A02, r3.A03, this.A01), 30000);
    }
}
