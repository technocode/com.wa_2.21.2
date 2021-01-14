package X;

/* renamed from: X.1hy  reason: invalid class name and case insensitive filesystem */
public final class C34141hy implements AnonymousClass143 {
    public boolean A00;
    public final AnonymousClass143 A01;
    public final /* synthetic */ AnonymousClass25T A02;

    public C34141hy(AnonymousClass25T r1, AnonymousClass143 r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass143
    public boolean ABS() {
        return !this.A02.A00() && this.A01.ABS();
    }

    @Override // X.AnonymousClass143
    public void AC4() {
        this.A01.AC4();
    }

    @Override // X.AnonymousClass143
    public int AMM(AnonymousClass127 r12, C33961hf r13, boolean z) {
        AnonymousClass25T r1 = this.A02;
        if (r1.A00()) {
            return -3;
        }
        if (this.A00) {
            ((AbstractC227012v) r13).A00 = 4;
            return -4;
        }
        int AMM = this.A01.AMM(r12, r13, z);
        if (AMM == -5) {
            AnonymousClass126 r5 = r12.A00;
            int i = r5.A06;
            if (!(i == 0 && r5.A07 == 0)) {
                int i2 = 0;
                if (r1.A00 == Long.MIN_VALUE) {
                    i2 = r5.A07;
                }
                r12.A00 = r5.A01(i, i2);
            }
            return -5;
        }
        long j = r1.A00;
        if (j == Long.MIN_VALUE || (AMM != -4 ? !(AMM == -3 && r1.A51() == Long.MIN_VALUE) : r13.A00 < j)) {
            return AMM;
        }
        r13.A03();
        ((AbstractC227012v) r13).A00 = 4;
        this.A00 = true;
        return -4;
    }

    @Override // X.AnonymousClass143
    public int APy(long j) {
        if (this.A02.A00()) {
            return -3;
        }
        return this.A01.APy(j);
    }
}
