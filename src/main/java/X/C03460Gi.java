package X;

import android.content.ContentValues;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Gi  reason: invalid class name and case insensitive filesystem */
public class C03460Gi {
    public static volatile C03460Gi A03;
    public final AnonymousClass02M A00;
    public final AnonymousClass0Gd A01;
    public final C03470Gj A02;

    public C03460Gi(AnonymousClass02M r3, C03440Gg r4, AnonymousClass0Gd r5) {
        C03470Gj r1;
        synchronized (r4) {
            r1 = r4.A04;
            if (r1 == null) {
                r1 = new C03470Gj(r4.A01());
                r4.A04 = r1;
            }
        }
        this.A00 = r3;
        this.A01 = r5;
        this.A02 = r1;
    }

    public static C03460Gi A00() {
        if (A03 == null) {
            synchronized (C03460Gi.class) {
                if (A03 == null) {
                    A03 = new C03460Gi(AnonymousClass02M.A00(), C03440Gg.A00(), AnonymousClass0Gd.A00);
                }
            }
        }
        return A03;
    }

    public void A01(C49232Po r6, long j) {
        AnonymousClass02M r2 = this.A00;
        r2.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 7));
        C03470Gj r22 = this.A02;
        String str = r6.A04;
        if (r22 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("plaintext_hash", str);
            contentValues.put("timestamp", Long.valueOf(j));
            ReentrantReadWriteLock.ReadLock readLock = r22.A01;
            readLock.lock();
            try {
                r22.A00.A01().A0B("starred_gifs", contentValues, "addStarredGif/INSERT_STARRED_GIF");
            } finally {
                readLock.unlock();
            }
        } else {
            throw null;
        }
    }
}
