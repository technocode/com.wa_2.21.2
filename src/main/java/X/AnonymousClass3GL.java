package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.widget.MultiExclusionChip;
import java.util.Set;

/* renamed from: X.3GL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GL implements AbstractC63572we {
    public final /* synthetic */ PaymentTransactionHistoryActivity A00;
    public final /* synthetic */ MultiExclusionChip A01;
    public final /* synthetic */ MultiExclusionChip A02;
    public final /* synthetic */ MultiExclusionChip A03;
    public final /* synthetic */ MultiExclusionChip A04;

    public /* synthetic */ AnonymousClass3GL(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, MultiExclusionChip multiExclusionChip, MultiExclusionChip multiExclusionChip2, MultiExclusionChip multiExclusionChip3, MultiExclusionChip multiExclusionChip4) {
        this.A00 = paymentTransactionHistoryActivity;
        this.A01 = multiExclusionChip;
        this.A02 = multiExclusionChip2;
        this.A03 = multiExclusionChip3;
        this.A04 = multiExclusionChip4;
    }

    @Override // X.AbstractC63572we
    public final void AJw(Set set) {
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A00;
        MultiExclusionChip multiExclusionChip = this.A01;
        MultiExclusionChip multiExclusionChip2 = this.A02;
        MultiExclusionChip multiExclusionChip3 = this.A03;
        MultiExclusionChip multiExclusionChip4 = this.A04;
        if (paymentTransactionHistoryActivity.A0D) {
            AnonymousClass1X3 r1 = paymentTransactionHistoryActivity.A0N;
            r1.A06 = set.contains(multiExclusionChip);
            r1.A05 = set.contains(multiExclusionChip2);
        }
        if (paymentTransactionHistoryActivity.A0B) {
            AnonymousClass1X3 r12 = paymentTransactionHistoryActivity.A0N;
            r12.A01 = set.contains(multiExclusionChip3);
            r12.A02 = set.contains(multiExclusionChip4);
        }
        paymentTransactionHistoryActivity.A0U();
    }
}
