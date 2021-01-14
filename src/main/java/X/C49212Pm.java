package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2Pm  reason: invalid class name and case insensitive filesystem */
public class C49212Pm {
    public final C03450Gh A00;
    public final ReentrantReadWriteLock.ReadLock A01;

    public C49212Pm(C03450Gh r1, ReentrantReadWriteLock.ReadLock readLock) {
        this.A00 = r1;
        this.A01 = readLock;
    }

    public void A00(C49232Po r7) {
        ReentrantReadWriteLock.ReadLock readLock = this.A01;
        readLock.lock();
        try {
            this.A00.A01().A01("gifs", "plain_file_hash LIKE ?", new String[]{r7.A04}, "deleteGif/DELETE_GIF_TABLE");
        } finally {
            readLock.unlock();
        }
    }
}
