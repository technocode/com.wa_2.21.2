package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: X.26S  reason: invalid class name */
public final class AnonymousClass26S extends AbstractC35671kk {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final AlarmManager A03 = ((AlarmManager) ((C242619s) this).A00.A00.getSystemService("alarm"));

    public AnonymousClass26S(C242819u r3) {
        super(r3);
    }

    public final int A0D() {
        String str;
        Integer num = this.A00;
        if (num == null) {
            String valueOf = String.valueOf(((C242619s) this).A00.A00.getPackageName());
            if (valueOf.length() != 0) {
                str = "analytics".concat(valueOf);
            } else {
                str = new String("analytics");
            }
            num = Integer.valueOf(str.hashCode());
            this.A00 = num;
        }
        return num.intValue();
    }

    public final void A0E() {
        this.A02 = false;
        AlarmManager alarmManager = this.A03;
        Context context = ((C242619s) this).A00.A00;
        alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver")), 0));
        if (Build.VERSION.SDK_INT >= 24) {
            int A0D = A0D();
            A06("Cancelling job. JobID", Integer.valueOf(A0D));
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(A0D);
        }
    }
}
