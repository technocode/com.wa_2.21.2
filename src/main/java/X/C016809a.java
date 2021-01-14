package X;

/* renamed from: X.09a  reason: invalid class name and case insensitive filesystem */
public class C016809a {
    public static volatile C016809a A03;
    public final C015308l A00;
    public final C014508d A01;
    public final C015708p A02;

    public C016809a(C015308l r1, C015708p r2, C014508d r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static C016809a A00() {
        if (A03 == null) {
            synchronized (C016809a.class) {
                if (A03 == null) {
                    A03 = new C016809a(C015308l.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass0ZA r7) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016809a.A01(X.0ZA):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass0ZA r7, long r8) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016809a.A02(X.0ZA, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r9, X.AnonymousClass0ZA r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            long r0 = r10.A0p
            r7 = 0
            r6 = 1
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r2 = 0
            if (r3 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.String r0 = "OrderMessageStore/fillOrderDataIfAvailable/message must have row_id set; key="
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            X.03n r0 = r10.A0n
            X.AnonymousClass008.A1R(r1, r0, r2)
            java.lang.String[] r3 = new java.lang.String[r6]
            long r0 = r10.A0p
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r7] = r0
            X.08d r0 = r8.A01
            X.0OQ r2 = r0.A03()
            X.0BK r0 = r2.A04     // Catch:{ all -> 0x0049 }
            android.database.Cursor r1 = r0.A07(r9, r3, r11)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0045
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003a
            X.08l r0 = r8.A00     // Catch:{ all -> 0x003e }
            r10.A12(r1, r12, r0)     // Catch:{ all -> 0x003e }
        L_0x003a:
            r1.close()
            goto L_0x0045
        L_0x003e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        L_0x0045:
            r2.close()
            return
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016809a.A03(java.lang.String, X.0ZA, java.lang.String, boolean):void");
    }
}
