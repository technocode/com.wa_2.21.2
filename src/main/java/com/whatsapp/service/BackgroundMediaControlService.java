package com.whatsapp.service;

import X.AnonymousClass0E4;
import X.C28301Tu;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class BackgroundMediaControlService extends AnonymousClass0E4 {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        C28301Tu r0;
        if (intent == null || (action = intent.getAction()) == null) {
            Log.d("backgroundmediacontrol/null?");
        } else if (action.equals("com.whatsapp.service.BackgroundMediaControlService.STOP")) {
            Log.d("stopping background media");
            C28301Tu.A03();
        } else if (action.equals("com.whatsapp.service.BackgroundMediaControlService.START") && (r0 = C28301Tu.A0i) != null) {
            r0.A0B();
        }
        stopSelf();
        return 2;
    }
}
