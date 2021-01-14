package X;

/* renamed from: X.3Et  reason: invalid class name and case insensitive filesystem */
public class C68843Et implements AbstractC27431Py {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C61892tu A01;
    public final /* synthetic */ AnonymousClass3YD A02;

    public C68843Et(C61892tu r1, AnonymousClass3YD r2, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
    }

    @Override // X.AbstractC27431Py
    public void ADA(int i, CharSequence charSequence) {
        C018809u r2 = this.A01.A03;
        StringBuilder A0S = AnonymousClass008.A0S("sendWithBiometric/onAuthenticationError/error: ");
        A0S.append(charSequence.toString());
        r2.A04(A0S.toString());
        this.A02.ADA(i, charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADB() {
        this.A01.A03.A04("sendWithBiometric/onAuthenticationFailed");
        this.A02.ADB();
    }

    @Override // X.AbstractC27431Py
    public void ADC(int i, CharSequence charSequence) {
        C018809u r2 = this.A01.A03;
        StringBuilder A0S = AnonymousClass008.A0S("sendWithBiometric/onAuthenticationHelp/help: ");
        A0S.append(charSequence.toString());
        r2.A04(A0S.toString());
        this.A02.ADC(i, charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADD(byte[] bArr) {
        if (bArr != null) {
            this.A01.A03.A07(null, "sendWithBiometric/onAuthenticationSucceeded/success", null);
            this.A02.ADD(C61962u1.A00("AUTH", Boolean.FALSE, bArr, this.A00, null, null, new Object[0]));
            return;
        }
        this.A01.A03.A04("sendWithBiometric/onAuthenticationSucceeded/null signature");
        this.A02.ADB();
    }
}
