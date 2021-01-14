package com.whatsapp.schedulers.job;

import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass0P5;
import X.AnonymousClass0P7;
import X.AnonymousClass30g;
import X.C002101e;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.whatsapp.util.Log;
import java.util.HashMap;

public class SchedulerExperimentJobService extends JobService {
    public AnonymousClass0P5 A00;
    public AnonymousClass0P7 A01;
    public AnonymousClass00T A02;
    public final HashMap A03 = new HashMap();

    public /* synthetic */ void A00(JobParameters jobParameters) {
        StringBuilder A0S = AnonymousClass008.A0S("SchExpJobService/execute_job; job_id=");
        A0S.append(jobParameters.getJobId());
        Log.d(A0S.toString());
        if (11 == jobParameters.getJobId()) {
            this.A00.A01("/ntp/job/api/started");
            try {
                AnonymousClass0P7 r2 = this.A01;
                if (r2 != null) {
                    Log.d("SchExpJobs/periodic_api/callback");
                    if (r2.A01.A01() != 4) {
                        Log.d("SchExpJobs/periodic_api/callback; wrong bucket");
                        r2.A02();
                    } else {
                        r2.A07(jobParameters);
                    }
                } else {
                    throw null;
                }
            } finally {
                this.A00.A01("/ntp/job/api/completed");
            }
        } else if (12 == jobParameters.getJobId() || 13 == jobParameters.getJobId()) {
            this.A00.A01("/ntp/job/manual_pre/started");
            try {
                AnonymousClass0P7 r22 = this.A01;
                if (r22 != null) {
                    Log.d("SchExpJobs/manual_pre_periodic/callback");
                    if (r22.A01.A01() != 5) {
                        Log.d("SchExpJobs/manual_pre_periodic/callback; wrong bucket");
                        r22.A02();
                    } else {
                        r22.A04();
                        r22.A07(jobParameters);
                    }
                } else {
                    throw null;
                }
            } finally {
                this.A00.A01("/ntp/job/manual_pre/completed");
            }
        } else if (14 == jobParameters.getJobId()) {
            this.A00.A01("/ntp/job/manual_post/started");
            try {
                AnonymousClass0P7 r23 = this.A01;
                if (r23 != null) {
                    Log.d("SchExpJobs/manual_post/callback");
                    if (r23.A01.A01() != 6) {
                        Log.d("SchExpJobs/manual_post/callback; wrong bucket");
                        r23.A02();
                    } else {
                        r23.A07(jobParameters);
                        r23.A03();
                    }
                } else {
                    throw null;
                }
            } finally {
                this.A00.A01("/ntp/job/manual_post/completed");
            }
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S("SchExpJobService/execute_job; unexpected, job_id=");
            A0S2.append(jobParameters.getJobId());
            Log.d(A0S2.toString());
        }
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            if (((JobParameters) hashMap.remove(Integer.valueOf(jobParameters.getJobId()))) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("SchExpJobService/execute_job; marking as finished, job_id=");
                sb.append(jobParameters.getJobId());
                Log.d(sb.toString());
                jobFinished(jobParameters, false);
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.A02 = C002101e.A00();
        this.A01 = AnonymousClass0P7.A00();
        this.A00 = AnonymousClass0P5.A00();
    }

    public boolean onStartJob(JobParameters jobParameters) {
        StringBuilder A0S = AnonymousClass008.A0S("SchExpJobService/start_job; job_id=");
        A0S.append(jobParameters.getJobId());
        Log.d(A0S.toString());
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            hashMap.put(Integer.valueOf(jobParameters.getJobId()), jobParameters);
        }
        this.A02.ANF(new AnonymousClass30g(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        StringBuilder A0S = AnonymousClass008.A0S("SchExpJobService/stop_job; job_id=");
        A0S.append(jobParameters.getJobId());
        Log.d(A0S.toString());
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            hashMap.remove(Integer.valueOf(jobParameters.getJobId()));
        }
        return false;
    }
}
