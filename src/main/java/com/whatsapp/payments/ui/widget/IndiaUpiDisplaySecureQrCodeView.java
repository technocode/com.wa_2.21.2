package com.whatsapp.payments.ui.widget;

import X.AbstractC000400g;
import X.AbstractC05890Qx;
import X.AnonymousClass01X;
import X.AnonymousClass0JE;
import X.AnonymousClass0Q7;
import X.AnonymousClass1GJ;
import X.AnonymousClass1VK;
import X.AnonymousClass3IG;
import X.AnonymousClass3IS;
import X.C000300f;
import X.C018809u;
import X.C02020Ai;
import X.C05900Qy;
import X.C63412wN;
import X.C69703Ib;
import X.RunnableC63432wP;
import X.View$OnFocusChangeListenerC63422wO;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.QrImageView;
import java.math.BigDecimal;

public class IndiaUpiDisplaySecureQrCodeView extends LinearLayout {
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public AnonymousClass1GJ A09;
    public QrImageView A0A;
    public PaymentAmountInputField A0B;
    public C69703Ib A0C;
    public final C000300f A0D = C000300f.A00();
    public final AnonymousClass01X A0E = AnonymousClass01X.A00();
    public final C02020Ai A0F = C02020Ai.A00();
    public final C018809u A0G = C018809u.A00("IndiaUpiDisplaySecureQrCodeView", "payment-settings", "IN");

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.india_upi_display_qr_code_view, (ViewGroup) this, true);
        setOrientation(1);
        this.A0A = (QrImageView) findViewById(R.id.qr_code);
        this.A05 = (TextView) AnonymousClass0Q7.A0D(this, R.id.add_amount);
        this.A06 = (TextView) AnonymousClass0Q7.A0D(this, R.id.display_payment_amount);
        this.A07 = (TextView) AnonymousClass0Q7.A0D(this, R.id.amount_input_error_text);
        this.A02 = (ImageView) AnonymousClass0Q7.A0D(this, R.id.dashed_underline);
        PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) AnonymousClass0Q7.A0D(this, R.id.user_payment_amount);
        this.A0B = paymentAmountInputField;
        AbstractC05890Qx A012 = AnonymousClass1VK.A01("INR");
        paymentAmountInputField.A0C = A012;
        paymentAmountInputField.A03 = 1;
        C05900Qy r3 = new C05900Qy(new BigDecimal(this.A0D.A06(AbstractC000400g.A3o)), A012.A5z());
        this.A0B.A0E = new AnonymousClass3IS(A012, this.A0E, r3, r3);
        this.A03 = (LinearLayout) AnonymousClass0Q7.A0D(this, R.id.add_or_display_amount);
        this.A00 = AnonymousClass0Q7.A0D(this, R.id.user_amount_input);
        this.A04 = (LinearLayout) findViewById(R.id.qr_code_signing_secure_title_container);
        this.A08 = (TextView) findViewById(R.id.qr_code_signing_retry_text);
        this.A01 = (FrameLayout) findViewById(R.id.progress_container);
    }

    public void A00(boolean z) {
        int i = 8;
        if (z) {
            this.A05.setVisibility(8);
            this.A02.setVisibility(8);
            this.A08.setVisibility(8);
            return;
        }
        if (this.A06.getVisibility() == 8) {
            this.A05.setVisibility(0);
        } else {
            this.A02.setVisibility(0);
        }
        if (!this.A0D.A0D(AbstractC000400g.A20)) {
            this.A08.setVisibility(8);
            return;
        }
        TextView textView = this.A08;
        if (this.A04.getVisibility() != 0) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final void A01(boolean z) {
        if (!this.A0D.A0D(AbstractC000400g.A20)) {
            this.A04.setVisibility(8);
            this.A08.setVisibility(8);
        } else if (!z) {
            this.A04.setVisibility(8);
            this.A08.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.A0C.A02().A06)) {
            this.A08.setVisibility(8);
            this.A04.setVisibility(0);
        } else {
            this.A08.setVisibility(0);
            this.A04.setVisibility(8);
        }
    }

    public AnonymousClass1GJ getQrCode() {
        return this.A09;
    }

    public String getUserInputAmount() {
        return this.A0B.getText().toString();
    }

    public void setup(C69703Ib r5) {
        this.A0C = r5;
        this.A03.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(r5, 46));
        this.A08.setText(AnonymousClass0JE.A06(this.A0E.A06(R.string.upi_signing_qr_code_failed_retry_message), "try-again", RunnableC63432wP.A00));
        this.A08.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(r5, 47));
        PaymentAmountInputField paymentAmountInputField = this.A0B;
        paymentAmountInputField.A08 = findViewById(R.id.currency_symbol);
        paymentAmountInputField.A0J = true;
        this.A0B.setOnFocusChangeListener(new View$OnFocusChangeListenerC63422wO(this));
        this.A0B.setErrorTextView(this.A07);
        this.A0B.setOnEditorActionListener(new C63412wN(this));
        ((InterceptingEditText) this.A0B).A00 = new AnonymousClass3IG(this);
    }
}
