package com.whatsapp.payments.ui.widget;

import X.AbstractC61092sU;
import X.AbstractC63652wn;
import X.AnonymousClass01A;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass0HJ;
import X.AnonymousClass0L2;
import X.AnonymousClass0MH;
import X.AnonymousClass0YX;
import X.AnonymousClass0Z6;
import X.AnonymousClass1PN;
import X.C002001d;
import X.C004302a;
import X.C01970Ad;
import X.C02150Av;
import X.C61112sW;
import X.C68783En;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class PeerPaymentTransactionRow extends LinearLayout implements AbstractC63652wn {
    public View A00;
    public View A01;
    public FrameLayout A02;
    public ImageView A03;
    public ImageView A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public TextView A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public TextEmojiLabel A0A;
    public TextEmojiLabel A0B;
    public WaImageView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public AnonymousClass0YX A0F;
    public AnonymousClass0MH A0G;
    public AbstractC61092sU A0H;
    public final AnonymousClass0Z6 A0I = AnonymousClass0Z6.A00();
    public final AnonymousClass1PN A0J = AnonymousClass1PN.A00();
    public final AnonymousClass0HJ A0K = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0L = AnonymousClass01A.A00();
    public final AnonymousClass0L2 A0M = AnonymousClass0L2.A01();
    public final AnonymousClass01X A0N = AnonymousClass01X.A00();
    public final AnonymousClass01K A0O = AnonymousClass01K.A00();
    public final C61112sW A0P = C61112sW.A00();
    public final C01970Ad A0Q = C01970Ad.A00();
    public final C68783En A0R = C68783En.A00();
    public final C02150Av A0S = C02150Av.A02();

    public PeerPaymentTransactionRow(Context context) {
        super(context);
        A00();
    }

    public PeerPaymentTransactionRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        LayoutInflater.from(getContext()).inflate(R.layout.payment_transaction_row, (ViewGroup) this, true);
        setOrientation(1);
        setBackground(C004302a.A03(getContext(), R.drawable.selector_orange_gradient));
        this.A04 = (ImageView) findViewById(R.id.transaction_icon);
        this.A0A = (TextEmojiLabel) findViewById(R.id.transaction_receiver);
        this.A09 = (TextEmojiLabel) findViewById(R.id.transaction_note);
        this.A08 = (TextEmojiLabel) findViewById(R.id.transaction_amount);
        this.A07 = (TextView) findViewById(R.id.transaction_status);
        this.A01 = findViewById(R.id.transaction_shimmer);
        this.A03 = (ImageView) findViewById(R.id.sales_icon);
        this.A0E = (WaTextView) findViewById(R.id.requested_from_note);
        this.A00 = findViewById(R.id.action_buttons_container);
        this.A05 = (LinearLayout) findViewById(R.id.transaction_row_details);
        this.A0C = (WaImageView) findViewById(R.id.transaction_loading_error);
        this.A02 = (FrameLayout) findViewById(R.id.custom_country_view_container);
        this.A06 = (LinearLayout) findViewById(R.id.transaction_row_not_supported);
        this.A0B = (TextEmojiLabel) findViewById(R.id.transaction_receiver_not_supported);
        this.A0D = (WaTextView) findViewById(R.id.transaction_not_supported_description);
        this.A0F = this.A0M.A03(getContext());
        C002001d.A2m(this.A0C, C004302a.A00(getContext(), R.color.payments_error_exclamation));
        setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c7, code lost:
        if (r2 == 106) goto L_0x01c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0239  */
    @Override // X.AbstractC63652wn
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2H(X.AnonymousClass0MH r21) {
        /*
        // Method dump skipped, instructions count: 705
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow.A2H(X.0MH):void");
    }

    @Override // X.AbstractC63652wn
    public void AMW() {
        AnonymousClass0MH r1 = this.A0G;
        if (r1 != null && this.A0H != null) {
            A2H(r1);
        }
    }

    public AbstractC61092sU getCallback() {
        return this.A0H;
    }

    public int getLayoutResourceId() {
        return R.layout.payment_transaction_row;
    }

    public void setCallback(AbstractC61092sU r1) {
        this.A0H = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r1 != 200) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setTransactionIcon(X.AnonymousClass0MH r5) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow.setTransactionIcon(X.0MH):void");
    }
}
