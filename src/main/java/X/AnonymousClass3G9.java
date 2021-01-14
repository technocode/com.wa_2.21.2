package X;

import android.widget.FrameLayout;
import com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity;

/* renamed from: X.3G9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G9 implements AnonymousClass0SG {
    public final /* synthetic */ MerchantPayoutTransactionHistoryActivity A00;

    public /* synthetic */ AnonymousClass3G9(MerchantPayoutTransactionHistoryActivity merchantPayoutTransactionHistoryActivity) {
        this.A00 = merchantPayoutTransactionHistoryActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        FrameLayout frameLayout = this.A00.A00;
        int i = 8;
        if (((Boolean) obj).booleanValue()) {
            i = 0;
        }
        frameLayout.setVisibility(i);
    }
}
