package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2Uv  reason: invalid class name and case insensitive filesystem */
public class C50472Uv extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass0G3 A00;

    public C50472Uv(AnonymousClass0G3 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (!"com.whatsapp.alarm.CLIENT_PING_PERIODIC".equals(intent.getAction())) {
            StringBuilder sb = new StringBuilder("xmpp/client-ping/periodic/receiver; unexpected intent: ");
            sb.append(intent);
            Log.w(sb.toString());
            return;
        }
        Log.i("xmpp/client-ping/periodic/receiver");
        AnonymousClass0G3 r7 = this.A00;
        if (r7 != null) {
            Log.i("xmpp/client-ping/send-ping");
            AnonymousClass00E.A02(r7.A08);
            if (!r7.A05 || r7.A03 == null) {
                Log.w("xmpp/client-ping/send-ping; not connected, ignoring.");
            } else if (r7.A0D > 0) {
                Log.w("xmpp/client-ping/send-ping; skipping ping request, pending ping already exists.");
                if (r7.A0D > 0) {
                    if (SystemClock.elapsedRealtime() > r7.A00() + r7.A0D) {
                        r7.A04();
                    }
                }
            } else {
                Log.i("xmpp/client-ping/periodic/cancel-alarm");
                r7.A07(new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"));
                r7.A0D = SystemClock.elapsedRealtime();
                r7.A07 = false;
                Log.i("xmpp/client-ping/timeout/schedule-alarm");
                PendingIntent broadcast = PendingIntent.getBroadcast(r7.A0C.A00, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"), 134217728);
                long elapsedRealtime = SystemClock.elapsedRealtime() + r7.A00();
                AlarmManager A02 = r7.A0B.A02();
                if (A02 == null) {
                    Log.w("xmpp/client-ping/timeout/schedule-alarm; failed to schedule alarm");
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        A02.setExactAndAllowWhileIdle(2, elapsedRealtime, broadcast);
                    } else if (i >= 19) {
                        A02.setExact(2, elapsedRealtime, broadcast);
                    } else {
                        A02.set(2, elapsedRealtime, broadcast);
                    }
                }
                r7.A03.ANd();
                r7.A00++;
            }
        } else {
            throw null;
        }
    }
}
