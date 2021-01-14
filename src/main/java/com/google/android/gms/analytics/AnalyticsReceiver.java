package com.google.android.gms.analytics;

import X.AnonymousClass1AE;
import X.AnonymousClass1AF;
import X.AnonymousClass26U;
import X.C008805h;
import X.C239818i;
import X.C240318p;
import X.C242819u;
import X.C24571Bm;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class AnalyticsReceiver extends BroadcastReceiver {
    public AnonymousClass1AE A00;

    public final void onReceive(Context context, Intent intent) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass1AE();
        }
        AnonymousClass26U r5 = C242819u.A00(context).A07;
        C242819u.A01(r5);
        if (intent == null) {
            r5.A04("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        r5.A06("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean A002 = AnonymousClass1AF.A00(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (AnonymousClass1AE.A02) {
                context.startService(intent2);
                if (A002) {
                    try {
                        if (AnonymousClass1AE.A00 == null) {
                            C24571Bm r2 = new C24571Bm(context);
                            AnonymousClass1AE.A00 = r2;
                            r2.A06.setReferenceCounted(false);
                            r2.A03 = false;
                        }
                        C24571Bm r6 = AnonymousClass1AE.A00;
                        r6.A02.incrementAndGet();
                        if (r6.A03) {
                            TextUtils.isEmpty(null);
                        }
                        synchronized (r6.A07) {
                            Map map = r6.A09;
                            if ((!map.isEmpty() || r6.A00 > 0) && !r6.A06.isHeld()) {
                                map.clear();
                                r6.A00 = 0;
                            }
                            if (r6.A03) {
                                Integer[] numArr = (Integer[]) map.get(null);
                                if (numArr == null) {
                                    map.put(null, new Integer[]{1});
                                    C239818i.A00(r6.A05, C008805h.A0e(r6.A06), 7, r6.A08, r6.A04, C240318p.A00(r6.A01), 1000);
                                    r6.A00++;
                                } else {
                                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                                }
                            }
                            if (!r6.A03 && r6.A00 == 0) {
                                C239818i.A00(r6.A05, C008805h.A0e(r6.A06), 7, r6.A08, r6.A04, C240318p.A00(r6.A01), 1000);
                                r6.A00++;
                            }
                        }
                        r6.A06.acquire();
                        C24571Bm.A0A.schedule(new RunnableEBaseShape6S0100000_I1_1(r6, 0), 1000, TimeUnit.MILLISECONDS);
                    } catch (SecurityException unused) {
                        r5.A04("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
