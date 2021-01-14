package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.schedulers.alarm.SchedulerExperimentAlarmReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.0P6  reason: invalid class name */
public class AnonymousClass0P6 {
    public static volatile AnonymousClass0P6 A03;
    public final AlarmManager A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass0P4 A02;

    public AnonymousClass0P6(AnonymousClass00G r2, AnonymousClass03P r3, AnonymousClass0P4 r4) {
        this.A01 = r2;
        this.A00 = r3.A02();
        this.A02 = r4;
    }

    public static AnonymousClass0P6 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0P6.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0P6(AnonymousClass00G.A01, AnonymousClass03P.A00(), AnonymousClass0P4.A00());
                }
            }
        }
        return A03;
    }

    public final Intent A01() {
        Intent intent = new Intent(this.A01.A00, SchedulerExperimentAlarmReceiver.class);
        intent.setAction("com.whatsapp.schexp.PERIODIC_API");
        intent.putExtra("alarm_period", this.A02.A02());
        return intent;
    }

    public void A02() {
        Log.d("SchExpAlarms/periodic_api/schedule");
        AnonymousClass0P4 r3 = this.A02;
        if (r3.A01() != 2) {
            Log.d("SchExpAlarms/periodic_api/schedule; wrong bucket");
            return;
        }
        AlarmManager alarmManager = this.A00;
        if (alarmManager != null) {
            PendingIntent broadcast = PendingIntent.getBroadcast(this.A01.A00, 0, A01(), 0);
            long A022 = r3.A02();
            alarmManager.setInexactRepeating(3, SystemClock.elapsedRealtime() + A022, A022, broadcast);
            StringBuilder A0S = AnonymousClass008.A0S("SchExpAlarms/periodic_api/schedule; period ");
            A0S.append((A022 / 1000) / 60);
            A0S.append(" minutes");
            Log.d(A0S.toString());
        }
    }

    public final void A03() {
        long A032 = this.A02.A03();
        StringBuilder A0S = AnonymousClass008.A0S("SchExpAlarms/useful_work/started; duration=");
        A0S.append(A032 / 1000);
        A0S.append("s");
        Log.d(A0S.toString());
        SystemClock.sleep(A032);
        Log.d("SchExpAlarms/useful_work/ended;");
    }

    public final void A04() {
        Log.d("SchExpAlarms/manual/schedule_next;");
        AnonymousClass0P4 r7 = this.A02;
        if (r7.A01() != 3) {
            Log.d("SchExpAlarms/manual/schedule_next; wrong bucket");
            return;
        }
        AlarmManager alarmManager = this.A00;
        if (alarmManager != null) {
            AnonymousClass00G r3 = this.A01;
            Intent intent = new Intent(r3.A00, SchedulerExperimentAlarmReceiver.class);
            intent.setAction("com.whatsapp.schexp.PERIODIC_MANUAL");
            PendingIntent broadcast = PendingIntent.getBroadcast(r3.A00, 0, intent, 0);
            long A022 = r7.A02();
            alarmManager.set(3, SystemClock.elapsedRealtime() + A022, broadcast);
            StringBuilder sb = new StringBuilder("SchExpAlarms/manual/schedule_next; next in ");
            sb.append((A022 / 1000) / 60);
            sb.append(" minutes");
            Log.d(sb.toString());
        }
    }

    public void A05(Intent intent) {
        PendingIntent broadcast;
        AlarmManager alarmManager = this.A00;
        if (alarmManager != null && (broadcast = PendingIntent.getBroadcast(this.A01.A00, 0, intent, 536870912)) != null) {
            alarmManager.cancel(broadcast);
            broadcast.cancel();
        }
    }
}
