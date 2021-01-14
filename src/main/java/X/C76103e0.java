package X;

/* renamed from: X.3e0  reason: invalid class name and case insensitive filesystem */
public final class C76103e0 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76103e0 A0A;
    public static volatile AbstractC37151nd A0B;
    public int A00;
    public AbstractC04120Jd A01;
    public AbstractC04120Jd A02;
    public AnonymousClass0OG A03;
    public String A04;
    public String A05;
    public String A06 = "";
    public String A07;
    public String A08;
    public String A09 = "";

    static {
        C76103e0 r0 = new C76103e0();
        A0A = r0;
        r0.A0C();
    }

    public C76103e0() {
        C05030Mw r0 = C05030Mw.A01;
        this.A02 = r0;
        this.A08 = "";
        this.A07 = "";
        this.A01 = r0;
        this.A05 = "";
        this.A04 = "";
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = AbstractC11750gu.A09(1, this.A09) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += AbstractC11750gu.A09(2, this.A06);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 += AbstractC11750gu.A0B((String) this.A02.get(i4));
        }
        int size = this.A02.size() + i + i3;
        if ((this.A00 & 4) == 4) {
            size += AbstractC11750gu.A09(4, this.A08);
        }
        if ((this.A00 & 8) == 8) {
            size += AbstractC11750gu.A09(5, this.A07);
        }
        for (int i5 = 0; i5 < this.A01.size(); i5++) {
            size += AbstractC11750gu.A08(6, (AnonymousClass076) this.A01.get(i5));
        }
        if ((this.A00 & 16) == 16) {
            size += AbstractC11750gu.A09(7, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            size += AbstractC11750gu.A09(8, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass0OG r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass0OG.A05;
            }
            size += AbstractC11750gu.A08(9, r0);
        }
        int A002 = this.unknownFields.A00() + size;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0L(1, this.A09);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0L(2, this.A06);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            r5.A0L(3, (String) this.A02.get(i));
        }
        if ((this.A00 & 4) == 4) {
            r5.A0L(4, this.A08);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0L(5, this.A07);
        }
        for (int i2 = 0; i2 < this.A01.size(); i2++) {
            r5.A0K(6, (AnonymousClass076) this.A01.get(i2));
        }
        if ((this.A00 & 16) == 16) {
            r5.A0L(7, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0L(8, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass0OG r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass0OG.A05;
            }
            r5.A0K(9, r0);
        }
        this.unknownFields.A02(r5);
    }
}
