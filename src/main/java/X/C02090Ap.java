package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Ap  reason: invalid class name and case insensitive filesystem */
public class C02090Ap {
    public static volatile C02090Ap A02;
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();

    public static C02090Ap A00() {
        if (A02 == null) {
            synchronized (C02090Ap.class) {
                if (A02 == null) {
                    C000300f.A00();
                    A02 = new C02090Ap();
                }
            }
        }
        return A02;
    }

    public void A01() {
        synchronized (this) {
            List list = this.A00;
            list.size();
            List list2 = this.A01;
            list2.size();
            list.clear();
            list2.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2.A01.size() > 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x0015 }
            int r0 = r0.size()     // Catch:{ all -> 0x0015 }
            if (r0 > 0) goto L_0x0012
            java.util.List r0 = r2.A01     // Catch:{ all -> 0x0015 }
            int r1 = r0.size()     // Catch:{ all -> 0x0015 }
            r0 = 0
            if (r1 <= 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02090Ap.A02():boolean");
    }
}
