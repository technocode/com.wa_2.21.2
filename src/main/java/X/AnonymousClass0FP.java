package X;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.0FP  reason: invalid class name */
public class AnonymousClass0FP extends AnonymousClass0EM {
    public static volatile AnonymousClass0FP A01;
    public final C002701k A00;

    public AnonymousClass0FP(C002701k r4, AnonymousClass00T r5) {
        super(new C02180Ay(new C56712j4(r5), null));
        this.A00 = r4;
    }

    @Override // X.AnonymousClass0EM
    public /* bridge */ /* synthetic */ Runnable A01(Object obj, Object obj2) {
        return A07((AnonymousClass0M3) obj, null);
    }

    public synchronized C60602pn A07(AnonymousClass0M3 r5, C60602pn r6) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) super.A00.get();
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int max = Math.max(1, Math.min(10, this.A00.A03(49)));
        if (corePoolSize != max) {
            AnonymousClass008.A0t("mediadownloadpriorityqueue/enqueue/updating thread pool size to ", max);
            if (max > corePoolSize) {
                threadPoolExecutor.setMaximumPoolSize(max);
                threadPoolExecutor.setCorePoolSize(max);
            } else {
                threadPoolExecutor.setCorePoolSize(max);
                threadPoolExecutor.setMaximumPoolSize(max);
            }
        }
        return (C60602pn) super.A01(r5, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(X.AnonymousClass0M3 r4) {
        /*
            r3 = this;
            r2 = r3
            monitor-enter(r2)
            java.util.Map r0 = r3.A01     // Catch:{ all -> 0x0016 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0016 }
            X.2is r0 = (X.RunnableC56592is) r0     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0013
            boolean r1 = r3.A05(r4, r0)     // Catch:{ all -> 0x0016 }
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            monitor-exit(r2)
            return r0
        L_0x0016:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FP.A08(X.0M3):boolean");
    }
}
