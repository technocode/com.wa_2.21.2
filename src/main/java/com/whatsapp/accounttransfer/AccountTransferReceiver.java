package com.whatsapp.accounttransfer;

import X.AbstractC000400g;
import X.AnonymousClass00T;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C003701u;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

public class AccountTransferReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        AnonymousClass00T A00 = C002101e.A00();
        C000300f A002 = C000300f.A00();
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder("AccountTransferReceiver/onReceive/action=");
        sb.append(action);
        Log.i(sb.toString());
        if (C003701u.A0E(action)) {
            Log.i("AccountTransferReceiver/onReceive/action is empty");
        } else if (!A002.A0D(AbstractC000400g.A0M) || Build.VERSION.SDK_INT < 23 || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || !keyguardManager.isDeviceSecure() || !C002001d.A3F(context)) {
            Log.i("AccountTransferReceiver/onReceive/disabled");
        } else if (action.equals("com.google.android.gms.auth.START_ACCOUNT_EXPORT")) {
            A00.ANF(new RunnableEBaseShape6S0200000_I1_1(context, A002, 15));
        }
    }
}
