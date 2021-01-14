package X;

/* renamed from: X.0Jc  reason: invalid class name and case insensitive filesystem */
public final class C04110Jc extends AnonymousClass078 implements AnonymousClass077 {
    public static final C04110Jc A07;
    public static volatile AbstractC37151nd A08;
    public int A00;
    public int A01;
    public AbstractC04120Jd A02 = C05030Mw.A01;
    public C75213cY A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";

    static {
        C04110Jc r0 = new C04110Jc();
        A07 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = AbstractC11750gu.A09(1, this.A06) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += AbstractC11750gu.A09(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            i += AbstractC11750gu.A09(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            i += AbstractC11750gu.A04(4, this.A01);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i += AbstractC11750gu.A08(5, (AnonymousClass076) this.A02.get(i3));
        }
        if ((this.A00 & 16) == 16) {
            C75213cY r0 = this.A03;
            if (r0 == null) {
                r0 = C75213cY.A05;
            }
            i += AbstractC11750gu.A08(6, r0);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A06);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0L(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0L(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0F(4, this.A01);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            r4.A0K(5, (AnonymousClass076) this.A02.get(i));
        }
        if ((this.A00 & 16) == 16) {
            C75213cY r0 = this.A03;
            if (r0 == null) {
                r0 = C75213cY.A05;
            }
            r4.A0K(6, r0);
        }
        this.unknownFields.A02(r4);
    }
}
