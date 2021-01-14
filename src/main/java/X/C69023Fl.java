package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.3Fl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69023Fl implements AbstractC61032sO {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public /* synthetic */ C69023Fl(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    @Override // X.AbstractC61032sO
    public final void AJh(boolean z, boolean z2, String str, String str2, UserJid userJid, boolean z3, C61072sS r17) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        indiaUpiPaymentActivity.A0F = z2;
        indiaUpiPaymentActivity.AMi();
        if (!z || r17 != null) {
            indiaUpiPaymentActivity.APq(0, R.string.payment_id_cannot_verify_error_text_default, ((AnonymousClass1DU) indiaUpiPaymentActivity).A0B.A06(R.string.india_upi_payment_id_name));
            return;
        }
        ((AnonymousClass1PY) indiaUpiPaymentActivity).A04 = str;
        ((AnonymousClass1PY) indiaUpiPaymentActivity).A08 = str2;
        indiaUpiPaymentActivity.A03 = userJid;
        if (z3) {
            indiaUpiPaymentActivity.A0V.A01(indiaUpiPaymentActivity, userJid, ((AnonymousClass1PY) indiaUpiPaymentActivity).A07, true, false, new C69013Fk(indiaUpiPaymentActivity));
        } else {
            indiaUpiPaymentActivity.A0s();
        }
    }
}
