package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import com.whatsapp.AlarmService;

/* renamed from: X.1aS  reason: invalid class name and case insensitive filesystem */
public final class job.JobServiceEngineC29941aS extends JobServiceEngine implements AbstractC14500mO {
    public JobParameters A00;
    public final AnonymousClass0PF A01;
    public final Object A02 = new Object();

    public job.JobServiceEngineC29941aS(AnonymousClass0PF r2) {
        super(r2);
        this.A01 = r2;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.A00 = jobParameters;
        this.A01.A04(false);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean z;
        AnonymousClass0PF r2 = this.A01;
        AsyncTaskC14490mN r1 = r2.A00;
        if (r1 != null) {
            r1.cancel(false);
        }
        if (!(r2 instanceof AlarmService)) {
            z = true;
        } else {
            boolean equals = "com.whatsapp.action.BACKUP_MESSAGES".equals(((AlarmService) r2).A1B);
            z = true;
            if (equals) {
                z = false;
            }
        }
        synchronized (this.A02) {
            this.A00 = null;
        }
        return z;
    }
}
