package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* renamed from: X.0st  reason: invalid class name and case insensitive filesystem */
public class C18160st {
    public static final String A00 = AbstractC17610rq.A01("WakeLocks");
    public static final WeakHashMap A01 = new WeakHashMap();

    public static PowerManager.WakeLock A00(Context context, String str) {
        String A0K = AnonymousClass008.A0K("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, A0K);
        WeakHashMap weakHashMap = A01;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, A0K);
        }
        return newWakeLock;
    }
}
