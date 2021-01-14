package X;

/* renamed from: X.0OH  reason: invalid class name */
public final class AnonymousClass0OH extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0OH A07;
    public static volatile AbstractC37151nd A08;
    public int A00;
    public int A01 = 0;
    public AbstractC04120Jd A02 = C05030Mw.A01;
    public Object A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";

    static {
        AnonymousClass0OH r0 = new AnonymousClass0OH();
        A07 = r0;
        r0.A0C();
    }

    public EnumC69923Jb A0I() {
        int i = this.A01;
        if (i == 0) {
            return EnumC69923Jb.TITLE_NOT_SET;
        }
        if (i == 1) {
            return EnumC69923Jb.DOCUMENT_MESSAGE;
        }
        if (i == 2) {
            return EnumC69923Jb.HYDRATED_TITLE_TEXT;
        }
        if (i == 3) {
            return EnumC69923Jb.IMAGE_MESSAGE;
        }
        if (i == 4) {
            return EnumC69923Jb.VIDEO_MESSAGE;
        }
        if (i != 5) {
            return null;
        }
        return EnumC69923Jb.LOCATION_MESSAGE;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        String str;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if (this.A01 == 1) {
            i = AbstractC11750gu.A08(1, (AnonymousClass079) this.A03) + 0;
        } else {
            i = 0;
        }
        int i3 = this.A01;
        if (i3 == 2) {
            if (i3 == 2) {
                str = (String) this.A03;
            } else {
                str = "";
            }
            i += AbstractC11750gu.A09(2, str);
        }
        if (this.A01 == 3) {
            i += AbstractC11750gu.A08(3, (AnonymousClass079) this.A03);
        }
        if (this.A01 == 4) {
            i += AbstractC11750gu.A08(4, (AnonymousClass079) this.A03);
        }
        if (this.A01 == 5) {
            i += AbstractC11750gu.A08(5, (AnonymousClass079) this.A03);
        }
        if ((this.A00 & 32) == 32) {
            i += AbstractC11750gu.A09(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            i += AbstractC11750gu.A09(7, this.A05);
        }
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i += AbstractC11750gu.A08(8, (AnonymousClass076) this.A02.get(i4));
        }
        if ((this.A00 & 128) == 128) {
            i += AbstractC11750gu.A09(9, this.A06);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        String str;
        if (this.A01 == 1) {
            r4.A0K(1, (AnonymousClass079) this.A03);
        }
        int i = this.A01;
        if (i == 2) {
            if (i == 2) {
                str = (String) this.A03;
            } else {
                str = "";
            }
            r4.A0L(2, str);
        }
        if (this.A01 == 3) {
            r4.A0K(3, (AnonymousClass079) this.A03);
        }
        if (this.A01 == 4) {
            r4.A0K(4, (AnonymousClass079) this.A03);
        }
        if (this.A01 == 5) {
            r4.A0K(5, (AnonymousClass079) this.A03);
        }
        if ((this.A00 & 32) == 32) {
            r4.A0L(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            r4.A0L(7, this.A05);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            r4.A0K(8, (AnonymousClass076) this.A02.get(i2));
        }
        if ((this.A00 & 128) == 128) {
            r4.A0L(9, this.A06);
        }
        this.unknownFields.A02(r4);
    }
}
