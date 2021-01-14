package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiSecureQrCodeDisplayActivity;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import java.util.EnumMap;

/* renamed from: X.3G2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G2 implements AnonymousClass0SG {
    public final /* synthetic */ IndiaUpiSecureQrCodeDisplayActivity A00;

    public /* synthetic */ AnonymousClass3G2(IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity) {
        this.A00 = indiaUpiSecureQrCodeDisplayActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity = this.A00;
        C63892xB r14 = (C63892xB) obj;
        int i = r14.A01;
        if (i == -1) {
            indiaUpiSecureQrCodeDisplayActivity.finish();
        } else if (i == 0) {
            if (!TextUtils.isEmpty(indiaUpiSecureQrCodeDisplayActivity.A04.A02().A03)) {
                String str = indiaUpiSecureQrCodeDisplayActivity.A04.A02().A03;
                C02020Ai r12 = indiaUpiSecureQrCodeDisplayActivity.A08;
                C05900Qy A002 = C05900Qy.A00(str, r12.A01().A5z());
                TextView textView = indiaUpiSecureQrCodeDisplayActivity.A01;
                AnonymousClass01X r4 = ((AnonymousClass2C0) indiaUpiSecureQrCodeDisplayActivity).A01;
                textView.setText(r4.A0D(R.string.scan_this_code_to_pay_amount_to_user, r12.A01().A4R(r4, A002), indiaUpiSecureQrCodeDisplayActivity.A04.A02().A02));
            } else {
                indiaUpiSecureQrCodeDisplayActivity.A01.setText(((AnonymousClass2C0) indiaUpiSecureQrCodeDisplayActivity).A01.A0D(R.string.scan_this_code_to_pay_user, indiaUpiSecureQrCodeDisplayActivity.A04.A02().A02));
            }
            indiaUpiSecureQrCodeDisplayActivity.A01.setVisibility(0);
        } else if (i == 1) {
            indiaUpiSecureQrCodeDisplayActivity.A01.setVisibility(8);
        } else if (i != 3) {
            if (i == 3) {
                return;
            }
        } else if (r14.A00 == 0) {
            indiaUpiSecureQrCodeDisplayActivity.A0d();
            return;
        } else {
            return;
        }
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = indiaUpiSecureQrCodeDisplayActivity.A03;
        if (indiaUpiDisplaySecureQrCodeView != null) {
            int i2 = r14.A00;
            if (i == 0) {
                indiaUpiDisplaySecureQrCodeView.A01.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A0B.A00();
                indiaUpiDisplaySecureQrCodeView.A0A.setVisibility(0);
                indiaUpiDisplaySecureQrCodeView.A00.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A03.setVisibility(0);
                try {
                    AnonymousClass1GJ A01 = AnonymousClass1GH.A01(indiaUpiDisplaySecureQrCodeView.A0C.A02().A05(), AnonymousClass1G3.L, new EnumMap(EnumC25131Fe.class));
                    indiaUpiDisplaySecureQrCodeView.A09 = A01;
                    indiaUpiDisplaySecureQrCodeView.A0A.setQrCode(A01, new AnonymousClass3IF(indiaUpiDisplaySecureQrCodeView, i2));
                } catch (C25191Fl e) {
                    indiaUpiDisplaySecureQrCodeView.A0G.A08("display-qrcode/", e);
                }
                indiaUpiDisplaySecureQrCodeView.A01(true);
                if (!TextUtils.isEmpty(indiaUpiDisplaySecureQrCodeView.A0C.A02().A03)) {
                    indiaUpiDisplaySecureQrCodeView.A06.setVisibility(0);
                    indiaUpiDisplaySecureQrCodeView.A02.setVisibility(0);
                    indiaUpiDisplaySecureQrCodeView.A05.setVisibility(8);
                    return;
                }
                indiaUpiDisplaySecureQrCodeView.A06.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A02.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A05.setVisibility(0);
            } else if (i == 1) {
                indiaUpiDisplaySecureQrCodeView.A0A.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A03.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A01.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A07.setVisibility(4);
                indiaUpiDisplaySecureQrCodeView.A00.setVisibility(0);
                indiaUpiDisplaySecureQrCodeView.A0B.requestFocus();
                indiaUpiDisplaySecureQrCodeView.A0B.A01(true);
                indiaUpiDisplaySecureQrCodeView.A01(false);
            } else if (i == 2) {
                indiaUpiDisplaySecureQrCodeView.A01.setVisibility(0);
                indiaUpiDisplaySecureQrCodeView.A0A.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A00.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A03.setVisibility(8);
                indiaUpiDisplaySecureQrCodeView.A0B.A00();
                indiaUpiDisplaySecureQrCodeView.A01(false);
            }
        } else {
            throw null;
        }
    }
}
