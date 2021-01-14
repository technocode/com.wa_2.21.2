package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;

/* renamed from: X.0G3  reason: invalid class name */
public class AnonymousClass0G3 {
    public int A00;
    public C50472Uv A01;
    public C50482Uw A02;
    public AnonymousClass0GA A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final C000300f A09;
    public final AnonymousClass09K A0A;
    public final AnonymousClass03P A0B;
    public final AnonymousClass00G A0C;
    public volatile long A0D;

    public AnonymousClass0G3(AnonymousClass00G r2, C000300f r3, AnonymousClass03P r4, Looper looper, AnonymousClass09K r6) {
        this.A0C = r2;
        this.A09 = r3;
        this.A0B = r4;
        this.A08 = new Handler(looper);
        this.A0A = r6;
    }

    public long A00() {
        return Math.min(32000L, Math.max(8000L, (long) (this.A09.A06(AbstractC000400g.A3p) * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
    }

    public void A01() {
        Log.i("xmpp/client-ping/on-demand-ping");
        this.A08.post(new RunnableEBaseShape3S0100000_I0_3(this, 20));
    }

    public final void A02() {
        Log.i("xmpp/client-ping/timeout/cancel-alarm");
        A07(new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"));
    }

    public final void A03() {
        AnonymousClass00E.A02(this.A08);
        if (!this.A06) {
            Log.d("xmpp/client-ping/orphaned-alarms");
            Log.d("xmpp/client-ping/legacy-alarms");
            A07(new Intent("com.whatsapp.MessageHandler.CLIENT_PINGER_ACTION"));
            A07(new Intent("com.whatsapp.MessageHandler.CLIENT_PINGER_ACTION").setPackage("com.whatsapp"));
            this.A06 = true;
        }
    }

    public final void A04() {
        Log.i("xmpp/client-ping/ping-timeout");
        AnonymousClass00E.A02(this.A08);
        if (!this.A05 || this.A03 == null) {
            Log.w("xmpp/client-ping/ping-timeout; not connected, ignoring.");
        } else if (!this.A0A.A06) {
            Log.w("xmpp/client-ping/ping-timeout; xmpp connection is not ready, ignoring.");
        } else if (this.A07) {
            Log.w("xmpp/client-ping/ping-timeout; already notified about timeout, ignoring.");
        } else {
            this.A03.ANj();
            this.A07 = true;
            A02();
        }
    }

    public final void A05() {
        Log.i("xmpp/client-ping/send-ping");
        AnonymousClass00E.A02(this.A08);
        if (!this.A05 || this.A03 == null) {
            Log.w("xmpp/client-ping/send-ping; not connected, ignoring.");
        } else if (this.A0D > 0) {
            Log.w("xmpp/client-ping/send-ping; skipping ping request, pending ping already exists.");
            if (this.A0D > 0) {
                if (SystemClock.elapsedRealtime() > A00() + this.A0D) {
                    A04();
                }
            }
        } else {
            Log.i("xmpp/client-ping/periodic/cancel-alarm");
            A07(new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"));
            this.A0D = SystemClock.elapsedRealtime();
            this.A07 = false;
            Log.i("xmpp/client-ping/timeout/schedule-alarm");
            PendingIntent broadcast = PendingIntent.getBroadcast(this.A0C.A00, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"), 134217728);
            long elapsedRealtime = SystemClock.elapsedRealtime() + A00();
            AlarmManager A022 = this.A0B.A02();
            if (A022 == null) {
                Log.w("xmpp/client-ping/timeout/schedule-alarm; failed to schedule alarm");
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    A022.setExactAndAllowWhileIdle(2, elapsedRealtime, broadcast);
                } else if (i >= 19) {
                    A022.setExact(2, elapsedRealtime, broadcast);
                } else {
                    A022.set(2, elapsedRealtime, broadcast);
                }
            }
            this.A03.ANd();
            this.A00++;
        }
    }

    public final void A06() {
        long j;
        Log.i("xmpp/client-ping/periodic/schedule-alarm");
        Application application = this.A0C.A00;
        AlarmManager A022 = this.A0B.A02();
        if (A022 == null) {
            Log.w("xmpp/client-ping/periodic/schedule-alarm; alarm manager is null");
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"), 134217728);
        if (this.A00 == 0) {
            j = 15000;
        } else {
            j = 240000;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        int i = 2;
        if (this.A04) {
            i = 3;
        }
        A022.set(i, elapsedRealtime, broadcast);
    }

    public void A07(Intent intent) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A0C.A00, 0, intent, 536870912);
        if (broadcast != null) {
            AlarmManager A022 = this.A0B.A02();
            if (A022 == null) {
                Log.w("xmpp/client-ping/cancel-alarm; service is null");
                return;
            }
            A022.cancel(broadcast);
            broadcast.cancel();
        }
    }
}
