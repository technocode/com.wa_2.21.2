package X;

import android.os.Process;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.01v  reason: invalid class name and case insensitive filesystem */
public class C003801v extends Thread {
    public static final Runnable A05 = RunnableC29311Xy.A00;
    public static volatile boolean A06;
    public AnonymousClass009 A00;
    public AnonymousClass00Z A01 = new AnonymousClass00Z(1, 20, 20, true);
    public AtomicInteger A02 = new AtomicInteger(0);
    public final BlockingQueue A03 = new ArrayBlockingQueue(2048, true);
    public volatile boolean A04;

    public C003801v() {
        super("Logger (2.21.2.4(267728432))");
    }

    public final void A00() {
        AnonymousClass009 r2;
        Object obj = null;
        do {
            try {
                obj = this.A03.take();
                continue;
            } catch (InterruptedException unused) {
            }
        } while (obj == null);
        if (obj instanceof String) {
            Log.doLogToFile((String) obj);
        } else if (obj instanceof FutureTask) {
            ((FutureTask) obj).run();
        } else {
            throw new IllegalStateException("Invalid log item type");
        }
        if (this.A04 && this.A03.isEmpty()) {
            Log.blockingLog(4, "log/emptyingqueue/end");
            StringBuilder sb = new StringBuilder("log/emptyingqueue/skipped ");
            sb.append(this.A02);
            sb.append(" entries");
            Log.blockingLog(4, sb.toString());
            this.A02.set(0);
            A06 = true;
            this.A04 = false;
            if (this.A01.A00()) {
                synchronized (this) {
                    r2 = this.A00;
                    if (r2 == null) {
                        throw null;
                    }
                }
                r2.A03("Logging queue became full", 2);
            }
        }
    }

    public final void A01(Object obj) {
        AnonymousClass009 r2;
        Thread currentThread = Thread.currentThread();
        if (currentThread == this) {
            Log.blockingLog(1, "Cannot add a log item from the logging thread. Attempting to crash.");
            throw new AssertionError("Cannot add a log item from the logging thread.");
        } else if (this.A04) {
            this.A02.incrementAndGet();
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    if (this.A03.offer(obj, 1000, TimeUnit.MILLISECONDS)) {
                        break;
                    } else if (SystemClock.elapsedRealtime() - elapsedRealtime >= 2000 && !z) {
                        try {
                            synchronized (this) {
                                r2 = this.A00;
                                if (r2 == null) {
                                    throw null;
                                }
                            }
                            r2.A04("addLogItem waited for 2 seconds", null, true);
                            if (!this.A04 && !A06) {
                                this.A04 = true;
                                this.A02.incrementAndGet();
                                Log.blockingLog(4, "log/emptyingqueue/start");
                                break;
                            }
                            z = true;
                        } catch (InterruptedException unused) {
                            z = true;
                            z2 = true;
                        }
                    }
                } catch (InterruptedException unused2) {
                    z2 = true;
                }
            }
            if (z2) {
                currentThread.interrupt();
            }
        }
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            A00();
        }
    }
}
