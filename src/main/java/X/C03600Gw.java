package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Gw  reason: invalid class name and case insensitive filesystem */
public class C03600Gw {
    public final C03590Gv A00;
    public final ReentrantReadWriteLock.ReadLock A01;

    public C03600Gw(C03590Gv r2) {
        this.A00 = r2;
        this.A01 = r2.A04.readLock();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c8, code lost:
        if (r4 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00() {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03600Gw.A00():java.util.List");
    }

    public void A01(String str) {
        ReentrantReadWriteLock.ReadLock readLock = this.A01;
        readLock.lock();
        try {
            this.A00.A03().A01("starred_stickers", "plaintext_hash = ?", new String[]{str}, "removeStarredStickerHash/DELETE_STARRED_STICKER");
        } finally {
            readLock.unlock();
        }
    }
}
