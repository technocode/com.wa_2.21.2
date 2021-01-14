package X;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.SystemClock;
import com.whatsapp.schedulers.job.SchedulerExperimentJobService;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.0P7  reason: invalid class name */
public class AnonymousClass0P7 {
    public static volatile AnonymousClass0P7 A02;
    public final AnonymousClass00G A00;
    public final AnonymousClass0P4 A01;

    public AnonymousClass0P7(AnonymousClass00G r1, AnonymousClass0P4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass0P7 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0P7.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0P7(AnonymousClass00G.A01, AnonymousClass0P4.A00());
                }
            }
        }
        return A02;
    }

    public final JobInfo A01(int i) {
        if (Build.VERSION.SDK_INT < 21) {
            StringBuilder sb = new StringBuilder();
            sb.append("SchExpJobs/is_scheduled/");
            sb.append(i);
            sb.append("; unsupported OS version");
            Log.d(sb.toString());
            return null;
        }
        JobScheduler jobScheduler = (JobScheduler) this.A00.A00.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SchExpJobs/is_scheduled/");
            sb2.append(i);
            sb2.append("; job scheduler is null");
            Log.d(sb2.toString());
            return null;
        }
        try {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                if (jobInfo.getId() == i) {
                    return jobInfo;
                }
            }
            return null;
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("SchExpJobs/findJobInfo/");
            sb3.append(i);
            sb3.append("; getAllPendingJobs() error");
            Log.d(sb3.toString(), e);
            return null;
        }
    }

    public void A02() {
        Log.d("SchExpJobs/periodic_api/cancel;");
        A06(11);
    }

    public void A03() {
        Log.d("SchExpJobs/manual_post/schedule");
        AnonymousClass0P4 r2 = this.A01;
        if (r2.A01() != 6) {
            Log.d("SchExpJobs/manual_post/schedule; wrong bucket");
        } else if (Build.VERSION.SDK_INT < 21) {
            Log.d("SchExpJobs/manual_post/schedule; unsupported OS version");
        } else {
            Application application = this.A00.A00;
            JobScheduler jobScheduler = (JobScheduler) application.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                Log.d("SchExpJobs/manual_post/cancel; job scheduler is null");
                return;
            }
            long A022 = r2.A02();
            if (jobScheduler.schedule(new JobInfo.Builder(14, new ComponentName(application, SchedulerExperimentJobService.class)).setMinimumLatency(A022).setOverrideDeadline(A022).build()) == 1) {
                StringBuilder A0S = AnonymousClass008.A0S("SchExpJobs/manual_post/schedule; period ");
                A0S.append((A022 / 1000) / 60);
                A0S.append(" minutes");
                Log.d(A0S.toString());
                return;
            }
            Log.d("SchExpJobs/manual_post/schedule; failed to schedule a job.");
        }
    }

    public void A04() {
        Log.d("SchExpJobs/manual_pre_periodic/schedule");
        AnonymousClass0P4 r2 = this.A01;
        if (r2.A01() != 5) {
            Log.d("SchExpJobs/manual_pre_periodic/schedule; wrong bucket");
        } else if (Build.VERSION.SDK_INT < 21) {
            Log.d("SchExpJobs/manual_pre_periodic/schedule; unsupported OS version");
        } else {
            Application application = this.A00.A00;
            JobScheduler jobScheduler = (JobScheduler) application.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                Log.d("SchExpJobs/manual_pre_periodic/cancel; job scheduler is null");
                return;
            }
            int i = 12;
            boolean z = false;
            if (A01(12) != null) {
                z = true;
            }
            boolean z2 = false;
            if (A01(13) != null) {
                z2 = true;
            }
            if (!z || !z2) {
                long A022 = r2.A02();
                if (z) {
                    i = 13;
                }
                if (jobScheduler.schedule(new JobInfo.Builder(i, new ComponentName(application, SchedulerExperimentJobService.class)).setMinimumLatency(A022).setOverrideDeadline(A022).build()) == 1) {
                    AnonymousClass008.A16("SchExpJobs/manual_pre_periodic/schedule; ", String.format(Locale.US, "job_id=%d, period=%d minutes", Integer.valueOf(i), Long.valueOf((A022 / 1000) / 60)));
                    return;
                }
                AnonymousClass008.A0t("SchExpJobs/manual_pre_periodic/schedule; failed to schedule a job: ", i);
                return;
            }
            Log.d("SchExpJobs/manual_pre_periodic/already_scheduled; job A and B are already scheduled.");
        }
    }

    public void A05() {
        Log.d("SchExpJobs/periodic_api/schedule");
        AnonymousClass0P4 r2 = this.A01;
        if (r2.A01() != 4) {
            Log.d("SchExpJobs/periodic_api/schedule; wrong bucket");
        } else if (Build.VERSION.SDK_INT < 21) {
            Log.d("SchExpJobs/periodic_api/schedule; unsupported OS version");
        } else {
            Application application = this.A00.A00;
            JobScheduler jobScheduler = (JobScheduler) application.getSystemService("jobscheduler");
            if (jobScheduler == null) {
                Log.d("SchExpJobs/periodic_api/cancel; job scheduler is null");
                return;
            }
            long A022 = r2.A02();
            if (jobScheduler.schedule(new JobInfo.Builder(11, new ComponentName(application, SchedulerExperimentJobService.class)).setPeriodic(A022).build()) == 1) {
                StringBuilder A0S = AnonymousClass008.A0S("SchExpJobs/periodic_api/schedule; period ");
                A0S.append((A022 / 1000) / 60);
                A0S.append(" minutes");
                Log.d(A0S.toString());
                return;
            }
            Log.d("SchExpJobs/periodic_api/schedule; failed to schedule a job.");
        }
    }

    public final void A06(int i) {
        if (Build.VERSION.SDK_INT < 21) {
            StringBuilder sb = new StringBuilder();
            sb.append("SchExpJobs/cancel/");
            sb.append(i);
            sb.append("; unsupported OS version");
            Log.d(sb.toString());
            return;
        }
        JobScheduler jobScheduler = (JobScheduler) this.A00.A00.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SchExpJobs/cancel/");
            sb2.append(i);
            sb2.append("; job scheduler is null");
            Log.d(sb2.toString());
            return;
        }
        jobScheduler.cancel(i);
    }

    public final void A07(JobParameters jobParameters) {
        long A03 = this.A01.A03();
        int jobId = jobParameters.getJobId();
        StringBuilder sb = new StringBuilder("SchExpJobs/useful_work/started; job=");
        sb.append(jobId);
        sb.append(", duration=");
        sb.append(A03);
        sb.append("ms");
        Log.d(sb.toString());
        SystemClock.sleep(A03);
        Log.d("SchExpJobs/useful_work/ended;");
    }
}
