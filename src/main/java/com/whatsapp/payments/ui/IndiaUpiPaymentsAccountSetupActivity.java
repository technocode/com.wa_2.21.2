package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AbstractC01990Af;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0GS;
import X.AnonymousClass1PY;
import X.AnonymousClass2C0;
import X.C018809u;
import X.C02000Ag;
import X.C61592tQ;
import X.C69043Fn;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

public class IndiaUpiPaymentsAccountSetupActivity extends AnonymousClass1PY {
    public final AnonymousClass0GS A00 = AnonymousClass0GS.A00();
    public final C61592tQ A01 = C61592tQ.A00();
    public final C018809u A02 = C018809u.A00("IndiaUpiPaymentsAccountSetupActivity", "payment-settings", "IN");

    public final void A0d(boolean z) {
        C018809u r2 = this.A02;
        StringBuilder sb = new StringBuilder("showCompleteAndFinish ");
        sb.append(z);
        r2.A07(null, sb.toString(), null);
        ((ActivityC004702f) this).A0K.A00();
        this.A00.A01(new C69043Fn(this));
        Intent intent = new Intent(this, IndiaUpiBankAccountLinkingConfirmationActivity.class);
        A0c(intent);
        finish();
        if (getIntent() != null) {
            intent.putExtra("successInfo", getIntent().getStringExtra("successInfo"));
            if (z) {
                AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
                intent.putExtra("setup_confirmation_title", r22.A06(R.string.payments_setup_complete_confirmation_title));
                intent.putExtra("setup_confirmation_description", r22.A06(R.string.payments_setup_complete_confirmation_desc));
            }
        }
        startActivity(intent);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.payments_title));
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C018809u r4 = this.A02;
        AnonymousClass008.A1N(AnonymousClass008.A0S("onResume payment setup with mode: "), ((AnonymousClass1PY) this).A01, r4);
        if (!isFinishing()) {
            C02000Ag A002 = ((AbstractActivityC34761jB) this).A0I.A00();
            if (A002 == null) {
                r4.A07(null, "showNextStep is already complete", null);
                A0d(true);
                return;
            }
            StringBuilder sb = new StringBuilder("showNextStep: ");
            sb.append(A002);
            r4.A07(null, sb.toString(), null);
            if (A002 == AbstractC01990Af.A04) {
                r4.A08("Unset step", null);
                finish();
                return;
            }
            String str = A002.A03;
            if (str.equals("tos_with_wallet") || str.equals("tos_no_wallet")) {
                Intent intent = new Intent(this, IndiaUpiPaymentsTosActivity.class);
                finish();
                intent.putExtra("stepName", str);
                intent.putExtra("extra_setup_mode", ((AnonymousClass1PY) this).A01);
                A0c(intent);
                startActivity(intent);
            } else if (str.equals("add_card")) {
                r4.A07(null, "showAddCard not implemented", null);
            } else if (str.equals("add_bank")) {
                Intent intent2 = new Intent(this, IndiaUpiPaymentBankSetupActivity.class);
                finish();
                ((AnonymousClass1PY) this).A09 = true;
                A0c(intent2);
                startActivity(intent2);
            } else if (!str.equals("2fa")) {
            } else {
                if (((AnonymousClass1PY) this).A01 == 1) {
                    Intent intent3 = new Intent(this, IndiaUpiResetPinActivity.class);
                    finish();
                    ((AnonymousClass1PY) this).A09 = true;
                    A0c(intent3);
                    startActivity(intent3);
                    return;
                }
                A0d(false);
            }
        }
    }
}
