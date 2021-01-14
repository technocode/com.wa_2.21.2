package X;

/* renamed from: X.1ia  reason: invalid class name and case insensitive filesystem */
public final class C34501ia implements AbstractC233315i {
    public long A00;
    public long A01;
    public AnonymousClass12F A02 = AnonymousClass12F.A04;
    public boolean A03;
    public final AnonymousClass15Y A04;

    public C34501ia(AnonymousClass15Y r2) {
        this.A04 = r2;
    }

    public void A00(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A3z();
        }
    }

    @Override // X.AbstractC233315i
    public AnonymousClass12F A8Q() {
        return this.A02;
    }

    @Override // X.AbstractC233315i
    public long A8V() {
        long j = this.A01;
        if (!this.A03) {
            return j;
        }
        long A3z = this.A04.A3z() - this.A00;
        AnonymousClass12F r4 = this.A02;
        if (r4.A01 == 1.0f) {
            return j + AnonymousClass11u.A00(A3z);
        }
        return j + (A3z * ((long) r4.A02));
    }

    @Override // X.AbstractC233315i
    public AnonymousClass12F AOp(AnonymousClass12F r3) {
        if (this.A03) {
            A00(A8V());
        }
        this.A02 = r3;
        return r3;
    }
}
