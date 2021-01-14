package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.01T  reason: invalid class name */
public class AnonymousClass01T {
    public static volatile AnonymousClass01T A09;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass00D A03;
    public final AnonymousClass091 A04;
    public final C014508d A05;
    public final C016708z A06;
    public final AnonymousClass090 A07;
    public final C015208k A08;

    public AnonymousClass01T(AnonymousClass009 r1, AnonymousClass01I r2, AnonymousClass01A r3, C014508d r4, AnonymousClass00D r5, C015208k r6, C016708z r7, AnonymousClass090 r8, AnonymousClass091 r9) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r4;
        this.A03 = r5;
        this.A08 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r9;
    }

    public static AnonymousClass01T A00() {
        if (A09 == null) {
            synchronized (AnonymousClass01T.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass01T(AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass01A.A00(), C014508d.A00(), AnonymousClass00D.A00(), C015208k.A00(), C016708z.A00(), AnonymousClass090.A00(), AnonymousClass091.A00());
                }
            }
        }
        return A09;
    }

    public C05340Od A01(AnonymousClass02X r3) {
        C015208k r1 = this.A08;
        if (r1.A0F()) {
            return r1.A03(r3);
        }
        return this.A07.A01(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r1 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A02(com.whatsapp.jid.UserJid r9) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01T.A02(com.whatsapp.jid.UserJid):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C05340Od r5) {
        /*
            r4 = this;
            X.08d r0 = r4.A05
            X.0OQ r3 = r0.A04()
            X.0Rk r2 = r3.A00()     // Catch:{ all -> 0x0031 }
            X.08k r1 = r4.A08     // Catch:{ all -> 0x002a }
            boolean r0 = r1.A0G()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x001e
            r1.A08(r5)     // Catch:{ all -> 0x002a }
        L_0x0015:
            X.090 r0 = r4.A07     // Catch:{ all -> 0x002a }
            r0.A04(r5)     // Catch:{ all -> 0x002a }
            r2.A00()     // Catch:{ all -> 0x002a }
            goto L_0x0022
        L_0x001e:
            if (r1 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0022:
            r2.close()
            r3.close()
            return
        L_0x0029:
            throw r0
        L_0x002a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0
        L_0x0031:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01T.A03(X.0Od):void");
    }

    public boolean A04(GroupJid groupJid) {
        return A01(groupJid).A0A(this.A01);
    }

    public boolean A05(GroupJid groupJid) {
        AnonymousClass1M5 r0;
        C05340Od A012 = A01(groupJid);
        AnonymousClass01I r02 = this.A01;
        r02.A04();
        UserJid userJid = r02.A03;
        if (userJid == null || (r0 = (AnonymousClass1M5) A012.A01.get(userJid)) == null || r0.A01 == 0) {
            return false;
        }
        return true;
    }

    public boolean A06(AnonymousClass02U r3, UserJid userJid) {
        AnonymousClass1M5 r0 = (AnonymousClass1M5) A01(r3).A01.get(userJid);
        if (r0 == null || r0.A01 == 0) {
            return false;
        }
        return true;
    }
}
