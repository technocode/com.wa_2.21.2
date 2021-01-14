package X;

import android.content.ContentValues;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0H9  reason: invalid class name */
public class AnonymousClass0H9 {
    public static volatile AnonymousClass0H9 A02;
    public final AnonymousClass0BZ A00;
    public final ReentrantReadWriteLock.ReadLock A01;

    public AnonymousClass0H9(AnonymousClass0BZ r2) {
        this.A00 = r2;
        this.A01 = r2.A07().A04.readLock();
    }

    public static AnonymousClass0H9 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0H9.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0H9(AnonymousClass0BZ.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        if (r11 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.lang.String r18, java.lang.String[] r19) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0H9.A01(java.lang.String, java.lang.String[]):java.util.List");
    }

    public void A02(String str, String str2, AnonymousClass33N r10) {
        ReentrantReadWriteLock.ReadLock readLock = this.A01;
        readLock.lock();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("authority", str);
            contentValues.put("sticker_pack_id", str2);
            contentValues.put("sticker_pack_name", r10.A0F);
            contentValues.put("sticker_pack_publisher", r10.A0H);
            String str3 = r10.A0E;
            contentValues.put("sticker_pack_image_data_hash", str3);
            int i = 1;
            int i2 = 0;
            if (r10.A0L) {
                i2 = 1;
            }
            contentValues.put("avoid_cache", Integer.valueOf(i2));
            if (!r10.A0M) {
                i = 0;
            }
            contentValues.put("is_animated_pack", Integer.valueOf(i));
            this.A00.A07().A03().A0B("third_party_whitelist_packs", contentValues, "whitelistPack/INSERT_THIRD_PARTY_WHITELIST_PACKS");
            r10.A01 = r10.A08;
            r10.A02 = str3;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r1 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r7 = "authority = ? AND sticker_pack_id = ?"
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]
            r3 = 0
            r8[r3] = r12
            r0 = 1
            r8[r0] = r13
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r11.A01
            r2.lock()
            X.0BZ r0 = r11.A00     // Catch:{ all -> 0x003c }
            X.0Gv r0 = r0.A07()     // Catch:{ all -> 0x003c }
            X.0BK r4 = r0.A02()     // Catch:{ all -> 0x003c }
            java.lang.String r5 = "third_party_whitelist_packs"
            r6 = 0
            java.lang.String r10 = "checkExistence/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            r9 = r6
            android.database.Cursor r1 = r4.A08(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x003c }
            int r0 = r1.getCount()     // Catch:{ all -> 0x0033 }
            if (r0 <= 0) goto L_0x002c
            r3 = 1
        L_0x002c:
            r1.close()
            r2.unlock()
            return r3
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0H9.A03(java.lang.String, java.lang.String):boolean");
    }
}
