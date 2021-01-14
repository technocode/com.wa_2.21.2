package com.whatsapp.payments.ui.widget;

import X.AbstractC61092sU;
import X.AbstractC63642wl;
import X.C63762wy;
import android.content.Context;
import android.util.AttributeSet;

public class TransactionsExpandableView extends AbstractC63642wl {
    public C63762wy A00;

    public TransactionsExpandableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new C63762wy(context);
    }

    public void setAdapter(C63762wy r1) {
        this.A00 = r1;
    }

    public void setPaymentRequestActionCallback(AbstractC61092sU r2) {
        this.A00.A01 = r2;
    }
}
