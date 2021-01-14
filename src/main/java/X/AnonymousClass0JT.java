package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.0JT  reason: invalid class name */
public final class AnonymousClass0JT extends BroadcastReceiver {
    public final AnonymousClass0JQ A00;
    public final AnonymousClass0Fk A01;
    public final AnonymousClass0JR A02;
    public final AnonymousClass0JS A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass00G A05;

    public AnonymousClass0JT(AnonymousClass00G r1, AnonymousClass03P r2, AnonymousClass0Fk r3, AnonymousClass0JQ r4, AnonymousClass0JR r5, AnonymousClass0JS r6) {
        this.A05 = r1;
        this.A04 = r2;
        this.A01 = r3;
        this.A00 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    public void A00() {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A05.A00, 0, new Intent("com.whatsapp.alarm.AVAILABLE_TIMEOUT").setPackage("com.whatsapp"), 536870912);
        if (broadcast != null) {
            AlarmManager A022 = this.A04.A02();
            if (A022 != null) {
                A022.cancel(broadcast);
            } else {
                Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/cancelAvailableTimeoutAlarm AlarmManager is null");
            }
            broadcast.cancel();
        }
    }

    public void onReceive(Context context, Intent intent) {
        AnonymousClass0Fk r3 = this.A01;
        if (r3.A00 == 1) {
            Log.d("app/presenceavailable/timeout/still-foreground");
        } else {
            AnonymousClass0JQ r2 = this.A00;
            r2.A01.A00();
            StringBuilder sb = new StringBuilder("presencestatemanager/setUnavailable previous-state: ");
            AnonymousClass0Fk r1 = r2.A02;
            sb.append(r1);
            Log.i(sb.toString());
            r1.A00 = 3;
            AnonymousClass0JR r12 = this.A02;
            r12.A00 = false;
            r12.A02();
            this.A03.A00.clear();
        }
        StringBuilder A0S = AnonymousClass008.A0S("app/presenceavailable/timeout/foreground ");
        A0S.append(r3);
        Log.i(A0S.toString());
    }
}
