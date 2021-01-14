package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0oX  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC15710oX {
    public static HandlerC15690oV A05;
    public static final BlockingQueue A06;
    public static final Executor A07;
    public static final ThreadFactory A08 = new ThreadFactoryC15660oS();
    public final CallableC30341bA A00;
    public final FutureTask A01;
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final AtomicBoolean A03 = new AtomicBoolean();
    public volatile EnumC15700oW A04 = EnumC15700oW.PENDING;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        A06 = linkedBlockingQueue;
        A07 = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, A08);
    }

    public AbstractC15710oX() {
        CallableC30341bA r1 = new CallableC30341bA(this);
        this.A00 = r1;
        this.A01 = new C15670oT(this, r1);
    }

    public void A00(Object obj) {
        HandlerC15690oV r3;
        synchronized (AbstractC15710oX.class) {
            r3 = A05;
            if (r3 == null) {
                r3 = new HandlerC15690oV();
                A05 = r3;
            }
        }
        r3.obtainMessage(1, new C15680oU(this, obj)).sendToTarget();
    }
}
