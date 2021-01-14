package X;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0s6  reason: invalid class name */
public class AnonymousClass0s6 {
    public static final String A00 = AbstractC17610rq.A01("Schedulers");

    public static AbstractC17710s5 A00(Context context, C31221cl r9) {
        String str;
        if (Build.VERSION.SDK_INT >= 23) {
            C31281cv r4 = new C31281cv(context, r9);
            C18110so.A00(context, SystemJobService.class, true);
            AbstractC17610rq.A00().A02(A00, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return r4;
        }
        try {
            AbstractC17710s5 r42 = (AbstractC17710s5) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            AbstractC17610rq A002 = AbstractC17610rq.A00();
            str = A00;
            A002.A02(str, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            if (r42 != null) {
                return r42;
            }
            C31271cu r43 = new C31271cu(context);
            C18110so.A00(context, SystemAlarmService.class, true);
            AbstractC17610rq.A00().A02(str, "Created SystemAlarmScheduler", new Throwable[0]);
            return r43;
        } catch (Throwable th) {
            AbstractC17610rq A003 = AbstractC17610rq.A00();
            str = A00;
            A003.A02(str, "Unable to create GCM Scheduler", th);
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A01(WorkDatabase workDatabase, List list) {
        Throwable th;
        if (list != null && list.size() != 0) {
            AbstractC18040sg A09 = workDatabase.A09();
            workDatabase.A02();
            try {
                int i = 20;
                if (Build.VERSION.SDK_INT == 23) {
                    i = 10;
                }
                C31481dI r0 = (C31481dI) A09;
                C30721bp A002 = C30721bp.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
                A002.A03[1] = 2;
                A002.A04[1] = (long) i;
                AbstractC16780qQ r1 = r0.A01;
                r1.A01();
                Cursor A003 = C16830qW.A00(r1, A002, false);
                try {
                    int A08 = AnonymousClass0N2.A08(A003, "required_network_type");
                    int A082 = AnonymousClass0N2.A08(A003, "requires_charging");
                    int A083 = AnonymousClass0N2.A08(A003, "requires_device_idle");
                    int A084 = AnonymousClass0N2.A08(A003, "requires_battery_not_low");
                    int A085 = AnonymousClass0N2.A08(A003, "requires_storage_not_low");
                    int A086 = AnonymousClass0N2.A08(A003, "trigger_content_update_delay");
                    int A087 = AnonymousClass0N2.A08(A003, "trigger_max_content_delay");
                    int A088 = AnonymousClass0N2.A08(A003, "content_uri_triggers");
                    int A089 = AnonymousClass0N2.A08(A003, "id");
                    int A0810 = AnonymousClass0N2.A08(A003, "state");
                    int A0811 = AnonymousClass0N2.A08(A003, "worker_class_name");
                    int A0812 = AnonymousClass0N2.A08(A003, "input_merger_class_name");
                    int A0813 = AnonymousClass0N2.A08(A003, "input");
                    int A0814 = AnonymousClass0N2.A08(A003, "output");
                    try {
                        int A0815 = AnonymousClass0N2.A08(A003, "initial_delay");
                        int A0816 = AnonymousClass0N2.A08(A003, "interval_duration");
                        int A0817 = AnonymousClass0N2.A08(A003, "flex_duration");
                        int A0818 = AnonymousClass0N2.A08(A003, "run_attempt_count");
                        int A0819 = AnonymousClass0N2.A08(A003, "backoff_policy");
                        int A0820 = AnonymousClass0N2.A08(A003, "backoff_delay_duration");
                        int A0821 = AnonymousClass0N2.A08(A003, "period_start_time");
                        int A0822 = AnonymousClass0N2.A08(A003, "minimum_retention_duration");
                        int A0823 = AnonymousClass0N2.A08(A003, "schedule_requested_at");
                        int A0824 = AnonymousClass0N2.A08(A003, "run_in_foreground");
                        ArrayList arrayList = new ArrayList(A003.getCount());
                        while (A003.moveToNext()) {
                            String string = A003.getString(A089);
                            String string2 = A003.getString(A0811);
                            C17530rh r3 = new C17530rh();
                            r3.A03 = AnonymousClass0N2.A0g(A003.getInt(A08));
                            boolean z = false;
                            if (A003.getInt(A082) != 0) {
                                z = true;
                            }
                            r3.A05 = z;
                            boolean z2 = false;
                            if (A003.getInt(A083) != 0) {
                                z2 = true;
                            }
                            r3.A06 = z2;
                            boolean z3 = false;
                            if (A003.getInt(A084) != 0) {
                                z3 = true;
                            }
                            r3.A04 = z3;
                            boolean z4 = false;
                            if (A003.getInt(A085) != 0) {
                                z4 = true;
                            }
                            r3.A07 = z4;
                            r3.A00 = A003.getLong(A086);
                            r3.A01 = A003.getLong(A087);
                            r3.A02 = AnonymousClass0N2.A0f(A003.getBlob(A088));
                            C18030sf r2 = new C18030sf(string, string2);
                            r2.A0C = AnonymousClass0N2.A0h(A003.getInt(A0810));
                            r2.A0E = A003.getString(A0812);
                            r2.A0A = C17550rj.A00(A003.getBlob(A0813));
                            r2.A0B = C17550rj.A00(A003.getBlob(A0814));
                            r2.A03 = A003.getLong(A0815);
                            r2.A04 = A003.getLong(A0816);
                            r2.A02 = A003.getLong(A0817);
                            r2.A00 = A003.getInt(A0818);
                            r2.A08 = AnonymousClass0N2.A0e(A003.getInt(A0819));
                            r2.A01 = A003.getLong(A0820);
                            r2.A06 = A003.getLong(A0821);
                            r2.A05 = A003.getLong(A0822);
                            r2.A07 = A003.getLong(A0823);
                            boolean z5 = false;
                            if (A003.getInt(A0824) != 0) {
                                z5 = true;
                            }
                            r2.A0G = z5;
                            r2.A09 = r3;
                            arrayList.add(r2);
                        }
                        A003.close();
                        A002.A01();
                        if (arrayList.size() > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                r0.A07(((C18030sf) it.next()).A0D, currentTimeMillis);
                            }
                        }
                        workDatabase.A04();
                        workDatabase.A03();
                        if (arrayList.size() > 0) {
                            C18030sf[] r22 = (C18030sf[]) arrayList.toArray(new C18030sf[0]);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((AbstractC17710s5) it2.next()).ANQ(r22);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        A003.close();
                        A002.A01();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    A003.close();
                    A002.A01();
                    throw th;
                }
            } catch (Throwable th4) {
                workDatabase.A03();
                throw th4;
            }
        }
    }
}
