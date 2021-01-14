package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: X.1AJ  reason: invalid class name */
public final class AnonymousClass1AJ {
    public static final Method A00;
    public static final Method A01;
    public static volatile AnonymousClass1AK A02 = C35751ks.A00;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    static {
        /*
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "JobSchedulerCompat"
            r5 = 6
            r2 = 0
            r6 = 24
            if (r0 < r6) goto L_0x0034
            java.lang.Class<android.app.job.JobScheduler> r8 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            r0 = 4
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0029 }
            r1 = 0
            java.lang.Class<android.app.job.JobInfo> r0 = android.app.job.JobInfo.class
            r4[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0029 }
            r0 = 1
            r4[r0] = r9     // Catch:{ NoSuchMethodException -> 0x0029 }
            r1 = 2
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0029 }
            r4[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0029 }
            r0 = 3
            r4[r0] = r9     // Catch:{ NoSuchMethodException -> 0x0029 }
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r7, r4)     // Catch:{ NoSuchMethodException -> 0x0029 }
            goto L_0x0035
        L_0x0029:
            boolean r0 = android.util.Log.isLoggable(r3, r5)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r3, r0)
        L_0x0034:
            r0 = r2
        L_0x0035:
            X.AnonymousClass1AJ.A00 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L_0x004f
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            java.lang.String r0 = "myUserId"
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0044 }
            goto L_0x004f
        L_0x0044:
            boolean r0 = android.util.Log.isLoggable(r3, r5)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r3, r0)
        L_0x004f:
            X.AnonymousClass1AJ.A01 = r2
            X.1AK r0 = X.C35751ks.A00
            X.AnonymousClass1AJ.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AJ.<clinit>():void");
    }

    public static void A00(Context context, JobInfo jobInfo) {
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(jobInfo);
    }
}
