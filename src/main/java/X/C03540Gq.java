package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Gq  reason: invalid class name and case insensitive filesystem */
public class C03540Gq {
    public static volatile C03540Gq A06;
    public C52672bV A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass04q A03;
    public final String A04 = "commerce.db";
    public final ReentrantReadWriteLock A05 = new ReentrantReadWriteLock();

    public C03540Gq(AnonymousClass009 r2, AnonymousClass00G r3, AnonymousClass04q r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static C03540Gq A00() {
        if (A06 == null) {
            synchronized (C03540Gq.class) {
                if (A06 == null) {
                    A06 = new C03540Gq(AnonymousClass009.A00(), AnonymousClass00G.A01, AnonymousClass04q.A00());
                }
            }
        }
        return A06;
    }

    public AnonymousClass0OQ A01() {
        return new AnonymousClass0OQ(this.A05.readLock(), A02(), null, true, this.A01);
    }

    public synchronized C52672bV A02() {
        C52672bV r3;
        r3 = this.A00;
        if (r3 == null) {
            r3 = new C52672bV(this.A02, this.A03, this.A04);
            this.A00 = r3;
        }
        return r3;
    }

    public synchronized void A03() {
        C52672bV r0 = this.A00;
        if (r0 != null) {
            r0.close();
            this.A00 = null;
        }
    }
}
