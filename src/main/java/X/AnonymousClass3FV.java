package X;

import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

/* renamed from: X.3FV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FV implements AbstractC03150Ez {
    public final /* synthetic */ C05900Qy A00;
    public final /* synthetic */ BrazilPaymentActivity A01;

    public /* synthetic */ AnonymousClass3FV(BrazilPaymentActivity brazilPaymentActivity, C05900Qy r2) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        C05900Qy r3 = this.A00;
        List list = (List) obj;
        if (list == null || list.size() <= 0) {
            AddPaymentMethodBottomSheet A0X = brazilPaymentActivity.A0X("brpay_p_add_card");
            A0X.A01 = new RunnableEBaseShape2S0300000_I1(brazilPaymentActivity, list, r3, 32);
            brazilPaymentActivity.APm(A0X);
        } else {
            AnonymousClass1VM r0 = (AnonymousClass1VM) list.get(C28051Sr.A0D(list));
            if (r0 != null) {
                brazilPaymentActivity.A0Z(r0, r3);
            } else {
                throw null;
            }
        }
        brazilPaymentActivity.A01.A02();
    }
}
