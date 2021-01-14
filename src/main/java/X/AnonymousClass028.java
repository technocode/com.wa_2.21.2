package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.028  reason: invalid class name */
public abstract class AnonymousClass028 {
    public final int A00;
    public final AnonymousClass025 A01;
    public final Set A02 = new HashSet();
    public final Executor A03;

    public void A01(String str) {
    }

    public AnonymousClass028(int i, Executor executor, AnonymousClass025 r4) {
        this.A00 = i;
        this.A03 = executor;
        this.A01 = r4;
    }

    public final void A00(String str, HashMap hashMap) {
        String str2;
        LinkedList linkedList;
        ThreadPoolExecutor threadPoolExecutor;
        int i = this.A00;
        if (i != 1) {
            str2 = i != 2 ? "UNKNOWN_ANOMALY" : "LONG_RUNNING_JOB";
        } else {
            str2 = "BLOCKED_QUEUE";
        }
        hashMap.put("anomalyName", str2);
        synchronized (this) {
            linkedList = new LinkedList(this.A02);
        }
        AnonymousClass025 r1 = this.A01;
        synchronized (r1) {
            threadPoolExecutor = (ThreadPoolExecutor) r1.A01.get(str);
        }
        this.A03.execute(new RunnableEBaseShape0S1400000_I0(this, linkedList, str, threadPoolExecutor, hashMap, 2));
    }
}
