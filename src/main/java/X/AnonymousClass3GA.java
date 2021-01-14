package X;

import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity;

/* renamed from: X.3GA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GA implements AnonymousClass0SG {
    public final /* synthetic */ MerchantPayoutTransactionHistoryActivity A00;

    public /* synthetic */ AnonymousClass3GA(MerchantPayoutTransactionHistoryActivity merchantPayoutTransactionHistoryActivity) {
        this.A00 = merchantPayoutTransactionHistoryActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A00.A01;
        int i = 8;
        if (((Boolean) obj).booleanValue()) {
            i = 0;
        }
        stickyHeadersRecyclerView.setVisibility(i);
    }
}
