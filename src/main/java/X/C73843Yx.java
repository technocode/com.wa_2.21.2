package X;

import com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity;

/* renamed from: X.3Yx  reason: invalid class name and case insensitive filesystem */
public class C73843Yx extends C30271b3 {
    public final /* synthetic */ MerchantPayoutTransactionHistoryActivity A00;
    public final /* synthetic */ C63382wK A01;

    public C73843Yx(C63382wK r1, MerchantPayoutTransactionHistoryActivity merchantPayoutTransactionHistoryActivity) {
        this.A01 = r1;
        this.A00 = merchantPayoutTransactionHistoryActivity;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass3IB.class)) {
            MerchantPayoutTransactionHistoryActivity merchantPayoutTransactionHistoryActivity = this.A00;
            C63382wK r0 = this.A01;
            return new AnonymousClass3IB(merchantPayoutTransactionHistoryActivity, r0.A05, r0.A0K, r0.A0J, r0.A07, r0.A09, r0.A0I);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
