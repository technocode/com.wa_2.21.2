package X;

/* renamed from: X.1hP  reason: invalid class name and case insensitive filesystem */
public final class C33801hP implements AbstractC233315i {
    public AbstractC33821hR A00;
    public AbstractC233315i A01;
    public final AnonymousClass11v A02;
    public final C34501ia A03;

    public C33801hP(AnonymousClass11v r2, AnonymousClass15Y r3) {
        this.A02 = r2;
        this.A03 = new C34501ia(r3);
    }

    public final void A00() {
        long A8V = this.A01.A8V();
        C34501ia r3 = this.A03;
        r3.A00(A8V);
        AnonymousClass12F A8Q = this.A01.A8Q();
        if (!A8Q.equals(r3.A02)) {
            if (r3.A03) {
                r3.A00(r3.A8V());
            }
            r3.A02 = A8Q;
            ((AnonymousClass25N) this.A02).A0Q.A00.obtainMessage(16, A8Q).sendToTarget();
        }
    }

    @Override // X.AbstractC233315i
    public AnonymousClass12F A8Q() {
        AbstractC233315i r0 = this.A01;
        if (r0 != null) {
            return r0.A8Q();
        }
        return this.A03.A02;
    }

    @Override // X.AbstractC233315i
    public long A8V() {
        boolean z;
        AbstractC33821hR r0 = this.A00;
        if (r0 == null || r0.AB1() || (!this.A00.ABS() && this.A00.AAM())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.A01.A8V();
        }
        return this.A03.A8V();
    }

    @Override // X.AbstractC233315i
    public AnonymousClass12F AOp(AnonymousClass12F r3) {
        AbstractC233315i r0 = this.A01;
        if (r0 != null) {
            r3 = r0.AOp(r3);
        }
        this.A03.AOp(r3);
        ((AnonymousClass25N) this.A02).A0Q.A00.obtainMessage(16, r3).sendToTarget();
        return r3;
    }
}
