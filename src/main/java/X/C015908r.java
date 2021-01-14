package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.08r  reason: invalid class name and case insensitive filesystem */
public class C015908r {
    public static volatile C015908r A07;
    public AnonymousClass01O A00;
    public final AnonymousClass01I A01;
    public final C014508d A02;
    public final C016208u A03;
    public final C016308v A04;
    public final C016008s A05;
    public volatile String A06;

    public C015908r(AnonymousClass01I r1, C016008s r2, C014508d r3, C016208u r4, C016308v r5) {
        this.A01 = r1;
        this.A05 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static C015908r A00() {
        if (A07 == null) {
            synchronized (C015908r.class) {
                if (A07 == null) {
                    AnonymousClass01I A002 = AnonymousClass01I.A00();
                    if (C016008s.A04 == null) {
                        synchronized (C016008s.class) {
                            if (C016008s.A04 == null) {
                                C016008s.A04 = new C016008s(C015308l.A00(), C014508d.A00(), C015708p.A00());
                            }
                        }
                    }
                    C016008s r8 = C016008s.A04;
                    C014508d A003 = C014508d.A00();
                    if (C016208u.A04 == null) {
                        synchronized (C016208u.class) {
                            if (C016208u.A04 == null) {
                                C016208u.A04 = new C016208u(C015308l.A00(), C015708p.A00(), C014508d.A00());
                            }
                        }
                    }
                    A07 = new C015908r(A002, r8, A003, C016208u.A04, C016308v.A00());
                }
            }
        }
        return A07;
    }

    public AnonymousClass0PU A01() {
        Iterator it = this.A04.A01().A01().iterator();
        HashMap hashMap = new HashMap();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (!r1.hasNext()) {
                return new AnonymousClass0PU(hashMap, null);
            }
            Map.Entry entry = (Map.Entry) r1.next();
            boolean z = false;
            if (((AnonymousClass1VI) entry.getValue()).A01 > 0) {
                z = true;
            }
            if (!z) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        if (r6 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0PU A02(com.whatsapp.jid.UserJid r14) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015908r.A02(com.whatsapp.jid.UserJid):X.0PU");
    }

    public void A03() {
        synchronized (this) {
            AnonymousClass01I r2 = this.A01;
            r2.A04();
            if (r2.A02 == null) {
                this.A06 = null;
            } else {
                HashSet A022 = this.A04.A01().A02().A02();
                r2.A04();
                A022.add(r2.A02);
                this.A06 = C001801b.A18(A022);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C05350Oe r4) {
        /*
            r3 = this;
            java.util.Set r0 = r4.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            X.08d r0 = r3.A02
            X.0OQ r2 = r0.A04()
            X.0Rk r1 = r2.A00()     // Catch:{ all -> 0x0025 }
            X.08v r0 = r3.A04     // Catch:{ all -> 0x001e }
            r0.A02(r4)     // Catch:{ all -> 0x001e }
            r1.A00()     // Catch:{ all -> 0x001e }
            r1.close()
            goto L_0x002c
        L_0x001e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0
        L_0x0025:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r0
        L_0x002c:
            r2.close()
            r3.A03()
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015908r.A04(X.0Oe):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C05350Oe r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015908r.A05(X.0Oe, boolean):void");
    }
}
