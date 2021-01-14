package com.whatsapp.conversationslist;

import X.ActivityC004602e;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass2C0;
import X.AnonymousClass2JU;
import X.AnonymousClass2JV;
import X.AnonymousClass2JW;
import X.AnonymousClass2JX;
import X.AnonymousClass2JY;
import X.AnonymousClass2JZ;
import X.C002001d;
import X.C09040cC;
import X.DialogInterface$OnCancelListenerC47652Ja;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

public class SmsDefaultAppWarning extends ActivityC004602e {
    public final C09040cC A00 = C09040cC.A00();

    public final void A0T() {
        this.A00.A01(this, getIntent().getData(), ((AnonymousClass2C0) this).A01.A0D(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/"), 17);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        ActivityInfo activityInfo;
        super.onCreate(bundle);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(getIntent().getData());
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !"com.whatsapp".equals(activityInfo.packageName)) {
            C002001d.A2O(this, 1);
        } else {
            C002001d.A2O(this, 0);
        }
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(this);
            AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
            String A06 = r3.A06(R.string.warning_sms_default_app);
            AnonymousClass0MC r2 = r4.A01;
            r2.A0E = A06;
            r4.A06(r3.A06(R.string.sms_invite), new AnonymousClass2JU(this));
            r4.A05(r3.A06(R.string.sms_reset), new AnonymousClass2JX(this));
            r4.A07(r3.A06(R.string.sms_sms), new AnonymousClass2JV(this));
            r2.A02 = new DialogInterface$OnCancelListenerC47652Ja(this);
            return r4.A00();
        } else if (i != 1) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r42 = new AnonymousClass0MB(this);
            AnonymousClass01X r32 = ((AnonymousClass2C0) this).A01;
            String A062 = r32.A06(R.string.warning_sms);
            AnonymousClass0MC r22 = r42.A01;
            r22.A0E = A062;
            r42.A06(r32.A06(R.string.sms_invite), new AnonymousClass2JZ(this));
            r42.A07(r32.A06(R.string.sms_sms), new AnonymousClass2JW(this));
            r22.A02 = new AnonymousClass2JY(this);
            return r42.A00();
        }
    }
}
