package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

public class RequestPermissionRegistrationActivity extends RequestPermissionActivity {
    public Intent A00 = new Intent();

    @Override // com.whatsapp.RequestPermissionActivity
    public void A0U(String[] strArr, boolean z) {
        super.A0U(strArr, z);
        if (!z) {
            View findViewById = findViewById(R.id.submit);
            if (findViewById != null) {
                findViewById.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, strArr, 1));
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass2C0, com.whatsapp.RequestPermissionActivity, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.cancel);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 10));
            return;
        }
        throw null;
    }
}
