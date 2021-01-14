package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;

/* renamed from: X.3Yw  reason: invalid class name and case insensitive filesystem */
public class C73833Yw extends C30271b3 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ PaymentTransactionDetailsListActivity A01;
    public final /* synthetic */ C63382wK A02;

    public C73833Yw(C63382wK r1, PaymentTransactionDetailsListActivity paymentTransactionDetailsListActivity, Bundle bundle) {
        this.A02 = r1;
        this.A01 = paymentTransactionDetailsListActivity;
        this.A00 = bundle;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass3IE.class)) {
            PaymentTransactionDetailsListActivity paymentTransactionDetailsListActivity = this.A01;
            C63382wK r1 = this.A02;
            return new AnonymousClass3IE(paymentTransactionDetailsListActivity, r1.A05, r1.A01, r1.A02, r1.A06, r1.A0K, r1.A0A, r1.A0J, r1.A03, r1.A04, r1.A07, r1.A0F, r1.A00, r1.A08, r1.A0H, r1.A0C, r1.A0E, r1.A09, r1.A0G, r1.A0D, r1.A0B, this.A00);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
