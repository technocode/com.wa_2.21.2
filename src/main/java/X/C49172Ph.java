package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2Ph  reason: invalid class name and case insensitive filesystem */
public class C49172Ph {
    public final C03450Gh A00;
    public final ReentrantReadWriteLock.ReadLock A01;

    public C49172Ph(C03450Gh r2) {
        this.A00 = r2;
        this.A01 = r2.A04.readLock();
    }

    public void A00(String str) {
        ReentrantReadWriteLock.ReadLock readLock = this.A01;
        readLock.lock();
        try {
            this.A00.A01().A01("downloadable_gifs", "content_url LIKE ?", new String[]{str}, "removeGifInfo/DELETE_DOWNLOADABLE_GIF");
        } finally {
            readLock.unlock();
        }
    }
}
