package com.whatsapp.voipcalling;

import X.AbstractC673938k;
import X.AnonymousClass0GZ;
import X.AnonymousClass0TX;
import X.AnonymousClass2C0;
import X.AnonymousClass3T8;
import X.C004302a;
import X.C674038l;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;

public class VoipAppUpdateActivity extends AnonymousClass2C0 {
    public AbstractC673938k A00 = new AnonymousClass3T8(this);
    public final AnonymousClass0GZ A01 = AnonymousClass0GZ.A00();
    public final C674038l A02 = C674038l.A01;

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(C004302a.A00(this, R.color.popup_dim)));
        getWindow().addFlags(2621440);
        setContentView(R.layout.voip_app_update_dialog);
        AnonymousClass0TX.A0A(this, R.id.cancel).setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 24));
        AnonymousClass0TX.A0A(this, R.id.upgrade).setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 25));
        C674038l r0 = this.A02;
        r0.A00.add(this.A00);
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C674038l r0 = this.A02;
        r0.A00.remove(this.A00);
    }
}
