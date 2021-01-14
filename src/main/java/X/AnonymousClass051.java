package X;

import com.whatsapp.util.Log;

/* renamed from: X.051  reason: invalid class name */
public class AnonymousClass051 {
    public final AnonymousClass04x A00;
    public final AnonymousClass00S A01;

    public AnonymousClass051(AnonymousClass00S r1, AnonymousClass04x r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static void A00(AnonymousClass0E6 r2) {
        StringBuilder sb = new StringBuilder("axolotl trusting ");
        sb.append(r2);
        sb.append(" key pair");
        Log.i(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r2 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01() {
        /*
            r10 = this;
            X.04x r0 = r10.A00
            X.0BK r3 = r0.A01()
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r0 = "next_prekey_id"
            r1 = 0
            r5[r1] = r0
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r0 = "-1"
            r7[r1] = r0
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r7[r2] = r0
            java.lang.String r4 = "identities"
            java.lang.String r6 = "recipient_id = ? AND device_id = ?"
            r8 = 0
            java.lang.String r9 = "SignalIdentityKeyStore/getNextPreKeyId"
            android.database.Cursor r2 = r3.A08(r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0034
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x003c }
            r2.close()
            return r0
        L_0x0034:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x003c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0044
            r2.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass051.A01():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r2 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02() {
        /*
            r10 = this;
            X.04x r0 = r10.A00
            X.0BK r3 = r0.A01()
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r0 = "registration_id"
            r1 = 0
            r5[r1] = r0
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r0 = "-1"
            r7[r1] = r0
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r7[r2] = r0
            java.lang.String r4 = "identities"
            java.lang.String r6 = "recipient_id = ? AND device_id = ?"
            r8 = 0
            java.lang.String r9 = "SignalIdentityKeyStore/getRegistrationId"
            android.database.Cursor r2 = r3.A08(r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0034
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x003c }
            r2.close()
            return r0
        L_0x0034:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x003c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0044
            r2.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass051.A02():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r3 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1Q5 A03() {
        /*
            r11 = this;
            X.04x r0 = r11.A00
            X.0BK r4 = r0.A01()
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r0 = "public_key"
            r2 = 0
            r6[r2] = r0
            java.lang.String r0 = "private_key"
            r1 = 1
            r6[r1] = r0
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.String r0 = "-1"
            r8[r2] = r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r8[r1] = r0
            java.lang.String r5 = "identities"
            java.lang.String r7 = "recipient_id = ? AND device_id = ?"
            r9 = 0
            java.lang.String r10 = "SignalIdentityKeyStore/getIdentityKeyPair"
            android.database.Cursor r3 = r4.A08(r5, r6, r7, r8, r9, r10)
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0041
            byte[] r2 = r3.getBlob(r2)     // Catch:{ all -> 0x0049 }
            byte[] r1 = r3.getBlob(r1)     // Catch:{ all -> 0x0049 }
            X.1Q5 r0 = new X.1Q5     // Catch:{ all -> 0x0049 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0049 }
            r3.close()
            return r0
        L_0x0041:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            if (r3 == 0) goto L_0x0051
            r3.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass051.A03():X.1Q5");
    }

    public boolean A04(AnonymousClass0E6 r7) {
        long A012 = (long) this.A00.A02().A01("identities", "recipient_id = ? AND device_id = ? ", new String[]{r7.A01, String.valueOf(r7.A00)}, "SignalIdentityKeyStore/removeIdentity");
        StringBuilder sb = new StringBuilder("axolotl deleted ");
        sb.append(A012);
        sb.append(" identities for ");
        sb.append(r7);
        Log.i(sb.toString());
        if (A012 > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007e, code lost:
        if (r6 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A05(X.AnonymousClass0E6 r12) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass051.A05(X.0E6):byte[]");
    }
}
