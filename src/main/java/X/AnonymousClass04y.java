package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;

/* renamed from: X.04y  reason: invalid class name */
public class AnonymousClass04y {
    public final C000300f A00;
    public final AnonymousClass04x A01;
    public final AnonymousClass00S A02;

    public AnonymousClass04y(AnonymousClass00S r1, AnonymousClass04x r2, C000300f r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
            r4 = this;
            X.04x r0 = r4.A01
            X.0BK r3 = r0.A01()
            java.lang.String r2 = "SELECT COUNT(*) FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0"
            r1 = 0
            java.lang.String r0 = "SignalPreKeyStore/getUnsentPreKeysCount"
            android.database.Cursor r2 = r3.A07(r2, r1, r0)
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x001e
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0027 }
            r2.close()
            return r0
        L_0x001e:
            java.lang.String r1 = "unable to fetch count from table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            if (r2 == 0) goto L_0x002f
            r2.close()     // Catch:{ all -> 0x002f }
        L_0x002f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04y.A00():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r3 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01() {
        /*
            r15 = this;
            X.04x r0 = r15.A01
            X.0BK r7 = r0.A01()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 2
            java.lang.String[] r9 = new java.lang.String[r0]
            java.lang.String r0 = "prekey_id"
            r5 = 0
            r9[r5] = r0
            java.lang.String r0 = "record"
            r4 = 1
            r9[r4] = r0
            X.00f r1 = r15.A00
            X.03a r0 = X.AbstractC000400g.A2w
            int r0 = r1.A06(r0)
            java.lang.String r13 = java.lang.String.valueOf(r0)
            java.lang.String r8 = "prekeys"
            java.lang.String r10 = "sent_to_server = 0 AND direct_distribution = 0"
            r11 = 0
            java.lang.String r14 = "SignalPreKeyStore/getUnsentPreKeys"
            r12 = r11
            android.database.Cursor r3 = r7.A09(r8, r9, r10, r11, r12, r13, r14)
        L_0x0031:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0048
            int r2 = r3.getInt(r5)     // Catch:{ all -> 0x004c }
            byte[] r1 = r3.getBlob(r4)     // Catch:{ all -> 0x004c }
            X.1Q6 r0 = new X.1Q6     // Catch:{ all -> 0x004c }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x004c }
            r6.add(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0031
        L_0x0048:
            r3.close()
            return r6
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04y.A01():java.util.List");
    }

    public void A02(int i) {
        AnonymousClass0BK A022 = this.A01.A02();
        String[] strArr = {String.valueOf(i)};
        StringBuilder sb = new StringBuilder("axolotl deleted ");
        sb.append((long) A022.A01("prekeys", "prekey_id = ?", strArr, "SignalPreKeyStore/removePreKey"));
        sb.append(" pre keys with id ");
        sb.append(i);
        Log.i(sb.toString());
    }

    public void A03(int[] iArr) {
        AnonymousClass04x r6 = this.A01;
        AnonymousClass0BK A022 = r6.A02();
        long A05 = this.A02.A05() / 1000;
        SQLiteDatabase sQLiteDatabase = A022.A00;
        sQLiteDatabase.beginTransaction();
        int i = 0;
        while (true) {
            try {
                int length = iArr.length;
                if (i < length) {
                    int min = Math.min(i + 200, length);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sent_to_server", Boolean.TRUE);
                    contentValues.put("upload_timestamp", Long.valueOf(A05));
                    StringBuilder sb = new StringBuilder("?");
                    String[] strArr = new String[(min - i)];
                    for (int i2 = i; i2 < min; i2++) {
                        strArr[i2 - i] = String.valueOf(iArr[i2]);
                        if (i2 != i) {
                            sb.append(",?");
                        }
                    }
                    AnonymousClass0BK A023 = r6.A02();
                    StringBuilder sb2 = new StringBuilder("prekey_id IN (");
                    sb2.append((Object) sb);
                    sb2.append(")");
                    int A002 = A023.A00("prekeys", contentValues, sb2.toString(), strArr, "SignalPreKeyStore/setPreKeysAsSentToServer");
                    StringBuilder sb3 = new StringBuilder("updated ");
                    sb3.append(A002);
                    sb3.append(" prekeys; values=");
                    sb3.append(contentValues);
                    Log.i(sb3.toString());
                    i = min;
                } else {
                    AnonymousClass0BK A024 = r6.A02();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("upload_timestamp", Long.valueOf(A05));
                    A024.A02("prekey_uploads", contentValues2, "SignalPreKeyStore/savePreKeyUpload");
                    StringBuilder sb4 = new StringBuilder("axolotl addPreKeyUpload ts:");
                    sb4.append(A05);
                    Log.i(sb4.toString());
                    sQLiteDatabase.setTransactionSuccessful();
                    return;
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(int r11) {
        /*
            r10 = this;
            X.04x r0 = r10.A01
            X.0BK r3 = r0.A01()
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r0 = "record"
            r2 = 0
            r5[r2] = r0
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r7[r2] = r0
            java.lang.String r4 = "prekeys"
            java.lang.String r6 = "prekey_id = ?"
            r8 = 0
            java.lang.String r9 = "SignalPreKeyStore/getPreKey"
            android.database.Cursor r1 = r3.A08(r4, r5, r6, r7, r8, r9)
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002b
            r1.close()
            return r8
        L_0x002b:
            byte[] r0 = r1.getBlob(r2)
            r1.close()
            return r0
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04y.A04(int):byte[]");
    }
}
