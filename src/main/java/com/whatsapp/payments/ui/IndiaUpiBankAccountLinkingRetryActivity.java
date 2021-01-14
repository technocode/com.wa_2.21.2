package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass0S2;
import X.AnonymousClass1PY;
import X.AnonymousClass27v;
import X.AnonymousClass2C0;
import X.C12420i4;
import X.C60922sD;
import X.C63512wX;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class IndiaUpiBankAccountLinkingRetryActivity extends AnonymousClass1PY {
    public final C60922sD A00 = C60922sD.A00();

    public final ArrayList A0d(String str) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        arrayList.add(r5.A0D(R.string.device_binding_failure_reasons_1, str));
        arrayList.add(r5.A06(R.string.device_binding_failure_reasons_2));
        arrayList.add(r5.A06(R.string.device_binding_failure_reasons_3));
        if (Build.VERSION.SDK_INT < 21) {
            arrayList.add(r5.A0D(R.string.device_binding_failure_reasons_4, str));
        }
        return arrayList;
    }

    public /* synthetic */ void lambda$onCreate$16$IndiaUpiBankAccountLinkingRetryActivity(View view) {
        int i = 0;
        if (getIntent() != null) {
            i = getIntent().getIntExtra("try_again", 0);
        }
        if (((AnonymousClass1PY) this).A09 || i <= 0) {
            Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A0c(intent);
            startActivity(intent);
        } else if (i == 1) {
            Intent intent2 = new Intent(this, IndiaUpiPaymentBankSetupActivity.class);
            A0c(intent2);
            startActivity(intent2);
        }
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_account);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String str;
        String A0D;
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_bankaccount_linking_retry);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(((AnonymousClass2C0) this).A01.A06(R.string.payments_retry_setup_activity_title));
            A09.A0A(true);
        }
        TextView textView = (TextView) findViewById(R.id.bankaccount_linking_retry_title);
        TextView textView2 = (TextView) findViewById(R.id.bankaccount_linking_retry_desc);
        int intExtra = getIntent().getIntExtra("error", 0);
        int intExtra2 = getIntent().getIntExtra("error_type", 0);
        AnonymousClass27v r0 = (AnonymousClass27v) getIntent().getParcelableExtra("extra_bank_account");
        String str2 = "";
        if (r0 != null) {
            str2 = r0.A05;
            str = r0.A02;
        } else {
            str = str2;
        }
        if (intExtra2 >= 1 && intExtra2 <= 3) {
            AnonymousClass01I r1 = ((AbstractActivityC34761jB) this).A0C;
            r1.A04();
            UserJid userJid = r1.A03;
            if (userJid != null) {
                String A03 = C12420i4.A03(userJid.user);
                AnonymousClass01X r9 = ((AnonymousClass2C0) this).A01;
                String A0F = r9.A0F(A03);
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.failure_reasons_bullet_list_container);
                TextView textView3 = (TextView) viewGroup.findViewById(R.id.failure_reasons_title);
                ArrayList<String> arrayList = new ArrayList(5);
                if (intExtra2 == 1) {
                    textView.setText(r9.A0D(R.string.bankaccount_linking_retry_get_accounts_failure_title, r9.A0E(str2)));
                    if (intExtra == R.string.get_accounts_failure_reason) {
                        if (TextUtils.isEmpty(str)) {
                            A0D = r9.A0D(R.string.get_accounts_failure_reason_without_bank_phone, A0F);
                        } else {
                            A0D = r9.A0D(R.string.get_accounts_failure_reason, A0F, r9.A0F(str));
                        }
                        textView2.setText(A0D);
                    }
                } else if (intExtra2 == 2) {
                    textView.setText(r9.A06(R.string.device_binding_failure_title));
                    textView3.setText(r9.A06(R.string.device_binding_failure_reasons_bullet_list_title));
                    arrayList = A0d(A0F);
                } else if (intExtra2 == 3) {
                    textView.setText(r9.A06(R.string.device_binding_failure_title));
                    if (intExtra == R.string.payments_device_binding_sms_data_mismatched) {
                        textView2.setText(r9.A06(intExtra));
                    } else {
                        textView3.setText(r9.A06(R.string.device_binding_failure_reasons_bullet_list_title_sms));
                        arrayList = A0d(A0F);
                    }
                }
                for (String str3 : arrayList) {
                    SpannableString spannableString = new SpannableString(str3);
                    spannableString.setSpan(new C63512wX((int) getResources().getDimension(R.dimen.payment_text_bullet_distance)), 0, str3.length(), 0);
                    TextView textView4 = new TextView(this);
                    textView4.setText(spannableString);
                    textView4.setTextColor(getResources().getColor(R.color.secondary_text));
                    textView4.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.payment_bullet_text_size));
                    textView4.setLineSpacing((float) getResources().getDimensionPixelSize(R.dimen.payment_bullet_text_line_spacing_extra), 1.0f);
                    textView4.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.payment_bullet_text_line_spacing_extra));
                    viewGroup.addView(textView4);
                }
                if (arrayList.size() > 0) {
                    viewGroup.setVisibility(0);
                    textView2.setVisibility(8);
                }
            } else {
                throw null;
            }
        } else if (intExtra > 0) {
            if (!TextUtils.isEmpty(str2) && intExtra2 == 4) {
                AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
                textView2.setText(r2.A0D(intExtra, r2.A0E(str2)));
            } else if (TextUtils.isEmpty(str2) || intExtra2 != 5) {
                textView2.setText(((AnonymousClass2C0) this).A01.A06(intExtra));
            } else {
                AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
                textView2.setText(r22.A0D(intExtra, r22.A0E(str2)));
            }
        }
        findViewById(R.id.retry_button).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 10));
        onConfigurationChanged(getResources().getConfiguration());
    }
}
