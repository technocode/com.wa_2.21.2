package com.whatsapp.payments.ui;

import X.AnonymousClass008;
import X.AnonymousClass00Y;
import X.AnonymousClass0S2;
import X.AnonymousClass1PY;
import X.AnonymousClass1VM;
import X.AnonymousClass20C;
import X.AnonymousClass2C0;
import X.C002301g;
import X.C018809u;
import X.C06170Sb;
import X.C28051Sr;
import X.C61772ti;
import X.C62342ud;
import X.C63042vl;
import X.C68683Ed;
import X.View$OnKeyListenerC63052vm;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import java.util.Calendar;

public class IndiaUpiDebitCardVerifActivity extends AnonymousClass1PY {
    public int A00;
    public int A01;
    public EditText A02;
    public EditText A03;
    public EditText A04;
    public EditText A05;
    public TextView A06;
    public AnonymousClass20C A07;
    public final AnonymousClass00Y A08 = AnonymousClass00Y.A00();
    public final C68683Ed A09 = C68683Ed.A00();
    public final C018809u A0A = C018809u.A00("IndiaUpiDebitCardVerifActivity", "onboarding", "IN");
    public final C06170Sb A0B = C06170Sb.A00();

    public final void A0d() {
        this.A06.startAnimation(AnonymousClass008.A02(0.0f, 1.0f, 250));
        this.A06.setVisibility(0);
    }

    public final void A0e() {
        if (A0f(this.A00, this.A01, true)) {
            Intent intent = getIntent();
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass008.A0B(this.A02));
            sb.append(AnonymousClass008.A0B(this.A03));
            intent.putExtra("extra_india_upi_debit_card_last6", sb.toString());
            intent.putExtra("extra_india_upi_debit_card_expiry_month", AnonymousClass008.A0B(this.A04));
            intent.putExtra("extra_india_upi_debit_card_expiry_year", AnonymousClass008.A0B(this.A05));
            setResult(101, intent);
            finish();
        }
        this.A08.A07(this.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r8 > 12) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e2, code lost:
        if (r8 > 12) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f7, code lost:
        if (r8 > 12) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0116, code lost:
        if (r6 > r5) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0129, code lost:
        if (r8 > 12) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0f(int r11, int r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 493
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDebitCardVerifActivity.A0f(int, int, boolean):boolean");
    }

    public /* synthetic */ void lambda$onCreate$77$IndiaUpiDebitCardVerifActivity(View view) {
        A0e();
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        super.onBackPressed();
        AnonymousClass20C r1 = this.A07;
        r1.A02 = null;
        r1.A00 = Boolean.TRUE;
        this.A08.A07(r1);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String A14;
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        setContentView(R.layout.india_upi_payments_bank_card_verif);
        C68683Ed r3 = this.A09;
        C61772ti r0 = r3.A03;
        String str = r0.A02;
        if (str == null) {
            str = r0.A02();
        }
        AnonymousClass20C r1 = new AnonymousClass20C();
        r1.A01 = r3.A00;
        r1.A03 = str;
        this.A07 = r1;
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.payments_verify_debit_card_activity_title));
            A092.A0A(true);
        }
        AnonymousClass1VM r02 = (AnonymousClass1VM) getIntent().getParcelableExtra("extra_bank_account");
        if (!(r02 == null || (A14 = C28051Sr.A14(r02.A0A)) == null)) {
            ((TextView) findViewById(R.id.add_card_number_label)).setText(((AnonymousClass2C0) this).A01.A0D(R.string.payments_debit_card_verification_title, A14));
        }
        EditText editText = (EditText) findViewById(R.id.add_card_number1);
        this.A02 = editText;
        C002301g.A03(editText);
        EditText editText2 = (EditText) findViewById(R.id.add_card_number2);
        this.A03 = editText2;
        C002301g.A03(editText2);
        this.A04 = (EditText) findViewById(R.id.add_card_month);
        this.A05 = (EditText) findViewById(R.id.add_card_year);
        C002301g.A03(this.A04);
        C002301g.A03(this.A05);
        this.A06 = (TextView) findViewById(R.id.payments_send_payment_error_text);
        Calendar instance = Calendar.getInstance();
        this.A00 = instance.get(2) + 1;
        this.A01 = instance.get(1) % 100;
        this.A02.addTextChangedListener(new C63042vl(this, 2, this.A03));
        this.A02.setOnKeyListener(new View$OnKeyListenerC63052vm(null, this.A03));
        this.A03.addTextChangedListener(new C63042vl(this, 4, this.A04));
        this.A03.setOnKeyListener(new View$OnKeyListenerC63052vm(this.A02, this.A04));
        this.A04.addTextChangedListener(new C63042vl(this, 2, this.A05));
        this.A04.setOnKeyListener(new View$OnKeyListenerC63052vm(this.A03, this.A05));
        this.A05.addTextChangedListener(new C63042vl(this, 2, null));
        this.A05.setOnKeyListener(new View$OnKeyListenerC63052vm(this.A04, null));
        this.A05.setOnEditorActionListener(new C62342ud(this));
        findViewById(R.id.verify_card).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 14));
        this.A02.requestFocus();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A0B.A02(findViewById(R.id.add_card_year));
    }
}
