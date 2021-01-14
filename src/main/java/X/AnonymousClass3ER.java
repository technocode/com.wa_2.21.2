package X;

/* renamed from: X.3ER  reason: invalid class name */
public class AnonymousClass3ER implements AbstractC27431Py {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AbstractC61552tM A01;
    public final /* synthetic */ AnonymousClass3YB A02;
    public final /* synthetic */ C61952u0 A03;
    public final /* synthetic */ String A04;

    public AnonymousClass3ER(AbstractC61552tM r1, AnonymousClass3YB r2, String str, C61952u0 r4, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = str;
        this.A03 = r4;
        this.A00 = j;
    }

    @Override // X.AbstractC27431Py
    public void ADA(int i, CharSequence charSequence) {
        C018809u r2 = this.A01.A0F;
        StringBuilder A0S = AnonymousClass008.A0S("authenticateBiometric/onAuthenticationError/error: ");
        A0S.append(charSequence.toString());
        r2.A04(A0S.toString());
        this.A02.ADA(i, charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADB() {
        this.A01.A0F.A04("authenticateBiometric/onAuthenticationFailed");
        this.A02.ADB();
    }

    @Override // X.AbstractC27431Py
    public void ADC(int i, CharSequence charSequence) {
        C018809u r2 = this.A01.A0F;
        StringBuilder A0S = AnonymousClass008.A0S("authenticateBiometric/onAuthenticationHelp/help: ");
        A0S.append(charSequence.toString());
        r2.A04(A0S.toString());
        this.A02.ADC(i, charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADD(byte[] bArr) {
        if (bArr != null) {
            AbstractC61552tM r4 = this.A01;
            r4.A0F.A07(null, "authenticateBiometric/onAuthenticationSucceeded/success", null);
            AnonymousClass3YB r3 = this.A02;
            r3.ADD(bArr);
            AbstractC61552tM.A00(r4, this.A04, this.A03.A00(C61962u1.A00("AUTH", Boolean.FALSE, bArr, this.A00, null, null, new Object[0])), r3);
            return;
        }
        this.A01.A0F.A04("authenticateBiometric/onAuthenticationSucceeded/null signature");
        this.A02.ADB();
    }
}
