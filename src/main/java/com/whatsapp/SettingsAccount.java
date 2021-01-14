package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.account.delete.DeleteAccountActivity;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;

public class SettingsAccount extends ActivityC004602e {
    public /* synthetic */ void lambda$onCreate$1340$SettingsAccount(View view) {
        startActivity(new Intent(this, SettingsPrivacy.class));
    }

    public /* synthetic */ void lambda$onCreate$1341$SettingsAccount(View view) {
        startActivity(new Intent(this, SettingsSecurity.class));
    }

    public /* synthetic */ void lambda$onCreate$1342$SettingsAccount(View view) {
        startActivity(new Intent(this, SettingsTwoFactorAuthActivity.class));
    }

    public /* synthetic */ void lambda$onCreate$1343$SettingsAccount(View view) {
        startActivity(new Intent(this, ChangeNumberOverview.class));
    }

    public /* synthetic */ void lambda$onCreate$1344$SettingsAccount(View view) {
        startActivity(new Intent(this, DeleteAccountActivity.class));
    }

    public /* synthetic */ void lambda$onCreate$1345$SettingsAccount(View view) {
        startActivity(new Intent(this, GdprReportActivity.class));
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.settings_account_info));
        setContentView(R.layout.preferences_account);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            findViewById(R.id.privacy_preference).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 39));
            findViewById(R.id.security_preference).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 43));
            findViewById(R.id.two_step_verification_preference).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 41));
            findViewById(R.id.change_number_preference).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 42));
            findViewById(R.id.delete_account_preference).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 40));
            findViewById(R.id.request_account_info_preference).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 38));
            return;
        }
        throw null;
    }
}
