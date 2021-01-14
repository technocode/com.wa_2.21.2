package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2z0  reason: invalid class name and case insensitive filesystem */
public class C64912z0 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass3MP A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final AtomicInteger A07 = new AtomicInteger(-1);
    public final AtomicInteger A08 = new AtomicInteger(0);
    public final AtomicLong A09 = new AtomicLong(-1);
    public final boolean A0A;
    public final boolean A0B;

    public C64912z0(AnonymousClass3MP r5, boolean z, long j, int i, long j2) {
        this.A03 = r5;
        this.A0B = z;
        this.A01 = j;
        this.A00 = i;
        this.A02 = j2;
        this.A0A = true;
    }

    public void A00(short s, long j) {
        if (this.A09.compareAndSet(-1, j)) {
            this.A07.set(s);
        }
    }
}
