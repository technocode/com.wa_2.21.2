package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.1cu  reason: invalid class name and case insensitive filesystem */
public class C31271cu implements AbstractC17710s5 {
    public static final String A01 = AbstractC17610rq.A01("SystemAlarmScheduler");
    public final Context A00;

    public C31271cu(Context context) {
        this.A00 = context.getApplicationContext();
    }

    @Override // X.AbstractC17710s5
    public void A2X(String str) {
        Context context = this.A00;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // X.AbstractC17710s5
    public void ANQ(C18030sf... r9) {
        for (C18030sf r7 : r9) {
            AbstractC17610rq.A00().A02(A01, String.format("Scheduling work with workSpecId %s", r7.A0D), new Throwable[0]);
            Context context = this.A00;
            String str = r7.A0D;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            intent.putExtra("KEY_WORKSPEC_ID", str);
            context.startService(intent);
        }
    }
}
