package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1El  reason: invalid class name */
public abstract class AnonymousClass1El extends Service {
    public int A00;
    public int A01;
    public Binder A02;
    public final Object A03;
    public final ExecutorService A04;

    public AnonymousClass1El() {
        String str;
        String simpleName = getClass().getSimpleName();
        if (simpleName.length() != 0) {
            str = "Firebase-".concat(simpleName);
        } else {
            str = new String("Firebase-");
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC240418r(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A04 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.A03 = new Object();
        this.A01 = 0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.content.Intent r23) {
        /*
        // Method dump skipped, instructions count: 972
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1El.A00(android.content.Intent):void");
    }

    public final void A01(Intent intent) {
        int intExtra;
        if (!(intent == null || (intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0)) == 0)) {
            SparseArray sparseArray = FirebaseInstanceIdReceiver.A03;
            synchronized (sparseArray) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No active wake lock id #");
                    sb.append(intExtra);
                    Log.w("WakefulBroadcastReceiv.", sb.toString());
                }
            }
        }
        synchronized (this.A03) {
            int i = this.A01 - 1;
            this.A01 = i;
            if (i == 0) {
                stopSelfResult(this.A00);
            }
        }
    }

    public boolean A02(Intent intent) {
        if (!(this instanceof FirebaseMessagingService) || !"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!C008805h.A1O(intent)) {
            return true;
        }
        if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
            AnonymousClass05T A002 = AnonymousClass05T.A00();
            A002.A03();
            A002.A03.A02(AnonymousClass07D.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
        C008805h.A1F("_no", intent);
        return true;
    }

    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        binder = this.A02;
        if (binder == null) {
            binder = new AnonymousClass1En(this);
            this.A02 = binder;
        }
        return binder;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2;
        synchronized (this.A03) {
            this.A00 = i2;
            this.A01++;
        }
        if (!(this instanceof FirebaseMessagingService)) {
            intent2 = (Intent) AnonymousClass1Ej.A00().A03.poll();
        } else {
            intent2 = (Intent) AnonymousClass1Ej.A00().A04.poll();
        }
        if (intent2 == null) {
            A01(intent);
            return 2;
        } else if (A02(intent2)) {
            A01(intent);
            return 2;
        } else {
            this.A04.execute(new RunnableEBaseShape2S0300000_I1(intent2, intent, this, 11));
            return 3;
        }
    }
}
