package com.whatsapp.payments.ui;

import X.AbstractC11910hD;
import X.AnonymousClass00T;
import X.AnonymousClass0e8;
import X.AnonymousClass1PU;
import X.AnonymousClass3DQ;
import X.AnonymousClass3YM;
import X.C002101e;
import X.C02020Ai;
import X.C02040Ak;
import X.C63272w9;
import X.C63342wG;
import X.C73743Yn;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

public class BrazilMerchantDetailsListActivity extends AnonymousClass1PU {
    public AnonymousClass3DQ A00 = null;
    public AnonymousClass0e8 A01;
    public C73743Yn A02;
    public final C02020Ai A03 = C02020Ai.A00();
    public final C02040Ak A04 = C02040Ak.A00();
    public final C63272w9 A05 = C63272w9.A00();
    public final AnonymousClass00T A06 = C002101e.A00();

    @Override // X.ActivityC09470d0, X.AnonymousClass1PU
    public AbstractC11910hD A0T(ViewGroup viewGroup, int i) {
        if (i != 302) {
            return super.A0T(viewGroup, i);
        }
        return new AnonymousClass3YM(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.merchant_payout_detail_row_item_view, viewGroup, false));
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A02.A02(new C63342wG(3));
        }
    }
}
