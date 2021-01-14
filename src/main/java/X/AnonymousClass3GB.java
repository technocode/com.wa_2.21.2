package X;

import android.util.Pair;
import com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity;
import java.util.List;

/* renamed from: X.3GB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GB implements AnonymousClass0SG {
    public final /* synthetic */ MerchantPayoutTransactionHistoryActivity A00;

    public /* synthetic */ AnonymousClass3GB(MerchantPayoutTransactionHistoryActivity merchantPayoutTransactionHistoryActivity) {
        this.A00 = merchantPayoutTransactionHistoryActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        Pair pair = (Pair) obj;
        C69403Gx r1 = this.A00.A02;
        if (r1 != null) {
            r1.A02 = (List) pair.first;
            r1.A01 = (List) pair.second;
            ((AbstractC16300pa) r1).A01.A00();
            return;
        }
        throw null;
    }
}
