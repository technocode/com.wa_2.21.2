package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0sm  reason: invalid class name and case insensitive filesystem */
public class RunnableC18090sm extends RunnableEmptyBase implements Runnable {
    public static final long A02 = TimeUnit.DAYS.toMillis(3650);
    public static final String A03 = AbstractC17610rq.A01("ForceStopRunnable");
    public final Context A00;
    public final C31221cl A01;

    public RunnableC18090sm(Context context, C31221cl r3) {
        this.A00 = context.getApplicationContext();
        this.A01 = r3;
    }

    public static void A00(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + A02;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        } else {
            alarmManager.set(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        Throwable th;
        Context context = this.A00;
        C17730s8.A00(context);
        AbstractC17610rq A002 = AbstractC17610rq.A00();
        String str = A03;
        A002.A02(str, "Performing cleanup operations.", new Throwable[0]);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                C31281cv.A04(context);
            }
            C31221cl r0 = this.A01;
            WorkDatabase workDatabase = r0.A04;
            AbstractC18040sg A09 = workDatabase.A09();
            AbstractC18000sc A08 = workDatabase.A08();
            workDatabase.A02();
            C31481dI r02 = (C31481dI) A09;
            try {
                C30721bp A003 = C30721bp.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
                AbstractC16780qQ r1 = r02.A01;
                r1.A01();
                Cursor A004 = C16830qW.A00(r1, A003, false);
                try {
                    int A082 = AnonymousClass0N2.A08(A004, "required_network_type");
                    int A083 = AnonymousClass0N2.A08(A004, "requires_charging");
                    int A084 = AnonymousClass0N2.A08(A004, "requires_device_idle");
                    int A085 = AnonymousClass0N2.A08(A004, "requires_battery_not_low");
                    int A086 = AnonymousClass0N2.A08(A004, "requires_storage_not_low");
                    int A087 = AnonymousClass0N2.A08(A004, "trigger_content_update_delay");
                    int A088 = AnonymousClass0N2.A08(A004, "trigger_max_content_delay");
                    int A089 = AnonymousClass0N2.A08(A004, "content_uri_triggers");
                    int A0810 = AnonymousClass0N2.A08(A004, "id");
                    int A0811 = AnonymousClass0N2.A08(A004, "state");
                    int A0812 = AnonymousClass0N2.A08(A004, "worker_class_name");
                    int A0813 = AnonymousClass0N2.A08(A004, "input_merger_class_name");
                    int A0814 = AnonymousClass0N2.A08(A004, "input");
                    int A0815 = AnonymousClass0N2.A08(A004, "output");
                    try {
                        int A0816 = AnonymousClass0N2.A08(A004, "initial_delay");
                        int A0817 = AnonymousClass0N2.A08(A004, "interval_duration");
                        int A0818 = AnonymousClass0N2.A08(A004, "flex_duration");
                        int A0819 = AnonymousClass0N2.A08(A004, "run_attempt_count");
                        int A0820 = AnonymousClass0N2.A08(A004, "backoff_policy");
                        int A0821 = AnonymousClass0N2.A08(A004, "backoff_delay_duration");
                        int A0822 = AnonymousClass0N2.A08(A004, "period_start_time");
                        int A0823 = AnonymousClass0N2.A08(A004, "minimum_retention_duration");
                        int A0824 = AnonymousClass0N2.A08(A004, "schedule_requested_at");
                        int A0825 = AnonymousClass0N2.A08(A004, "run_in_foreground");
                        ArrayList arrayList = new ArrayList(A004.getCount());
                        while (A004.moveToNext()) {
                            String string = A004.getString(A0810);
                            String string2 = A004.getString(A0812);
                            C17530rh r3 = new C17530rh();
                            r3.A03 = AnonymousClass0N2.A0g(A004.getInt(A082));
                            boolean z = false;
                            if (A004.getInt(A083) != 0) {
                                z = true;
                            }
                            r3.A05 = z;
                            boolean z2 = false;
                            if (A004.getInt(A084) != 0) {
                                z2 = true;
                            }
                            r3.A06 = z2;
                            boolean z3 = false;
                            if (A004.getInt(A085) != 0) {
                                z3 = true;
                            }
                            r3.A04 = z3;
                            boolean z4 = false;
                            if (A004.getInt(A086) != 0) {
                                z4 = true;
                            }
                            r3.A07 = z4;
                            r3.A00 = A004.getLong(A087);
                            r3.A01 = A004.getLong(A088);
                            r3.A02 = AnonymousClass0N2.A0f(A004.getBlob(A089));
                            C18030sf r2 = new C18030sf(string, string2);
                            r2.A0C = AnonymousClass0N2.A0h(A004.getInt(A0811));
                            r2.A0E = A004.getString(A0813);
                            r2.A0A = C17550rj.A00(A004.getBlob(A0814));
                            r2.A0B = C17550rj.A00(A004.getBlob(A0815));
                            r2.A03 = A004.getLong(A0816);
                            r2.A04 = A004.getLong(A0817);
                            r2.A02 = A004.getLong(A0818);
                            r2.A00 = A004.getInt(A0819);
                            r2.A08 = AnonymousClass0N2.A0e(A004.getInt(A0820));
                            r2.A01 = A004.getLong(A0821);
                            r2.A06 = A004.getLong(A0822);
                            r2.A05 = A004.getLong(A0823);
                            r2.A07 = A004.getLong(A0824);
                            boolean z5 = false;
                            if (A004.getInt(A0825) != 0) {
                                z5 = true;
                            }
                            r2.A0G = z5;
                            r2.A09 = r3;
                            arrayList.add(r2);
                        }
                        A004.close();
                        A003.A01();
                        boolean z6 = false;
                        if (!arrayList.isEmpty()) {
                            z6 = true;
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C18030sf r4 = (C18030sf) it.next();
                                r02.A06(AnonymousClass0VU.ENQUEUED, r4.A0D);
                                r02.A07(r4.A0D, -1);
                            }
                        }
                        C31391d9 r03 = (C31391d9) A08;
                        AbstractC16780qQ r5 = r03.A00;
                        r5.A01();
                        AbstractC16810qT r42 = r03.A02;
                        AbstractC30751bt A005 = r42.A00();
                        r5.A02();
                        AnonymousClass248 r22 = (AnonymousClass248) A005;
                        try {
                            r22.A00.executeUpdateDelete();
                            r5.A04();
                            r5.A03();
                            if (r22 == r42.A02) {
                                r42.A01.set(false);
                            }
                            workDatabase.A04();
                            workDatabase.A03();
                            Long A006 = ((C31341d3) r0.A05.A00.A06()).A00("reschedule_needed");
                            if (A006 == null || A006.longValue() != 1) {
                                Intent intent = new Intent();
                                intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
                                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                                if (PendingIntent.getBroadcast(context, -1, intent, 536870912) == null) {
                                    A00(context);
                                    AbstractC17610rq.A00().A02(str, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                    r0.A04();
                                } else if (z6) {
                                    AbstractC17610rq.A00().A02(str, "Found unfinished work, scheduling it.", new Throwable[0]);
                                    AnonymousClass0s6.A01(r0.A04, r0.A07);
                                }
                            } else {
                                AbstractC17610rq.A00().A02(str, "Rescheduling Workers.", new Throwable[0]);
                                r0.A04();
                                C18120sp r04 = r0.A05;
                                ((C31341d3) r04.A00.A06()).A01(new C17940sW());
                            }
                            synchronized (C31221cl.A0B) {
                                r0.A08 = true;
                                BroadcastReceiver.PendingResult pendingResult = r0.A00;
                                if (pendingResult != null) {
                                    pendingResult.finish();
                                    r0.A00 = null;
                                }
                            }
                        } catch (Throwable th2) {
                            r5.A03();
                            r42.A02(A005);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        A004.close();
                        A003.A01();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    A004.close();
                    A003.A01();
                    throw th;
                }
            } catch (Throwable th5) {
                workDatabase.A03();
                throw th5;
            }
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteDatabaseCorruptException e) {
            AbstractC17610rq.A00().A03(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
            throw new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
        }
    }
}
