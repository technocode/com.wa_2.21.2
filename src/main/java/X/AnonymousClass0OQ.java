package X;

import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0OQ  reason: invalid class name */
public class AnonymousClass0OQ implements Closeable {
    public boolean A00 = false;
    public final C015008i A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass08J A03;
    public final AnonymousClass0BK A04;
    public final ReentrantReadWriteLock.ReadLock A05;

    public AnonymousClass0OQ(ReentrantReadWriteLock.ReadLock readLock, AnonymousClass08N r4, C015008i r5, boolean z, AnonymousClass009 r7) {
        this.A05 = readLock;
        this.A01 = r5;
        this.A03 = r4.A7k();
        this.A02 = r7;
        if (readLock != null) {
            readLock.lock();
            A03(true);
        }
        if (z) {
            try {
                this.A04 = r4.A9x();
            } catch (Exception e) {
                Log.e("DatabaseSession/failed to get database", e);
                close();
                throw e;
            }
        } else {
            this.A04 = r4.A8g();
        }
    }

    public C06020Rk A00() {
        if (C003701u.A0D()) {
            this.A02.A04("db-transaction-on-main-thread", this.A04.A00.getPath(), true);
        }
        return new C06020Rk(this.A04, this.A03, null);
    }

    public C06020Rk A01() {
        return new C06020Rk(this.A04, this.A03, null);
    }

    public void A02(Runnable runnable) {
        AnonymousClass00E.A07(this.A04.A00.inTransaction());
        AnonymousClass08J r0 = this.A03;
        Object obj = new Object();
        AnonymousClass1V3 r1 = new AnonymousClass1V3(runnable);
        Object obj2 = r0.A01.get();
        if (obj2 != null) {
            ((AbstractMap) obj2).put(obj, r1);
            return;
        }
        throw null;
    }

    public final void A03(boolean z) {
        long id = Thread.currentThread().getId();
        C015008i r4 = this.A01;
        if (r4 != null) {
            synchronized (r4) {
                int intValue = ((Integer) r4.A03(id, 0)).intValue();
                int i = -1;
                if (z) {
                    i = 1;
                }
                int i2 = intValue + i;
                if (i2 > 0) {
                    r4.A08(id, Integer.valueOf(i2));
                } else {
                    r4.A06(id);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.A00) {
            ReentrantReadWriteLock.ReadLock readLock = this.A05;
            if (readLock != null) {
                A03(false);
                readLock.unlock();
            }
            this.A00 = true;
        }
    }
}
