package X;

/* renamed from: X.1ho  reason: invalid class name and case insensitive filesystem */
public final class C34041ho implements AnonymousClass13M {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C233815n A04;

    @Override // X.AnonymousClass13M
    public boolean AB3() {
        return false;
    }

    public C34041ho(C34021hm r3) {
        C233815n r1 = r3.A00;
        this.A04 = r1;
        r1.A0B(12);
        C233815n r12 = this.A04;
        this.A02 = r12.A02() & 255;
        this.A03 = r12.A02();
    }

    @Override // X.AnonymousClass13M
    public int A8s() {
        return this.A03;
    }

    @Override // X.AnonymousClass13M
    public int AMO() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A01();
        }
        if (i == 16) {
            return this.A04.A03();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int A012 = this.A04.A01();
        this.A00 = A012;
        return (A012 & 240) >> 4;
    }
}
