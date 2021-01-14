package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0wx  reason: invalid class name and case insensitive filesystem */
public class ThreadFactoryC20590wx implements ThreadFactory {
    public final int A00 = 10;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);
    public final boolean A03;

    public ThreadFactoryC20590wx(String str) {
        this.A01 = str;
        this.A03 = true;
    }

    public Thread newThread(Runnable runnable) {
        String str;
        RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0 = new RunnableEBaseShape5S0200000_I1_0(this, runnable, 23);
        if (this.A03) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.A01);
            sb.append("-");
            sb.append(this.A02.getAndIncrement());
            str = sb.toString();
        } else {
            str = this.A01;
        }
        return new Thread(runnableEBaseShape5S0200000_I1_0, str);
    }
}
