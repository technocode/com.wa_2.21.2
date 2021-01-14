package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;

/* renamed from: X.3Ys  reason: invalid class name and case insensitive filesystem */
public class C73793Ys extends C30271b3 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ IndiaUpiPaymentTransactionDetailsActivity A01;
    public final /* synthetic */ C63332wF A02;

    public C73793Ys(C63332wF r1, IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity, Bundle bundle) {
        this.A02 = r1;
        this.A01 = indiaUpiPaymentTransactionDetailsActivity;
        this.A00 = bundle;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(C73773Yq.class)) {
            IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = this.A01;
            C63332wF r1 = this.A02;
            return new C73773Yq(indiaUpiPaymentTransactionDetailsActivity, r1.A07, r1.A01, r1.A02, r1.A08, r1.A0W, r1.A03, r1.A0D, r1.A0V, r1.A04, r1.A06, r1.A0A, r1.A0U, r1.A0O, r1.A00, r1.A0B, r1.A0T, r1.A0S, r1.A0R, r1.A05, r1.A0I, r1.A0F, r1.A0L, r1.A0N, r1.A0C, r1.A0E, r1.A0J, r1.A0P, r1.A0K, r1.A0H, r1.A0Q, this.A00);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
