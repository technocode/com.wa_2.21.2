package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;

/* renamed from: X.3HG  reason: invalid class name */
public class AnonymousClass3HG implements AnonymousClass0YR {
    public final /* synthetic */ PaymentTransactionHistoryActivity A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public AnonymousClass3HG(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity) {
        this.A00 = paymentTransactionHistoryActivity;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A00;
        ArrayList A03 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01);
        paymentTransactionHistoryActivity.A09 = A03;
        paymentTransactionHistoryActivity.A08 = str;
        if (A03.isEmpty()) {
            paymentTransactionHistoryActivity.A09 = null;
        }
        paymentTransactionHistoryActivity.A0U();
        return false;
    }
}
