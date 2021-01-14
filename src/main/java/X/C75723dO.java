package X;

/* renamed from: X.3dO  reason: invalid class name and case insensitive filesystem */
public final class C75723dO extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75723dO A07;
    public static volatile AbstractC37151nd A08;
    public int A00;
    public int A01 = 0;
    public AbstractC04120Jd A02 = C05030Mw.A01;
    public C75423cu A03;
    public Object A04;
    public String A05 = "";
    public String A06 = "";

    static {
        C75723dO r0 = new C75723dO();
        A07 = r0;
        r0.A0C();
    }

    public AnonymousClass3JL A0I() {
        int i = this.A01;
        if (i == 0) {
            return AnonymousClass3JL.TITLE_NOT_SET;
        }
        if (i == 1) {
            return AnonymousClass3JL.TITLE_TEXT;
        }
        if (i == 2) {
            return AnonymousClass3JL.DOCUMENT_MESSAGE;
        }
        if (i == 3) {
            return AnonymousClass3JL.IMAGE_MESSAGE;
        }
        if (i == 4) {
            return AnonymousClass3JL.VIDEO_MESSAGE;
        }
        if (i != 5) {
            return null;
        }
        return AnonymousClass3JL.LOCATION_MESSAGE;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        String str;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A01;
        if (i3 == 1) {
            if (i3 == 1) {
                str = (String) this.A04;
            } else {
                str = "";
            }
            i = AbstractC11750gu.A09(1, str) + 0;
        } else {
            i = 0;
        }
        if (this.A01 == 2) {
            i += AbstractC11750gu.A08(2, (AnonymousClass079) this.A04);
        }
        if (this.A01 == 3) {
            i += AbstractC11750gu.A08(3, (AnonymousClass079) this.A04);
        }
        if (this.A01 == 4) {
            i += AbstractC11750gu.A08(4, (AnonymousClass079) this.A04);
        }
        if (this.A01 == 5) {
            i += AbstractC11750gu.A08(5, (AnonymousClass079) this.A04);
        }
        if ((this.A00 & 32) == 32) {
            i += AbstractC11750gu.A09(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            i += AbstractC11750gu.A09(7, this.A06);
        }
        if ((this.A00 & 128) == 128) {
            C75423cu r0 = this.A03;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i += AbstractC11750gu.A08(8, r0);
        }
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i += AbstractC11750gu.A08(9, (AnonymousClass076) this.A02.get(i4));
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        String str;
        int i = this.A01;
        if (i == 1) {
            if (i == 1) {
                str = (String) this.A04;
            } else {
                str = "";
            }
            r4.A0L(1, str);
        }
        if (this.A01 == 2) {
            r4.A0K(2, (AnonymousClass079) this.A04);
        }
        if (this.A01 == 3) {
            r4.A0K(3, (AnonymousClass079) this.A04);
        }
        if (this.A01 == 4) {
            r4.A0K(4, (AnonymousClass079) this.A04);
        }
        if (this.A01 == 5) {
            r4.A0K(5, (AnonymousClass079) this.A04);
        }
        if ((this.A00 & 32) == 32) {
            r4.A0L(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            r4.A0L(7, this.A06);
        }
        if ((this.A00 & 128) == 128) {
            C75423cu r0 = this.A03;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r4.A0K(8, r0);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            r4.A0K(9, (AnonymousClass076) this.A02.get(i2));
        }
        this.unknownFields.A02(r4);
    }
}
