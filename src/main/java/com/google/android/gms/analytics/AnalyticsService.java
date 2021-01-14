package com.google.android.gms.analytics;

import X.AnonymousClass1AF;
import X.AnonymousClass1AH;
import X.AnonymousClass26U;
import X.C242819u;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

public final class AnalyticsService extends Service implements AnonymousClass1AH {
    public AnonymousClass1AF A00;

    @Override // X.AnonymousClass1AH
    public final boolean A2Q(int i) {
        return stopSelfResult(i);
    }

    @Override // X.AnonymousClass1AH
    public final void ARr(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final IBinder onBind(Intent intent) {
        if (this.A00 != null) {
            return null;
        }
        this.A00 = new AnonymousClass1AF(this);
        return null;
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
}
