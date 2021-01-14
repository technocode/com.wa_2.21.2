package com.whatsapp.group;

import X.AnonymousClass02U;
import X.AnonymousClass03S;
import X.AnonymousClass0QH;
import X.AnonymousClass2C0;
import X.AnonymousClass325;
import X.C002001d;
import X.C006903j;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public class GroupMembersSelector extends AnonymousClass0QH {
    public final AnonymousClass03S A00 = AnonymousClass03S.A00();
    public final C006903j A01 = C006903j.A00();
    public final AnonymousClass325 A02 = AnonymousClass325.A00();

    @Override // X.AnonymousClass0QH
    public void A0g(int i) {
        if (i <= 0) {
            A09().A07(((AnonymousClass2C0) this).A01.A06(R.string.add_paticipants));
        } else {
            super.A0g(i);
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 != -1) {
                Log.i("groupmembersselector/permissions denied");
                finish();
            }
        } else if (i2 == -1) {
            if (intent != null) {
                AnonymousClass02U A03 = AnonymousClass02U.A03(intent.getStringExtra("group_jid"));
                if (A03 != null) {
                    Bundle bundleExtra = intent.getBundleExtra("invite_bundle");
                    StringBuilder sb = new StringBuilder("groupmembersselector/group created ");
                    sb.append(A03);
                    Log.i(sb.toString());
                    if (this.A01.A0C(A03) && !C002001d.A3D(this)) {
                        StringBuilder sb2 = new StringBuilder("groupmembersselector/opening conversation");
                        sb2.append(A03);
                        Log.i(sb2.toString());
                        Intent A05 = Conversation.A05(this, A03);
                        if (bundleExtra != null) {
                            A05.putExtra("invite_bundle", bundleExtra);
                        }
                        startActivity(A05);
                        finish();
                        return;
                    }
                } else {
                    throw null;
                }
            }
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0QH, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && !this.A00.A03()) {
            RequestPermissionActivity.A08(this, R.string.permission_contacts_access_on_new_group_request, R.string.permission_contacts_access_on_new_group);
        }
    }
}
