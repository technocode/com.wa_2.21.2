package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AbstractC60972sI;
import X.AnonymousClass00E;
import X.AnonymousClass01X;
import X.AnonymousClass0AY;
import X.AnonymousClass0S2;
import X.AnonymousClass1PY;
import X.AnonymousClass2C0;
import X.C004302a;
import X.C05270Nw;
import X.C68433De;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import java.util.Iterator;

public class IndiaUpiBankAccountLinkingConfirmationActivity extends AnonymousClass1PY {
    public C68433De A00 = C68433De.A00;

    public /* synthetic */ void lambda$onCreate$15$IndiaUpiBankAccountLinkingConfirmationActivity(View view) {
        int i = ((AnonymousClass1PY) this).A00;
        if (i != 1) {
            if (((AbstractActivityC34761jB) this).A02 != null || ((AnonymousClass1PY) this).A07 != null) {
                Intent intent = new Intent(this, IndiaUpiPaymentActivity.class);
                A0c(intent);
                startActivity(intent);
            } else if (i == 0) {
                Intent intent2 = new Intent(this, IndiaUpiContactPicker.class);
                intent2.putExtra("for_payments", true);
                startActivity(intent2);
            } else {
                Intent intent3 = new Intent(this, IndiaUpiPaymentSettingsActivity.class);
                intent3.addFlags(335544320);
                startActivity(intent3);
            }
        }
        finish();
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.payment_education);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(((AnonymousClass2C0) this).A01.A07(R.string.payments_account_linking_confirmation_activity_title));
            A09.A0A(true);
        }
        ((ImageView) findViewById(R.id.education_activity_image)).setImageResource(R.drawable.ic_hero_send_payments);
        TextView textView = (TextView) findViewById(R.id.education_activity_title);
        TextView textView2 = (TextView) findViewById(R.id.education_activity_desc);
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        textView.setText(r4.A06(R.string.bankaccount_linking_confirmation_title_text));
        textView2.setText(r4.A06(R.string.bankaccount_linking_confirmation_desc_text));
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("setup_confirmation_title");
            if (!TextUtils.isEmpty(stringExtra)) {
                textView.setText(stringExtra);
            }
            String stringExtra2 = getIntent().getStringExtra("setup_confirmation_description");
            if (!TextUtils.isEmpty(stringExtra2)) {
                textView2.setText(C05270Nw.A00(stringExtra2, C004302a.A03(this, R.drawable.ib_attach), textView2.getPaint()));
            }
            String stringExtra3 = getIntent().getStringExtra("successInfo");
            TextView textView3 = (TextView) findViewById(R.id.extra_desc);
            textView3.setTextColor(getResources().getColor(R.color.payments_education_desc_font_color));
            textView3.setAllCaps(false);
            if (!TextUtils.isEmpty(stringExtra3)) {
                textView3.setVisibility(0);
                textView3.setText(stringExtra3);
            }
        }
        TextView textView4 = (TextView) findViewById(R.id.education_main_button);
        textView4.setText(r4.A06(R.string.bankaccount_linking_confirmation_button_text));
        textView4.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 9));
        C68433De r0 = this.A00;
        if (r0 != null) {
            AnonymousClass00E.A01();
            Iterator it = r0.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC60972sI) r1.next()).A00();
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }
}
