package X;

import android.app.job.JobParameters;
import com.whatsapp.schedulers.job.SchedulerExperimentJobService;

/* renamed from: X.30g  reason: invalid class name */
public final /* synthetic */ class AnonymousClass30g extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ SchedulerExperimentJobService A01;

    public /* synthetic */ AnonymousClass30g(SchedulerExperimentJobService schedulerExperimentJobService, JobParameters jobParameters) {
        this.A01 = schedulerExperimentJobService;
        this.A00 = jobParameters;
    }

    public final void run() {
        this.A01.A00(this.A00);
    }
}
