package com.whatsapp.notification;

import X.AnonymousClass0L1;
import X.C014508d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MissedCallNotificationDismissedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C014508d A00 = C014508d.A00();
        AnonymousClass0L1 A002 = AnonymousClass0L1.A00();
        Log.i("missedcallnotification/dismiss");
        A00.A05();
        if (A00.A01) {
            A002.A02();
        }
    }
}
