package X;

/* renamed from: X.12E  reason: invalid class name */
public final class AnonymousClass12E {
    public static final C229113r A0D = new C229113r(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass12R A03;
    public final C229113r A04;
    public final C229113r A05;
    public final AnonymousClass14A A06;
    public final C232414y A07;
    public final Object A08;
    public final boolean A09;
    public volatile long A0A;
    public volatile long A0B;
    public volatile long A0C;

    public AnonymousClass12E(AnonymousClass12R r3, Object obj, C229113r r5, long j, long j2, int i, boolean z, AnonymousClass14A r12, C232414y r13, C229113r r14, long j3, long j4, long j5) {
        this.A03 = r3;
        this.A08 = obj;
        this.A05 = r5;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A09 = z;
        this.A06 = r12;
        this.A07 = r13;
        this.A04 = r14;
        this.A0A = j3;
        this.A0C = j4;
        this.A0B = j5;
    }

    public static AnonymousClass12E A00(long j, C232414y r19) {
        AnonymousClass12R r1 = AnonymousClass12R.A00;
        C229113r r3 = A0D;
        return new AnonymousClass12E(r1, null, r3, j, -9223372036854775807L, 1, false, AnonymousClass14A.A03, r19, r3, j, 0, j);
    }

    public AnonymousClass12E A01(C229113r r21, long j, long j2) {
        long j3 = j2;
        AnonymousClass12R r2 = this.A03;
        Object obj = this.A08;
        if (!r21.A00()) {
            j3 = -9223372036854775807L;
        }
        return new AnonymousClass12E(r2, obj, r21, j, j3, this.A00, this.A09, this.A06, this.A07, r21, j, 0, j);
    }

    public AnonymousClass12E A02(C229113r r21, long j, long j2, long j3) {
        long j4 = j2;
        AnonymousClass12R r2 = this.A03;
        Object obj = this.A08;
        if (!r21.A00()) {
            j4 = -9223372036854775807L;
        }
        return new AnonymousClass12E(r2, obj, r21, j, j4, this.A00, this.A09, this.A06, this.A07, this.A04, this.A0A, j3, j);
    }

    public AnonymousClass12E A03(AnonymousClass14A r29, C232414y r30) {
        return new AnonymousClass12E(this.A03, this.A08, this.A05, this.A02, this.A01, this.A00, this.A09, r29, r30, this.A04, this.A0A, this.A0C, this.A0B);
    }

    public C229113r A04(boolean z, AnonymousClass12Q r4) {
        AnonymousClass12R r1 = this.A03;
        if (r1.A0D()) {
            return A0D;
        }
        return new C229113r(r1.A0C(r1.A0A(r1.A05(z), r4).A00));
    }
}
