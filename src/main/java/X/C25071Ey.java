package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Ey  reason: invalid class name and case insensitive filesystem */
public final class C25071Ey {
    public static final AtomicInteger A03 = new AtomicInteger((int) SystemClock.elapsedRealtime());
    public Bundle A00;
    public final Context A01;
    public final String A02;

    public C25071Ey(Context context, String str) {
        this.A01 = context;
        this.A02 = str;
    }

    public static String A00(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    public static void A01(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    public final PendingIntent A02(int i, Intent intent) {
        Context context = this.A01;
        return PendingIntent.getBroadcast(context, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    public final synchronized Bundle A03() {
        Bundle bundle;
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            return bundle2;
        }
        try {
            ApplicationInfo applicationInfo = this.A01.getPackageManager().getApplicationInfo(this.A02, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                this.A00 = bundle;
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad A[SYNTHETIC, Splitter:B:21:0x00ad] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A04(android.os.Bundle r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25071Ey.A04(android.os.Bundle, java.lang.String):java.lang.String");
    }

    public final boolean A05(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.A01.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }
}
