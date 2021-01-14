package X;

/* renamed from: X.3dA  reason: invalid class name and case insensitive filesystem */
public final class C75583dA extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75583dA A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01;
    public int A02 = -1;
    public int A03;
    public AbstractC11330g6 A04 = C11320g5.A02;

    static {
        C75583dA r0 = new C75583dA();
        A05 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2;
        int i3 = ((AnonymousClass078) this).A00;
        if (i3 != -1) {
            return i3;
        }
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i = AbstractC11750gu.A04(1, this.A03) + 0;
        } else {
            i = 0;
        }
        if ((i4 & 2) == 2) {
            i += AbstractC11750gu.A04(2, this.A01);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.A04.size(); i6++) {
            C11320g5 r0 = (C11320g5) this.A04;
            r0.A02(i6);
            i5 += AbstractC11750gu.A01(r0.A01[i6]);
        }
        int i7 = i + i5;
        if (!this.A04.isEmpty()) {
            int i8 = i7 + 1;
            if (i5 >= 0) {
                i2 = AbstractC11750gu.A01(i5);
            } else {
                i2 = 10;
            }
            i7 = i8 + i2;
        }
        this.A02 = i5;
        int A002 = this.unknownFields.A00() + i7;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        A90();
        if ((this.A00 & 1) == 1) {
            r3.A0F(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0F(2, this.A01);
        }
        if (this.A04.size() > 0) {
            r3.A0C(26);
            r3.A0C(this.A02);
        }
        for (int i = 0; i < this.A04.size(); i++) {
            C11320g5 r0 = (C11320g5) this.A04;
            r0.A02(i);
            r3.A0C(r0.A01[i]);
        }
        this.unknownFields.A02(r3);
    }
}
