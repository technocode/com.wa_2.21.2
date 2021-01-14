package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.0DR  reason: invalid class name */
public class AnonymousClass0DR {
    public static volatile AnonymousClass0DR A02;
    public final AnonymousClass0DK A00;
    public final AnonymousClass0AL A01;

    public AnonymousClass0DR(AnonymousClass0DK r1, AnonymousClass0AL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass0DR A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0DR.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0DR(AnonymousClass0DK.A00(), AnonymousClass0AL.A01());
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x024b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0125, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0210, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0214, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0247, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r2.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(X.AbstractC05460Oq r9) {
        /*
        // Method dump skipped, instructions count: 613
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DR.A01(X.0Oq):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC05460Oq A02(long r5) {
        /*
            r4 = this;
            X.AnonymousClass00E.A00()
            X.0DK r0 = r4.A00
            X.0BK r3 = r0.A8g()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data FROM peer_messages WHERE _id = ?"
            java.lang.String r0 = "PeerMessagesTable.SELECT_MESSAGE_BY_ID"
            android.database.Cursor r1 = r3.A07(r1, r2, r0)
            if (r1 == 0) goto L_0x0032
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0032
            X.0Oq r0 = r4.A03(r1)     // Catch:{ all -> 0x002b }
            r1.close()
            return r0
        L_0x002b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0
        L_0x0032:
            r0 = 0
            if (r1 == 0) goto L_0x0038
            r1.close()
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DR.A02(long):X.0Oq");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0342, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0346, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0127, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AbstractC05460Oq A03(android.database.Cursor r8) {
        /*
        // Method dump skipped, instructions count: 900
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DR.A03(android.database.Cursor):X.0Oq");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC05460Oq A04(com.whatsapp.jid.DeviceJid r6, java.lang.String r7) {
        /*
            r5 = this;
            r4 = 1
            X.AnonymousClass00E.A00()
            X.0DK r0 = r5.A00
            X.0BK r3 = r0.A8g()
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r1 = r6.getRawString()
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r2[r4] = r0
            r0 = 2
            r2[r0] = r7
            java.lang.String r1 = "SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data FROM peer_messages WHERE device_id = ? AND key_from_me = ? AND key_id = ?"
            java.lang.String r0 = "PeerMessagesStore.getPeerMessageByKey"
            android.database.Cursor r1 = r3.A07(r1, r2, r0)
            if (r1 == 0) goto L_0x003c
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x003c
            X.0Oq r0 = r5.A03(r1)     // Catch:{ all -> 0x0035 }
            r1.close()
            return r0
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r0 = 0
            if (r1 == 0) goto L_0x0042
            r1.close()
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DR.A04(com.whatsapp.jid.DeviceJid, java.lang.String):X.0Oq");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r1 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A05(byte r6) {
        /*
            r5 = this;
            X.AnonymousClass00E.A00()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0DK r0 = r5.A00
            X.0BK r3 = r0.A8g()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data FROM peer_messages WHERE message_type = ? "
            java.lang.String r0 = "PeerMessagesTable.SELECT_MESSAGES_BY_MESSAGE_TYPE"
            android.database.Cursor r1 = r3.A07(r1, r2, r0)
        L_0x0020:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0030
            X.0Oq r0 = r5.A03(r1)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0020
            r4.add(r0)     // Catch:{ all -> 0x0034 }
            goto L_0x0020
        L_0x0030:
            r1.close()
            return r4
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DR.A05(byte):java.util.List");
    }

    public void A06(DeviceJid deviceJid) {
        AnonymousClass00E.A00();
        this.A00.A9x().A01("peer_messages", "device_id = ?", new String[]{deviceJid.getRawString()}, "PeerMessagesStore.deletePeerMessages");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.util.List r9) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DR.A07(java.util.List):void");
    }
}
