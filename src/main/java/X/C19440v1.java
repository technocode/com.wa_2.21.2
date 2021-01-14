package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.0v1  reason: invalid class name and case insensitive filesystem */
public class C19440v1 {
    public static int A00 = Integer.MAX_VALUE;
    public static final int A01 = Math.max((int) (((float) Runtime.getRuntime().availableProcessors()) * 1.5f), 3);
    public static final Handler A02 = new Handler(Looper.getMainLooper());
    public static volatile C32181eT A03;

    public static C32181eT A00() {
        if (A03 == null) {
            synchronized (C19440v1.class) {
                if (A03 == null) {
                    A03 = new C32181eT(A01);
                }
            }
        }
        return A03;
    }

    public static void A01(AbstractRunnableC19430v0 r3) {
        int i = A00;
        A00 = i - 1;
        r3.A00 = ((long) i) << 32;
        r3.A02 = null;
        r3.A01 = 0;
        A00().A00.add(r3);
    }

    public static void A02(AbstractRunnableC19430v0 r3, String str) {
        int i = A00;
        A00 = i - 1;
        r3.A00 = ((long) i) << 32;
        r3.A02 = str;
        r3.A01 = 0;
        A00().A00.add(r3);
    }

    public static void A03(String str) {
        BlockingQueue<AbstractRunnableC19430v0> blockingQueue = A00().A00;
        for (AbstractRunnableC19430v0 r1 : blockingQueue) {
            if (str.equals(r1.A02)) {
                blockingQueue.remove(r1);
                if (r1 instanceof C32191eU) {
                    C19470v5.A0B.release();
                } else if (!(r1 instanceof C32081eJ)) {
                    continue;
                } else {
                    C19650vN r2 = ((C32081eJ) r1).A05;
                    if (r2 == null) {
                        throw null;
                    } else if (Looper.getMainLooper() == Looper.myLooper()) {
                        r2.A0C = 0;
                        if (r2.A08 == null && r2.A09 == null) {
                            r2.A03();
                        }
                    } else {
                        A02.post(r2.A0A);
                    }
                }
            }
        }
    }
}
