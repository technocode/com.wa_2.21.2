package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AbstractC61362t3;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass0GP;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import X.AnonymousClass0S2;
import X.AnonymousClass1PY;
import X.AnonymousClass208;
import X.AnonymousClass2C0;
import X.AnonymousClass3DY;
import X.AnonymousClass3E7;
import X.C018809u;
import X.C01980Ae;
import X.C60922sD;
import X.C61072sS;
import X.C61082sT;
import X.C61432tA;
import X.C68393Da;
import X.C68683Ed;
import X.C69293Gm;
import X.C74493b1;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class IndiaUpiPaymentBankSetupActivity extends AnonymousClass1PY implements AbstractC61362t3 {
    public C61082sT A00;
    public AnonymousClass3E7 A01;
    public final C60922sD A02 = C60922sD.A00();
    public final C68393Da A03 = C68393Da.A00();
    public final C01980Ae A04 = C01980Ae.A00();
    public final AnonymousClass0GP A05 = AnonymousClass0GP.A00();
    public final C68683Ed A06 = C68683Ed.A00();
    public final C018809u A07 = C018809u.A00("IndiaUpiPaymentBankSetupActivity", "onboarding", "IN");

    public final void A0d() {
        this.A07.A07(null, "showBanksList called", null);
        Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
        intent.putParcelableArrayListExtra("extra_banks_list", this.A02.A06);
        intent.addFlags(335544320);
        A0c(intent);
        A0I(intent, false);
        finish();
    }

    public final void A0e(int i) {
        C018809u r2 = this.A07;
        StringBuilder sb = new StringBuilder("showErrorAndFinish: ");
        sb.append(i);
        r2.A07(null, sb.toString(), null);
        A0a();
        if (i == 0) {
            i = R.string.payments_setup_error;
            String str = this.A00.A03;
            if ("upi-batch".equalsIgnoreCase(str)) {
                i = R.string.payments_error_create_payment_account;
            } else if ("upi-get-banks".equalsIgnoreCase(str)) {
                i = R.string.payments_error_banks_list;
            }
        }
        if (((AnonymousClass1PY) this).A09) {
            A0Z();
            Intent intent = new Intent(this, IndiaUpiBankAccountLinkingRetryActivity.class);
            intent.putExtra("error", i);
            A0c(intent);
            A0I(intent, false);
            finish();
            return;
        }
        APo(i);
    }

    public void A0f(C61072sS r4) {
        A0g(r4, true);
        if (!C69293Gm.A02(this, "upi-batch", r4.code, false)) {
            C018809u r2 = this.A07;
            StringBuilder sb = new StringBuilder("onBatchError: ");
            sb.append(r4);
            sb.append("; showErrorAndFinish");
            r2.A07(null, sb.toString(), null);
            A0e(C69293Gm.A00(r4.code, this.A00));
        }
    }

    public final void A0g(C61072sS r6, boolean z) {
        int i;
        C68683Ed r1 = this.A06;
        int i2 = 4;
        if (z) {
            i2 = 3;
        }
        AnonymousClass208 A012 = r1.A01(i2);
        if (r6 != null) {
            A012.A05 = String.valueOf(r6.code);
            A012.A06 = r6.text;
            i = 2;
        } else {
            i = 1;
        }
        A012.A01 = Integer.valueOf(i);
        ((AnonymousClass1PY) this).A0A.A0B(A012, null, false);
        C018809u r2 = this.A07;
        StringBuilder sb = new StringBuilder("logBanksList: ");
        sb.append(A012);
        r2.A07(null, sb.toString(), null);
    }

    public void A0h(ArrayList arrayList, ArrayList arrayList2, AnonymousClass3DY r8, C61072sS r9) {
        Object valueOf;
        C018809u r2 = this.A07;
        StringBuilder A0S = AnonymousClass008.A0S("banks returned: ");
        if (arrayList == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(arrayList.size());
        }
        A0S.append(valueOf);
        r2.A07(null, A0S.toString(), null);
        A0g(r9, !this.A04.A09());
        if (AnonymousClass3E7.A00(this.A03, arrayList, arrayList2, r8)) {
            A0d();
        } else if (r9 == null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("onBanksList empty. showErrorAndFinish error: ");
            A0S2.append(this.A00.A00("upi-get-banks"));
            r2.A07(null, A0S2.toString(), null);
            A0e(C69293Gm.A00(0, this.A00));
        } else if (C69293Gm.A02(this, "upi-get-banks", r9.code, true)) {
        } else {
            if (this.A00.A06("upi-get-banks")) {
                StringBuilder A0S3 = AnonymousClass008.A0S("onBanksList failure. Retry sendGetBanksList error: ");
                A0S3.append(this.A00.A00("upi-get-banks"));
                r2.A07(null, A0S3.toString(), null);
                this.A01.A01();
                this.A06.AQ7();
                return;
            }
            StringBuilder A0S4 = AnonymousClass008.A0S("onBanksList failure. showErrorAndFinish error: ");
            A0S4.append(this.A00.A00("upi-get-banks"));
            r2.A07(null, A0S4.toString(), null);
            A0e(C69293Gm.A00(r9.code, this.A00));
        }
    }

    @Override // X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        this.A07.A08(AnonymousClass008.A0H("onActivityResult: request: ", i, " result: ", i2), null);
        if (i != 1000) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            A0Z();
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_payments);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_bank_setup);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(((AnonymousClass2C0) this).A01.A06(R.string.payments_add_bank_account_activity_title));
            A09.A0A(true);
        }
        C60922sD r7 = this.A02;
        this.A00 = r7.A04;
        this.A01 = new AnonymousClass3E7(this, ((ActivityC004702f) this).A0F, ((AbstractActivityC34761jB) this).A0M, ((ActivityC004702f) this).A0H, r7, ((AbstractActivityC34761jB) this).A0J, this.A05, this.A03, this);
        onConfigurationChanged(getResources().getConfiguration());
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A01.A00 = null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (!isFinishing()) {
            C018809u r3 = this.A07;
            StringBuilder A0S = AnonymousClass008.A0S("bank setup onResume states: ");
            A0S.append(this.A00);
            r3.A07(null, A0S.toString(), null);
            if (this.A02.A06 == null) {
                if (!this.A04.A09()) {
                    AnonymousClass3E7 r8 = this.A01;
                    if (r8 != null) {
                        Log.i("PAY: IndiaUpiPaymentSetup createPaymentAccountBatch called");
                        C61082sT r13 = ((C61432tA) r8).A00;
                        r13.A03("upi-batch");
                        ((C61432tA) r8).A01.A09(true, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "upi-batch", null, (byte) 0), new AnonymousClass0OS("version", 2)}, null, null), new C74493b1(r8, r8.A01, r8.A02, r8.A03, r8.A06, r13), 0);
                    } else {
                        throw null;
                    }
                } else {
                    this.A01.A01();
                }
                this.A06.AQ7();
                return;
            }
            A0d();
        }
    }
}
