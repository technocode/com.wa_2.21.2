package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;

/* renamed from: X.3Fe  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68953Fe implements AnonymousClass0SG {
    public final /* synthetic */ IndiaUpiMandateHistoryActivity A00;

    public /* synthetic */ C68953Fe(IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity) {
        this.A00 = indiaUpiMandateHistoryActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity = this.A00;
        C63302wC r5 = (C63302wC) obj;
        Intent intent = new Intent(indiaUpiMandateHistoryActivity, PaymentTransactionHistoryActivity.class);
        intent.putExtra("extra_disable_search", r5.A01);
        intent.putExtra("extra_predefined_search_filter", r5.A00);
        indiaUpiMandateHistoryActivity.startActivity(intent);
    }
}
