package X;

/* renamed from: X.09j  reason: invalid class name and case insensitive filesystem */
public class C017709j {
    public static volatile C017709j A04;
    public final C015308l A00;
    public final C014508d A01;
    public final C015408m A02;
    public final C015708p A03;

    public C017709j(C015308l r1, C015408m r2, C015708p r3, C014508d r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public static C017709j A00() {
        if (A04 == null) {
            synchronized (C017709j.class) {
                if (A04 == null) {
                    C015308l A002 = C015308l.A00();
                    C000300f.A00();
                    A04 = new C017709j(A002, C015408m.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AbstractC007503q r9) {
        /*
            r8 = this;
            java.util.List r3 = r9.A0c
            if (r3 == 0) goto L_0x0063
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r8.A03()
            if (r0 == 0) goto L_0x0063
            X.08d r0 = r8.A01
            X.0OQ r7 = r0.A04()
            X.0Rk r6 = r7.A00()     // Catch:{ all -> 0x005c }
            X.08p r2 = r8.A03     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "INSERT OR IGNORE INTO message_mentions(    message_row_id,    jid_row_id) VALUES (?, ?)"
            java.lang.String r0 = "INSERT_MESSAGE_MENTION_SQL"
            X.1VB r5 = r2.A01(r1, r0)     // Catch:{ all -> 0x0055 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0055 }
        L_0x0028:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004b
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0055 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x0055 }
            r5.A02()     // Catch:{ all -> 0x0055 }
            r2 = 1
            long r0 = r9.A0p     // Catch:{ all -> 0x0055 }
            r5.A06(r2, r0)     // Catch:{ all -> 0x0055 }
            r2 = 2
            X.08l r0 = r8.A00     // Catch:{ all -> 0x0055 }
            long r0 = r0.A02(r3)     // Catch:{ all -> 0x0055 }
            r5.A06(r2, r0)     // Catch:{ all -> 0x0055 }
            r5.A01()     // Catch:{ all -> 0x0055 }
            goto L_0x0028
        L_0x004b:
            r6.A00()     // Catch:{ all -> 0x0055 }
            r6.close()
            r7.close()
            return
        L_0x0055:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0
        L_0x005c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017709j.A01(X.03q):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AbstractC007503q r8, long r9) {
        /*
            r7 = this;
            java.util.List r3 = r8.A0c
            if (r3 == 0) goto L_0x005b
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x005b
            X.08d r0 = r7.A01
            X.0OQ r6 = r0.A04()
            X.0Rk r5 = r6.A00()     // Catch:{ all -> 0x0054 }
            X.08p r2 = r7.A03     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "INSERT OR IGNORE INTO message_quoted_mentions(    message_row_id,    jid_row_id) VALUES (?, ?)"
            java.lang.String r0 = "INSERT_MESSAGE_QUOTED_MENTION_SQL"
            X.1VB r4 = r2.A01(r1, r0)     // Catch:{ all -> 0x004d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x004d }
        L_0x0022:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x004d }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x004d }
            r4.A02()     // Catch:{ all -> 0x004d }
            r0 = 1
            r4.A06(r0, r9)     // Catch:{ all -> 0x004d }
            r2 = 2
            X.08l r0 = r7.A00     // Catch:{ all -> 0x004d }
            long r0 = r0.A02(r1)     // Catch:{ all -> 0x004d }
            r4.A06(r2, r0)     // Catch:{ all -> 0x004d }
            r4.A01()     // Catch:{ all -> 0x004d }
            goto L_0x0022
        L_0x0043:
            r5.A00()     // Catch:{ all -> 0x004d }
            r5.close()
            r6.close()
            return
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017709j.A02(X.03q, long):void");
    }

    public boolean A03() {
        String A012;
        if (!this.A00.A0C() || (A012 = this.A02.A01("mention_message_ready")) == null || Integer.parseInt(A012) != 1) {
            return false;
        }
        return true;
    }
}
