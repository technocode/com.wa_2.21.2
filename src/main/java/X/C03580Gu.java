package X;

import android.content.ContentValues;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Gu  reason: invalid class name and case insensitive filesystem */
public class C03580Gu {
    public static volatile C03580Gu A05;
    public final AnonymousClass0B3 A00;
    public final C03610Gy A01;
    public final C03600Gw A02;
    public final AnonymousClass0Gx A03;
    public volatile boolean A04 = false;

    public C03580Gu(AnonymousClass0BZ r3, AnonymousClass0Gx r4, AnonymousClass0B3 r5) {
        this.A02 = new C03600Gw(r3.A07());
        this.A03 = r4;
        this.A00 = r5;
        this.A01 = new C03610Gy();
    }

    public static C03580Gu A00() {
        if (A05 == null) {
            synchronized (C03580Gu.class) {
                if (A05 == null) {
                    AnonymousClass0BZ A002 = AnonymousClass0BZ.A00();
                    if (AnonymousClass0Gx.A02 == null) {
                        synchronized (AnonymousClass0Gx.class) {
                            if (AnonymousClass0Gx.A02 == null) {
                                AnonymousClass0Gx.A02 = new AnonymousClass0Gx(WebpUtils.A00(), AnonymousClass0B3.A00());
                            }
                        }
                    }
                    A05 = new C03580Gu(A002, AnonymousClass0Gx.A02, AnonymousClass0B3.A00());
                }
            }
        }
        return A05;
    }

    public final void A01() {
        if (!this.A04) {
            synchronized (this.A01) {
                if (!this.A04) {
                    Iterator it = ((ArrayList) this.A02.A00()).iterator();
                    while (it.hasNext()) {
                        C663133s r5 = (C663133s) it.next();
                        if (r5.A00 == null) {
                            try {
                                AnonymousClass0Gx r4 = this.A03;
                                File A032 = r4.A00.A03(r5.A07);
                                if (A032.exists()) {
                                    r5.A00 = r4.A01.A02(A032.getAbsolutePath());
                                    C03600Gw r2 = this.A02;
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("plaintext_hash", r5.A07);
                                    contentValues.put("hash_of_image_part", r5.A00);
                                    contentValues.put("timestamp", Long.valueOf(r5.A04));
                                    contentValues.put("url", r5.A0A);
                                    contentValues.put("enc_hash", r5.A06);
                                    contentValues.put("direct_path", r5.A05);
                                    contentValues.put("mimetype", r5.A09);
                                    contentValues.put("media_key", r5.A08);
                                    contentValues.put("file_size", Integer.valueOf(r5.A01));
                                    contentValues.put("width", Integer.valueOf(r5.A03));
                                    contentValues.put("height", Integer.valueOf(r5.A02));
                                    ReentrantReadWriteLock.ReadLock readLock = r2.A01;
                                    readLock.lock();
                                    try {
                                        r2.A00.A03().A0B("starred_stickers", contentValues, "addStarredStickerHash/INSERT_STARRED_STICKER");
                                    } finally {
                                        readLock.unlock();
                                    }
                                } else {
                                    throw new FileNotFoundException("StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker");
                                }
                            } catch (FileNotFoundException e) {
                                Log.e("StarredStickers/initStickerDedupeMappings/could not get internally managed media file for sticker, dropping it from starred", e);
                                this.A02.A01(r5.A07);
                            }
                        }
                        this.A01.A01(r5.A07, r5.A00);
                    }
                    this.A04 = true;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r1 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.lang.String r12) {
        /*
            r11 = this;
            X.AnonymousClass00E.A00()
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0015
            X.0Gy r1 = r11.A01
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.containsKey(r12)     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0015:
            X.0Gw r4 = r11.A02
            if (r4 == 0) goto L_0x0058
            r3 = 1
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r1 = "plaintext_hash"
            r0 = 0
            r6[r0] = r1
            java.lang.String[] r8 = new java.lang.String[r3]
            r8[r0] = r12
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r4.A01
            r2.lock()
            X.0Gv r0 = r4.A00     // Catch:{ all -> 0x0053 }
            X.0BK r4 = r0.A02()     // Catch:{ all -> 0x0053 }
            java.lang.String r5 = "starred_stickers"
            java.lang.String r7 = "plaintext_hash = ?"
            r9 = 0
            java.lang.String r10 = "checkStickerHashIsStarred/QUERY_STARRED_STICKER"
            android.database.Cursor r1 = r4.A08(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0053 }
            int r0 = r1.getCount()     // Catch:{ all -> 0x004a }
            if (r0 > 0) goto L_0x0043
            r3 = 0
        L_0x0043:
            r1.close()
            r2.unlock()
            return r3
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0
        L_0x0053:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x0058:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03580Gu.A02(java.lang.String):boolean");
    }
}
