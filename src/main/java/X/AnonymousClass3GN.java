package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3GN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GN {
    public final /* synthetic */ PaymentTransactionHistoryActivity A00;

    public /* synthetic */ AnonymousClass3GN(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity) {
        this.A00 = paymentTransactionHistoryActivity;
    }

    public final void A00(String str, AnonymousClass1X3 r9, List list, List list2) {
        String A0D;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A00;
        AnonymousClass3HJ r0 = paymentTransactionHistoryActivity.A06;
        r0.A00 = list;
        ((AbstractC16300pa) r0).A01.A00();
        ArrayList arrayList = paymentTransactionHistoryActivity.A0R;
        arrayList.clear();
        arrayList.addAll(list2);
        paymentTransactionHistoryActivity.A00.setVisibility(8);
        if (list.isEmpty()) {
            TextView textView = paymentTransactionHistoryActivity.A01;
            if (r9.A04) {
                if (r9.A06) {
                    if (TextUtils.isEmpty(str)) {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_pending_requests_from_you);
                    } else {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_pending_requests_from_you_query, str);
                    }
                } else if (r9.A05) {
                    if (TextUtils.isEmpty(str)) {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_pending_requests_to_you);
                    } else {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_pending_requests_to_you_query, str);
                    }
                } else if (TextUtils.isEmpty(str)) {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_pending_requests);
                } else {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_pending_requests_query, str);
                }
            } else if (r9.A06) {
                if (r9.A01) {
                    if (TextUtils.isEmpty(str)) {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_completed_transactions_or_requests_from_you);
                    } else {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_completed_transactions_or_requests_from_you_query, str);
                    }
                } else if (r9.A02) {
                    if (TextUtils.isEmpty(str)) {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_from_you);
                    } else {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_from_you_query, str);
                    }
                } else if (TextUtils.isEmpty(str)) {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_transactions_or_requests_from_you);
                } else {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_transactions_or_requests_from_you_query, str);
                }
            } else if (r9.A05) {
                if (r9.A01) {
                    if (TextUtils.isEmpty(str)) {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_completed_transactions_or_requests_to_you);
                    } else {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_completed_transactions_or_requests_to_you_query, str);
                    }
                } else if (r9.A02) {
                    if (TextUtils.isEmpty(str)) {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_to_you);
                    } else {
                        A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_to_you_query, str);
                    }
                } else if (TextUtils.isEmpty(str)) {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_transactions_or_requests_to_you);
                } else {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_transactions_or_requests_to_you_query, str);
                }
            } else if (r9.A01) {
                if (TextUtils.isEmpty(str)) {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_completed_transactions_or_requests);
                } else {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_completed_transactions_or_requests_query, str);
                }
            } else if (r9.A02) {
                if (TextUtils.isEmpty(str)) {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_incomplete_transactions_or_requests);
                } else {
                    A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_incomplete_transactions_or_requests_query, str);
                }
            } else if (TextUtils.isEmpty(str)) {
                A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A06(R.string.payments_history_search_no_results_transactions_or_requests);
            } else {
                A0D = ((AnonymousClass2C0) paymentTransactionHistoryActivity).A01.A0D(R.string.payments_history_search_no_results_transactions_or_requests_query, str);
            }
            textView.setText(A0D);
            paymentTransactionHistoryActivity.A01.setVisibility(0);
            return;
        }
        paymentTransactionHistoryActivity.A01.setVisibility(8);
        paymentTransactionHistoryActivity.A0M.A04(list);
    }
}
