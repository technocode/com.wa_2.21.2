package com.whatsapp.payments.ui;

import X.AbstractC000400g;
import X.AbstractC63552wc;
import X.AbstractView$OnClickListenerC32271ec;
import X.ActivityC004702f;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass0GP;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0S2;
import X.AnonymousClass0e8;
import X.AnonymousClass1VM;
import X.AnonymousClass2C0;
import X.AnonymousClass3EA;
import X.AnonymousClass3EB;
import X.AnonymousClass3EH;
import X.AnonymousClass3EI;
import X.AnonymousClass3HA;
import X.C002001d;
import X.C002101e;
import X.C018809u;
import X.C01970Ad;
import X.C01980Ae;
import X.C02020Ai;
import X.C03340Fu;
import X.C28051Sr;
import X.C43751yt;
import X.C60922sD;
import X.C63812x3;
import X.C63842x6;
import X.C68393Da;
import X.C68683Ed;
import X.C69243Gh;
import X.C69293Gm;
import X.C74463ay;
import X.DialogInterface$OnCancelListenerC62292uY;
import X.DialogInterface$OnClickListenerC62272uW;
import X.DialogInterface$OnClickListenerC62282uX;
import X.View$OnClickListenerC63562wd;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.AbstractCollection;

public class IndiaUpiBankAccountDetailsActivity extends AbstractView$OnClickListenerC32271ec implements AbstractC63552wc {
    public C43751yt A00;
    public AnonymousClass3EI A01;
    public AnonymousClass0e8 A02;
    public View$OnClickListenerC63562wd A03;
    public C63812x3 A04;
    public final AnonymousClass01I A05 = AnonymousClass01I.A00();
    public final C60922sD A06 = C60922sD.A00();
    public final C68393Da A07 = C68393Da.A00();
    public final C01980Ae A08 = C01980Ae.A00();
    public final AnonymousClass0GP A09 = AnonymousClass0GP.A00();
    public final C03340Fu A0A = C03340Fu.A00();
    public final C02020Ai A0B = C02020Ai.A00();
    public final C68683Ed A0C = C68683Ed.A00();
    public final C018809u A0D = C018809u.A00("IndiaUpiBankAccountDetailsActivity", "payment-settings", "IN");
    public final C69293Gm A0E = C69293Gm.A01();
    public final C63842x6 A0F = C63842x6.A00();
    public final AnonymousClass00T A0G = C002101e.A00();

    @Override // X.AbstractView$OnClickListenerC32271ec
    public void A0V(AnonymousClass1VM r7, boolean z) {
        super.A0V(r7, z);
        C43751yt r0 = (C43751yt) r7;
        this.A00 = r0;
        if (z) {
            String A14 = C28051Sr.A14(r0.A0A);
            TextView textView = ((AbstractView$OnClickListenerC32271ec) this).A05;
            String str = this.A00.A08;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append("•");
            sb.append("•");
            sb.append(A14);
            textView.setText(sb.toString());
            ((AbstractView$OnClickListenerC32271ec) this).A06.setText(this.A07.A05());
            ((AbstractView$OnClickListenerC32271ec) this).A06.A00 = ((AnonymousClass2C0) this).A01.A06(R.string.vpa_copied_to_clipboard);
            this.A03 = new View$OnClickListenerC63562wd(this);
            ((ViewGroup) findViewById(R.id.widget_container)).addView(this.A03);
            View$OnClickListenerC63562wd r3 = this.A03;
            r3.A03 = this;
            C74463ay r5 = (C74463ay) r7.A06;
            r3.findViewById(R.id.reset_upi_pin_container).setOnClickListener(r3);
            r3.A02 = (TextView) r3.findViewById(R.id.reset_upi_pin);
            r3.A00 = r3.findViewById(R.id.change_upi_pin_container);
            r3.A01 = r3.findViewById(R.id.check_balance_container);
            boolean z2 = r5.A0G;
            r3.A04 = z2;
            int i = 8;
            if (!z2) {
                r3.A02.setText(r3.A06.A06(R.string.payments_reset_upi_pin_activity_title));
                r3.A00.setVisibility(8);
                r3.A01.setVisibility(8);
            } else {
                r3.A00.setVisibility(0);
                View view = r3.A01;
                if (r3.A05.A0D(AbstractC000400g.A1z)) {
                    String str2 = r5.A08;
                    if ("OD_SECURED".equals(str2) || "OD_UNSECURED".equals(str2)) {
                        i = 0;
                    }
                }
                view.setVisibility(i);
            }
            r3.A00.setOnClickListener(r3);
            r3.A01.setOnClickListener(r3);
        }
    }

    public void A0W(boolean z) {
        if (z) {
            this.A0D.A07(null, "unlinking the payment account.", null);
            Intent intent = new Intent(this, PaymentDeleteAccountActivity.class);
            intent.putExtra("extra_remove_payment_account", 1);
            startActivityForResult(intent, 0);
            return;
        }
        A0G(R.string.register_wait_message);
        C68683Ed r2 = this.A0C;
        r2.AQ7();
        C69243Gh r3 = new C69243Gh(this, new AnonymousClass3HA(this, r2, 13), r2);
        C74463ay r6 = (C74463ay) this.A00.A06;
        C018809u r22 = this.A0D;
        AnonymousClass00E.A04(r6, r22.A02(r22.A02, "IndiaUpiBankAccountDetailsActivity onRemovePaymentMethod Unable to get IndiaUpiMethodData").toString());
        AnonymousClass3EI r15 = this.A01;
        String str = r6.A0D;
        String str2 = r6.A0E;
        String str3 = r6.A0A;
        String str4 = this.A00.A07;
        if (r15 == null) {
            throw null;
        } else if (TextUtils.isEmpty(str)) {
            AnonymousClass3EB r4 = new AnonymousClass3EB(r15.A00, r15.A01, r15.A02, r15.A07, r15.A03, r15.A06, r15.A08, r15.A05, r15.A04, null);
            AnonymousClass3EH r23 = new AnonymousClass3EH(r15, str3, str4, r3);
            AnonymousClass01I r0 = r4.A02;
            r0.A04();
            r4.A00(r0.A03, new AnonymousClass3EA(r4, r23));
        } else {
            r15.A00(str, str2, str3, str4, r3);
        }
    }

    @Override // X.AbstractView$OnClickListenerC32271ec, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (i2 == -1) {
                this.A04.A00(this);
            }
        } else if (i == 1012 && i2 == -1) {
            View$OnClickListenerC63562wd r3 = this.A03;
            r3.A04 = true;
            r3.A02.setText(r3.A06.A06(R.string.forgot_upi_pin));
            r3.A00.setVisibility(0);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AnonymousClass2C0, X.AbstractView$OnClickListenerC32271ec, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04 = new C63812x3(this.A08);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.payments_bank_account_details));
            A092.A0A(true);
        }
        this.A0D.A07(null, "onCreate", null);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        C68393Da r1 = this.A07;
        ((TextView) findViewById(R.id.footer_processed_by_psp)).setText(r5.A0D(R.string.payments_processed_by_psp, r5.A06(r1.A02())));
        this.A01 = new AnonymousClass3EI(this, ((ActivityC004702f) this).A0F, this.A05, ((AbstractView$OnClickListenerC32271ec) this).A0B, this.A0F, this.A06, ((ActivityC004702f) this).A0H, this.A0A, this.A0C, this.A09, r1);
    }

    @Override // X.AbstractView$OnClickListenerC32271ec, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        AnonymousClass01X r3;
        String A062;
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C01970Ad r0 = ((AbstractView$OnClickListenerC32271ec) this).A0B;
        r0.A04();
        int size = ((AbstractCollection) r0.A05.A0S(1)).size();
        boolean z = false;
        if (size > 0) {
            z = true;
        }
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        if (z) {
            r3 = ((AnonymousClass2C0) this).A01;
            A062 = r3.A06(R.string.switch_psp_dialog_title_with_warning);
        } else {
            r3 = ((AnonymousClass2C0) this).A01;
            A062 = r3.A06(R.string.switch_psp_dialog_title);
        }
        CharSequence A1J = C002001d.A1J(A062, this, this.A0M);
        AnonymousClass0MC r2 = r4.A01;
        r2.A0E = A1J;
        r2.A0J = true;
        r4.A05(r3.A06(R.string.cancel), new DialogInterface$OnClickListenerC62282uX(this));
        r4.A07(r3.A06(R.string.payments_remove_and_continue), new DialogInterface$OnClickListenerC62272uW(this));
        r2.A02 = new DialogInterface$OnCancelListenerC62292uY(this);
        return r4.A00();
    }

    @Override // X.AbstractView$OnClickListenerC32271ec
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A1u)) {
            menu.add(0, R.id.menuitem_switch_payment_processor, 0, ((AnonymousClass2C0) this).A01.A06(R.string.switch_payment_processor));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AbstractView$OnClickListenerC32271ec, X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_switch_payment_processor) {
            return super.onOptionsItemSelected(menuItem);
        }
        C002001d.A2O(this, 100);
        return true;
    }
}
