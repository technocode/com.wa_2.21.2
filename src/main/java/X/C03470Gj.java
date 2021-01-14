package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Gj  reason: invalid class name and case insensitive filesystem */
public class C03470Gj {
    public final C03450Gh A00;
    public final ReentrantReadWriteLock.ReadLock A01;

    public C03470Gj(C03450Gh r2) {
        this.A00 = r2;
        this.A01 = r2.A04.readLock();
    }
}
