package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass0KP;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0S2;
import X.AnonymousClass1JD;
import X.AnonymousClass1JE;
import X.AnonymousClass2C0;
import X.AnonymousClass325;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C02780Dk;
import X.C06210Sf;
import X.C06470Tj;
import X.C39451rY;
import X.C40461tJ;
import X.DialogInterface$OnClickListenerC14350m7;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class SettingsHelp extends ActivityC004602e {
    public final C02780Dk A00 = C02780Dk.A02();
    public final C06210Sf A01 = C06210Sf.A00();
    public final AnonymousClass04j A02 = AnonymousClass04j.A00();
    public final AnonymousClass03P A03 = AnonymousClass03P.A00();
    public final AnonymousClass03S A04 = AnonymousClass03S.A00();
    public final AnonymousClass00D A05 = AnonymousClass00D.A00();
    public final AnonymousClass0M9 A06 = AnonymousClass0M9.A01();
    public final AnonymousClass0KP A07 = AnonymousClass0KP.A00();
    public final AnonymousClass325 A08 = AnonymousClass325.A00();
    public final AnonymousClass00T A09 = C002101e.A00();

    public /* synthetic */ void lambda$onCreate$1381$SettingsHelp(View view) {
        this.A00.A05(this, new Intent("android.intent.action.VIEW", this.A06.A03("android", null, null)));
    }

    public /* synthetic */ void lambda$onCreate$1382$SettingsHelp(View view) {
        String A0K;
        AnonymousClass04j r6 = this.A02;
        if (!r6.A05()) {
            Log.i("about/no-connectivity");
            C002001d.A2O(this, 102);
            return;
        }
        String string = this.A05.A00.getString("change_number_new_number_banned", null);
        if (string == null) {
            A0K = "settings/about";
        } else {
            A0K = AnonymousClass008.A0K("settings/about/chnum ", string);
        }
        this.A09.ANC(new C39451rY(this, this.A03, ((AnonymousClass2C0) this).A01, r6, this.A04, this.A07, false, true, false, A0K, null), new String[0]);
    }

    public /* synthetic */ void lambda$onCreate$1383$SettingsHelp(View view) {
        this.A00.A05(this, new Intent("android.intent.action.VIEW", this.A01.A01("https://www.whatsapp.com/legal/")));
    }

    public /* synthetic */ void lambda$onCreate$1384$SettingsHelp(View view) {
        startActivity(new Intent(this, About.class));
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (C002001d.A3C() && i == 17 && i2 == -1 && intent != null && intent.getIntExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", -1) == 1) {
            new AlertDialog.Builder(this).setMessage(getString(R.string.chat_support_dialog_message)).setCancelable(true).setPositiveButton(getString(R.string.ok), DialogInterface$OnClickListenerC14350m7.A00).create().show();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        setTitle(r6.A06(R.string.settings_help));
        setContentView(R.layout.preferences_help);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            View findViewById = findViewById(R.id.faq_preference);
            View findViewById2 = findViewById(R.id.contact_us_preference);
            View findViewById3 = findViewById(R.id.terms_and_privacy_preference);
            View findViewById4 = findViewById(R.id.about_preference);
            int A062 = C002001d.A06(this, R.attr.settingsIconColor, R.color.settings_icon);
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.settings_row_icon);
            imageView.setImageDrawable(new C40461tJ(r6, C004302a.A03(this, R.drawable.ic_settings_help)));
            C002001d.A2m(imageView, A062);
            C002001d.A2m((ImageView) findViewById2.findViewById(R.id.settings_row_icon), A062);
            ImageView imageView2 = (ImageView) findViewById3.findViewById(R.id.settings_row_icon);
            imageView2.setImageDrawable(new C06470Tj(r6, C004302a.A03(this, R.drawable.ic_settings_terms_policy)));
            C002001d.A2m(imageView2, A062);
            C002001d.A2m((ImageView) findViewById4.findViewById(R.id.settings_row_icon), A062);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 49));
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 2));
            ((TextView) findViewById3.findViewById(R.id.settings_row_text)).setText(r6.A06(R.string.settings_terms_and_privacy_policy));
            findViewById3.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 0));
            findViewById4.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 1));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 102) {
            AnonymousClass0MB r5 = new AnonymousClass0MB(this);
            AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
            String A062 = r4.A06(R.string.no_internet_title);
            AnonymousClass0MC r3 = r5.A01;
            r3.A0I = A062;
            r3.A0E = r4.A0D(R.string.register_no_internet_connectivity, r4.A06(R.string.connectivity_self_help_instructions));
            r5.A07(r4.A06(R.string.ok), new AnonymousClass1JE(this));
            return r5.A00();
        } else if (i == 122) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.register_connecting));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 123) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r32 = new AnonymousClass0MB(this);
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            r32.A01.A0E = r2.A06(R.string.settings_network_service_unavailable);
            r32.A07(r2.A06(R.string.ok_short), new AnonymousClass1JD(this));
            return r32.A00();
        }
    }
}
