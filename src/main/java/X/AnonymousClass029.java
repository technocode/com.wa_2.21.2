package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.029  reason: invalid class name */
public class AnonymousClass029 implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public AnonymousClass029(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public Thread newThread(Runnable runnable) {
        RunnableEBaseShape4S0200000_I0_3 runnableEBaseShape4S0200000_I0_3 = new RunnableEBaseShape4S0200000_I0_3(this, runnable, 15);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" #");
        sb.append(this.A02.getAndIncrement());
        return new Thread(runnableEBaseShape4S0200000_I0_3, sb.toString());
    }
}
