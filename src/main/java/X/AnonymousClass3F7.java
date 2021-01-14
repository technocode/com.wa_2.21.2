package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.3F7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3F7 {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public /* synthetic */ AnonymousClass3F7(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    public final void A00(C61072sS r7) {
        String A06;
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        ((ActivityC004702f) indiaUpiPaymentActivity).A0K.A00();
        if (r7 == null) {
            indiaUpiPaymentActivity.A0Z();
            ((AnonymousClass1PY) indiaUpiPaymentActivity).A0D.ANF(new RunnableEBaseShape11S0100000_I1_6(indiaUpiPaymentActivity, 27));
            return;
        }
        int i = r7.code;
        if (i == 11495) {
            AnonymousClass008.A1N(AnonymousClass008.A0S("collect request expired; showErrorAndFinish; error code: "), i, indiaUpiPaymentActivity.A0W);
            C02020Ai r1 = ((AnonymousClass1DU) indiaUpiPaymentActivity).A0G;
            if (r1.A01() != null) {
                A06 = r1.A01().A4R(((AnonymousClass1DU) indiaUpiPaymentActivity).A0B, indiaUpiPaymentActivity.A01);
            } else {
                A06 = ((AnonymousClass1DU) indiaUpiPaymentActivity).A0B.A06(R.string.unknown_amount_payment);
            }
            ((AnonymousClass1PY) indiaUpiPaymentActivity).A0D.ANF(new RunnableEBaseShape11S0100000_I1_6(indiaUpiPaymentActivity, 26));
            indiaUpiPaymentActivity.A0u(R.string.payments_request_system_message_to_me_expired, ((AnonymousClass1PY) indiaUpiPaymentActivity).A07, A06);
        } else if (!C69293Gm.A02(indiaUpiPaymentActivity, "upi-accept-collect", i, false)) {
            C018809u r2 = indiaUpiPaymentActivity.A0W;
            StringBuilder A0S = AnonymousClass008.A0S("onPayRequestFromNonWa; error code: ");
            A0S.append(r7.code);
            r2.A08(A0S.toString(), null);
            indiaUpiPaymentActivity.A0i();
        }
    }
}
