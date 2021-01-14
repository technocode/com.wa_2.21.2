package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0H1  reason: invalid class name */
public class AnonymousClass0H1 {
    public static volatile AnonymousClass0H1 A02;
    public final AnonymousClass0BZ A00;
    public final ReentrantReadWriteLock.ReadLock A01;

    public AnonymousClass0H1(AnonymousClass0BZ r2) {
        this.A00 = r2;
        this.A01 = r2.A07().A04.readLock();
    }

    public static AnonymousClass0H1 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0H1.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0H1(AnonymousClass0BZ.A00());
                }
            }
        }
        return A02;
    }
}
