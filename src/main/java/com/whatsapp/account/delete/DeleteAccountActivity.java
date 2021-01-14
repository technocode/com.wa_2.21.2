package com.whatsapp.account.delete;

import X.ActivityC004602e;
import X.AnonymousClass01X;
import X.AnonymousClass0HQ;
import X.AnonymousClass0S2;
import X.AnonymousClass1MS;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C004302a;
import X.C02040Ak;
import X.C06470Tj;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.MatchPhoneNumberFragment;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

public class DeleteAccountActivity extends ActivityC004602e implements AnonymousClass1MS {
    public final AnonymousClass0HQ A00 = AnonymousClass0HQ.A00();
    public final C02040Ak A01 = C02040Ak.A00();

    @Override // X.AnonymousClass1MS
    public void AHV() {
        A0I(new Intent(this, DeleteAccountFeedback.class), true);
    }

    @Override // X.AnonymousClass1MS
    public void AHo() {
        APo(R.string.delete_account_mismatch);
    }

    public /* synthetic */ void lambda$onCreate$1511$DeleteAccountActivity(View view) {
        Log.i("delete-account/changenumber");
        startActivity(new Intent(this, ChangeNumberOverview.class));
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.delete_account);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        setTitle(r3.A06(R.string.settings_delete_account));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
        }
        ImageView imageView = (ImageView) findViewById(R.id.change_number_icon);
        imageView.setImageDrawable(new C06470Tj(r3, C004302a.A03(this, R.drawable.ic_settings_change_number)));
        C002001d.A2m(imageView, C002001d.A06(this, R.attr.settingsIconColor, R.color.settings_icon));
        ((TextView) findViewById(R.id.delete_account_instructions)).setText(r3.A06(R.string.delete_account_instructions));
        findViewById(R.id.delete_account_change_number_option).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 44));
        if (!this.A00.A06() || this.A0J.A0D() == null) {
            findViewById(R.id.delete_gdrive_account_warning).setVisibility(8);
        }
        if (!this.A01.A04()) {
            findViewById(R.id.delete_payments_account_warning).setVisibility(8);
        }
        MatchPhoneNumberFragment matchPhoneNumberFragment = (MatchPhoneNumberFragment) A04().A06(R.id.delete_account_match_phone_number_fragment);
        if (matchPhoneNumberFragment != null) {
            findViewById(R.id.delete_account_submit).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(matchPhoneNumberFragment));
            return;
        }
        throw null;
    }
}
