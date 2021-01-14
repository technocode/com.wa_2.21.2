package X;

import android.content.Intent;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.List;

/* renamed from: X.3F9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3F9 implements AbstractC48012Ko {
    public final /* synthetic */ C43761yu A00;
    public final /* synthetic */ AnonymousClass3GS A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public /* synthetic */ AnonymousClass3F9(AnonymousClass3GS r1, C43761yu r2, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = paymentBottomSheet;
    }

    @Override // X.AbstractC48012Ko
    public final void ACf(List list) {
        AnonymousClass3GS r0 = this.A01;
        C43761yu r6 = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = r0.A00;
        brazilConfirmReceivePaymentFragment.A01.A02();
        C62952vc r3 = brazilConfirmReceivePaymentFragment.A0E;
        Intent intent = new Intent(brazilConfirmReceivePaymentFragment.A0A(), BrazilPayBloksActivity.class);
        intent.putExtra("screen_params", r3.A03(r6, null));
        intent.putExtra("screen_name", "brpay_p_card_verified");
        brazilConfirmReceivePaymentFragment.A0h(intent);
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A0w(false, false);
        }
    }
}
