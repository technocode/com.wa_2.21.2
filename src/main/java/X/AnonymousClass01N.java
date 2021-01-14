package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.01N  reason: invalid class name */
public class AnonymousClass01N {
    public static volatile AnonymousClass01N A09;
    public int A00 = 200;
    public final AnonymousClass08V A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass09V A03;
    public final C015308l A04;
    public final AnonymousClass094 A05;
    public final C014508d A06;
    public final C015408m A07;
    public final AnonymousClass096 A08;

    public AnonymousClass01N(C015308l r3, AnonymousClass009 r4, C015408m r5, AnonymousClass09V r6, C014508d r7, AnonymousClass096 r8, AnonymousClass094 r9) {
        this.A04 = r3;
        this.A02 = r4;
        this.A07 = r5;
        this.A03 = r6;
        this.A06 = r7;
        this.A08 = r8;
        this.A05 = r9;
        this.A01 = new AnonymousClass08V(250);
    }

    public static AnonymousClass01N A00() {
        if (A09 == null) {
            synchronized (AnonymousClass01N.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass01N(C015308l.A00(), AnonymousClass009.A00(), C015408m.A00(), AnonymousClass09V.A00(), C014508d.A00(), AnonymousClass096.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass01N r8, long r9, com.whatsapp.jid.UserJid r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0056
            com.whatsapp.jid.DeviceJid r1 = r11.getPrimaryDevice()
            X.08l r0 = r8.A04
            long r6 = r0.A02(r1)
            X.08d r0 = r8.A06     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
            X.0OQ r5 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
            r0 = 2
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0044 }
            r3.<init>(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0044 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "receipt_device_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0044 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0044 }
            X.0BK r2 = r5.A04     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "receipt_device"
            java.lang.String r0 = "addBlankReceiptForMasterDevice/INSERT_RECEIPT_DEVICE"
            long r3 = r2.A02(r1, r3, r0)     // Catch:{ all -> 0x0044 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            r0 = 1
            r5.close()
            return r0
        L_0x0040:
            r5.close()
            goto L_0x0054
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        L_0x004b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
            X.094 r0 = r8.A05
            r0.A02()
        L_0x0054:
            r0 = 0
            return r0
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01N.A01(X.01N, long, com.whatsapp.jid.UserJid):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r6 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1V9 A02(X.AbstractC007503q r12) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01N.A02(X.03q):X.1V9");
    }

    public Set A03(C007303n r3) {
        AbstractC007503q A052 = this.A03.A05(r3);
        if (A052 != null) {
            return new HashSet(A02(A052).A00.keySet());
        }
        return new HashSet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0106, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AbstractC007503q r9, com.whatsapp.jid.DeviceJid r10, long r11) {
        /*
        // Method dump skipped, instructions count: 277
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01N.A04(X.03q, com.whatsapp.jid.DeviceJid, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AbstractC007503q r15, java.util.Set r16, boolean r17) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01N.A05(X.03q, java.util.Set, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.util.Set r8) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01N.A06(java.util.Set):void");
    }
}
