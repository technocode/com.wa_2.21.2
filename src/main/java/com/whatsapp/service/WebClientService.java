package com.whatsapp.service;

import X.AbstractActivityC60812rK;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass03E;
import X.AnonymousClass0BS;
import X.AnonymousClass0E4;
import X.AnonymousClass0GC;
import X.C000300f;
import X.C015808q;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public final class WebClientService extends AnonymousClass0GC {
    public final C000300f A00 = C000300f.A00();
    public final C015808q A01 = C015808q.A00();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public WebClientService() {
        super("webclientservice", true);
        AnonymousClass00D.A00();
    }

    @Override // X.AnonymousClass0GC
    public void onCreate() {
        Log.i("webclientservice/onCreate");
        super.onCreate();
    }

    @Override // X.AnonymousClass0GC
    public void onDestroy() {
        Log.i("webclientservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("webclientservice/onStartCommand:");
        sb.append(intent);
        Log.i(sb.toString());
        AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
        A002.A0J = "other_notifications@1";
        A002.A09 = PendingIntent.getActivity(this, 0, AbstractActivityC60812rK.A04(this, this.A00, this.A01), 0);
        int i3 = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i3 = -1;
        }
        A002.A03 = i3;
        if (intent == null || !intent.getBooleanExtra("isPortal", false)) {
            AnonymousClass01X r2 = ((AnonymousClass0E4) this).A01;
            A002.A0B(r2.A06(R.string.notification_ticker_web_client));
            A002.A0A(r2.A06(R.string.notification_ticker_web_client));
            A002.A09(r2.A06(R.string.notification_text_web_client));
        } else {
            AnonymousClass01X r22 = ((AnonymousClass0E4) this).A01;
            A002.A0B(r22.A06(R.string.notification_ticker_portal_client));
            A002.A0A(r22.A06(R.string.notification_ticker_portal_client));
            A002.A09(r22.A06(R.string.notification_text_portal_client));
        }
        A002.A07.icon = R.drawable.notify_web_client_connected;
        A00(i2, 9, A002.A01());
        return 1;
    }
}
