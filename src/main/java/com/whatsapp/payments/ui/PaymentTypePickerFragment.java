package com.whatsapp.payments.ui;

import X.AnonymousClass01X;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;

public class PaymentTypePickerFragment extends WaFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.payment_type_picker_fragment, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            String string = bundle2.getString("arg_type", "goodAndServices");
            if (string != null) {
                AnonymousClass01X r5 = this.A00;
                ((TextView) view.findViewById(R.id.buying_goods_and_services_text)).setText(r5.A06(R.string.buying_goods_and_services));
                TextView textView = (TextView) view.findViewById(R.id.buying_goods_and_services_hint_text);
                if (!(this instanceof BrazilPaymentTypePickerFragment)) {
                    throw null;
                }
                textView.setText(this.A00.A06(R.string.br_buying_goods_and_services_hint));
                ((TextView) view.findViewById(R.id.sending_to_friends_and_family_text)).setText(r5.A06(R.string.sending_to_friends_and_family));
                TextView textView2 = (TextView) view.findViewById(R.id.sending_to_friends_and_family_hint_text);
                if (!(this instanceof BrazilPaymentTypePickerFragment)) {
                    throw null;
                }
                textView2.setText(this.A00.A06(R.string.br_sending_to_friends_and_family_hint));
                if (string.equals("goodAndServices")) {
                    view.findViewById(R.id.buying_goods_and_services_check).setVisibility(0);
                    view.findViewById(R.id.sending_to_friends_and_family_check).setVisibility(4);
                } else {
                    view.findViewById(R.id.buying_goods_and_services_check).setVisibility(4);
                    view.findViewById(R.id.sending_to_friends_and_family_check).setVisibility(0);
                }
                view.findViewById(R.id.sending_to_friends_and_family_container).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 34));
                view.findViewById(R.id.buying_goods_and_services_container).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 33));
                view.findViewById(R.id.back).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 35));
                return;
            }
            throw null;
        }
        throw null;
    }
}
