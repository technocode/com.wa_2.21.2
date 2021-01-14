package com.whatsapp.payments.ui.widget;

import X.AbstractC63652wn;
import X.AnonymousClass0MH;
import X.C002001d;
import X.C004302a;
import X.C01970Ad;
import X.C68783En;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;

public class PaymentInteropShimmerRow extends LinearLayout implements AbstractC63652wn {
    public View A00;
    public View A01;
    public AnonymousClass0MH A02;
    public final C01970Ad A03 = C01970Ad.A00();
    public final C68783En A04 = C68783En.A00();

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.payment_transaction_shimmer, this);
        setOrientation(1);
        this.A00 = findViewById(R.id.payment_shimmer);
        this.A01 = findViewById(R.id.static_shimmer);
        C002001d.A2m((ImageView) findViewById(R.id.transaction_loading_error), C004302a.A00(getContext(), R.color.payments_error_exclamation));
        setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 1));
    }

    @Override // X.AbstractC63652wn
    public void A2H(AnonymousClass0MH r5) {
        boolean contains;
        this.A02 = r5;
        C68783En r2 = this.A04;
        String str = r5.A0G;
        if (TextUtils.isEmpty(str)) {
            contains = false;
        } else {
            contains = r2.A00.contains(str);
        }
        View view = this.A00;
        if (contains) {
            view.setVisibility(8);
            this.A01.setVisibility(0);
            return;
        }
        view.setVisibility(0);
        this.A01.setVisibility(8);
    }

    @Override // X.AbstractC63652wn
    public void AMW() {
        AnonymousClass0MH r0 = this.A02;
        if (r0 != null) {
            A2H(r0);
        }
    }
}
