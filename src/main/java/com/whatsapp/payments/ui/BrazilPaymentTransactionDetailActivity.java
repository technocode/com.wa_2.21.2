package com.whatsapp.payments.ui;

import X.AbstractC11910hD;
import X.AnonymousClass3YN;
import X.C62952vc;
import X.C63272w9;
import X.C63372wJ;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

public class BrazilPaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public final C62952vc A00 = C62952vc.A00();
    public final C63272w9 A01 = C63272w9.A00();

    @Override // X.ActivityC09470d0, com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity
    public AbstractC11910hD A0T(ViewGroup viewGroup, int i) {
        if (i != 1000) {
            return super.A0T(viewGroup, i);
        }
        return new AnonymousClass3YN(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_merchant_upgrade_banner, viewGroup, false));
    }

    @Override // com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity
    public void A0U(C63372wJ r5) {
        if (r5.A00 != 501) {
            super.A0U(r5);
            return;
        }
        String A02 = this.A00.A02(false);
        if (A02 != null) {
            Intent intent = new Intent(this, BrazilPayBloksActivity.class);
            intent.putExtra("screen_name", A02);
            A0I(intent, false);
        }
    }
}
