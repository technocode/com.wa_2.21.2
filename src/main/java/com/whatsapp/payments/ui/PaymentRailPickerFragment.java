package com.whatsapp.payments.ui;

import X.AbstractC460627w;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass1VM;
import X.C43761yu;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;

public class PaymentRailPickerFragment extends WaFragment {
    public PaymentRailPickerFragment() {
        AnonymousClass01X.A00();
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.payment_rail_picker_fragment, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            String string = bundle2.getString("arg_type", "credit");
            if (string != null) {
                if (string.equals("credit")) {
                    view.findViewById(R.id.credit_card_check).setVisibility(0);
                    view.findViewById(R.id.debit_card_check).setVisibility(4);
                } else {
                    view.findViewById(R.id.credit_card_check).setVisibility(4);
                    view.findViewById(R.id.debit_card_check).setVisibility(0);
                }
                view.findViewById(R.id.payment_rail_credit_card_container).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 28));
                view.findViewById(R.id.payment_rail_debit_card_container).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 29));
                view.findViewById(R.id.back).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 27));
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A0n(int i) {
        AbstractC460627w r0;
        ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) A09();
        if (confirmPaymentFragment != null) {
            confirmPaymentFragment.A00 = i;
            TextView textView = confirmPaymentFragment.A09;
            AnonymousClass01X r1 = confirmPaymentFragment.A0K;
            if (i == 0) {
                textView.setText(r1.A06(R.string.confirm_payment_bottom_sheet_payment_rails_credit_label));
            } else {
                textView.setText(r1.A06(R.string.confirm_payment_bottom_sheet_payment_rails_debit_label));
            }
            AnonymousClass1VM r12 = confirmPaymentFragment.A0E;
            if ((r12 instanceof C43761yu) && (r0 = (AbstractC460627w) r12.A06) != null) {
                r0.A03 = i;
            }
        }
        AnonymousClass037 r02 = this.A0D;
        if (r02 != null) {
            r02.A0C().A0C();
        }
    }
}
