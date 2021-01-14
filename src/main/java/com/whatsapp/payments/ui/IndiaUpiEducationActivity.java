package com.whatsapp.payments.ui;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0S2;
import X.AnonymousClass1PY;
import X.AnonymousClass1VM;
import X.AnonymousClass20J;
import X.AnonymousClass20K;
import X.AnonymousClass2C0;
import X.C018809u;
import X.C28051Sr;
import X.C61772ti;
import X.C68683Ed;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;

public class IndiaUpiEducationActivity extends AnonymousClass1PY {
    public int A00;
    public int A01;
    public int A02;
    public final C68683Ed A03 = C68683Ed.A00();
    public final C018809u A04 = C018809u.A00("IndiaUpiEducationActivity", "onboarding", "IN");

    public /* synthetic */ void lambda$onCreate$81$IndiaUpiEducationActivity(View view) {
        setResult(100);
        finish();
    }

    @Override // X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        this.A04.A07(null, AnonymousClass008.A0H("got result for activity: ", i, " result:", i2), null);
        super.onActivityResult(i, i2, intent);
        if (i == 1013 && i2 == 101) {
            Intent intent2 = getIntent();
            intent2.putExtras(intent);
            setResult(101, intent2);
            finish();
        }
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        super.onBackPressed();
        int i = this.A00;
        if (i == 1 && this.A02 != 2) {
            C68683Ed r3 = this.A03;
            C61772ti r0 = r3.A03;
            String str = r0.A02;
            if (str == null) {
                str = r0.A02();
            }
            AnonymousClass20J r1 = new AnonymousClass20J();
            r1.A02 = r3.A00;
            r1.A03 = str;
            r1.A00 = Boolean.TRUE;
            ((AnonymousClass1PY) this).A0A.A0B(r1, null, false);
        } else if (i == 0) {
            C68683Ed r32 = this.A03;
            C61772ti r02 = r32.A03;
            String str2 = r02.A02;
            if (str2 == null) {
                str2 = r02.A02();
            }
            AnonymousClass20K r12 = new AnonymousClass20K();
            r12.A02 = r32.A00;
            r12.A03 = str2;
            r12.A00 = Boolean.TRUE;
            ((AnonymousClass1PY) this).A0A.A0B(r12, null, false);
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String A06;
        String A0D;
        String A062;
        int i;
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.payment_education);
        this.A00 = getIntent().getIntExtra("extra_education_type", 0);
        this.A02 = getIntent().getIntExtra("extra_use_pin_education_type", -1);
        this.A01 = getIntent().getIntExtra("extra_set_pin_education_type", -1);
        AnonymousClass1VM r5 = (AnonymousClass1VM) getIntent().getParcelableExtra("extra_bank_account");
        if (this.A00 == 1) {
            String stringExtra = getIntent().getStringExtra("extra_bank_account");
            if (this.A02 == 2) {
                AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
                A06 = r2.A06(R.string.upi_pin_entry_education_activity_title_text);
                str = r2.A06(R.string.upi_pin_entry_education_title_text);
                A0D = r2.A0D(R.string.upi_pin_entry_education_desc_text, stringExtra);
                A062 = r2.A06(R.string.upi_pin_entry_education_button_text);
                TextView textView = (TextView) findViewById(R.id.extra_desc);
                textView.setText(r2.A06(R.string.upi_pin_entry_education_cta_text));
                textView.setVisibility(0);
                textView.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 16));
            } else {
                AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
                A06 = r22.A06(R.string.upi_pin_setup_education_title_text);
                str = r22.A06(R.string.upi_pin_setup_education_title_text);
                A0D = r22.A0D(R.string.upi_pin_setup_education_desc_text, stringExtra);
                A062 = r22.A06(R.string.upi_pin_setup_education_button_text);
            }
            i = R.drawable.ic_hero_pin;
        } else {
            String A14 = C28051Sr.A14(r5.A0A);
            AnonymousClass01X r23 = ((AnonymousClass2C0) this).A01;
            A06 = r23.A06(R.string.payments_verify_debit_card_activity_title);
            int i2 = this.A01;
            if (i2 == 1) {
                A0D = r23.A0D(R.string.payments_verify_debit_card_education_activity_set_desc, A14);
            } else if (i2 == 2) {
                A0D = r23.A0D(R.string.payments_verify_debit_card_education_activity_reset_desc, A14);
            } else {
                A0D = r23.A0D(R.string.payments_verify_debit_card_education_activity_desc, A14);
            }
            A062 = r23.A06(R.string.btn_continue);
            i = R.drawable.ic_hero_card;
            str = A06;
        }
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(A06);
            A09.A0A(true);
        }
        ((ImageView) findViewById(R.id.education_activity_image)).setImageResource(i);
        ((TextView) findViewById(R.id.education_activity_title)).setText(str);
        ((TextView) findViewById(R.id.education_activity_desc)).setText(A0D);
        TextView textView2 = (TextView) findViewById(R.id.education_main_button);
        textView2.setText(A062);
        textView2.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r5, 12));
    }
}
