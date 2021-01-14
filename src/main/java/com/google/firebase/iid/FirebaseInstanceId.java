package com.google.firebase.iid;

import X.AbstractC011406u;
import X.AnonymousClass05T;
import X.AnonymousClass07M;
import X.AnonymousClass07Z;
import X.AnonymousClass07o;
import X.C008805h;
import X.C011506v;
import X.C012007a;
import X.C012207c;
import X.C012407e;
import X.C012807i;
import X.C012907j;
import X.C013207n;
import X.C36191lj;
import X.C37031nQ;
import X.C37061nT;
import X.ThreadFactoryC012107b;
import X.ThreadFactoryC240418r;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstanceId {
    public static C012207c A08;
    public static ScheduledThreadPoolExecutor A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public C012407e A00;
    public boolean A01 = false;
    public final AnonymousClass05T A02;
    public final C012907j A03;
    public final C012007a A04;
    public final C013207n A05;
    public final C012807i A06;
    public final Executor A07;

    public FirebaseInstanceId(AnonymousClass05T r23, AnonymousClass07M r24, AnonymousClass07Z r25) {
        r23.A03();
        Context context = r23.A00;
        C012007a r2 = new C012007a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = ThreadFactoryC012107b.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
        if (C012007a.A00(r23) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (A08 == null) {
                    r23.A03();
                    A08 = new C012207c(context);
                }
            }
            this.A02 = r23;
            this.A04 = r2;
            C012407e r1 = this.A00;
            if (r1 == null) {
                r23.A03();
                r1 = (C012407e) r23.A03.A02(C012407e.class);
                if (r1 == null || r1.A01.A01() == 0) {
                    r1 = new C012407e(r23, r2, threadPoolExecutor, r25);
                    this.A00 = r1;
                } else {
                    this.A00 = r1;
                }
            }
            this.A00 = r1;
            this.A07 = threadPoolExecutor2;
            this.A06 = new C012807i(A08);
            C012907j r12 = new C012907j(this, r24);
            this.A03 = r12;
            this.A05 = new C013207n(threadPoolExecutor);
            if (r12.A00()) {
                A06();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static AnonymousClass07o A00(String str, String str2) {
        AnonymousClass07o r4;
        C012207c r3 = A08;
        synchronized (r3) {
            r4 = null;
            String string = r3.A01.getString(C012207c.A01(str, str2), null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        r4 = new AnonymousClass07o(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("Failed to parse token: ");
                        sb.append(valueOf);
                        Log.w("FirebaseInstanceId", sb.toString());
                    }
                } else {
                    r4 = new AnonymousClass07o(string, null, 0);
                }
            }
        }
        return r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01() {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.A01():java.lang.String");
    }

    public static void A02(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = A09;
            if (scheduledThreadPoolExecutor == null) {
                scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC240418r("FirebaseInstanceId"));
                A09 = scheduledThreadPoolExecutor;
            }
            scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static boolean A03() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    public final Object A04(AbstractC011406u r4) {
        try {
            return C008805h.A0Y(r4, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    A08();
                }
                throw cause;
            } else if (cause instanceof RuntimeException) {
                throw cause;
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public String A05(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            C011506v r5 = new C011506v();
            r5.A08(null);
            Executor executor = this.A07;
            C37031nQ r3 = new C37031nQ(this, str, str2);
            C011506v r2 = new C011506v();
            r5.A03.A01(new C36191lj(executor, r3, r2));
            r5.A06();
            return ((C37061nT) A04(r2)).A00;
        }
        throw new IOException("MAIN_THREAD");
    }

    public final void A06() {
        boolean z;
        if (!A0B(A00(C012007a.A00(this.A02), "*"))) {
            C012807i r2 = this.A06;
            synchronized (r2) {
                z = false;
                if (r2.A00() != null) {
                    z = true;
                }
            }
            if (!z) {
                return;
            }
        }
        A07();
    }

    public final synchronized void A07() {
        if (!this.A01) {
            A09(0);
        }
    }

    public final synchronized void A08() {
        A08.A02();
        if (this.A03.A00()) {
            A07();
        }
    }

    public final synchronized void A09(long j) {
        A02(new RunnableEBaseShape0S0300100_I0(this, this.A06, Math.min(Math.max(30L, j << 1), A0A)), j);
        this.A01 = true;
    }

    public final synchronized void A0A(boolean z) {
        this.A01 = z;
    }

    public final boolean A0B(AnonymousClass07o r9) {
        if (r9 != null) {
            String A042 = this.A04.A04();
            if (System.currentTimeMillis() > r9.A00 + AnonymousClass07o.A03 || !A042.equals(r9.A02)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static FirebaseInstanceId getInstance(AnonymousClass05T r2) {
        r2.A03();
        return (FirebaseInstanceId) r2.A03.A02(FirebaseInstanceId.class);
    }
}
