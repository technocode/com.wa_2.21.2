package com.whatsapp;

import X.AbstractC000400g;
import X.AnonymousClass00Y;
import X.C000300f;
import X.C003701u;
import X.C43941zF;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class TellAFriendReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 22) {
            String packageName = ((ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")).getPackageName();
            if (!C003701u.A0E(packageName)) {
                AnonymousClass00Y A00 = AnonymousClass00Y.A00();
                if (C000300f.A00().A0D(AbstractC000400g.A1G)) {
                    C43941zF r2 = new C43941zF();
                    r2.A00 = 2;
                    r2.A01 = Integer.valueOf(intent.getIntExtra("extra_invite_source", 0));
                    r2.A02 = packageName;
                    A00.A0B(r2, null, false);
                }
            }
        }
    }
}
