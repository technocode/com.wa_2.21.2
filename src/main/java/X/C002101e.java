package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.01e  reason: invalid class name and case insensitive filesystem */
public final class C002101e implements AnonymousClass00T {
    public static Executor A03;
    public static ThreadPoolExecutor A04;
    public static ThreadPoolExecutor A05;
    public static final AnonymousClass024 A06;
    public static final BlockingQueue A07 = new AnonymousClass023();
    public static volatile AnonymousClass00T A08;
    public Handler A00;
    public final HashMap A01 = new HashMap();
    public final Set A02 = new HashSet();

    static {
        ExecutorC29321Xz r1 = ExecutorC29321Xz.A00;
        A03 = r1;
        A06 = new AnonymousClass024(r1);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AnonymousClass02A r12 = new AnonymousClass02A(timeUnit, A07, new AnonymousClass029(10, "WhatsApp Worker"));
        A05 = r12;
        r12.setRejectedExecutionHandler(AnonymousClass02B.A00);
        AnonymousClass024 r2 = A06;
        ThreadPoolExecutor threadPoolExecutor = A05;
        synchronized (r2) {
            r2.A00(threadPoolExecutor, AnonymousClass02C.A01);
        }
        A04 = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 120, timeUnit, new SynchronousQueue(), new AnonymousClass029(0, "High Pri Worker"));
    }

    public static AnonymousClass00T A00() {
        if (A08 == null) {
            synchronized (C002101e.class) {
                if (A08 == null) {
                    A08 = new C002101e();
                }
            }
        }
        return A08;
    }

    @Override // X.AnonymousClass00T
    public ThreadPoolExecutor A3T(String str, int i, int i2, long j, int i3, BlockingQueue blockingQueue) {
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(str)) {
            C04300Jv r3 = new C04300Jv(i, i2, j, TimeUnit.SECONDS, blockingQueue, new AnonymousClass029(i3, str));
            AnonymousClass024 r1 = A06;
            synchronized (r1) {
                r1.A00(r3, AnonymousClass02C.A01);
            }
            hashMap.put(str, r3);
            return r3;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0K("A thread pool with this prefix already exists: ", str));
    }

    @Override // X.AnonymousClass00T
    public Executor ACN() {
        return Executors.newSingleThreadExecutor();
    }

    @Override // X.AnonymousClass00T
    public synchronized void AMj(Runnable runnable) {
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override // X.AnonymousClass00T
    public final void ANC(AnonymousClass0JW r3, Object... objArr) {
        r3.A00.executeOnExecutor(A05, objArr);
    }

    @Override // X.AnonymousClass00T
    public void ANF(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = A05;
        A06.A02(threadPoolExecutor, runnable);
        threadPoolExecutor.execute(runnable);
    }

    @Override // X.AnonymousClass00T
    public void ANH(Runnable runnable, String str) {
        Set set = this.A02;
        synchronized (set) {
            if (set.add(str)) {
                ANF(new RunnableEBaseShape0S1200000_I0(this, runnable, str, 18));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("WaWorkers/runIfNotRunning skipping running task id:");
                sb.append(str);
                Log.d(sb.toString());
            }
        }
    }

    @Override // X.AnonymousClass00T
    public final void ANI(AnonymousClass0JW r3, Object... objArr) {
        r3.A00.executeOnExecutor(A04, objArr);
    }

    @Override // X.AnonymousClass00T
    public void ANJ(Runnable runnable) {
        A04.execute(runnable);
    }

    @Override // X.AnonymousClass00T
    public synchronized Runnable ANO(Runnable runnable, long j) {
        RunnableEBaseShape4S0200000_I0_3 runnableEBaseShape4S0200000_I0_3;
        Handler handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("WhatsApp Worker Scheduler", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        runnableEBaseShape4S0200000_I0_3 = new RunnableEBaseShape4S0200000_I0_3(this, runnable, 16);
        handler.postDelayed(runnableEBaseShape4S0200000_I0_3, j);
        return runnableEBaseShape4S0200000_I0_3;
    }
}
