package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import java.util.List;

/* renamed from: X.0BN  reason: invalid class name */
public class AnonymousClass0BN {
    public static NotificationChannel A00(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static List A01(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static void A02(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void A03(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }
}
