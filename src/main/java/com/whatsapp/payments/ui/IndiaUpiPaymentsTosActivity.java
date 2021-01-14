package com.whatsapp.payments.ui;

import X.AbstractC01990Af;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0GT;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass1PY;
import X.AnonymousClass208;
import X.AnonymousClass20I;
import X.AnonymousClass2C0;
import X.C018809u;
import X.C01970Ad;
import X.C01980Ae;
import X.C02000Ag;
import X.C05710Pt;
import X.C05720Pu;
import X.C06210Sf;
import X.C60982sJ;
import X.C61072sS;
import X.C666435f;
import X.C68683Ed;
import X.C69293Gm;
import X.DialogInterface$OnClickListenerC62592v2;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

public class IndiaUpiPaymentsTosActivity extends AnonymousClass1PY implements AnonymousClass0GT {
    public C02000Ag A00 = AbstractC01990Af.A04;
    public boolean A01 = false;
    public boolean A02 = false;
    public final C06210Sf A03 = C06210Sf.A00();
    public final AnonymousClass20I A04 = new AnonymousClass20I();
    public final C01980Ae A05 = C01980Ae.A00();
    public final C01970Ad A06 = C01970Ad.A00();
    public final C68683Ed A07 = C68683Ed.A00();
    public final C018809u A08 = C018809u.A00("IndiaUpiPaymentsTosActivity", "onboarding", "IN");
    public final C666435f A09 = C666435f.A00();

    public final void A0d(int i) {
        this.A07.reset();
        this.A08.A08("showErrorAndFinish", null);
        findViewById(R.id.progress).setVisibility(4);
        int A002 = C69293Gm.A00(i, null);
        if (A002 == 0) {
            A002 = R.string.payments_tos_error;
        }
        APo(A002);
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r4) {
        AnonymousClass008.A1N(AnonymousClass008.A0S("got request error for accept-tos: "), r4.code, this.A08);
        A0d(r4.code);
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r7) {
        AnonymousClass008.A1N(AnonymousClass008.A0S("got response error for accept-tos: "), r7.code, this.A08);
        C68683Ed r4 = this.A07;
        int i = r7.code;
        String str = r7.text;
        AnonymousClass208 A012 = r4.A01(17);
        A012.A05 = Integer.toString(i);
        A012.A06 = str;
        r4.A01.A0B(A012, null, false);
        A0d(r7.code);
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r5) {
        C018809u r2 = this.A08;
        StringBuilder A0S = AnonymousClass008.A0S("got response for accept-tos: ");
        A0S.append(r5.A02);
        r2.A07(null, A0S.toString(), null);
        C02000Ag r22 = this.A00;
        if (!r22.A03.equals("tos_no_wallet")) {
            return;
        }
        if (r5.A00) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r23 = ((AnonymousClass2C0) this).A01;
            r3.A01.A0E = r23.A06(R.string.payments_tos_outage);
            r3.A07(r23.A06(R.string.ok), new DialogInterface$OnClickListenerC62592v2(this));
            r3.A00().show();
            return;
        }
        this.A05.A05(r22);
        C68683Ed r24 = this.A07;
        r24.A01.A0B(r24.A01(17), null, false);
        if (this.A01) {
            Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A0c(intent);
            A0I(intent, false);
        }
        setResult(-1);
        finish();
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A02) {
            setResult(0);
            finish();
            return;
        }
        super.onBackPressed();
        AnonymousClass20I r1 = this.A04;
        r1.A02 = Boolean.TRUE;
        ((AnonymousClass1PY) this).A0A.A07(r1);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.payments_tos_image_section);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AnonymousClass20I r2;
        super.onCreate(bundle);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("stepName");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.A00 = this.A05.A01(stringExtra);
                this.A01 = true;
            } else {
                this.A00 = this.A05.A01("tos_no_wallet");
            }
            ((AnonymousClass1PY) this).A01 = getIntent().getIntExtra("extra_setup_mode", 1);
        }
        setContentView(R.layout.india_upi_payment_tos);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.payments_activity_title));
            A092.A0A(true);
        }
        TextView textView = (TextView) findViewById(R.id.payments_tos_title);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        textView.setText(r6.A0D(R.string.payments_tos_title_text, r6.A06(R.string.india_upi_short_name)));
        if (getIntent() == null || !getIntent().getBooleanExtra("extra_show_updated_tos", false)) {
            r2 = this.A04;
            r2.A01 = Boolean.FALSE;
        } else {
            this.A02 = true;
            textView.setText(r6.A06(R.string.payments_tos_v2_title_text));
            r2 = this.A04;
            r2.A01 = Boolean.TRUE;
        }
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.payments_tos_desc);
        C06210Sf r62 = this.A03;
        SpannableString A012 = this.A09.A01(this, r6.A06(R.string.payments_tos_desc_text), new String[]{"terms-and-privacy-policy", "payment-provider-terms"}, new String[]{r62.A01("https://www.whatsapp.com/legal/#payments-in").toString(), r62.A01("https://www.whatsapp.com/legal/#payments-payment-provider-in").toString()}, new Runnable[]{new RunnableEBaseShape11S0100000_I1_6(this, 28), new RunnableEBaseShape11S0100000_I1_6(this, 29)});
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setText(A012);
        View findViewById = findViewById(R.id.payments_tos_continue);
        findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, findViewById, 14));
        C018809u r3 = this.A08;
        StringBuilder A0S = AnonymousClass008.A0S("onCreate step: ");
        A0S.append(this.A00);
        r3.A07(null, A0S.toString(), null);
        C68683Ed r0 = this.A07;
        r0.reset();
        r2.A05 = r0.A03.A02();
        onConfigurationChanged(getResources().getConfiguration());
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A06.A05(this);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A02 = bundle.getBoolean("extra_show_updated_tos");
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_updated_tos", this.A02);
    }
}
