package X;

import com.facebook.redex.ViewOnClickEBaseShape0S0700000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;

/* renamed from: X.3G5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G5 implements AnonymousClass1KW {
    public final /* synthetic */ ViewOnClickEBaseShape0S0700000_I1 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass3G5(ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1, String str, String str2, String str3) {
        this.A00 = viewOnClickEBaseShape0S0700000_I1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // X.AnonymousClass1KW
    public final void AJg(boolean z) {
        ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        if (z) {
            viewOnClickEBaseShape0S0700000_I1.A03(str, str2, str3);
            return;
        }
        IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = (IndiaUpiSendPaymentToVpaDialogFragment) viewOnClickEBaseShape0S0700000_I1.A00;
        ((AbstractC004502c) indiaUpiSendPaymentToVpaDialogFragment.A0A()).APq(0, R.string.unblock_payment_id_error_default, indiaUpiSendPaymentToVpaDialogFragment.A03.A06(R.string.india_upi_payment_id_name));
    }
}
