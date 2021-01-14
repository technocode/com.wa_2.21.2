package com.whatsapp.payments.ui;

import X.AbstractC000400g;
import X.AbstractC61862tr;
import X.AbstractC63182vz;
import X.AbstractC63192w0;
import X.AbstractView$OnClickListenerC32241eZ;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00D;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass0GP;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1VM;
import X.AnonymousClass2C0;
import X.C000300f;
import X.C002001d;
import X.C004302a;
import X.C01980Ae;
import X.C04570Kw;
import X.C28051Sr;
import X.C61202sf;
import X.C61762th;
import X.C61902tv;
import X.C61942tz;
import X.C63542wb;
import X.C63812x3;
import X.C63822x4;
import X.C68393Da;
import X.C68783En;
import X.C69383Gv;
import X.DialogInterface$OnClickListenerC62552uy;
import X.View$OnLongClickListenerC62562uz;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import java.lang.ref.WeakReference;
import java.util.List;

public final class IndiaUpiPaymentSettingsActivity extends AbstractView$OnClickListenerC32241eZ implements AbstractC63182vz, AbstractC61862tr {
    public View A00 = null;
    public AbstractC63192w0 A01;
    public C63812x3 A02;
    public boolean A03;
    public final AnonymousClass01I A04 = AnonymousClass01I.A00();
    public final C000300f A05 = C000300f.A00();
    public final AnonymousClass00D A06 = AnonymousClass00D.A00();
    public final C68393Da A07 = C68393Da.A00();
    public final C01980Ae A08 = C01980Ae.A00();
    public final C68783En A09 = C68783En.A00();

    @Override // X.AnonymousClass3HB
    public String A7Q(AnonymousClass1VM r2) {
        return null;
    }

    @Override // X.AbstractC63102vr
    public String A7S(AnonymousClass1VM r2) {
        return null;
    }

    public final void A0W() {
        if (this.A05.A0D(AbstractC000400g.A1y) && ((AbstractView$OnClickListenerC32241eZ) this).A0L.A01().getBoolean("payment_has_received_upi_mandate_request", false) && !this.A03) {
            this.A03 = true;
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.recurring_payment_container);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(this).inflate(R.layout.india_upi_payment_setting_mandate_entry, viewGroup, true);
            C002001d.A2m((ImageView) inflate.findViewById(R.id.mandate_icon), C004302a.A00(this, R.color.settings_icon));
            inflate.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 18));
            viewGroup.setVisibility(0);
        }
    }

    @Override // X.AbstractC63152vw
    public void ACc(boolean z) {
        if (z) {
            Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            intent.putExtra("extra_setup_mode", 2);
            startActivity(intent);
            return;
        }
        startActivityForResult(new Intent(this, IndiaUpiPaymentBankSetupActivity.class), 1008);
    }

    @Override // X.AbstractC61862tr
    public void AEo(String str) {
        TransactionsExpandableView transactionsExpandableView = ((AbstractView$OnClickListenerC32241eZ) this).A0E;
        transactionsExpandableView.post(new RunnableEBaseShape11S0100000_I1_6(transactionsExpandableView, 48));
        TransactionsExpandableView transactionsExpandableView2 = ((AbstractView$OnClickListenerC32241eZ) this).A0D;
        transactionsExpandableView2.post(new RunnableEBaseShape11S0100000_I1_6(transactionsExpandableView2, 48));
    }

    @Override // X.AbstractC63152vw
    public void AIN(AnonymousClass1VM r3) {
        Intent intent = new Intent(this, IndiaUpiBankAccountDetailsActivity.class);
        intent.putExtra("extra_bank_account", r3);
        startActivityForResult(intent, 1009);
    }

    @Override // X.AbstractC63182vz
    public void ANs(boolean z) {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_required_container);
        if (this.A00 == null) {
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(this).inflate(R.layout.india_upi_payment_settings_action_required_row, viewGroup, true);
            this.A00 = inflate;
            inflate.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 20));
        }
        int i = 8;
        if (z) {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    @Override // X.AbstractView$OnClickListenerC32241eZ, X.AbstractC63162vx
    public void AQs(List list) {
        super.AQs(list);
        if (!this.A08.A09()) {
            ((AbstractView$OnClickListenerC32241eZ) this).A07.removeAllViews();
            ((AbstractView$OnClickListenerC32241eZ) this).A07.setVisibility(8);
            ((AbstractView$OnClickListenerC32241eZ) this).A04.setVisibility(8);
        } else if (((AbstractView$OnClickListenerC32241eZ) this).A07.getChildCount() == 0) {
            String A0T = A0T();
            String A052 = this.A07.A05();
            if (TextUtils.isEmpty(A0T)) {
                A0T = this.A06.A00.getString("push_name", "");
                ((AbstractView$OnClickListenerC32241eZ) this).A0N.A01(1, null);
            }
            C63542wb r3 = new C63542wb(this);
            r3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            r3.setIconTint(C004302a.A00(this, R.color.settings_icon));
            AnonymousClass01I r0 = this.A04;
            r0.A04();
            r3.A03.A02(r0.A01, r3.A00);
            r3.A02.setText(A0T);
            r3.A01.setText(A052);
            r3.setBackgroundColor(getResources().getColor(R.color.primary_surface));
            r3.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 19));
            r3.setOnLongClickListener(new View$OnLongClickListenerC62562uz(this, A052));
            ((AbstractView$OnClickListenerC32241eZ) this).A07.addView(r3);
            ((AbstractView$OnClickListenerC32241eZ) this).A07.setVisibility(0);
            ((AbstractView$OnClickListenerC32241eZ) this).A04.setVisibility(0);
        }
    }

    @Override // X.AbstractC63202w1, X.AbstractView$OnClickListenerC32241eZ
    public void AQv(List list) {
        this.A09.A04(list);
        super.AQv(list);
    }

    public /* synthetic */ void lambda$maybeAddMandateSection$117$IndiaUpiPaymentSettingsActivity(View view) {
        startActivity(new Intent(this, IndiaUpiMandateHistoryActivity.class));
    }

    public /* synthetic */ void lambda$setActionRequiredRowVisibility$120$IndiaUpiPaymentSettingsActivity(View view) {
        this.A01.A02();
    }

    public /* synthetic */ void lambda$updateProfileHeader$118$IndiaUpiPaymentSettingsActivity(View view) {
        Intent intent = new Intent(this, IndiaUpiSecureQrCodeDisplayActivity.class);
        String A0T = A0T();
        if (!TextUtils.isEmpty(A0T)) {
            intent.putExtra("extra_account_holder_name", A0T);
        }
        startActivity(intent);
    }

    @Override // X.AbstractView$OnClickListenerC32241eZ, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1008) {
            ((AbstractView$OnClickListenerC32241eZ) this).A0C.A00(false);
        } else if (i != 1009) {
            if (i == 1014 && i2 == -1) {
                this.A01.A01();
            }
        } else if (i2 != -1 || intent == null || intent.getIntExtra("extra_remove_payment_account", 0) < 1) {
            ((AbstractView$OnClickListenerC32241eZ) this).A0C.A00(false);
        } else if (intent.getIntExtra("extra_remove_payment_account", 0) == 2) {
            Intent intent2 = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            intent2.putExtra("extra_setup_mode", 2);
            startActivity(intent2);
        } else {
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.AbstractView$OnClickListenerC32241eZ, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C01980Ae r13 = this.A08;
        this.A02 = new C63812x3(r13);
        C63822x4.A00();
        this.A02.A00(this);
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().getBoolean("extra_send_to_upi_id", false))) {
            APm(new IndiaUpiSendPaymentToVpaDialogFragment());
        }
        A0W();
        C69383Gv r5 = new C69383Gv(((ActivityC004602e) this).A0C, ((ActivityC004702f) this).A0F, this.A04, C61202sf.A00(), ((AnonymousClass2C0) this).A01, ((AbstractView$OnClickListenerC32241eZ) this).A0L, ((ActivityC004702f) this).A0H, r13, C61942tz.A00(), ((AbstractView$OnClickListenerC32241eZ) this).A0N, AnonymousClass0GP.A00(), C61902tv.A00(), C61762th.A00(), C04570Kw.A00(), this);
        this.A01 = r5;
        r5.A06(getIntent().getStringExtra("notification-type"), "UPI", 1014);
        ImageView A0W = C28051Sr.A0W(this, 16);
        FrameLayout frameLayout = ((AbstractView$OnClickListenerC32241eZ) this).A06;
        if (frameLayout == null) {
            frameLayout = (FrameLayout) findViewById(R.id.custom_footer_container);
            ((AbstractView$OnClickListenerC32241eZ) this).A06 = frameLayout;
        }
        if (frameLayout.getChildCount() > 0) {
            ((AbstractView$OnClickListenerC32241eZ) this).A06.removeAllViews();
        }
        ((AbstractView$OnClickListenerC32241eZ) this).A06.addView(A0W);
        ((AbstractView$OnClickListenerC32241eZ) this).A06.setVisibility(0);
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        String A062 = r3.A06(R.string.payments_request_status_requested_expired);
        AnonymousClass0MC r2 = r4.A01;
        r2.A0E = A062;
        r2.A0J = false;
        r4.A04(R.string.ok, new DialogInterface$OnClickListenerC62552uy(this));
        r2.A0I = r3.A06(R.string.payments_request_status_request_expired);
        return r4.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A07.A05() != null) {
            menu.add(0, R.id.menuitem_scan_qr, 0, ((AnonymousClass2C0) this).A01.A06(R.string.menuitem_scan_qr));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AbstractView$OnClickListenerC32241eZ, X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_scan_qr) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent(this, IndiaUpiQrCodeScanActivity.class));
        return true;
    }

    @Override // X.AbstractView$OnClickListenerC32241eZ, X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A01.A05("UPI");
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        C68783En r1 = this.A09;
        r1.A00.clear();
        r1.A02.add(new WeakReference(this));
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A09.A02(this);
    }
}
