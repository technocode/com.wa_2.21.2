package com.whatsapp.instrumentation.service;

import X.AnonymousClass01X;
import X.AnonymousClass03E;
import X.AnonymousClass0BS;
import X.AnonymousClass0E4;
import X.AnonymousClass0GC;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

public class InstrumentationFGService extends AnonymousClass0GC {
    public Handler A00 = new Handler();
    public Runnable A01 = new RunnableEBaseShape10S0100000_I1_5(this, 32);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public InstrumentationFGService() {
        super("instrumentationfgservice", true);
    }

    @Override // X.AnonymousClass0GC
    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("instrumentationfgservice/onStartCommand:");
        sb.append(intent);
        sb.append(" startId:");
        sb.append(i2);
        Log.i(sb.toString());
        AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
        A002.A0J = "other_notifications@1";
        AnonymousClass01X r2 = ((AnonymousClass0E4) this).A01;
        A002.A0B(r2.A06(R.string.localized_app_name));
        A002.A0A(r2.A06(R.string.localized_app_name));
        A002.A09(r2.A06(R.string.notification_text_instrumentation_fg));
        A002.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
        int i3 = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i3 = -1;
        }
        A002.A03 = i3;
        A002.A07.icon = R.drawable.notifybar;
        A00(i2, 25, A002.A01());
        this.A00.removeCallbacks(this.A01);
        this.A00.postDelayed(this.A01, 5000);
        return 2;
    }
}
