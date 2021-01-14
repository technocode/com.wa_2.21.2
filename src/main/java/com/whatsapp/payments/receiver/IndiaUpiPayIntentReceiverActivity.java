package com.whatsapp.payments.receiver;

import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1PY;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C01980Ae;
import X.C61992u4;
import X.C63812x3;
import X.DialogInterface$OnClickListenerC62002u5;
import X.DialogInterface$OnClickListenerC62012u6;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity;

public class IndiaUpiPayIntentReceiverActivity extends AnonymousClass1PY {
    public C63812x3 A00;
    public final C01980Ae A01 = C01980Ae.A00();

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = new C63812x3(this.A01);
        if (C61992u4.A00(getIntent().getData()) == null) {
            finish();
            return;
        }
        C01980Ae r1 = this.A00.A00;
        if (r1.A08()) {
            Intent intent = new Intent(this, IndiaUpiPaymentLauncherActivity.class);
            intent.setData(getIntent().getData());
            startActivity(intent);
            finish();
        } else if (r1.A09()) {
            C002001d.A2O(this, 10001);
        } else {
            C002001d.A2O(this, SearchActionVerificationClientService.NOTIFICATION_ID);
        }
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 10000) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
            String A06 = r1.A06(R.string.payment_intent_error_cannot_continue_dialog_title);
            AnonymousClass0MC r2 = r3.A01;
            r2.A0I = A06;
            r2.A0E = r1.A06(R.string.payment_intent_error_no_account);
            r3.A07(r1.A06(R.string.ok), new DialogInterface$OnClickListenerC62002u5(this));
            r2.A0J = false;
            return r3.A00();
        } else if (i != 10001) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r32 = new AnonymousClass0MB(this);
            AnonymousClass01X r12 = ((AnonymousClass2C0) this).A01;
            String A062 = r12.A06(R.string.payment_intent_error_cannot_continue_dialog_title);
            AnonymousClass0MC r22 = r32.A01;
            r22.A0I = A062;
            r22.A0E = r12.A06(R.string.payment_intent_error_no_pin_set);
            r32.A07(r12.A06(R.string.ok), new DialogInterface$OnClickListenerC62012u6(this));
            r22.A0J = false;
            return r32.A00();
        }
    }
}
