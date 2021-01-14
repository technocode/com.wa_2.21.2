package com.whatsapp.notification;

import X.AnonymousClass00D;
import X.AnonymousClass0FE;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MessageNotificationDismissedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("notification_hash");
        AnonymousClass0FE A00 = AnonymousClass0FE.A00();
        AnonymousClass00D.A00().A00.edit().putString("notification_hash", stringExtra).apply();
        StringBuilder sb = new StringBuilder("notification/dismiss ");
        sb.append(stringExtra);
        Log.i(sb.toString());
        A00.A03();
    }
}
