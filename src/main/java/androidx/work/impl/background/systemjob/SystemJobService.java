package androidx.work.impl.background.systemjob;

import X.AbstractC17610rq;
import X.AnonymousClass0s4;
import X.C31221cl;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements AnonymousClass0s4 {
    public static final String A02 = AbstractC17610rq.A01("SystemJobService");
    public C31221cl A00;
    public final Map A01 = new HashMap();

    @Override // X.AnonymousClass0s4
    public void AFn(String str, boolean z) {
        JobParameters jobParameters;
        AbstractC17610rq.A00().A02(A02, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        Map map = this.A01;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C31221cl A002 = C31221cl.A00(getApplicationContext());
            this.A00 = A002;
            A002.A03.A01(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                AbstractC17610rq.A00().A05(A02, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C31221cl r0 = this.A00;
        if (r0 != null) {
            r0.A03.A02(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        r2 = null;
        r1 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r1 < 24) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        r2 = new X.C17700s2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (r1 < 28) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r2.A00 = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r8.A00.A06(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStopJob(android.app.job.JobParameters r8) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
