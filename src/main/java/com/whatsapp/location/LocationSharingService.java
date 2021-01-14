package com.whatsapp.location;

import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass01S;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03E;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass0AV;
import X.AnonymousClass0AX;
import X.AnonymousClass0BS;
import X.AnonymousClass0C1;
import X.AnonymousClass0E4;
import X.AnonymousClass0E5;
import X.AnonymousClass0XZ;
import X.C002001d;
import X.C004302a;
import X.C02760Di;
import X.C02770Dj;
import X.C02900Dx;
import X.C49802Sf;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.LiveLocationPrivacyActivity;
import com.whatsapp.util.Log;

public class LocationSharingService extends AnonymousClass0E4 implements AnonymousClass0E5 {
    public static volatile boolean A0C;
    public long A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass00S A02 = AnonymousClass00S.A00();
    public final AnonymousClass03S A03 = AnonymousClass03S.A00();
    public final AnonymousClass01S A04 = AnonymousClass01S.A00();
    public final AnonymousClass0XZ A05 = AnonymousClass0XZ.A00();
    public final C49802Sf A06 = new C49802Sf(AnonymousClass03P.A00(), AnonymousClass00D.A00(), AnonymousClass0AV.A00(), AnonymousClass0C1.A01(), AnonymousClass0AX.A00(), this);
    public final C02760Di A07 = C02760Di.A00();
    public final Runnable A08 = new RunnableEBaseShape3S0100000_I0_3(this, 10);
    public final Runnable A09 = new RunnableEBaseShape3S0100000_I0_3(this, 11);
    public volatile boolean A0A;
    public volatile boolean A0B;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void A00(Context context) {
        Log.d("LocationSharingService/stop-location-reporting");
        C004302a.A06(context, new Intent(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING"));
    }

    public static void A01(Context context, long j) {
        StringBuilder sb = new StringBuilder("LocationSharingService/start-location-updates for ");
        sb.append(j);
        Log.d(sb.toString());
        C004302a.A06(context, new Intent(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.ACTION_START_LOCATION_UPDATES_FOR_WEB").putExtra("duration", j));
    }

    public static void A02(Context context, AnonymousClass01S r3) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (r3.A0c()) {
            Log.d("LocationSharingService/start-location-updates persistent");
            C004302a.A06(context, new Intent(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_PERSISTENT_LOCATION_REPORTING"));
        } else if (A0C) {
            A00(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r3.A04.A0c() == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r3 = this;
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0016
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0016
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x004a
            X.01S r0 = r3.A04
            boolean r0 = r0.A0c()
            if (r0 == 0) goto L_0x004a
        L_0x0016:
            java.lang.String r0 = "LocationSharingService/stopSelfIfNeeded/service not stopped: "
            java.lang.StringBuilder r2 = X.AnonymousClass008.A0S(r0)
            boolean r0 = r3.A0A
            r2.append(r0)
            java.lang.String r1 = "|"
            r2.append(r1)
            boolean r0 = r3.A0B
            r2.append(r0)
            r2.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x003e
            X.01S r0 = r3.A04
            boolean r1 = r0.A0c()
            r0 = 1
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i(r0)
            return
        L_0x004a:
            r3.stopSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.A03():void");
    }

    @Override // X.AnonymousClass0E5
    public void AHL(Location location) {
        if (this.A0B) {
            this.A04.A0O(location);
            AnonymousClass0XZ r6 = this.A05;
            C02770Dj r1 = r6.A03;
            C02900Dx A052 = r1.A05(location);
            r6.A05.A09(A052.A06, r1.A04(A052, null), (r6.A00.A05() - A052.A05) / 1000);
        }
        long A053 = this.A02.A05();
        long j = this.A00;
        if (A053 > j) {
            AnonymousClass008.A1P(AnonymousClass008.A0S("LocationSharingService/onLocationUpdate/stop this service since passed maxEndTime; maxEndTime="), j);
            this.A0A = false;
            A03();
            return;
        }
        AnonymousClass01S r12 = this.A04;
        if (!r12.A0c()) {
            Log.i("LocationSharingService/onLocationUpdate/stop this service, no longer sharing live location");
            this.A0A = false;
            A03();
        } else if (this.A0A) {
            r12.A0O(location);
            if (!r12.A0d()) {
                r12.A0J();
            }
        }
    }

    public void onCreate() {
        Log.i("LocationSharingService/onCreate");
        super.onCreate();
        C49802Sf r9 = this.A06;
        try {
            PowerManager A0C2 = r9.A08.A0C();
            if (A0C2 == null) {
                Log.w("MyLocationUpdater/onCreate pm=null");
            } else {
                PowerManager.WakeLock wakeLock = r9.A03;
                if (wakeLock == null) {
                    wakeLock = C002001d.A0f(A0C2, 1, "ShareLocationService");
                    r9.A03 = wakeLock;
                }
                if (wakeLock != null && !wakeLock.isHeld()) {
                    r9.A03.acquire(5000);
                }
            }
        } catch (RuntimeException e) {
            Log.e("MyLocationUpdater/onCreate/PowerManager exception", e);
        }
        String string = r9.A09.A00.getString("location_shared_duration", "");
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(";")) {
                String[] split = str.split(",");
                if (split.length == 2) {
                    int intValue = Integer.valueOf(split[0]).intValue();
                    if ((((long) intValue) * 1000) + 86400000 >= currentTimeMillis) {
                        r9.A04.put(intValue, Integer.valueOf(split[1]).intValue());
                    }
                }
            }
        }
        this.A01.postDelayed(this.A08, 42000);
    }

    public void onDestroy() {
        Log.i("LocationSharingService/onDestroy");
        AnonymousClass01S r0 = this.A04;
        synchronized (r0.A0Q) {
            r0.A00 = 0;
        }
        stopForeground(true);
        A0C = false;
        Handler handler = this.A01;
        handler.removeCallbacks(this.A08);
        handler.removeCallbacks(this.A09);
        C49802Sf r1 = this.A06;
        r1.A06.A06(r1);
        r1.A00();
        PowerManager.WakeLock wakeLock = r1.A03;
        if (wakeLock != null && wakeLock.isHeld()) {
            r1.A03.release();
            r1.A03 = null;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("LocationSharingService/onStartCommand intent=");
        sb.append(intent);
        sb.append(" permission=");
        AnonymousClass03S r6 = this.A03;
        sb.append(r6.A04());
        Log.i(sb.toString());
        AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
        A002.A0J = "other_notifications@1";
        AnonymousClass01X r4 = super.A01;
        A002.A0B(r4.A06(R.string.notification_ticker_live_location_fg));
        A002.A0A(r4.A06(R.string.notification_ticker_live_location_fg));
        A002.A09 = PendingIntent.getActivity(this, 0, new Intent(this, LiveLocationPrivacyActivity.class), 0);
        int i3 = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i3 = -1;
        }
        A002.A03 = i3;
        if (r6.A04()) {
            A002.A09(r4.A06(R.string.notification_text_live_location_fg));
            A002.A07.icon = R.drawable.notify_live_location;
        } else {
            A002.A09(r4.A06(R.string.live_location_fix_location_update));
            A002.A07.icon = R.drawable.notifybar_error;
        }
        startForeground(12, A002.A01());
        A0C = true;
        if (intent != null) {
            if ("com.whatsapp.ShareLocationService.ACTION_SEND_LOCATION_WEB_RESPONSE".equals(intent.getAction())) {
                C02760Di r5 = this.A07;
                String stringExtra = intent.getStringExtra("id");
                AnonymousClass02N A012 = AnonymousClass02N.A01(intent.getStringExtra("chatJid"));
                if (A012 != null) {
                    r5.A04(stringExtra, A012, intent.getLongExtra("duration", -1), true);
                    A03();
                    return 1;
                }
                throw null;
            } else if ("com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING".equals(intent.getAction())) {
                this.A0A = false;
                A03();
                return 1;
            }
        }
        long j = 42000;
        if (intent != null) {
            if ("com.whatsapp.ShareLocationService.ACTION_START_LOCATION_UPDATES_FOR_WEB".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("duration", 42000);
                Handler handler = this.A01;
                Runnable runnable = this.A09;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, longExtra);
                this.A0B = true;
                AnonymousClass008.A10("LocationSharingService/onStartCommand/start location updates; duration=", longExtra);
                this.A06.A01("web-client-updates");
                return 1;
            } else if ("com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB".equals(intent.getAction())) {
                Log.i("LocationSharingService/onStartCommand/stop location updates");
                this.A0B = false;
                A03();
                return 1;
            } else {
                j = intent.getLongExtra("duration", 42000);
            }
        }
        Handler handler2 = this.A01;
        Runnable runnable2 = this.A08;
        handler2.removeCallbacks(runnable2);
        handler2.postDelayed(runnable2, j);
        this.A00 = this.A02.A05() + j;
        this.A0A = true;
        AnonymousClass008.A1P(AnonymousClass008.A0V("LocationSharingService/onStartCommand/start; duration=", j, "; maxEndTime="), this.A00);
        this.A06.A01("location-sharing-service");
        return 1;
    }
}
