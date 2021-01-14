package com.whatsapp.payments.ui;

import X.AnonymousClass01X;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class SimpleCustomPaymentBottomSheet extends RoundedBottomSheetDialogFragment {
    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.simple_custom_payment_buttom_sheet, viewGroup, false);
        BrazilSmbMerchantNuxUpSellBottomSheet brazilSmbMerchantNuxUpSellBottomSheet = (BrazilSmbMerchantNuxUpSellBottomSheet) this;
        AnonymousClass01X r1 = brazilSmbMerchantNuxUpSellBottomSheet.A00;
        String A06 = r1.A06(R.string.get_started_button_text);
        ViewOnClickEBaseShape7S0100000_I1_5 viewOnClickEBaseShape7S0100000_I1_5 = new ViewOnClickEBaseShape7S0100000_I1_5(brazilSmbMerchantNuxUpSellBottomSheet, 5);
        String A062 = r1.A06(R.string.not_now);
        ViewOnClickEBaseShape7S0100000_I1_5 viewOnClickEBaseShape7S0100000_I1_52 = new ViewOnClickEBaseShape7S0100000_I1_5(brazilSmbMerchantNuxUpSellBottomSheet, 4);
        View inflate2 = LayoutInflater.from(brazilSmbMerchantNuxUpSellBottomSheet.A00()).inflate(R.layout.collect_request_upgrade_nudge_bottom_sheet_content, (ViewGroup) null, false);
        if (!TextUtils.isEmpty(A06)) {
            TextView textView = (TextView) inflate.findViewById(R.id.primary_button);
            textView.setText(A06);
            textView.setOnClickListener(viewOnClickEBaseShape7S0100000_I1_5);
            textView.setVisibility(0);
        }
        if (!TextUtils.isEmpty(A062)) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.secondary_button);
            textView2.setText(A062);
            textView2.setOnClickListener(viewOnClickEBaseShape7S0100000_I1_52);
            textView2.setVisibility(0);
        }
        ((ViewGroup) inflate.findViewById(R.id.ui_container)).addView(inflate2);
        return inflate;
    }
}
