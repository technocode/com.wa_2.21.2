package com.whatsapp.service;

import X.AnonymousClass00T;
import X.AnonymousClass019;
import X.AnonymousClass0AC;
import X.AnonymousClass31D;
import X.AnonymousClass31E;
import X.AnonymousClass31F;
import X.AnonymousClass3OU;
import X.C002101e;
import X.C014508d;
import X.C03160Fa;
import X.C04490Ko;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import com.whatsapp.util.Log;

public class UnsentMessagesNetworkAvailableJob extends JobService {
    public JobParameters A00;
    public final Handler A01 = new Handler();
    public final AnonymousClass019 A02 = new AnonymousClass3OU(this);
    public final AnonymousClass0AC A03 = AnonymousClass0AC.A00;
    public final C014508d A04 = C014508d.A00();
    public final C04490Ko A05 = C04490Ko.A00();
    public final C03160Fa A06 = C03160Fa.A00();
    public final AnonymousClass00T A07 = C002101e.A00();
    public final Runnable A08 = new AnonymousClass31E(this);

    public final void A00() {
        C014508d r0 = this.A04;
        r0.A05();
        if (!r0.A01 || !this.A05.A04()) {
            Log.d("UnsentMessagesNetworkAvailableJob/No unsent messages found, finishing job.");
            A01();
            return;
        }
        Handler handler = this.A01;
        handler.post(new AnonymousClass31D(this));
        Log.i("Unsent messages found, scheduling timeout task");
        handler.postDelayed(this.A08, 30000);
        this.A06.A0E(false, true, false, false, 0);
    }

    public final void A01() {
        if (this.A00 != null) {
            Log.d("UnsentMessagesNetworkAvailableJob/finishing job");
            jobFinished(this.A00, false);
            this.A00 = null;
        }
    }

    public /* synthetic */ void A02() {
        this.A03.A01(this.A02);
    }

    public /* synthetic */ void A03() {
        Log.d("UnsentMessagesNetworkAvailableJob timeout");
        this.A03.A00(this.A02);
        A01();
    }

    public void onCreate() {
        Log.i("UnsentMessagesNetworkAvailableJob/onCreate");
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("UnsentMessagesNetworkAvailableJob/onDestroy");
        super.onDestroy();
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Log.d("UnsentMessagesNetworkAvailableJob/onStartJob called");
        if (jobParameters.getJobId() != 6 || this.A00 != null) {
            return false;
        }
        this.A00 = jobParameters;
        this.A07.ANF(new AnonymousClass31F(this));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        Log.d("UnsentMessagesNetworkAvailableJob/onStopJob called");
        if (this.A00 == null) {
            return true;
        }
        this.A03.A00(this.A02);
        this.A01.removeCallbacks(this.A08);
        this.A00 = null;
        return true;
    }
}
