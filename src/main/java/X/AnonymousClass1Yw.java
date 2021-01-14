package X;

/* renamed from: X.1Yw  reason: invalid class name */
public class AnonymousClass1Yw {
    public AnonymousClass2BB A00;

    public AnonymousClass1Yw(int i, int i2, byte[] bArr, AnonymousClass238 r10, AbstractC68363Cx r11) {
        boolean z;
        C77713gs r3 = (C77713gs) C77723gt.A03.AQb();
        r3.A04(i2);
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        r3.A02();
        C77723gt r1 = (C77723gt) r3.A00;
        r1.A00 |= 2;
        r1.A02 = A002;
        C77723gt r4 = (C77723gt) r3.A01();
        AbstractC04160Jh A0B = C77763gx.A03.AQb();
        byte[] A003 = r10.A00();
        AnonymousClass071 A004 = AnonymousClass071.A00(A003, 0, A003.length);
        A0B.A02();
        C77763gx r12 = (C77763gx) A0B.A00;
        r12.A00 |= 1;
        r12.A02 = A004;
        if (!(r11 instanceof AnonymousClass3XF)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            byte[] ANr = ((AbstractC29461Yo) r11.A00()).ANr();
            AnonymousClass071 A005 = AnonymousClass071.A00(ANr, 0, ANr.length);
            A0B.A02();
            C77763gx r13 = (C77763gx) A0B.A00;
            r13.A00 |= 2;
            r13.A01 = A005;
        }
        AbstractC04160Jh A0B2 = AnonymousClass2BB.A05.AQb();
        A0B2.A02();
        AnonymousClass2BB r14 = (AnonymousClass2BB) A0B2.A00;
        r14.A00 |= 1;
        r14.A01 = i;
        A0B2.A02();
        AnonymousClass2BB r15 = (AnonymousClass2BB) A0B2.A00;
        if (r4 != null) {
            r15.A03 = r4;
            r15.A00 |= 2;
            A0B2.A02();
            AnonymousClass2BB r16 = (AnonymousClass2BB) A0B2.A00;
            if (r16 != null) {
                r16.A04 = (C77763gx) A0B.A01();
                r16.A00 |= 4;
                this.A00 = (AnonymousClass2BB) A0B2.A01();
                return;
            }
            throw null;
        }
        throw null;
    }

    public AnonymousClass1Yw(AnonymousClass2BB r1) {
        this.A00 = r1;
    }

    public AnonymousClass3Ci A00() {
        C77723gt r0 = this.A00.A03;
        if (r0 == null) {
            r0 = C77723gt.A03;
        }
        return new AnonymousClass3Ci(r0.A01, r0.A02.A01());
    }

    public void A01(AnonymousClass3Ci r5) {
        C77713gs r3 = (C77713gs) C77723gt.A03.AQb();
        r3.A04(r5.A00);
        byte[] bArr = r5.A01;
        AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
        r3.A02();
        C77723gt r1 = (C77723gt) r3.A00;
        r1.A00 |= 2;
        r1.A02 = A002;
        C77723gt r32 = (C77723gt) r3.A01();
        AbstractC04160Jh A0B = this.A00.AQb();
        A0B.A02();
        AnonymousClass2BB r12 = (AnonymousClass2BB) A0B.A00;
        if (r32 != null) {
            r12.A03 = r32;
            r12.A00 |= 2;
            this.A00 = (AnonymousClass2BB) A0B.A01();
            return;
        }
        throw null;
    }
}
