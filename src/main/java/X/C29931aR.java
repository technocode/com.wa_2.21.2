package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: X.1aR  reason: invalid class name and case insensitive filesystem */
public final class C29931aR implements AbstractC14510mP {
    public final JobWorkItem A00;
    public final /* synthetic */ job.JobServiceEngineC29941aS A01;

    public C29931aR(job.JobServiceEngineC29941aS r1, JobWorkItem jobWorkItem) {
        this.A01 = r1;
        this.A00 = jobWorkItem;
    }

    @Override // X.AbstractC14510mP
    public void A2s() {
        job.JobServiceEngineC29941aS r0 = this.A01;
        synchronized (r0.A02) {
            JobParameters jobParameters = r0.A00;
            if (jobParameters != null) {
                jobParameters.completeWork(this.A00);
            }
        }
    }

    @Override // X.AbstractC14510mP
    public Intent getIntent() {
        return this.A00.getIntent();
    }
}
