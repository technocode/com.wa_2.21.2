package com.whatsapp.schedulers.alarm;

import X.AnonymousClass0PF;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SchedulerExperimentAlarmReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        AnonymousClass0PF.A01(context, SchedulerExperimentAlarmService.class, 10, intent);
    }
}
