package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.08m  reason: invalid class name and case insensitive filesystem */
public class C015408m {
    public static volatile C015408m A06;
    public final AnonymousClass00S A00;
    public final C015508n A01;
    public final C014508d A02;
    public final AnonymousClass00T A03;
    public final Object A04 = new Object();
    public final Map A05 = new HashMap();

    public C015408m(AnonymousClass00S r2, AnonymousClass00T r3, C015508n r4, C014508d r5) {
        this.A00 = r2;
        this.A03 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public static C015408m A00() {
        if (A06 == null) {
            synchronized (C015408m.class) {
                if (A06 == null) {
                    A06 = new C015408m(AnonymousClass00S.A00(), C002101e.A00(), C015508n.A00(), C014508d.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1 = r5.A04.A07("SELECT value FROM props WHERE key=?", new java.lang.String[]{r13}, "GET_PROP_VALUE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r1.moveToNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r6 = r1.getString(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r1.close();
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r10.put(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        X.AnonymousClass008.A0h(r8, r2, r12.A01, "PropsMessageStore/getProp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        if (r1 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0060, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r6 = null;
        r5 = r12.A02.A03();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(java.lang.String r13) {
        /*
            r12 = this;
            X.00S r8 = r12.A00
            long r2 = r8.A04()
            java.lang.Object r7 = r12.A04
            monitor-enter(r7)
            java.util.Map r10 = r12.A05     // Catch:{ all -> 0x0061 }
            boolean r0 = r10.containsKey(r13)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r10.get(r13)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0061 }
            monitor-exit(r7)     // Catch:{ all -> 0x0061 }
            return r0
        L_0x0019:
            monitor-exit(r7)     // Catch:{ all -> 0x0061 }
            r6 = 0
            X.08d r0 = r12.A02
            X.0OQ r5 = r0.A03()
            X.0BK r11 = r5.A04     // Catch:{ all -> 0x005a }
            java.lang.String r9 = "SELECT value FROM props WHERE key=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x005a }
            r4 = 0
            r1[r4] = r13     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "GET_PROP_VALUE"
            android.database.Cursor r1 = r11.A07(r9, r1, r0)     // Catch:{ all -> 0x005a }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r6 = r1.getString(r4)     // Catch:{ all -> 0x0051 }
        L_0x003b:
            r1.close()
            r5.close()
            monitor-enter(r7)
            r10.put(r13, r6)     // Catch:{ all -> 0x004e }
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            X.08n r1 = r12.A01
            java.lang.String r0 = "PropsMessageStore/getProp"
            X.AnonymousClass008.A0h(r8, r2, r1, r0)
            return r6
        L_0x004e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0051:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            if (r1 == 0) goto L_0x0059
            r1.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0
        L_0x005a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0
        L_0x0061:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015408m.A01(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r7) {
        /*
            r6 = this;
            X.08d r0 = r6.A02
            X.0OQ r5 = r0.A04()
            X.0BK r4 = r5.A04     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "props"
            java.lang.String r2 = "key=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0027 }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "deleteProp/DELETE_PROPS"
            r4.A01(r3, r2, r1, r0)     // Catch:{ all -> 0x0027 }
            r5.close()
            java.lang.Object r1 = r6.A04
            monitor-enter(r1)
            java.util.Map r0 = r6.A05     // Catch:{ all -> 0x0024 }
            r0.remove(r7)     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            throw r0
        L_0x0027:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015408m.A02(java.lang.String):void");
    }

    public void A03(String str, int i) {
        A05(str, String.valueOf(i));
    }

    public void A04(String str, long j) {
        A05(str, String.valueOf(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            X.00S r6 = r8.A00
            long r1 = r6.A04()
            X.08d r0 = r8.A02
            X.0OQ r7 = r0.A04()
            r0 = 2
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x003d }
            r5.<init>(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "key"
            r5.put(r0, r9)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "value"
            r5.put(r0, r10)     // Catch:{ all -> 0x003d }
            X.0BK r4 = r7.A04     // Catch:{ all -> 0x003d }
            java.lang.String r3 = "props"
            java.lang.String r0 = "PropsMessageStore/setProp/REPLACE_PROPS"
            r4.A05(r3, r5, r0)     // Catch:{ all -> 0x003d }
            r7.close()
            java.lang.Object r3 = r8.A04
            monitor-enter(r3)
            java.util.Map r0 = r8.A05     // Catch:{ all -> 0x003a }
            r0.put(r9, r10)     // Catch:{ all -> 0x003a }
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            X.08n r3 = r8.A01
            java.lang.String r0 = "PropsMessageStore/setProp"
            X.AnonymousClass008.A0h(r6, r1, r3, r0)
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015408m.A05(java.lang.String, java.lang.String):void");
    }
}
