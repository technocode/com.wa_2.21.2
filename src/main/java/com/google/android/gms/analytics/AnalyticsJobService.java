package com.google.android.gms.analytics;

import X.AnonymousClass1AF;
import X.AnonymousClass1AG;
import X.AnonymousClass1AH;
import X.AnonymousClass26U;
import X.C242819u;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

public final class AnalyticsJobService extends JobService implements AnonymousClass1AH {
    public AnonymousClass1AF A00;

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // X.AnonymousClass1AH
    public final boolean A2Q(int i) {
        return stopSelfResult(i);
    }

    @Override // X.AnonymousClass1AH
    public final void ARr(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final void onCreate() {
        super.onCreate();
        AnonymousClass1AF r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass1AF(this);
            this.A00 = r0;
        }
        AnonymousClass26U r1 = C242819u.A00(r0.A00).A07;
        C242819u.A01(r1);
        r1.A03("Local AnalyticsService is starting up");
    }

    public final void onDestroy() {
        AnonymousClass1AF r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass1AF(this);
            this.A00 = r0;
        }
        AnonymousClass26U r1 = C242819u.A00(r0.A00).A07;
        C242819u.A01(r1);
        r1.A03("Local AnalyticsService is shutting down");
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        AnonymousClass1AF r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass1AF(this);
            this.A00 = r0;
        }
        r0.A01(intent, i2);
        return 2;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        AnonymousClass1AF r3 = this.A00;
        if (r3 == null) {
            r3 = new AnonymousClass1AF(this);
            this.A00 = r3;
        }
        AnonymousClass26U r2 = C242819u.A00(r3.A00).A07;
        C242819u.A01(r2);
        String string = jobParameters.getExtras().getString("action");
        r2.A06("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        r3.A02(new AnonymousClass1AG(r3, r2, jobParameters));
        return true;
    }
}
