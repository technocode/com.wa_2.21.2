package com.whatsapp.contact.picker;

import X.AnonymousClass01I;
import X.AnonymousClass01Q;
import X.AnonymousClass03S;
import X.AnonymousClass0EO;
import X.AnonymousClass0QH;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass325;
import X.C02360Br;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public class ListMembersSelector extends AnonymousClass0QH {
    public final AnonymousClass01I A00 = AnonymousClass01I.A00();
    public final AnonymousClass03S A01 = AnonymousClass03S.A00();
    public final AnonymousClass01Q A02 = AnonymousClass01Q.A00();
    public final AnonymousClass0EO A03 = AnonymousClass0EO.A00();
    public final C02360Br A04 = C02360Br.A00();
    public final AnonymousClass325 A05 = AnonymousClass325.A00();

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
        AnonymousClass0S2 A09 = A09();
        A09.A0A(true);
        A09.A08(((AnonymousClass2C0) this).A01.A06(R.string.new_list));
        if (bundle == null && !this.A01.A03()) {
            RequestPermissionActivity.A08(this, R.string.permission_contacts_access_on_new_broadcast_request, R.string.permission_contacts_access_on_new_broadcast);
        }
    }
}
