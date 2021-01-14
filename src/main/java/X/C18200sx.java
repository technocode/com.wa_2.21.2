package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.0sx  reason: invalid class name and case insensitive filesystem */
public class C18200sx {
    public static final String A05 = AbstractC17610rq.A01("WorkTimer");
    public final Object A00 = new Object();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final ScheduledExecutorService A03;
    public final ThreadFactory A04;

    public C18200sx() {
        ThreadFactoryC18180sv r1 = new ThreadFactoryC18180sv();
        this.A04 = r1;
        this.A03 = Executors.newSingleThreadScheduledExecutor(r1);
    }

    public void A00(String str) {
        synchronized (this.A00) {
            if (((RunnableEBaseShape1S1100000_I1) this.A02.remove(str)) != null) {
                AbstractC17610rq.A00().A02(A05, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.A01.remove(str);
            }
        }
    }
}
