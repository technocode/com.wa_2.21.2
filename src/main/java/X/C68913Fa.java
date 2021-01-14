package X;

import android.content.Intent;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.List;

/* renamed from: X.3Fa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68913Fa implements AbstractC48012Ko {
    public final /* synthetic */ C43761yu A00;
    public final /* synthetic */ C69213Ge A01;

    public /* synthetic */ C68913Fa(C69213Ge r1, C43761yu r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC48012Ko
    public final void ACf(List list) {
        C69213Ge r0 = this.A01;
        C43761yu r4 = this.A00;
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = r0.A00;
        ((AbstractView$OnClickListenerC32271ec) brazilPaymentCardDetailsActivity).A07 = r4;
        C62952vc r1 = brazilPaymentCardDetailsActivity.A0A;
        Intent intent = new Intent(brazilPaymentCardDetailsActivity, BrazilPayBloksActivity.class);
        intent.putExtra("screen_params", r1.A03(r4, null));
        intent.putExtra("screen_name", "brpay_p_card_verified");
        brazilPaymentCardDetailsActivity.A0H(intent, 1);
    }
}
