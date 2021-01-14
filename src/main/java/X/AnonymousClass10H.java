package X;

import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.logger.Logger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.10H  reason: invalid class name */
public final class AnonymousClass10H {
    public static final ThreadLocal A06 = new AnonymousClass10G();
    public static volatile AnonymousClass10H A07;
    public AnonymousClass10I A00;
    public final SparseArray A01;
    public final C33401gg A02;
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final AtomicReference A04;
    public final AtomicReferenceArray A05 = new AtomicReferenceArray(2);

    public AnonymousClass10H(SparseArray sparseArray, C33381ge r4, C33401gg r5) {
        this.A01 = sparseArray;
        this.A04 = new AtomicReference(r4);
        this.A02 = r5;
    }

    public final AnonymousClass10P A00(int i, long j) {
        if (this.A03.get() == 0) {
            return null;
        }
        int i2 = 0;
        do {
            AnonymousClass10P r3 = (AnonymousClass10P) this.A05.get(i2);
            if (!(r3 == null || (r3.A01 & i) == 0)) {
                long j2 = r3.A04;
                if (r3.A08 == null && j2 == j) {
                    return r3;
                }
            }
            i2++;
        } while (i2 < 2);
        return null;
    }

    public final AnonymousClass10P A01(long j) {
        if (this.A03.get() == 0) {
            return null;
        }
        int i = 0;
        do {
            AnonymousClass10P r3 = (AnonymousClass10P) this.A05.get(i);
            if (r3 != null && r3.A05 == j) {
                return r3;
            }
            i++;
        } while (i < 2);
        return null;
    }

    public final void A02() {
        AnonymousClass10J r2;
        HandlerThread handlerThread;
        if (this.A00 == null) {
            C33401gg r3 = this.A02;
            synchronized (AnonymousClass10J.class) {
                r2 = AnonymousClass10J.A01;
                if (r2 == null) {
                    r2 = new AnonymousClass10J();
                    AnonymousClass10J.A01 = r2;
                }
            }
            synchronized (r2) {
                if (r2.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    r2.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = r2.A00;
            }
            this.A00 = new AnonymousClass10I(r3, handlerThread.getLooper());
        }
    }

    public final void A03(int i, int i2, long j, int i3) {
        AnonymousClass10P A002 = A00(i, j);
        if (A002 != null) {
            A05(A002);
            StringBuilder sb = new StringBuilder("STOP PROFILO_TRACEID: ");
            sb.append(C20200wJ.A00(A002.A05));
            Log.w("Profilo/TraceControl", sb.toString());
            synchronized (this) {
                A02();
                if (i2 == 0) {
                    Logger.postFinishTrace(38, A002.A05);
                    this.A00.A00(new AnonymousClass10P(A002, i3));
                } else if (i2 == 1) {
                    Logger.postFinishTrace(61, A002.A05);
                    this.A00.A01(A002);
                }
            }
        }
    }

    public void A04(long j, int i) {
        AnonymousClass10P A012 = A01(j);
        if (A012 != null && A012.A05 == j) {
            A05(A012);
            synchronized (this) {
                A02();
                this.A00.A00(new AnonymousClass10P(A012, i));
            }
        }
    }

    public final void A05(AnonymousClass10P r6) {
        AtomicInteger atomicInteger;
        int i;
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.A05.compareAndSet(i2, r6, null)) {
                do {
                    atomicInteger = this.A03;
                    i = atomicInteger.get();
                } while (!atomicInteger.compareAndSet(i, (1 << i2) ^ i));
                return;
            }
        }
        Log.w("Profilo/TraceControl", "Could not reset Trace Context to null");
    }
}
