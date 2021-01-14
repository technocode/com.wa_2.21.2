package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;

/* renamed from: X.1AF  reason: invalid class name */
public final class AnonymousClass1AF {
    public static Boolean A02;
    public final Context A00;
    public final Handler A01 = new AnonymousClass1AL();

    public AnonymousClass1AF(Context context) {
        C001801b.A1Q(context);
        this.A00 = context;
    }

    public static boolean A00(Context context) {
        C001801b.A1Q(context);
        Boolean bool = A02;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        A02 = Boolean.valueOf(z);
        return z;
    }

    public final void A01(Intent intent, int i) {
        try {
            synchronized (AnonymousClass1AE.A02) {
                C24571Bm r3 = AnonymousClass1AE.A00;
                if (r3 != null && r3.A06.isHeld()) {
                    if (r3.A02.decrementAndGet() < 0) {
                        Log.e("WakeLock", String.valueOf(r3.A08).concat(" release without a matched acquire!"));
                    }
                    if (r3.A03) {
                        TextUtils.isEmpty(null);
                    }
                    synchronized (r3.A07) {
                        if (r3.A03) {
                            Map map = r3.A09;
                            Integer[] numArr = (Integer[]) map.get(null);
                            if (numArr != null) {
                                int intValue = numArr[0].intValue();
                                if (intValue == 1) {
                                    map.remove(null);
                                    C239818i.A00(r3.A05, C008805h.A0e(r3.A06), 8, r3.A08, r3.A04, C240318p.A00(r3.A01), 0);
                                    r3.A00--;
                                } else {
                                    numArr[0] = Integer.valueOf(intValue - 1);
                                }
                            }
                        }
                        if (!r3.A03 && r3.A00 == 1) {
                            C239818i.A00(r3.A05, C008805h.A0e(r3.A06), 8, r3.A08, r3.A04, C240318p.A00(r3.A01), 0);
                            r3.A00--;
                        }
                    }
                    r3.A00();
                }
            }
        } catch (SecurityException unused) {
        }
        AnonymousClass26U r4 = C242819u.A00(this.A00).A07;
        C242819u.A01(r4);
        if (intent == null) {
            r4.A04("AnalyticsService started with null intent");
            return;
        }
        String action = intent.getAction();
        r4.A02(2, "Local AnalyticsService called. startId, action", Integer.valueOf(i), action, null);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            A02(new RunnableEBaseShape1S0201000_I1(r4, i, this, 6));
        }
    }

    public final void A02(Runnable runnable) {
        AnonymousClass26L r4 = C242819u.A00(this.A00).A04;
        C242819u.A01(r4);
        C35741kr r3 = new C35741kr(this, runnable);
        r4.A0C();
        AnonymousClass16M r2 = ((C242619s) r4).A00.A02;
        C001801b.A1Q(r2);
        RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0 = new RunnableEBaseShape5S0200000_I1_0(r4, r3, 39);
        C001801b.A1Q(runnableEBaseShape5S0200000_I1_0);
        r2.A02.submit(runnableEBaseShape5S0200000_I1_0);
    }
}
