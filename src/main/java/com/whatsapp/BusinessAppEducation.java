package com.whatsapp;

import X.AnonymousClass2Cc;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;

public class BusinessAppEducation extends AnonymousClass2Cc {
    public /* synthetic */ void lambda$setupActivity$926$BusinessAppEducation(View view) {
        onBackPressed();
        A0U(3, 12, false);
    }

    public /* synthetic */ void lambda$setupActivity$927$BusinessAppEducation(View view) {
        startActivity(A0T("smb_cs_chats_banner"));
        A0U(2, 12, false);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.business_app_education);
        findViewById(R.id.close).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 8));
        findViewById(R.id.install_smb_google_play).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 9));
        A0U(1, 12, false);
    }
}
