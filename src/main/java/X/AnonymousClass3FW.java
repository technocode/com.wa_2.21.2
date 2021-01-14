package X;

import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.List;

/* renamed from: X.3FW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FW implements AbstractC03150Ez {
    public final /* synthetic */ C05900Qy A00;
    public final /* synthetic */ BrazilPaymentActivity A01;

    public /* synthetic */ AnonymousClass3FW(BrazilPaymentActivity brazilPaymentActivity, C05900Qy r2) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        C05900Qy r5 = this.A00;
        for (AnonymousClass1VM r1 : (List) obj) {
            if (C28051Sr.A1s(r1) && r1.A06 != null && r1.A00 == 2) {
                PaymentView paymentView = brazilPaymentActivity.A04;
                if (paymentView != null) {
                    brazilPaymentActivity.A0Q.ANF(new RunnableEBaseShape2S0300000_I1(brazilPaymentActivity, paymentView, r5, 30));
                    brazilPaymentActivity.A0U();
                    return;
                }
                return;
            }
        }
        brazilPaymentActivity.A0E.A01();
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A01 = new BrazilConfirmReceivePaymentFragment();
        brazilPaymentActivity.APm(paymentBottomSheet);
    }
}
