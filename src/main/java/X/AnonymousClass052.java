package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.052  reason: invalid class name */
public class AnonymousClass052 {
    public final AnonymousClass04x A00;
    public final AnonymousClass00S A01;

    public AnonymousClass052(AnonymousClass00S r1, AnonymousClass04x r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void A00(int i, byte[] bArr) {
        AnonymousClass0BK A02 = this.A00.A02();
        ContentValues contentValues = new ContentValues();
        contentValues.put("prekey_id", Integer.valueOf(i));
        contentValues.put("timestamp", Long.valueOf(this.A01.A05() / 1000));
        contentValues.put("record", bArr);
        A02.A05("signed_prekeys", contentValues, "SignalSignedPreKeyStore/saveSignedPreKey");
        StringBuilder sb = new StringBuilder("axolotl stored signed pre key with id ");
        sb.append(i);
        Log.i(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A01(int r11) {
        /*
            r10 = this;
            X.04x r0 = r10.A00
            X.0BK r3 = r0.A01()
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r0 = "record"
            r1 = 0
            r5[r1] = r0
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r0 = java.lang.String.valueOf(r11)
            r7[r1] = r0
            java.lang.String r4 = "signed_prekeys"
            java.lang.String r6 = "prekey_id = ?"
            r8 = 0
            java.lang.String r9 = "SignalSignedPreKeyStore/getSignedPreKey"
            android.database.Cursor r2 = r3.A08(r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "no signed prekey available with id "
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            r1.append(r11)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0048 }
            com.whatsapp.util.Log.e(r0)     // Catch:{ all -> 0x0048 }
            r2.close()
            return r8
        L_0x0040:
            byte[] r0 = r2.getBlob(r1)
            r2.close()
            return r0
        L_0x0048:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0050
            r2.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass052.A01(int):byte[]");
    }
}
