package X;

import android.app.job.JobParameters;

/* renamed from: X.1AG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1AG extends RunnableEmptyBase implements Runnable {
    public final JobParameters A00;
    public final AnonymousClass26U A01;
    public final AnonymousClass1AF A02;

    public AnonymousClass1AG(AnonymousClass1AF r1, AnonymousClass26U r2, JobParameters jobParameters) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = jobParameters;
    }

    public final void run() {
        AnonymousClass1AF r3 = this.A02;
        AnonymousClass26U r1 = this.A01;
        JobParameters jobParameters = this.A00;
        if (r3 != null) {
            r1.A03("AnalyticsJobService processed last dispatch request");
            ((AnonymousClass1AH) r3.A00).ARr(jobParameters, false);
            return;
        }
        throw null;
    }
}
