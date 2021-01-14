package com.whatsapp;

import X.AnonymousClass0PF;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

public class AlarmBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent(intent).setClass(context, AlarmService.class);
        StringBuilder sb = new StringBuilder("AlarmBroadcastReceiver dispatching to AlarmService; intent=");
        sb.append(intent);
        sb.append("; elapsedRealtime=");
        sb.append(SystemClock.elapsedRealtime());
        Log.i(sb.toString());
        AnonymousClass0PF.A01(context, AlarmService.class, 3, intent2);
    }
}
