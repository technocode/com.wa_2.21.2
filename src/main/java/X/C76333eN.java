package X;

/* renamed from: X.3eN  reason: invalid class name and case insensitive filesystem */
public final class C76333eN extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76333eN A0B;
    public static volatile AbstractC37151nd A0C;
    public int A00;
    public int A01;
    public int A02 = 1;
    public int A03 = 1;
    public AnonymousClass071 A04 = AnonymousClass071.A01;
    public C75423cu A05;
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";

    static {
        C76333eN r0 = new C76333eN();
        A0B = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012d, code lost:
        if (A0G(r0, r5) == false) goto L_0x012f;
     */
    @Override // X.AnonymousClass078
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0H(X.EnumC04960Mn r23, java.lang.Object r24, java.lang.Object r25) {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76333eN.A0H(X.0Mn, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A07);
        }
        int i3 = this.A00;
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A07(2, this.A04);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A03(3, this.A01);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A02(4, this.A02);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A02(5, this.A03);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A09(6, this.A06);
        }
        if ((this.A00 & 64) == 64) {
            i2 += AbstractC11750gu.A09(7, this.A08);
        }
        if ((this.A00 & 128) == 128) {
            i2 += AbstractC11750gu.A09(8, this.A09);
        }
        if ((this.A00 & 256) == 256) {
            i2 += AbstractC11750gu.A09(9, this.A0A);
        }
        if ((this.A00 & 512) == 512) {
            C75423cu r0 = this.A05;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(17, r0);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0L(1, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0J(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0E(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0E(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0E(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0L(6, this.A06);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0L(7, this.A08);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0L(8, this.A09);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0L(9, this.A0A);
        }
        if ((this.A00 & 512) == 512) {
            C75423cu r0 = this.A05;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r5.A0K(17, r0);
        }
        this.unknownFields.A02(r5);
    }
}
