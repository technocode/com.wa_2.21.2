package com.whatsapp.instrumentation.ui;

import X.AnonymousClass037;
import X.AnonymousClass2RM;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;

public class DisclosureFragment extends AnonymousClass037 {
    public AnonymousClass2RM A00;

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.instrumentation_disclosure, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        if (context instanceof AnonymousClass2RM) {
            this.A00 = (AnonymousClass2RM) context;
        }
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        view.findViewById(R.id.auth_button_allow).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 31));
        TextView textView = (TextView) view.findViewById(R.id.auth_encryption_disclosure_text);
        textView.setText(Html.fromHtml(A0F(R.string.instrumentation_auth_legal_disclosure_three)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
