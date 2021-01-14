package X;

/* renamed from: X.3gF  reason: invalid class name and case insensitive filesystem */
public final class C77493gF extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77493gF A0B;
    public static volatile AbstractC37151nd A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public AnonymousClass0N3 A07;
    public String A08 = "";
    public String A09 = "";
    public boolean A0A;

    static {
        C77493gF r0 = new C77493gF();
        A0B = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0138, code lost:
        if (A0G(r0, r15) == false) goto L_0x013a;
     */
    @Override // X.AnonymousClass078
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0H(X.EnumC04960Mn r23, java.lang.Object r24, java.lang.Object r25) {
        /*
        // Method dump skipped, instructions count: 874
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77493gF.A0H(X.0Mn, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A02(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A06(2, this.A04);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A09(3, this.A09);
        }
        int i4 = this.A00;
        if ((i4 & 8) == 8) {
            i2 += AbstractC11750gu.A02(4, this.A02);
        }
        if ((i4 & 16) == 16) {
            i2 += AbstractC11750gu.A06(5, this.A06);
        }
        if ((i4 & 32) == 32) {
            AnonymousClass0N3 r0 = this.A07;
            if (r0 == null) {
                r0 = AnonymousClass0N3.A05;
            }
            i2 += AbstractC11750gu.A08(6, r0);
        }
        int i5 = this.A00;
        if ((i5 & 64) == 64) {
            i2 += AbstractC11750gu.A06(7, this.A05);
        }
        if ((i5 & 128) == 128) {
            i2 += AbstractC11750gu.A00(8);
        }
        if ((i5 & 256) == 256) {
            i2 += AbstractC11750gu.A09(9, this.A08);
        }
        if ((this.A00 & 512) == 512) {
            i2 += AbstractC11750gu.A02(10, this.A03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0E(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0H(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0L(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0E(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0H(5, this.A06);
        }
        if ((this.A00 & 32) == 32) {
            AnonymousClass0N3 r0 = this.A07;
            if (r0 == null) {
                r0 = AnonymousClass0N3.A05;
            }
            r5.A0K(6, r0);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0H(7, this.A05);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0M(8, this.A0A);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0L(9, this.A08);
        }
        if ((this.A00 & 512) == 512) {
            r5.A0E(10, this.A03);
        }
        this.unknownFields.A02(r5);
    }
}
