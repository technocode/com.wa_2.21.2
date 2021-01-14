package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.18s  reason: invalid class name */
public class AnonymousClass18s implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();
    public final AtomicInteger A02 = new AtomicInteger();

    public AnonymousClass18s() {
        C001801b.A1R("GAC_Executor", "Name must not be null");
        this.A00 = "GAC_Executor";
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new RunnableEBaseShape1S0101000_I1(runnable, 0, 3));
        String str = this.A00;
        int andIncrement = this.A02.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
