package X;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.22c  reason: invalid class name and case insensitive filesystem */
public final class C449022c extends AbstractC29021Ws {
    @Override // X.AbstractC29021Ws
    public void A02(Context context, Notification notification, int i) {
        if (Build.VERSION.SDK_INT >= 19 && Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
            } catch (Exception unused) {
                Log.e("Could not set badge for Xiaomi notification");
            }
        }
    }
}
