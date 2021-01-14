package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import X.AnonymousClass0GC;
import X.AnonymousClass0Yz;
import X.AnonymousClass0Z0;
import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public final class VoiceFGService extends AnonymousClass0GC {
    public static volatile Notification A01;
    public final AnonymousClass0Z0 A00 = AnonymousClass0Z0.A00();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public VoiceFGService() {
        super("voicefgservice", true);
    }

    @Override // X.AnonymousClass0GC
    public void onCreate() {
        Log.i("voicefgservice/onCreate");
        super.onCreate();
    }

    @Override // X.AnonymousClass0GC
    public void onDestroy() {
        Log.i("voicefgservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("voicefgservice/onStartCommand:");
        sb.append(intent);
        Log.i(sb.toString());
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        if ("hangup_call".equals(action) || "reject_call".equals(action)) {
            AnonymousClass0Z0 r3 = this.A00;
            r3.A00.obtainMessage(1, new AnonymousClass0Yz(action, intent.getExtras(), null)).sendToTarget();
            return 2;
        } else if (!"com.whatsapp.service.VoiceFgService.START".equals(action) || A01 == null) {
            StringBuilder A0S = AnonymousClass008.A0S("voicefgservice/onStartCommand service started with unknown action:");
            A0S.append(intent.getAction());
            Log.e(A0S.toString());
            return 2;
        } else {
            if (intent.getBooleanExtra("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", false)) {
                stopForeground(true);
            }
            A00(i2, intent.getIntExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23), A01);
            return 2;
        }
    }
}
