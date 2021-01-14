package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.092  reason: invalid class name */
public class AnonymousClass092 {
    public static volatile AnonymousClass092 A04;
    public final C015308l A00;
    public final C014508d A01;
    public final C015708p A02;
    public final Map A03 = new HashMap();

    public AnonymousClass092(C015308l r2, C015708p r3, C014508d r4) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r2 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C28601Uy A00(X.AnonymousClass02U r12) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass092.A00(X.02U):X.1Uy");
    }

    public final void A01(AnonymousClass02U r3) {
        Map map = this.A03;
        synchronized (map) {
            map.remove(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass02U r15, long r16) {
        /*
            r14 = this;
            X.08d r0 = r14.A01
            X.0OQ r2 = r0.A04()
            X.0Rk r6 = r2.A00()     // Catch:{ all -> 0x0050 }
            X.08p r3 = r14.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "UPDATE group_notification_version SET announcement_version = ? WHERE group_jid_row_id = ?"
            java.lang.String r0 = "UPDATE_GROUP_NOTIFICATION_ANNOUNCEMENT_VERSION"
            X.1VB r5 = r3.A01(r1, r0)     // Catch:{ all -> 0x0049 }
            r4 = 1
            r10 = r16
            r5.A06(r4, r10)     // Catch:{ all -> 0x0049 }
            r3 = 2
            X.08l r0 = r14.A00     // Catch:{ all -> 0x0049 }
            long r0 = r0.A02(r15)     // Catch:{ all -> 0x0049 }
            r5.A06(r3, r0)     // Catch:{ all -> 0x0049 }
            int r0 = r5.A00()     // Catch:{ all -> 0x0049 }
            if (r0 == r4) goto L_0x0035
            r8 = 0
            r12 = r8
            X.1Uy r7 = new X.1Uy     // Catch:{ all -> 0x0049 }
            r7.<init>(r8, r10, r12)     // Catch:{ all -> 0x0049 }
            r14.A05(r15, r7)     // Catch:{ all -> 0x0049 }
        L_0x0035:
            r6.A00()     // Catch:{ all -> 0x0049 }
            r1 = 34
            java.lang.RunnableEBaseShape2S0200000_I0_1 r0 = new java.lang.RunnableEBaseShape2S0200000_I0_1     // Catch:{ all -> 0x0049 }
            r0.<init>(r14, r15, r1)     // Catch:{ all -> 0x0049 }
            r2.A02(r0)     // Catch:{ all -> 0x0049 }
            r6.close()
            r2.close()
            return
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass092.A02(X.02U, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass02U r15, long r16) {
        /*
            r14 = this;
            X.08d r0 = r14.A01
            X.0OQ r2 = r0.A04()
            X.0Rk r6 = r2.A00()     // Catch:{ all -> 0x0050 }
            X.08p r3 = r14.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "UPDATE group_notification_version SET participant_version = ? WHERE group_jid_row_id = ?"
            java.lang.String r0 = "UPDATE_GROUP_NOTIFICATION_PARTICIPANT_VERSION"
            X.1VB r5 = r3.A01(r1, r0)     // Catch:{ all -> 0x0049 }
            r4 = 1
            r12 = r16
            r5.A06(r4, r12)     // Catch:{ all -> 0x0049 }
            r3 = 2
            X.08l r0 = r14.A00     // Catch:{ all -> 0x0049 }
            long r0 = r0.A02(r15)     // Catch:{ all -> 0x0049 }
            r5.A06(r3, r0)     // Catch:{ all -> 0x0049 }
            int r0 = r5.A00()     // Catch:{ all -> 0x0049 }
            if (r0 == r4) goto L_0x0035
            r8 = 0
            r10 = r8
            X.1Uy r7 = new X.1Uy     // Catch:{ all -> 0x0049 }
            r7.<init>(r8, r10, r12)     // Catch:{ all -> 0x0049 }
            r14.A05(r15, r7)     // Catch:{ all -> 0x0049 }
        L_0x0035:
            r6.A00()     // Catch:{ all -> 0x0049 }
            r1 = 35
            java.lang.RunnableEBaseShape2S0200000_I0_1 r0 = new java.lang.RunnableEBaseShape2S0200000_I0_1     // Catch:{ all -> 0x0049 }
            r0.<init>(r14, r15, r1)     // Catch:{ all -> 0x0049 }
            r2.A02(r0)     // Catch:{ all -> 0x0049 }
            r6.close()
            r2.close()
            return
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass092.A03(X.02U, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass02U r15, long r16) {
        /*
            r14 = this;
            X.08d r0 = r14.A01
            X.0OQ r2 = r0.A04()
            X.0Rk r6 = r2.A00()     // Catch:{ all -> 0x0050 }
            X.08p r3 = r14.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "UPDATE group_notification_version SET subject_timestamp = ? WHERE group_jid_row_id = ?"
            java.lang.String r0 = "UPDATE_GROUP_NOTIFICATION_SUBJECT_TIMESTAMP"
            X.1VB r5 = r3.A01(r1, r0)     // Catch:{ all -> 0x0049 }
            r4 = 1
            r8 = r16
            r5.A06(r4, r8)     // Catch:{ all -> 0x0049 }
            r3 = 2
            X.08l r0 = r14.A00     // Catch:{ all -> 0x0049 }
            long r0 = r0.A02(r15)     // Catch:{ all -> 0x0049 }
            r5.A06(r3, r0)     // Catch:{ all -> 0x0049 }
            int r0 = r5.A00()     // Catch:{ all -> 0x0049 }
            if (r0 == r4) goto L_0x0035
            r10 = 0
            r12 = r10
            X.1Uy r7 = new X.1Uy     // Catch:{ all -> 0x0049 }
            r7.<init>(r8, r10, r12)     // Catch:{ all -> 0x0049 }
            r14.A05(r15, r7)     // Catch:{ all -> 0x0049 }
        L_0x0035:
            r6.A00()     // Catch:{ all -> 0x0049 }
            r1 = 33
            java.lang.RunnableEBaseShape2S0200000_I0_1 r0 = new java.lang.RunnableEBaseShape2S0200000_I0_1     // Catch:{ all -> 0x0049 }
            r0.<init>(r14, r15, r1)     // Catch:{ all -> 0x0049 }
            r2.A02(r0)     // Catch:{ all -> 0x0049 }
            r6.close()
            r2.close()
            return
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass092.A04(X.02U, long):void");
    }

    public final void A05(AnonymousClass02U r5, C28601Uy r6) {
        AnonymousClass1VB A012 = this.A02.A01("INSERT INTO group_notification_version(group_jid_row_id, subject_timestamp, announcement_version, participant_version) VALUES (?, ?, ?, ?)", "INSERT_GROUP_NOTIFICATION_VERSION");
        A012.A06(1, this.A00.A02(r5));
        A012.A06(2, r6.A02);
        A012.A06(3, r6.A00);
        A012.A06(4, r6.A01);
        A012.A01();
    }
}
