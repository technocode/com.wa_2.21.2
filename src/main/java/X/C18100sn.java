package X;

import androidx.work.impl.WorkDatabase;

/* renamed from: X.0sn  reason: invalid class name and case insensitive filesystem */
public class C18100sn {
    public final WorkDatabase A00;

    public C18100sn(WorkDatabase workDatabase) {
        this.A00 = workDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r4 == Integer.MAX_VALUE) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r9, int r10) {
        /*
            r8 = this;
            java.lang.Class<X.0sn> r7 = X.C18100sn.class
            monitor-enter(r7)
            java.lang.String r5 = "next_job_scheduler_id"
            androidx.work.impl.WorkDatabase r6 = r8.A00     // Catch:{ all -> 0x0058 }
            r6.A02()     // Catch:{ all -> 0x0058 }
            X.0sX r0 = r6.A06()     // Catch:{ all -> 0x0053 }
            X.1d3 r0 = (X.C31341d3) r0
            java.lang.Long r0 = r0.A00(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0033
            int r4 = r0.intValue()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r0) goto L_0x0034
        L_0x0020:
            X.0sX r3 = r6.A06()
            long r1 = (long) r1
            X.0sW r0 = new X.0sW
            r0.<init>(r5, r1)
            X.1d3 r3 = (X.C31341d3) r3
            r3.A01(r0)
            r6.A04()
            goto L_0x0037
        L_0x0033:
            r4 = 0
        L_0x0034:
            int r1 = r4 + 1
            goto L_0x0020
        L_0x0037:
            r6.A03()
            if (r4 < r9) goto L_0x0040
            if (r4 > r10) goto L_0x0040
            r9 = r4
            goto L_0x0051
        L_0x0040:
            int r0 = r9 + 1
            X.0sX r3 = r6.A06()
            long r1 = (long) r0
            X.0sW r0 = new X.0sW
            r0.<init>(r5, r1)
            X.1d3 r3 = (X.C31341d3) r3
            r3.A01(r0)
        L_0x0051:
            monitor-exit(r7)
            return r9
        L_0x0053:
            r0 = move-exception
            r6.A03()
            throw r0
        L_0x0058:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18100sn.A00(int, int):int");
    }
}
