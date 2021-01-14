package com.whatsapp.registration;

import X.AnonymousClass03S;
import X.AnonymousClass0QH;
import X.AnonymousClass2C0;
import X.AnonymousClass325;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public class NotifyContactsSelector extends AnonymousClass0QH {
    public final AnonymousClass03S A00 = AnonymousClass03S.A00();
    public final AnonymousClass325 A01 = AnonymousClass325.A00();

    @Override // X.AnonymousClass0QH
    public void A0g(int i) {
        if (i <= 0) {
            A09().A07(((AnonymousClass2C0) this).A01.A06(R.string.add_contacts_to_notify_change_number));
        } else {
            super.A0g(i);
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("listmembersselector/permissions denied");
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0QH, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && !this.A00.A03()) {
            RequestPermissionActivity.A08(this, R.string.permission_contacts_access_on_notify_contacts_change_number_request, R.string.permission_contacts_access_on_notify_contacts_change_number);
        }
    }
}
