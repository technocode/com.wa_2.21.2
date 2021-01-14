package X;

import com.whatsapp.Conversation;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;

/* renamed from: X.2sI  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC60972sI {
    public void A00() {
        if (this instanceof AnonymousClass3HD) {
            AnonymousClass3HD r4 = (AnonymousClass3HD) this;
            PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = r4.A00;
            C41191ud A00 = paymentMethodsListPickerFragment.A06.A01().A00();
            A00.A01.A03(new AnonymousClass3GI(r4), paymentMethodsListPickerFragment.A03.A06);
        } else if (this instanceof C69233Gg) {
            ConfirmReceivePaymentFragment confirmReceivePaymentFragment = ((C69233Gg) this).A00;
            C41191ud r0 = confirmReceivePaymentFragment.A01;
            if (r0 != null) {
                r0.A02();
            }
            confirmReceivePaymentFragment.A01 = confirmReceivePaymentFragment.A06.A01().A00();
        } else if (!(this instanceof AnonymousClass3GX)) {
            Conversation conversation = ((C39831sB) this).A00;
            conversation.A0Y.post(new RunnableEBaseShape0S0100000_I0_0(conversation, 45));
        } else {
            BrazilPaymentActivity brazilPaymentActivity = ((AnonymousClass3GX) this).A00;
            brazilPaymentActivity.A01.A02();
            brazilPaymentActivity.A01 = ((AbstractActivityC34761jB) brazilPaymentActivity).A0M.A01().A00();
        }
    }
}
