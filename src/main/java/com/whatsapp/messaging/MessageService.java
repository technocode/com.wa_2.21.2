package com.whatsapp.messaging;

import X.AnonymousClass02M;
import X.AnonymousClass03B;
import X.AnonymousClass0E4;
import X.C03350Fv;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessageService extends AnonymousClass0E4 {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final AnonymousClass03B A01 = AnonymousClass03B.A00();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void A00(Context context) {
        try {
            context.startService(new Intent(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
            Log.i("messageservice/startService success");
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 26) {
                Log.d("messageservice/startService failed", e);
                return;
            }
            throw e;
        }
    }

    public static void A01(Context context, C03350Fv r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                context.startService(new Intent(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
                Log.i("messageservice/startOnForeground success");
            } catch (Exception e) {
                Log.e("messageservice/startOnForeground failed", e);
                r3.A01();
            }
        }
    }

    public void onCreate() {
        Log.i("messageservice/onCreate");
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26 && this.A00 == null) {
            throw null;
        }
    }

    public void onDestroy() {
        Log.i("messageservice/onDestroy");
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 26 && this.A00 == null) {
            throw null;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        if (AnonymousClass03B.A01()) {
            Log.d("messageservice/unsupported");
            return 1;
        }
        if (intent == null || (action = intent.getAction()) == null || action.equals("com.whatsapp.messaging.MessageService.START")) {
            Log.d("messageservice/start");
        }
        return 1;
    }
}
