package X;

/* renamed from: X.1Yu  reason: invalid class name and case insensitive filesystem */
public class C29471Yu {
    public AnonymousClass2B8 A00;

    public C29471Yu(int i, int i2, byte[][] bArr, AnonymousClass238 r12, AbstractC68363Cx r13) {
        boolean z;
        AbstractC04160Jh A0B = C77763gx.A03.AQb();
        byte[] A002 = r12.A00();
        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
        A0B.A02();
        C77763gx r1 = (C77763gx) A0B.A00;
        r1.A00 |= 1;
        r1.A02 = A003;
        if (!(r13 instanceof AnonymousClass3XF)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            byte[] ANr = ((AbstractC29461Yo) r13.A00()).ANr();
            AnonymousClass071 A004 = AnonymousClass071.A00(ANr, 0, ANr.length);
            A0B.A02();
            C77763gx r14 = (C77763gx) A0B.A00;
            r14.A00 |= 2;
            r14.A01 = A004;
        }
        AbstractC04160Jh A0B2 = AnonymousClass2B8.A04.AQb();
        A0B2.A02();
        AnonymousClass2B8 r15 = (AnonymousClass2B8) A0B2.A00;
        r15.A00 |= 1;
        r15.A01 = i;
        A0B2.A02();
        AnonymousClass2B8 r16 = (AnonymousClass2B8) A0B2.A00;
        if (r16 != null) {
            r16.A03 = (C77763gx) A0B.A01();
            r16.A00 |= 2;
            int length = bArr.length;
            int[] A0g = AnonymousClass1YV.A0g(i2, length);
            for (int i3 = 0; i3 < length; i3++) {
                C77713gs r3 = (C77713gs) C77723gt.A03.AQb();
                r3.A04(A0g[i3]);
                byte[] bArr2 = bArr[i3];
                AnonymousClass071 A005 = AnonymousClass071.A00(bArr2, 0, bArr2.length);
                r3.A02();
                C77723gt r17 = (C77723gt) r3.A00;
                r17.A00 |= 2;
                r17.A02 = A005;
                AnonymousClass078 A01 = r3.A01();
                A0B2.A02();
                AnonymousClass2B8 r2 = (AnonymousClass2B8) A0B2.A00;
                if (A01 != null) {
                    AbstractC04120Jd r18 = r2.A02;
                    if (!((AbstractC05040Mx) r18).A00) {
                        r18 = AnonymousClass078.A04(r18);
                        r2.A02 = r18;
                    }
                    r18.add(A01);
                } else {
                    throw null;
                }
            }
            this.A00 = (AnonymousClass2B8) A0B2.A01();
            return;
        }
        throw null;
    }

    public C29471Yu(AnonymousClass2B8 r1) {
        this.A00 = r1;
    }

    public void A00(C68213Ch r10) {
        byte[][] bArr = r10.A01;
        int i = r10.A00;
        int length = bArr.length;
        int[] A0g = AnonymousClass1YV.A0g(i, length);
        AbstractC04160Jh A0B = this.A00.AQb();
        A0B.A02();
        AnonymousClass2B8 r1 = (AnonymousClass2B8) A0B.A00;
        if (r1 != null) {
            r1.A02 = C05030Mw.A01;
            for (int i2 = 0; i2 < length; i2++) {
                C77713gs r3 = (C77713gs) C77723gt.A03.AQb();
                r3.A04(A0g[i2]);
                byte[] bArr2 = bArr[i2];
                AnonymousClass071 A002 = AnonymousClass071.A00(bArr2, 0, bArr2.length);
                r3.A02();
                C77723gt r12 = (C77723gt) r3.A00;
                r12.A00 |= 2;
                r12.A02 = A002;
                AnonymousClass078 A01 = r3.A01();
                A0B.A02();
                AnonymousClass2B8 r2 = (AnonymousClass2B8) A0B.A00;
                if (A01 != null) {
                    AbstractC04120Jd r13 = r2.A02;
                    if (!((AbstractC05040Mx) r13).A00) {
                        r13 = AnonymousClass078.A04(r13);
                        r2.A02 = r13;
                    }
                    r13.add(A01);
                } else {
                    throw null;
                }
            }
            this.A00 = (AnonymousClass2B8) A0B.A01();
            return;
        }
        throw null;
    }
}
