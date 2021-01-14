package com.whatsapp.service;

import X.AbstractActivityC60812rK;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass03E;
import X.AnonymousClass0BS;
import X.AnonymousClass0C5;
import X.AnonymousClass0E4;
import X.AnonymousClass0EI;
import X.AnonymousClass0GC;
import X.AnonymousClass31G;
import X.C000300f;
import X.C002101e;
import X.C015808q;
import X.C03130Ex;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public final class MDSyncService extends AnonymousClass0GC {
    public int A00;
    public AnonymousClass31G A01;
    public boolean A02;
    public final C000300f A03 = C000300f.A00();
    public final AnonymousClass00G A04 = AnonymousClass00G.A01;
    public final C03130Ex A05 = C03130Ex.A00();
    public final C015808q A06 = C015808q.A00();
    public final AnonymousClass0EI A07 = AnonymousClass0EI.A00();
    public final AnonymousClass0C5 A08 = AnonymousClass0C5.A00();
    public final AnonymousClass00T A09 = C002101e.A00();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public MDSyncService() {
        super("md-sync-service", true);
    }

    @Override // X.AnonymousClass0GC
    public void onCreate() {
        Log.i("md-sync-service/onCreate");
        super.onCreate();
    }

    @Override // X.AnonymousClass0GC
    public void onDestroy() {
        Log.i("md-sync-service/onDestroy");
        AnonymousClass31G r2 = this.A01;
        if (r2 != null) {
            synchronized (r2) {
                r2.A04.set(true);
            }
            this.A01 = null;
        }
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("md-sync-service/onStartCommand:");
        sb.append(intent);
        Log.i(sb.toString());
        AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
        A002.A0J = "other_notifications@1";
        A002.A09 = PendingIntent.getActivity(this, 0, AbstractActivityC60812rK.A04(this, this.A03, this.A06), 0);
        int i3 = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i3 = -1;
        }
        A002.A03 = i3;
        AnonymousClass01X r3 = ((AnonymousClass0E4) this).A01;
        A002.A0B(r3.A06(R.string.notification_ticker_companion_client));
        A002.A0A(r3.A06(R.string.notification_ticker_companion_client));
        A002.A09(r3.A06(R.string.notification_text_companion_client));
        A002.A07.icon = R.drawable.notify_web_client_connected;
        A00(i2, 210204524, A002.A01());
        if (intent != null) {
            if ("com.whatsapp.service.MDSyncService.STOP_HISTORY_SYNC".equals(intent.getAction())) {
                this.A02 = false;
            } else if ("com.whatsapp.service.MDSyncService.START_HISTORY_SYNC".equals(intent.getAction())) {
                if (this.A01 == null) {
                    this.A02 = true;
                    AnonymousClass31G r1 = new AnonymousClass31G(this.A04, this.A08, this.A07, this.A05);
                    this.A01 = r1;
                    this.A09.ANF(r1);
                }
            } else if ("com.whatsapp.service.MDSyncService.RMR_STARTED".equals(intent.getAction())) {
                this.A00++;
            } else if ("com.whatsapp.service.MDSyncService.RMR_COMPLETED".equals(intent.getAction())) {
                this.A00--;
            }
        }
        if (!this.A02 && this.A00 <= 0) {
            this.A08.A02(this.A04.A00, MDSyncService.class);
        }
        return 1;
    }
}
