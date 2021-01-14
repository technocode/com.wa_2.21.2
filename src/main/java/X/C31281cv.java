package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1cv  reason: invalid class name and case insensitive filesystem */
public class C31281cv implements AbstractC17710s5 {
    public static final String A04 = AbstractC17610rq.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final C31221cl A02;
    public final C17790sH A03;

    public C31281cv(Context context, C31221cl r4) {
        C17790sH r0 = new C17790sH(context);
        this.A01 = context;
        this.A02 = r4;
        this.A00 = (JobScheduler) context.getSystemService("jobscheduler");
        this.A03 = r0;
    }

    public static List A00(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC17610rq.A00().A03(A04, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(android.content.Context r4, android.app.job.JobScheduler r5, java.lang.String r6) {
        /*
            java.util.List r1 = A00(r4, r5)
            if (r1 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            r0 = 2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x0012:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r3 = r4.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r3.getExtras()
            if (r1 == 0) goto L_0x0031
            boolean r0 = r1.containsKey(r2)     // Catch:{ NullPointerException -> 0x0031 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r1.getString(r2)     // Catch:{ NullPointerException -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0012
            int r0 = r3.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            goto L_0x0012
        L_0x0044:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31281cv.A01(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.List");
    }

    public static void A02(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            AbstractC17610rq.A00().A03(A04, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static void A03(Context context) {
        List<JobInfo> A002;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (A002 = A00(context, jobScheduler)) == null || A002.isEmpty())) {
            for (JobInfo jobInfo : A002) {
                A02(jobScheduler, jobInfo.getId());
            }
        }
    }

    public static void A04(Context context) {
        List<JobInfo> A002;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (A002 = A00(context, jobScheduler)) == null || A002.isEmpty())) {
            for (JobInfo jobInfo : A002) {
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    try {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID") && extras.getString("EXTRA_WORK_SPEC_ID") != null) {
                        }
                    } catch (NullPointerException unused) {
                    }
                }
                A02(jobScheduler, jobInfo.getId());
            }
        }
    }

    public void A05(C18030sf r10, int i) {
        int i2;
        JobInfo A012 = this.A03.A01(r10, i);
        AbstractC17610rq A002 = AbstractC17610rq.A00();
        String str = A04;
        A002.A02(str, String.format("Scheduling work ID %s Job ID %s", r10.A0D, Integer.valueOf(i)), new Throwable[0]);
        try {
            this.A00.schedule(A012);
        } catch (IllegalStateException e) {
            List A003 = A00(this.A01, this.A00);
            if (A003 != null) {
                i2 = A003.size();
            } else {
                i2 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = Integer.valueOf(((AbstractCollection) ((C31481dI) this.A02.A04.A09()).A03()).size());
            int i3 = 20;
            if (Build.VERSION.SDK_INT == 23) {
                i3 = 10;
            }
            objArr[2] = Integer.valueOf(i3);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            AbstractC17610rq.A00().A03(str, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            AbstractC17610rq.A00().A03(str, String.format("Unable to schedule %s", r10), th);
        }
    }

    @Override // X.AbstractC17710s5
    public void A2X(String str) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        List<Number> A012 = A01(context, jobScheduler, str);
        if (!(A012 == null || A012.isEmpty())) {
            for (Number number : A012) {
                A02(jobScheduler, number.intValue());
            }
            ((C31361d5) this.A02.A04.A07()).A02(str);
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AbstractC17710s5
    public void ANQ(C18030sf... r13) {
        int A002;
        List A012;
        int A003;
        C31221cl r8 = this.A02;
        WorkDatabase workDatabase = r8.A04;
        C18100sn r6 = new C18100sn(workDatabase);
        for (C18030sf r2 : r13) {
            workDatabase.A02();
            try {
                C18030sf A022 = ((C31481dI) workDatabase.A09()).A02(r2.A0D);
                if (A022 == null) {
                    AbstractC17610rq A004 = AbstractC17610rq.A00();
                    String str = A04;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Skipping scheduling ");
                    sb.append(r2.A0D);
                    sb.append(" because it's no longer in the DB");
                    A004.A05(str, sb.toString(), new Throwable[0]);
                    workDatabase.A04();
                } else if (A022.A0C != AnonymousClass0VU.ENQUEUED) {
                    AbstractC17610rq A005 = AbstractC17610rq.A00();
                    String str2 = A04;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Skipping scheduling ");
                    sb2.append(r2.A0D);
                    sb2.append(" because it is no longer enqueued");
                    A005.A05(str2, sb2.toString(), new Throwable[0]);
                    workDatabase.A04();
                } else {
                    C17960sY A006 = ((C31361d5) workDatabase.A07()).A00(r2.A0D);
                    if (A006 != null) {
                        A002 = A006.A00;
                    } else {
                        AnonymousClass01Z r0 = r8.A02;
                        A002 = r6.A00(r0.A03, r0.A01);
                        ((C31361d5) r8.A04.A07()).A01(new C17960sY(r2.A0D, A002));
                    }
                    A05(r2, A002);
                    if (Build.VERSION.SDK_INT == 23 && (A012 = A01(this.A01, this.A00, r2.A0D)) != null) {
                        int indexOf = A012.indexOf(Integer.valueOf(A002));
                        if (indexOf >= 0) {
                            A012.remove(indexOf);
                        }
                        if (!A012.isEmpty()) {
                            A003 = ((Integer) A012.get(0)).intValue();
                        } else {
                            AnonymousClass01Z r02 = r8.A02;
                            A003 = r6.A00(r02.A03, r02.A01);
                        }
                        A05(r2, A003);
                    }
                    workDatabase.A04();
                }
                workDatabase.A03();
            } catch (Throwable th) {
                workDatabase.A03();
                throw th;
            }
        }
    }
}
