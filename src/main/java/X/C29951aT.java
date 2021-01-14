package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1aT  reason: invalid class name and case insensitive filesystem */
public final class C29951aT extends AbstractC14520mQ {
    public final JobInfo A00;
    public final JobScheduler A01;

    public C29951aT(Context context, ComponentName componentName, int i) {
        super(componentName);
        A01(i);
        this.A00 = new JobInfo.Builder(i, this.A02).setOverrideDeadline(0).build();
        this.A01 = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // X.AbstractC14520mQ
    public void A02(Intent intent) {
        this.A01.enqueue(this.A00, new JobWorkItem(intent));
    }
}
