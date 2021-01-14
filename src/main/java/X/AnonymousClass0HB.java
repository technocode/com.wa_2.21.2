package X;

import android.content.ContentValues;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0HB  reason: invalid class name */
public class AnonymousClass0HB {
    public static volatile AnonymousClass0HB A02;
    public final AnonymousClass0BZ A00;
    public final ReentrantReadWriteLock.ReadLock A01;

    public AnonymousClass0HB(AnonymousClass0BZ r2) {
        this.A00 = r2;
        this.A01 = r2.A07().A04.readLock();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r12 = this;
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r1 = "pack_id"
            r7[r0] = r1
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r12.A01
            r3.lock()
            X.0BZ r0 = r12.A00     // Catch:{ all -> 0x004a }
            X.0Gv r0 = r0.A07()     // Catch:{ all -> 0x004a }
            X.0BK r5 = r0.A02()     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "unseen_sticker_packs"
            r8 = 0
            java.lang.String r11 = "getUnseenStickerPackIds/QUERY_UNSEEN_STICKER_PACK"
            r9 = r8
            r10 = r8
            android.database.Cursor r2 = r5.A08(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x004a }
            int r1 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0041 }
        L_0x002c:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x0041 }
            r4.add(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x002c
        L_0x003a:
            r2.close()
            r3.unlock()
            return r4
        L_0x0041:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            if (r2 == 0) goto L_0x0049
            r2.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0
        L_0x004a:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HB.A00():java.util.Set");
    }

    public void A01(String str) {
        ReentrantReadWriteLock.ReadLock readLock = this.A01;
        readLock.lock();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("pack_id", str);
            this.A00.A07().A03().A0B("unseen_sticker_packs", contentValues, "markPackAsUnseen/INSERT_UNSEEN_STICKER_PACK");
        } finally {
            readLock.unlock();
        }
    }
}
