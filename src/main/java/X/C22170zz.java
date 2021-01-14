package X;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0zz  reason: invalid class name and case insensitive filesystem */
public class C22170zz {
    public static final UUID A07 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;
    public final boolean A06 = true;

    public C22170zz() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        this.A05 = handlerThread;
        handlerThread.start();
        this.A03 = new Handler(this.A05.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        this.A04 = handlerThread2;
        handlerThread2.start();
        this.A02 = new Handler(this.A04.getLooper());
    }

    public synchronized C22160zy A00(Callable callable, String str, long j) {
        C22160zy r4;
        r4 = new C22160zy(this, this.A01, callable, str);
        this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis() + j);
        return r4;
    }

    public synchronized C22160zy A01(Callable callable, String str, AbstractC33031g5 r11) {
        C22160zy r4;
        r4 = new C22160zy(this, this.A01, callable, str);
        if (r11 != null) {
            synchronized (r4) {
                if (r4.isDone()) {
                    try {
                        r4.A03.A05(r4.A02, new RunnableEBaseShape1S0310000_I1(true, r11, r4.get(), (Exception) null));
                    } catch (CancellationException e) {
                        r4.A03.A05(r4.A02, new RunnableEBaseShape1S0310000_I1(false, r11, (Object) null, (Exception) e));
                    } catch (InterruptedException | ExecutionException e2) {
                        r4.A03.A05(r4.A02, new RunnableEBaseShape1S0310000_I1(false, r11, (Object) null, e2));
                    }
                } else {
                    r4.A01.add(r11);
                }
            }
        }
        this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis());
        return r4;
    }

    public Object A02(Callable callable, String str) {
        C22160zy r1;
        synchronized (this) {
            r1 = new C22160zy(this, this.A01, callable, str);
            this.A02.post(r1);
        }
        return r1.get();
    }

    public Object A03(Callable callable, String str) {
        C22160zy r1;
        synchronized (this) {
            r1 = new C22160zy(this, this.A01, callable, str);
            this.A02.post(r1);
        }
        AbstractC22140zw r0 = (AbstractC22140zw) r1.get();
        r0.A2I();
        return r0.A8p();
    }

    public void A04(String str) {
        if (!A08()) {
            StringBuilder A0Y = AnonymousClass008.A0Y(str, " Current thread: ");
            A0Y.append(Thread.currentThread().getName());
            throw new RuntimeException(A0Y.toString());
        }
    }

    public synchronized void A05(UUID uuid, Runnable runnable) {
        UUID uuid2 = this.A01;
        if ((uuid2 != null && uuid2.equals(uuid)) || A07.equals(uuid)) {
            Handler handler = this.A00;
            if (handler != null) {
                handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
            } else {
                AnonymousClass100.A00.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
            }
        }
    }

    public synchronized void A06(Callable callable, String str) {
        A01(callable, str, null);
    }

    public synchronized void A07(FutureTask futureTask) {
        this.A03.removeCallbacks(futureTask);
    }

    public boolean A08() {
        return this.A03.getLooper().getThread() == Thread.currentThread();
    }

    public void finalize() {
        super.finalize();
        HandlerThread handlerThread = this.A04;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            handlerThread.quitSafely();
        } else {
            handlerThread.quit();
        }
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        HandlerThread handlerThread2 = this.A05;
        if (i >= 18) {
            handlerThread2.quitSafely();
        } else {
            handlerThread2.quit();
        }
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
    }
}
