package X;

/* renamed from: X.3ei  reason: invalid class name and case insensitive filesystem */
public final class C76543ei extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76543ei A06;
    public static volatile AbstractC37151nd A07;
    public int A00;
    public int A01 = 0;
    public AbstractC04120Jd A02 = C05030Mw.A01;
    public C76103e0 A03;
    public C76103e0 A04;
    public Object A05;

    static {
        C76543ei r0 = new C76543ei();
        A06 = r0;
        r0.A0C();
    }

    public EnumC69913Ja A0I() {
        int i = this.A01;
        if (i == 0) {
            return EnumC69913Ja.TITLE_NOT_SET;
        }
        if (i == 1) {
            return EnumC69913Ja.DOCUMENT_MESSAGE;
        }
        if (i == 2) {
            return EnumC69913Ja.HIGHLY_STRUCTURED_MESSAGE;
        }
        if (i == 3) {
            return EnumC69913Ja.IMAGE_MESSAGE;
        }
        if (i == 4) {
            return EnumC69913Ja.VIDEO_MESSAGE;
        }
        if (i != 5) {
            return null;
        }
        return EnumC69913Ja.LOCATION_MESSAGE;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if (this.A01 == 1) {
            i = AbstractC11750gu.A08(1, (AnonymousClass079) this.A05) + 0;
        } else {
            i = 0;
        }
        if (this.A01 == 2) {
            i += AbstractC11750gu.A08(2, (AnonymousClass079) this.A05);
        }
        if (this.A01 == 3) {
            i += AbstractC11750gu.A08(3, (AnonymousClass079) this.A05);
        }
        if (this.A01 == 4) {
            i += AbstractC11750gu.A08(4, (AnonymousClass079) this.A05);
        }
        if (this.A01 == 5) {
            i += AbstractC11750gu.A08(5, (AnonymousClass079) this.A05);
        }
        if ((this.A00 & 32) == 32) {
            C76103e0 r0 = this.A03;
            if (r0 == null) {
                r0 = C76103e0.A0A;
            }
            i += AbstractC11750gu.A08(6, r0);
        }
        if ((this.A00 & 64) == 64) {
            C76103e0 r02 = this.A04;
            if (r02 == null) {
                r02 = C76103e0.A0A;
            }
            i += AbstractC11750gu.A08(7, r02);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i += AbstractC11750gu.A08(8, (AnonymousClass076) this.A02.get(i3));
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if (this.A01 == 1) {
            r4.A0K(1, (AnonymousClass079) this.A05);
        }
        if (this.A01 == 2) {
            r4.A0K(2, (AnonymousClass079) this.A05);
        }
        if (this.A01 == 3) {
            r4.A0K(3, (AnonymousClass079) this.A05);
        }
        if (this.A01 == 4) {
            r4.A0K(4, (AnonymousClass079) this.A05);
        }
        if (this.A01 == 5) {
            r4.A0K(5, (AnonymousClass079) this.A05);
        }
        if ((this.A00 & 32) == 32) {
            C76103e0 r0 = this.A03;
            if (r0 == null) {
                r0 = C76103e0.A0A;
            }
            r4.A0K(6, r0);
        }
        if ((this.A00 & 64) == 64) {
            C76103e0 r02 = this.A04;
            if (r02 == null) {
                r02 = C76103e0.A0A;
            }
            r4.A0K(7, r02);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            r4.A0K(8, (AnonymousClass076) this.A02.get(i));
        }
        this.unknownFields.A02(r4);
    }
}
