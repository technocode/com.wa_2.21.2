package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;

/* renamed from: X.3GJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GJ implements AnonymousClass1KW {
    public final /* synthetic */ PaymentTransactionDetailsListActivity A00;
    public final /* synthetic */ C63372wJ A01;

    public /* synthetic */ AnonymousClass3GJ(PaymentTransactionDetailsListActivity paymentTransactionDetailsListActivity, C63372wJ r2) {
        this.A00 = paymentTransactionDetailsListActivity;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass1KW
    public final void AJg(boolean z) {
        PaymentTransactionDetailsListActivity paymentTransactionDetailsListActivity = this.A00;
        C63372wJ r0 = this.A01;
        AnonymousClass3IE r6 = paymentTransactionDetailsListActivity.A00;
        String str = r0.A0A;
        if (r6 != null) {
            C63372wJ r4 = new C63372wJ(8);
            AnonymousClass01X r3 = r6.A0I;
            int i = R.string.unblock_payment_id_error_default;
            if (z) {
                i = R.string.unblock_confirmation;
            }
            r4.A07 = r3.A0D(i, str);
            r6.A06.A07(r4);
            return;
        }
        throw null;
    }
}
