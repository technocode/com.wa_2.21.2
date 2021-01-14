package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0sB  reason: invalid class name and case insensitive filesystem */
public class C17750sB {
    public static final String A00 = AbstractC17610rq.A01("Alarms");

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r4 == Integer.MAX_VALUE) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r9, X.C31221cl r10, java.lang.String r11, long r12) {
        /*
            androidx.work.impl.WorkDatabase r6 = r10.A04
            X.0sZ r5 = r6.A07()
            X.1d5 r5 = (X.C31361d5) r5
            X.0sY r0 = r5.A00(r11)
            if (r0 == 0) goto L_0x0017
            int r0 = r0.A00
            A01(r9, r11, r0)
            A02(r9, r11, r0, r12)
            return
        L_0x0017:
            java.lang.Class<X.0sn> r8 = X.C18100sn.class
            monitor-enter(r8)
            java.lang.String r7 = "next_alarm_manager_id"
            r6.A02()     // Catch:{ all -> 0x0061 }
            X.0sX r0 = r6.A06()     // Catch:{ all -> 0x005c }
            X.1d3 r0 = (X.C31341d3) r0
            java.lang.Long r0 = r0.A00(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0048
            int r4 = r0.intValue()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r0) goto L_0x0049
        L_0x0035:
            X.0sX r3 = r6.A06()
            long r1 = (long) r1
            X.0sW r0 = new X.0sW
            r0.<init>(r7, r1)
            X.1d3 r3 = (X.C31341d3) r3
            r3.A01(r0)
            r6.A04()
            goto L_0x004c
        L_0x0048:
            r4 = 0
        L_0x0049:
            int r1 = r4 + 1
            goto L_0x0035
        L_0x004c:
            r6.A03()
            monitor-exit(r8)
            X.0sY r0 = new X.0sY
            r0.<init>(r11, r4)
            r5.A01(r0)
            A02(r9, r11, r4, r12)
            return
        L_0x005c:
            r0 = move-exception
            r6.A03()
            throw r0
        L_0x0061:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17750sB.A00(android.content.Context, X.1cl, java.lang.String, long):void");
    }

    public static void A01(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        PendingIntent service = PendingIntent.getService(context, i, intent, 536870912);
        if (service != null && alarmManager != null) {
            AbstractC17610rq.A00().A02(A00, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void A02(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        PendingIntent service = PendingIntent.getService(context, i, intent, 134217728);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
