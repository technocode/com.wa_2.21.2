package com.whatsapp.payments.ui;

import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1PY;
import X.AnonymousClass35Y;
import X.AnonymousClass3YJ;
import X.C000300f;
import X.C002001d;
import X.C61122sX;
import X.C61352t2;
import X.C63832x5;
import X.C69693Ia;
import X.DialogInterface$OnClickListenerC62662v9;
import X.DialogInterface$OnClickListenerC62672vA;
import X.DialogInterface$OnClickListenerC62682vB;
import X.DialogInterface$OnClickListenerC62702vD;
import X.DialogInterface$OnClickListenerC62712vE;
import X.DialogInterface$OnClickListenerC62722vF;
import X.DialogInterface$OnClickListenerC62732vG;
import X.DialogInterface$OnDismissListenerC62692vC;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.google.android.search.verification.client.R;

public class IndiaUpiQrCodeUrlValidationActivity extends AnonymousClass1PY {
    public C69693Ia A00;
    public String A01;
    public final C000300f A02 = C000300f.A00();
    public final AnonymousClass01X A03;
    public final C61352t2 A04;
    public final C63832x5 A05;
    public final AnonymousClass35Y A06;

    public IndiaUpiQrCodeUrlValidationActivity() {
        if (C63832x5.A04 == null) {
            synchronized (C63832x5.class) {
                if (C63832x5.A04 == null) {
                    C63832x5.A04 = new C63832x5(C61122sX.A00(), C61352t2.A00());
                }
            }
        }
        this.A05 = C63832x5.A04;
        this.A03 = AnonymousClass01X.A00();
        this.A06 = AnonymousClass35Y.A00();
        this.A04 = C61352t2.A00();
    }

    @Override // X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            C002001d.A2O(this, 25);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = (C69693Ia) C002001d.A0l(this, new AnonymousClass3YJ(this, getIntent().getStringExtra("ARG_URL"), getIntent().getStringExtra("external_payment_source"))).A00(C69693Ia.class);
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        switch (i) {
            case 21:
                AnonymousClass0MB r4 = new AnonymousClass0MB(this);
                AnonymousClass01X r3 = this.A03;
                String A0D = r3.A0D(R.string.payment_id_cannot_verify_error_text_default, r3.A06(R.string.india_upi_payment_id_name));
                AnonymousClass0MC r2 = r4.A01;
                r2.A0E = A0D;
                r4.A07(r3.A06(R.string.ok), new DialogInterface$OnClickListenerC62732vG(this));
                r2.A0J = false;
                return r4.A00();
            case 22:
                AnonymousClass0MB r42 = new AnonymousClass0MB(this);
                AnonymousClass01X r32 = this.A03;
                String A0D2 = r32.A0D(R.string.unblock_payment_id_error_default, r32.A06(R.string.india_upi_payment_id_name));
                AnonymousClass0MC r22 = r42.A01;
                r22.A0E = A0D2;
                r42.A07(r32.A06(R.string.ok), new DialogInterface$OnClickListenerC62722vF(this));
                r22.A0J = false;
                return r42.A00();
            case 23:
            default:
                return super.onCreateDialog(i);
            case 24:
                AnonymousClass0MB r43 = new AnonymousClass0MB(this);
                AnonymousClass01X r33 = this.A03;
                String A062 = r33.A06(R.string.payments_qr_dialog_unsafe_code_warning_title);
                AnonymousClass0MC r23 = r43.A01;
                r23.A0I = A062;
                r23.A0E = r33.A06(R.string.payments_qr_dialog_unsafe_code_warning);
                r43.A07(r33.A06(R.string.payments_qr_dialog_unsafe_code_cta_continue), new DialogInterface$OnClickListenerC62662v9(this));
                r43.A05(r33.A06(R.string.cancel), new DialogInterface$OnClickListenerC62702vD(this));
                r23.A0J = true;
                return r43.A00();
            case 25:
                Uri parse = Uri.parse(this.A00.A02().A05);
                AnonymousClass35Y r1 = this.A06;
                AnonymousClass01X r6 = this.A03;
                String A063 = r6.A06(R.string.upi_invoice_link_dialog_title);
                if (r1 != null) {
                    SpannableString spannableString = new SpannableString(AnonymousClass35Y.A01(parse.toString()));
                    Linkify.addLinks(spannableString, 1);
                    AnonymousClass0MB r34 = new AnonymousClass0MB(this, R.style.AlertDialogExternalLink);
                    AnonymousClass0MC r24 = r34.A01;
                    r24.A0I = A063;
                    r24.A0E = spannableString;
                    r34.A05(r6.A06(R.string.payments_send_money), new DialogInterface$OnClickListenerC62672vA(this));
                    r34.A07(r6.A06(R.string.upi_invoice_link_dialog_cta), new DialogInterface$OnClickListenerC62682vB(this));
                    r24.A0J = true;
                    r24.A07 = new DialogInterface$OnDismissListenerC62692vC(this);
                    return r34.A00();
                }
                throw null;
            case 26:
                AnonymousClass0MB r44 = new AnonymousClass0MB(this);
                AnonymousClass01X r35 = this.A03;
                String A0D3 = r35.A0D(R.string.payments_qr_dialog_payment_from_non_verified_merchant_exceeded_limit, this.A01);
                AnonymousClass0MC r25 = r44.A01;
                r25.A0E = A0D3;
                r44.A07(r35.A06(R.string.ok), new DialogInterface$OnClickListenerC62712vE(this));
                r25.A0J = false;
                return r44.A00();
        }
    }
}
