package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Gf  reason: invalid class name and case insensitive filesystem */
public class C69223Gf implements AnonymousClass0GT {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A01;

    public C69223Gf(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity, AnonymousClass0GT r2) {
        this.A01 = brazilPaymentCardDetailsActivity;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r2) {
        this.A00.AJP(r2);
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r5) {
        StringBuilder sb = new StringBuilder("PAY: removePayment/onResponseError. paymentNetworkError: ");
        sb.append(r5);
        Log.i(sb.toString());
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A01;
        brazilPaymentCardDetailsActivity.A0K.A00();
        brazilPaymentCardDetailsActivity.A00.A01(brazilPaymentCardDetailsActivity, r5.code, R.string.payment_method_cannot_be_removed).show();
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r2) {
        this.A00.AJV(r2);
    }
}
