package X;

import com.facebook.redex.ViewOnClickEBaseShape0S0700000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;

/* renamed from: X.3G6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G6 implements AnonymousClass1KW {
    public final /* synthetic */ ViewOnClickEBaseShape0S0700000_I1 A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass3G6(ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1, String str) {
        this.A00 = viewOnClickEBaseShape0S0700000_I1;
        this.A01 = str;
    }

    @Override // X.AnonymousClass1KW
    public final void AJg(boolean z) {
        ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1 = this.A00;
        String str = this.A01;
        if (z) {
            viewOnClickEBaseShape0S0700000_I1.A03(str, null, null);
            return;
        }
        IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = (IndiaUpiSendPaymentToVpaDialogFragment) viewOnClickEBaseShape0S0700000_I1.A00;
        ((AbstractC004502c) indiaUpiSendPaymentToVpaDialogFragment.A0A()).APq(0, R.string.unblock_payment_id_error_default, indiaUpiSendPaymentToVpaDialogFragment.A03.A06(R.string.india_upi_payment_id_name));
    }
}
