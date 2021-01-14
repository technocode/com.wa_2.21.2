package X;

import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.3YD  reason: invalid class name */
public class AnonymousClass3YD implements AbstractC27431Py {
    public final /* synthetic */ AbstractC27431Py A00;
    public final /* synthetic */ AnonymousClass3YE A01;

    public AnonymousClass3YD(AnonymousClass3YE r1, AbstractC27431Py r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public /* synthetic */ void A00() {
        this.A01.A07.A01.A03();
    }

    @Override // X.AbstractC27431Py
    public void ADA(int i, CharSequence charSequence) {
        this.A00.ADA(i, charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADB() {
        this.A00.ADB();
    }

    @Override // X.AbstractC27431Py
    public void ADC(int i, CharSequence charSequence) {
        this.A00.ADC(i, charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADD(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01.A02;
        fingerprintBottomSheet.A0v(false);
        fingerprintBottomSheet.A02.setEnabled(false);
        fingerprintBottomSheet.A01.setEnabled(false);
        this.A00.ADD(bArr);
    }
}
