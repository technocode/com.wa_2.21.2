package com.whatsapp;

import X.AnonymousClass2Cc;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;

public class BusinessProfileEducation extends AnonymousClass2Cc {
    public /* synthetic */ void lambda$setupActivity$928$BusinessProfileEducation(View view) {
        onBackPressed();
        A0U(3, 11, true);
    }

    public /* synthetic */ void lambda$setupActivity$929$BusinessProfileEducation(View view) {
        startActivity(A0T("smb_cs_profile"));
        A0U(2, 11, true);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.business_profile_education);
        findViewById(R.id.close).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 11));
        findViewById(R.id.upsell_button).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 10));
        A0U(1, 11, true);
    }
}
