package com.whatsapp.service;

import X.AnonymousClass01X;
import X.AnonymousClass03E;
import X.AnonymousClass0BS;
import X.AnonymousClass0E4;
import X.AnonymousClass0GC;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

public final class GcmFGService extends AnonymousClass0GC {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public GcmFGService() {
        super("gcmfgservice", false);
    }

    @Override // X.AnonymousClass0GC
    public void onCreate() {
        Log.i("gcmfgservice/onCreate");
        super.onCreate();
    }

    @Override // X.AnonymousClass0GC
    public void onDestroy() {
        Log.i("gcmfgservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("gcmfgservice/onStartCommand:");
        sb.append(intent);
        sb.append(" startId:");
        sb.append(i2);
        Log.i(sb.toString());
        AnonymousClass03E A00 = AnonymousClass0BS.A00(this);
        A00.A0J = "other_notifications@1";
        AnonymousClass01X r2 = ((AnonymousClass0E4) this).A01;
        A00.A0B(r2.A06(R.string.localized_app_name));
        A00.A0A(r2.A06(R.string.localized_app_name));
        A00.A09(r2.A06(R.string.notification_text_gcm_fg));
        A00.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = -2;
        if (i3 >= 26) {
            i4 = -1;
        }
        A00.A03 = i4;
        if (i3 != 24) {
            A00.A07.icon = R.drawable.notifybar;
        }
        Notification A01 = A00.A01();
        if (i3 == 24) {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, A01);
            recoverBuilder.setSmallIcon(Icon.createWithBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.notifybar)));
            A00(i2, 210204511, recoverBuilder.build());
            return 1;
        }
        A00(i2, 11, A01);
        return 1;
    }
}
