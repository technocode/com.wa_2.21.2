package X;

/* renamed from: X.1Z1  reason: invalid class name */
public class AnonymousClass1Z1 {
    public AnonymousClass3AO A00;

    public AnonymousClass1Z1() {
        this.A00 = (AnonymousClass3AO) AnonymousClass3AO.A0E.AQb().A01();
    }

    public AnonymousClass1Z1(AnonymousClass1Z1 r2) {
        this.A00 = (AnonymousClass3AO) r2.A00.AQb().A01();
    }

    public AnonymousClass1Z1(AnonymousClass3AO r1) {
        this.A00 = r1;
    }

    public AnonymousClass1Yc A00() {
        try {
            return new AnonymousClass1Yc(this.A00.A06.A01());
        } catch (C29361Ye e) {
            throw new AssertionError(e);
        }
    }

    public AnonymousClass1Yc A01() {
        try {
            AnonymousClass3AO r3 = this.A00;
            boolean z = false;
            if ((r3.A00 & 4) == 4) {
                z = true;
            }
            if (!z) {
                return null;
            }
            return new AnonymousClass1Yc(r3.A07.A01());
        } catch (C29361Ye e) {
            AnonymousClass1YV.A0H(e);
            return null;
        }
    }

    public AnonymousClass238 A02() {
        try {
            AnonymousClass3Cd r0 = this.A00.A0A;
            if (r0 == null) {
                r0 = AnonymousClass3Cd.A05;
            }
            return C05360Of.A02(r0.A02.A01());
        } catch (C29361Ye e) {
            throw new AssertionError(e);
        }
    }

    public C68283Cp A03() {
        AnonymousClass3AO r2 = this.A00;
        AnonymousClass3Cd r0 = r2.A0A;
        if (r0 == null) {
            r0 = AnonymousClass3Cd.A05;
        }
        C77803h1 r1 = r0.A04;
        if (r1 == null) {
            r1 = C77803h1.A03;
        }
        int i = r2.A04;
        if (i == 0) {
            i = 2;
        }
        return new C68283Cp(AbstractC68253Cm.A00(i), r1.A02.A01(), r1.A01);
    }

    public final C68353Cw A04(AnonymousClass238 r6) {
        int i = 0;
        for (AnonymousClass3Cd r2 : this.A00.A09) {
            try {
                if (C05360Of.A02(r2.A02.A01()).equals(r6)) {
                    return new C68353Cw(r2, Integer.valueOf(i));
                }
                i++;
            } catch (C29361Ye e) {
                AnonymousClass1YV.A0H(e);
            }
        }
        return null;
    }

    public void A05() {
        AbstractC04160Jh A0B = this.A00.AQb();
        A0B.A02();
        AnonymousClass3AO r1 = (AnonymousClass3AO) A0B.A00;
        r1.A00 |= 1;
        r1.A04 = 3;
        this.A00 = (AnonymousClass3AO) A0B.A01();
    }

    public void A06(int i) {
        AbstractC04160Jh A0B = this.A00.AQb();
        A0B.A02();
        AnonymousClass3AO r1 = (AnonymousClass3AO) A0B.A00;
        r1.A00 |= 512;
        r1.A01 = i;
        this.A00 = (AnonymousClass3AO) A0B.A01();
    }

    public void A07(int i) {
        AbstractC04160Jh A0B = this.A00.AQb();
        A0B.A02();
        AnonymousClass3AO r1 = (AnonymousClass3AO) A0B.A00;
        r1.A00 |= 256;
        r1.A03 = i;
        this.A00 = (AnonymousClass3AO) A0B.A01();
    }

    public void A08(AnonymousClass1Yc r5) {
        AbstractC04160Jh A0B = this.A00.AQb();
        byte[] A002 = r5.A00.A00();
        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
        A0B.A02();
        AnonymousClass3AO r1 = (AnonymousClass3AO) A0B.A00;
        r1.A00 |= 2;
        r1.A06 = A003;
        this.A00 = (AnonymousClass3AO) A0B.A01();
    }

    public void A09(AnonymousClass1Yc r5) {
        AbstractC04160Jh A0B = this.A00.AQb();
        byte[] A002 = r5.A00.A00();
        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
        A0B.A02();
        AnonymousClass3AO r1 = (AnonymousClass3AO) A0B.A00;
        r1.A00 |= 4;
        r1.A07 = A003;
        this.A00 = (AnonymousClass3AO) A0B.A01();
    }

    public void A0A(AnonymousClass238 r5, C68283Cp r6) {
        C77793h0 r3 = (C77793h0) C77803h1.A03.AQb();
        byte[] bArr = r6.A02;
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        r3.A02();
        C77803h1 r1 = (C77803h1) r3.A00;
        r1.A00 |= 2;
        r1.A02 = A002;
        r3.A04(r6.A00);
        AbstractC04160Jh A0B = AnonymousClass3Cd.A05.AQb();
        A0B.A02();
        AnonymousClass3Cd.A08((AnonymousClass3Cd) A0B.A00, (C77803h1) r3.A01());
        byte[] A003 = r5.A00();
        AnonymousClass071 A004 = AnonymousClass071.A00(A003, 0, A003.length);
        A0B.A02();
        AnonymousClass3Cd r12 = (AnonymousClass3Cd) A0B.A00;
        r12.A00 |= 1;
        r12.A02 = A004;
        AnonymousClass078 A01 = A0B.A01();
        AbstractC04160Jh A0B2 = this.A00.AQb();
        A0B2.A02();
        AnonymousClass3AO r0 = (AnonymousClass3AO) A0B2.A00;
        if (A01 != null) {
            r0.A0I();
            r0.A09.add(A01);
            AnonymousClass3AO r02 = (AnonymousClass3AO) A0B2.A01();
            this.A00 = r02;
            if (r02.A09.size() > 5) {
                AbstractC04160Jh A0B3 = this.A00.AQb();
                A0B3.A02();
                AnonymousClass3AO r03 = (AnonymousClass3AO) A0B3.A00;
                r03.A0I();
                r03.A09.remove(0);
                this.A00 = (AnonymousClass3AO) A0B3.A01();
                return;
            }
            return;
        }
        throw null;
    }

    public void A0B(C29451Yn r6, C68283Cp r7) {
        C77793h0 r3 = (C77793h0) C77803h1.A03.AQb();
        byte[] bArr = r7.A02;
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        r3.A02();
        C77803h1 r1 = (C77803h1) r3.A00;
        r1.A00 |= 2;
        r1.A02 = A002;
        r3.A04(r7.A00);
        AbstractC04160Jh A0B = AnonymousClass3Cd.A05.AQb();
        byte[] A003 = r6.A00.A00();
        AnonymousClass071 A004 = AnonymousClass071.A00(A003, 0, A003.length);
        A0B.A02();
        AnonymousClass3Cd r12 = (AnonymousClass3Cd) A0B.A00;
        r12.A00 |= 1;
        r12.A02 = A004;
        byte[] ANr = r6.A01.ANr();
        AnonymousClass071 A005 = AnonymousClass071.A00(ANr, 0, ANr.length);
        A0B.A02();
        AnonymousClass3Cd r13 = (AnonymousClass3Cd) A0B.A00;
        r13.A00 |= 2;
        r13.A01 = A005;
        A0B.A02();
        AnonymousClass3Cd.A08((AnonymousClass3Cd) A0B.A00, (C77803h1) r3.A01());
        AnonymousClass3Cd r32 = (AnonymousClass3Cd) A0B.A01();
        AbstractC04160Jh A0B2 = this.A00.AQb();
        A0B2.A02();
        AnonymousClass3AO r14 = (AnonymousClass3AO) A0B2.A00;
        if (r32 != null) {
            r14.A0A = r32;
            r14.A00 |= 32;
            this.A00 = (AnonymousClass3AO) A0B2.A01();
            return;
        }
        throw null;
    }

    public void A0C(C68313Cs r5) {
        AbstractC04160Jh A0B = this.A00.AQb();
        byte[] bArr = r5.A01;
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        A0B.A02();
        AnonymousClass3AO r1 = (AnonymousClass3AO) A0B.A00;
        r1.A00 |= 8;
        r1.A08 = A002;
        this.A00 = (AnonymousClass3AO) A0B.A01();
    }

    public void A0D(byte[] bArr) {
        AbstractC04160Jh A0B = this.A00.AQb();
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        A0B.A02();
        AnonymousClass3AO r1 = (AnonymousClass3AO) A0B.A00;
        r1.A00 |= 2048;
        r1.A05 = A002;
        this.A00 = (AnonymousClass3AO) A0B.A01();
    }
}
