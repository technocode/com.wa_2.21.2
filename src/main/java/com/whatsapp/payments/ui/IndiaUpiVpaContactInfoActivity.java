package com.whatsapp.payments.ui;

import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0HJ;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass3G8;
import X.C002001d;
import X.C004302a;
import X.C018809u;
import X.C03340Fu;
import X.C05880Qw;
import X.C28051Sr;
import X.C449222e;
import X.C68453Dg;
import X.DialogInterface$OnClickListenerC62752vI;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class IndiaUpiVpaContactInfoActivity extends ActivityC004702f implements View.OnClickListener {
    public View A00;
    public LinearLayout A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass0HJ A06 = AnonymousClass0HJ.A02();
    public final C449222e A07 = C449222e.A00();
    public final C68453Dg A08 = C68453Dg.A00();
    public final C03340Fu A09 = C03340Fu.A00();
    public final C018809u A0A = C018809u.A00("IndiaUpiVpaContactInfoActivity", "payment-settings", "IN");

    public final void A0R(boolean z) {
        this.A05 = z;
        ImageView imageView = (ImageView) findViewById(R.id.block_vpa_icon);
        TextView textView = (TextView) findViewById(R.id.block_vpa_text);
        View view = this.A00;
        int i = 8;
        int i2 = 0;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        LinearLayout linearLayout = this.A01;
        if (!z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (z) {
            imageView.setColorFilter(C004302a.A00(this, R.color.dark_gray));
            textView.setTextColor(C004302a.A00(this, R.color.dark_gray));
            textView.setText(((AnonymousClass2C0) this).A01.A06(R.string.unblock));
            return;
        }
        imageView.setColorFilter(C004302a.A00(this, R.color.red_button_text));
        textView.setTextColor(C004302a.A00(this, R.color.red_button_text));
        textView.setText(((AnonymousClass2C0) this).A01.A06(R.string.block));
    }

    public void onClick(View view) {
        if (view.getId() == R.id.new_payment_container) {
            C018809u r2 = this.A0A;
            StringBuilder A0S = AnonymousClass008.A0S("send payment to vpa: ");
            A0S.append(C28051Sr.A17(this.A02));
            r2.A07(null, A0S.toString(), null);
            Intent A012 = this.A08.A01(this, false, true);
            A012.putExtra("extra_payment_handle", this.A02);
            A012.putExtra("extra_payment_handle_id", this.A03);
            A012.putExtra("extra_payee_name", this.A04);
            startActivity(A012);
        } else if (view.getId() != R.id.block_vpa_btn) {
        } else {
            if (this.A05) {
                C018809u r22 = this.A0A;
                StringBuilder A0S2 = AnonymousClass008.A0S("unblock vpa: ");
                A0S2.append(C28051Sr.A17(this.A02));
                r22.A07(null, A0S2.toString(), null);
                this.A07.A01(this, this.A09, this.A02, false, new AnonymousClass3G8(this, false));
                return;
            }
            C018809u r23 = this.A0A;
            StringBuilder A0S3 = AnonymousClass008.A0S("block vpa: ");
            A0S3.append(C28051Sr.A17(this.A02));
            r23.A07(null, A0S3.toString(), null);
            C002001d.A2O(this, 1);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_vpa_contact);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.upi_id_info));
        }
        this.A02 = getIntent().getStringExtra("extra_payment_handle");
        this.A03 = getIntent().getStringExtra("extra_payment_handle_id");
        this.A04 = getIntent().getStringExtra("extra_payee_name");
        this.A00 = findViewById(R.id.payment_separator);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.new_payment_container);
        this.A01 = linearLayout;
        linearLayout.setOnClickListener(this);
        ((TextView) findViewById(R.id.account_id_handle)).setText(this.A02);
        ((TextView) findViewById(R.id.vpa_name)).setText(this.A04);
        this.A06.A05((ImageView) findViewById(R.id.avatar), R.drawable.avatar_contact);
        View findViewById = findViewById(R.id.payment_drawable_text);
        findViewById.setContentDescription(((AnonymousClass2C0) this).A01.A06(R.string.new_payment));
        ((TextView) findViewById).setText(C05880Qw.A01.A5f(this));
        View findViewById2 = findViewById(R.id.block_vpa_btn);
        findViewById2.setVisibility(0);
        findViewById2.setOnClickListener(this);
        A0R(this.A07.A03(this.A02));
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        AnonymousClass0MB r5 = new AnonymousClass0MB(this);
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        r5.A01.A0E = r4.A0D(R.string.block_upi_id_confirmation, this.A04);
        r5.A07(r4.A06(R.string.block), new DialogInterface$OnClickListenerC62752vI(this));
        return AnonymousClass008.A03(r4, R.string.cancel, r5);
    }
}
