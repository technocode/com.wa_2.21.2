package com.whatsapp.account.delete;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass04j;
import X.AnonymousClass09H;
import X.AnonymousClass0AR;
import X.AnonymousClass0HQ;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass1P2;
import X.AnonymousClass1P5;
import X.AnonymousClass1P6;
import X.AnonymousClass1P7;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C014708f;
import X.C02040Ak;
import X.C03480Gk;
import X.C41141uX;
import X.DialogInterface$OnClickListenerC27281Ox;
import X.DialogInterface$OnClickListenerC27291Oy;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.util.Log;

public class DeleteAccountConfirmation extends ActivityC004602e {
    public int A00;
    public Handler A01;
    public View A02;
    public ScrollView A03;
    public AnonymousClass1P5 A04;
    public final C03480Gk A05 = C03480Gk.A00();
    public final AnonymousClass0HQ A06 = AnonymousClass0HQ.A00();
    public final AnonymousClass04j A07 = AnonymousClass04j.A00();
    public final AnonymousClass0AR A08 = AnonymousClass0AR.A00();
    public final C02040Ak A09 = C02040Ak.A00();
    public final C014708f A0A = C014708f.A00();

    public final void A0T() {
        if (this.A03.canScrollVertically(1)) {
            this.A02.setElevation((float) this.A00);
        } else {
            this.A02.setElevation(0.0f);
        }
    }

    public void lambda$onCreate$1512$DeleteAccountConfirmation(View view) {
        if (!this.A07.A05()) {
            Log.i("deleteaccountconfirm/no-connectivity");
            C002001d.A2O(this, 2);
            return;
        }
        C002001d.A2O(this, 1);
        this.A01.sendEmptyMessageDelayed(0, 60000);
        AnonymousClass0AR r3 = this.A08;
        AnonymousClass01X r0 = ((AnonymousClass2C0) this).A01;
        String A042 = r0.A04();
        String A032 = r0.A03();
        String stringExtra = getIntent().getStringExtra("additionalComments");
        int intExtra = getIntent().getIntExtra("deleteReason", -1);
        if (r3.A04.A06) {
            Log.i("sendmethods/sendremoveaccount");
            AnonymousClass09H r32 = r3.A08;
            Message obtain = Message.obtain(null, 0, 27, 0);
            obtain.getData().putString("lg", A042);
            obtain.getData().putString("lc", A032);
            obtain.getData().putString("userFeedback", stringExtra);
            obtain.getData().putInt("deleteReason", intExtra);
            r32.A09(obtain);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A03.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1P6(this));
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = new AnonymousClass1P7(this.A0A, this);
        this.A04 = new C41141uX(this);
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        setTitle(r4.A06(R.string.settings_delete_account));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
        }
        setContentView(R.layout.delete_account_confirmation);
        this.A03 = (ScrollView) findViewById(R.id.scroll_view);
        this.A02 = findViewById(R.id.bottom_button_container);
        findViewById(R.id.delete_account_submit).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 45));
        TextView textView = (TextView) findViewById(R.id.delete_account_confirmation_info);
        String A062 = r4.A06(R.string.settings_delete_account_confirmation_info);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
        AnonymousClass0HQ r1 = this.A06;
        if (r1.A06() && this.A0J.A0D() != null && this.A09.A04()) {
            A062 = r4.A0D(R.string.settings_delete_account_confirmation_info_drive_and_payments, A062);
        } else if (r1.A06() && this.A0J.A0D() != null) {
            A062 = r4.A0D(R.string.settings_delete_account_confirmation_info_drive, A062);
        } else if (this.A09.A04()) {
            A062 = r4.A0D(R.string.settings_delete_account_confirmation_info_payments, A062);
        }
        textView.setText(A062);
        C03480Gk r0 = this.A05;
        r0.A0j.add(this.A04);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
            this.A03.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass1P2(this));
            this.A03.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1P6(this));
        }
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.delete_account_processing));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i == 2) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(this);
            AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
            r4.A01.A0E = r3.A0D(R.string.register_check_connectivity, r3.A06(R.string.connectivity_self_help_instructions));
            r4.A07(r3.A06(R.string.ok), new DialogInterface$OnClickListenerC27281Ox(this));
            return r4.A00();
        } else if (i != 3) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r32 = new AnonymousClass0MB(this);
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            r32.A01.A0E = r2.A06(R.string.delete_account_failed);
            r32.A07(r2.A06(R.string.ok), new DialogInterface$OnClickListenerC27291Oy(this));
            return r32.A00();
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C03480Gk r0 = this.A05;
        r0.A0j.remove(this.A04);
        this.A01.removeMessages(0);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C014708f r1 = this.A0A;
        int A012 = r1.A01();
        AnonymousClass008.A0t("deleteaccountconfirm/resume ", A012);
        if (!r1.A02() && A012 != 6) {
            StringBuilder sb = new StringBuilder("deleteaccountconfirm/wrong-state bounce to main ");
            sb.append(A012);
            Log.e(sb.toString());
            startActivity(new Intent(this, Main.class));
            finish();
        }
    }
}
