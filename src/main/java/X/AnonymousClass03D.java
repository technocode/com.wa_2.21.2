package X;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.03D  reason: invalid class name */
public final class AnonymousClass03D {
    public static AnonymousClass03H A02;
    public static String A03;
    public static Set A04 = new HashSet();
    public static final Object A05 = new Object();
    public static final Object A06 = new Object();
    public final NotificationManager A00;
    public final Context A01;

    public AnonymousClass03D(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }

    public final void A00(AnonymousClass03G r4) {
        synchronized (A06) {
            AnonymousClass03H r1 = A02;
            if (r1 == null) {
                r1 = new AnonymousClass03H(this.A01.getApplicationContext());
                A02 = r1;
            }
            r1.A02.obtainMessage(0, r4).sendToTarget();
        }
    }

    public void A01(String str, int i, Notification notification) {
        Bundle A032 = C001801b.A03(notification);
        if (A032 == null || !A032.getBoolean("android.support.useSideChannel")) {
            this.A00.notify(str, i, notification);
            return;
        }
        A00(new AnonymousClass03I(this.A01.getPackageName(), i, str, notification));
        this.A00.cancel(str, i);
    }

    public boolean A02() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.A00.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        Context context = this.A01;
        Object systemService = context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(systemService, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
