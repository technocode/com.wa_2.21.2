package com.whatsapp.payments.ui;

import X.ActivityC004602e;
import X.AnonymousClass0GZ;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;

public class PaymentsUpdateRequiredActivity extends ActivityC004602e {
    public View A00;
    public final AnonymousClass0GZ A01 = AnonymousClass0GZ.A00();

    public /* synthetic */ void lambda$onCreate$108$PaymentsUpdateRequiredActivity(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(this.A01.A01());
        startActivity(intent);
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.A00;
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(((AnonymousClass2C0) this).A01.A06(R.string.software_about_to_expire_title));
            A09.A0A(true);
        }
        setContentView(R.layout.payment_update_required);
        findViewById(R.id.upgrade_button).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 36));
        this.A00 = findViewById(R.id.update_icon);
    }
}
