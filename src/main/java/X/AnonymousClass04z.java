package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;

/* renamed from: X.04z  reason: invalid class name */
public class AnonymousClass04z {
    public final AnonymousClass04x A00;
    public final AnonymousClass00S A01;

    public AnonymousClass04z(AnonymousClass00S r1, AnonymousClass04x r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r5 > 100) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A00(java.util.List r8) {
        /*
            r7 = this;
            int r5 = r8.size()
            r4 = 0
            r6 = 1
            if (r5 <= 0) goto L_0x000d
            r1 = 100
            r0 = 1
            if (r5 <= r1) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            X.AnonymousClass00E.A06(r0)
            java.lang.String r0 = "SELECT record, recipient_id, device_id FROM sessions INNER JOIN (SELECT ? AS r, ? AS d"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r1 = 1
        L_0x0019:
            if (r1 >= r5) goto L_0x0023
            java.lang.String r0 = " UNION ALL SELECT ? AS r, ? AS d"
            r2.append(r0)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0023:
            java.lang.String r0 = ") AS joined ON joined.r = sessions.recipient_id AND joined.d = sessions.device_id"
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            int r0 = r5 << 1
            java.lang.String[] r2 = new java.lang.String[r0]
        L_0x0030:
            if (r4 >= r5) goto L_0x0050
            int r1 = r4 << 1
            java.lang.Object r0 = r8.get(r4)
            X.0E6 r0 = (X.AnonymousClass0E6) r0
            java.lang.String r0 = r0.A01
            r2[r1] = r0
            int r1 = r1 + r6
            java.lang.Object r0 = r8.get(r4)
            X.0E6 r0 = (X.AnonymousClass0E6) r0
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r1] = r0
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0050:
            X.04x r0 = r7.A00
            X.0BK r1 = r0.A02()
            java.lang.String r0 = "SignalSessionStore/getSessionsCursor"
            android.database.Cursor r0 = r1.A07(r3, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04z.A00(java.util.List):android.database.Cursor");
    }

    public void A01(AnonymousClass0E6 r6) {
        AnonymousClass0BK A02 = this.A00.A02();
        String[] strArr = {r6.A01, String.valueOf(r6.A00)};
        StringBuilder sb = new StringBuilder("axolotl deleted ");
        sb.append((long) A02.A01("sessions", "recipient_id = ? AND device_id = ? ", strArr, "SignalSessionStore/removeSession"));
        sb.append(" sessions with ");
        sb.append(r6);
        Log.i(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    public void A02(AnonymousClass0E6 r15, byte[] bArr) {
        String str = r15.A01;
        int i = r15.A00;
        AnonymousClass0BK A02 = this.A00.A02();
        SQLiteDatabase sQLiteDatabase = A02.A00;
        sQLiteDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("record", bArr);
            if (A02.A00("sessions", contentValues, "recipient_id = ? AND device_id = ? ", new String[]{str, String.valueOf(i)}, "SignalSessionStore/saveSessionUpdate") == 0) {
                long A05 = this.A01.A05() / 1000;
                contentValues.put("recipient_id", str);
                contentValues.put("device_id", Integer.valueOf(i));
                contentValues.put("timestamp", Long.valueOf(A05));
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl inserting new session for ");
                sb.append(r15);
                sb.append(" at ");
                sb.append(A05);
                Log.i(sb.toString());
                A02.A02("sessions", contentValues, "SignalSessionStore/saveSession");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            StringBuilder sb2 = new StringBuilder("axolotl stored session for ");
            sb2.append(r15);
            Log.i(sb2.toString());
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r2 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A03(X.AnonymousClass0E6 r11) {
        /*
            r10 = this;
            X.04x r0 = r10.A00
            X.0BK r3 = r0.A01()
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r0 = "record"
            r1 = 0
            r5[r1] = r0
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r0 = r11.A01
            r7[r1] = r0
            int r0 = r11.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7[r2] = r0
            r8 = 0
            java.lang.String r4 = "sessions"
            java.lang.String r6 = "recipient_id = ? AND device_id = ? "
            java.lang.String r9 = "SignalSessionStore/getSession"
            android.database.Cursor r2 = r3.A08(r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004f }
            if (r0 != 0) goto L_0x0047
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "axolotl cant load a session record for "
            r1.append(r0)     // Catch:{ all -> 0x004f }
            r1.append(r11)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004f }
            com.whatsapp.util.Log.i(r0)     // Catch:{ all -> 0x004f }
            r2.close()
            return r8
        L_0x0047:
            byte[] r0 = r2.getBlob(r1)
            r2.close()
            return r0
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04z.A03(X.0E6):byte[]");
    }
}
