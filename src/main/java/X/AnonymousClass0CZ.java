package X;

/* renamed from: X.0CZ  reason: invalid class name */
public class AnonymousClass0CZ {
    public long A00;
    public long A01;
    public long A02;
    public final long A03;
    public final long A04;

    public AnonymousClass0CZ(long j, long j2) {
        boolean z = true;
        AnonymousClass00E.A07(j > 0);
        AnonymousClass00E.A07(j2 <= 0 ? false : z);
        this.A04 = j2;
        this.A03 = j;
        A02();
    }

    public synchronized long A00() {
        return this.A02;
    }

    public synchronized long A01() {
        this.A02++;
        long j = this.A00;
        long j2 = this.A04;
        if (j > j2) {
            return j2;
        }
        long j3 = this.A01 + j;
        this.A01 = j3;
        long j4 = j3 - j;
        this.A00 = j4;
        return j3 - j4;
    }

    public synchronized void A02() {
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = this.A03;
    }

    public synchronized void A03(long j) {
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        if (j < this.A02) {
            A02();
        }
        while (this.A02 < j) {
            A01();
        }
    }
}
