package X;

import android.app.Service;
import android.app.job.JobServiceEngine;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0PF  reason: invalid class name */
public abstract class AnonymousClass0PF extends Service {
    public static final Object A05 = new Object();
    public static final HashMap A06 = new HashMap();
    public AsyncTaskC14490mN A00;
    public AbstractC14500mO A01;
    public AbstractC14520mQ A02;
    public boolean A03 = false;
    public final ArrayList A04;

    public AnonymousClass0PF() {
        if (Build.VERSION.SDK_INT < 26) {
            this.A04 = new ArrayList();
        }
    }

    public static void A01(Context context, Class cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (A05) {
                HashMap hashMap = A06;
                AbstractC14520mQ r0 = (AbstractC14520mQ) hashMap.get(componentName);
                if (r0 == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        r0 = new C29951aT(context, componentName, i);
                    } else {
                        r0 = new C29911aP(context, componentName);
                    }
                    hashMap.put(componentName, r0);
                }
                r0.A01(i);
                r0.A02(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r2.getIntent().setExtrasClassLoader(r4.A01.getClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return new X.C29931aR(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC14510mP A02() {
        /*
            r5 = this;
            X.0mO r4 = r5.A01
            r3 = 0
            if (r4 == 0) goto L_0x002d
            X.1aS r4 = (X.job.JobServiceEngineC29941aS) r4
            java.lang.Object r1 = r4.A02
            monitor-enter(r1)
            android.app.job.JobParameters r0 = r4.A00     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0010
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            return r3
        L_0x0010:
            android.app.job.JobWorkItem r2 = r0.dequeueWork()     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0029
            android.content.Intent r1 = r2.getIntent()
            X.0PF r0 = r4.A01
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.setExtrasClassLoader(r0)
            X.1aR r3 = new X.1aR
            r3.<init>(r4, r2)
        L_0x0029:
            return r3
        L_0x002a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x002d:
            java.util.ArrayList r1 = r5.A04
            monitor-enter(r1)
            int r0 = r1.size()     // Catch:{ all -> 0x0041 }
            if (r0 <= 0) goto L_0x003f
            r0 = 0
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x0041 }
            X.0mP r0 = (X.AbstractC14510mP) r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            return r0
        L_0x003f:
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            return r3
        L_0x0041:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PF.A02():X.0mP");
    }

    public void A03() {
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A00 = null;
                if (arrayList.size() > 0) {
                    A04(false);
                } else if (!this.A03) {
                    this.A02.A00();
                }
            }
        }
    }

    public void A04(boolean z) {
        if (this.A00 == null) {
            this.A00 = new AsyncTaskC14490mN(this);
            AbstractC14520mQ r3 = this.A02;
            if (r3 != null && z && (r3 instanceof C29911aP)) {
                C29911aP r32 = (C29911aP) r3;
                synchronized (r32) {
                    if (!r32.A01) {
                        r32.A01 = true;
                        r32.A04.acquire(600000);
                        r32.A03.release();
                    }
                }
            }
            this.A00.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r21) {
        /*
        // Method dump skipped, instructions count: 560
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PF.A05(android.content.Intent):void");
    }

    public IBinder onBind(Intent intent) {
        AbstractC14500mO r0 = this.A01;
        if (r0 != null) {
            return ((JobServiceEngine) r0).getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.A01 = new job.JobServiceEngineC29941aS(this);
            this.A02 = null;
            return;
        }
        this.A01 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = A06;
        AbstractC14520mQ r0 = (AbstractC14520mQ) hashMap.get(componentName);
        if (r0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            r0 = new C29911aP(this, componentName);
            hashMap.put(componentName, r0);
        }
        this.A02 = r0;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.A03 = true;
                this.A02.A00();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            return 2;
        }
        AbstractC14520mQ r1 = this.A02;
        if (r1 instanceof C29911aP) {
            C29911aP r12 = (C29911aP) r1;
            synchronized (r12) {
                r12.A00 = false;
            }
        }
        synchronized (arrayList) {
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C29921aQ(this, intent, i2));
            A04(true);
        }
        return 3;
    }
}
