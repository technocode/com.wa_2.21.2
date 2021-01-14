package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.3I4  reason: invalid class name */
public class AnonymousClass3I4 implements AnonymousClass0GT {
    public final /* synthetic */ C73743Yn A00;

    public AnonymousClass3I4(C73743Yn r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r4) {
        C73743Yn r2 = this.A00;
        C73743Yn.A00(r2);
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantDetailsViewModel removePayment/onRequestError. paymentNetworkError: ");
        sb.append(r4);
        Log.w(sb.toString());
        C73743Yn.A01(r2, R.string.seller_account_cannot_be_removed);
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r4) {
        C73743Yn r2 = this.A00;
        C73743Yn.A00(r2);
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantDetailsViewModel removePayment/onResponseError. paymentNetworkError: ");
        sb.append(r4);
        Log.i(sb.toString());
        C73743Yn.A01(r2, R.string.seller_account_cannot_be_removed);
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r3) {
        C73743Yn r1 = this.A00;
        C73743Yn.A00(r1);
        Log.i("PAY: BrazilMerchantDetailsViewModel removePayment Success");
        C73743Yn.A01(r1, R.string.seller_account_is_removed);
    }
}
