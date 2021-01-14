package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.0Ht  reason: invalid class name */
public class AnonymousClass0Ht extends BroadcastReceiver {
    public final AnonymousClass03P A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass03S A02;
    public final AnonymousClass00D A03;
    public final C014708f A04;

    public AnonymousClass0Ht(AnonymousClass00G r1, AnonymousClass03P r2, AnonymousClass03S r3, AnonymousClass00D r4, C014708f r5) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public void A00() {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A01.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_TAKING_TOO_LONG_TIMEOUT").setPackage("com.whatsapp"), 536870912);
        if (broadcast != null) {
            AlarmManager A022 = this.A00.A02();
            if (A022 != null) {
                A022.cancel(broadcast);
            } else {
                Log.w("DelayedRegistrationBroadcastReceiver/cancelRegistrationTakingTooLongAlarm AlarmManager is null");
            }
            broadcast.cancel();
            AnonymousClass008.A0j(this.A03, "registration_start_time");
        }
    }

    public final void A01(long j) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A01.A00, 0, new Intent("com.whatsapp.alarm.REGISTRATION_TAKING_TOO_LONG_TIMEOUT").setPackage("com.whatsapp"), 134217728);
        AlarmManager A022 = this.A00.A02();
        if (A022 == null) {
            Log.w("DelayedRegistrationBroadcastReceiver/updateRegistrationTakingTooLongAlarm AlarmManager is null");
        } else if (Build.VERSION.SDK_INT >= 19) {
            A022.setExact(0, j, broadcast);
        } else {
            A022.set(0, j, broadcast);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        Log.i("app/regtoolong/timeout");
        AnonymousClass00D r6 = this.A03;
        long j = r6.A00.getLong("registration_start_time", -1);
        if (j <= 0 || System.currentTimeMillis() - j <= 43200000) {
            A01(j + 43200000);
            return;
        }
        A00();
        if (!this.A04.A02()) {
            StringBuilder A0a = AnonymousClass008.A0a("app/registrationtakingtoolong/cc ", r6.A0F(), " num=", r6.A0H(), " sim=");
            AnonymousClass03S r2 = this.A02;
            if (r2.A08()) {
                str = AnonymousClass0JE.A0B(this.A01, this.A00, r2);
            } else {
                str = "<permission denied>";
            }
            AnonymousClass008.A1U(A0a, str);
        }
        AnonymousClass008.A0l(r6, "registration_start_time", -2);
    }
}
