package X;

import com.whatsapp.payments.ui.IndiaUpiSecureQrCodeDisplayActivity;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;

/* renamed from: X.3G4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G4 implements AnonymousClass0SG {
    public final /* synthetic */ IndiaUpiSecureQrCodeDisplayActivity A00;

    public /* synthetic */ AnonymousClass3G4(IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity) {
        this.A00 = indiaUpiSecureQrCodeDisplayActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A00.A03;
        String str = indiaUpiDisplaySecureQrCodeView.A0C.A02().A03;
        if (str != null) {
            C02020Ai r4 = indiaUpiDisplaySecureQrCodeView.A0F;
            indiaUpiDisplaySecureQrCodeView.A06.setText(C02150Av.A01(indiaUpiDisplaySecureQrCodeView.A0E, C05900Qy.A00(str, r4.A01().A5z()), r4.A01()));
        }
    }
}
