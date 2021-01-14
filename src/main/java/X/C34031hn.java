package X;

/* renamed from: X.1hn  reason: invalid class name and case insensitive filesystem */
public final class C34031hn implements AnonymousClass13M {
    public final int A00;
    public final int A01;
    public final C233815n A02;

    public C34031hn(C34021hm r3) {
        C233815n r1 = r3.A00;
        this.A02 = r1;
        r1.A0B(12);
        C233815n r12 = this.A02;
        this.A00 = r12.A02();
        this.A01 = r12.A02();
    }

    @Override // X.AnonymousClass13M
    public int A8s() {
        return this.A01;
    }

    @Override // X.AnonymousClass13M
    public boolean AB3() {
        return this.A00 != 0;
    }

    @Override // X.AnonymousClass13M
    public int AMO() {
        int i = this.A00;
        return i == 0 ? this.A02.A02() : i;
    }
}
