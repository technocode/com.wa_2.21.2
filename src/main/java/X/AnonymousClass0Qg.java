package X;

/* renamed from: X.0Qg  reason: invalid class name */
public abstract class AnonymousClass0Qg implements AbstractC05800Qh, AbstractC05810Qi {
    public int A00;
    public long A01;
    public final byte[] A02;

    @Override // X.AbstractC05810Qi
    public int A53() {
        return 64;
    }

    public AnonymousClass0Qg() {
        this.A02 = new byte[4];
        this.A00 = 0;
    }

    public AnonymousClass0Qg(AnonymousClass0Qg r2) {
        this.A02 = new byte[4];
        A01(r2);
    }

    public void A00() {
        long j = this.A01 << 3;
        AQm(Byte.MIN_VALUE);
        while (this.A00 != 0) {
            AQm((byte) 0);
        }
        if (this instanceof C05830Qk) {
            C05830Qk r1 = (C05830Qk) this;
            if (r1.A08 > 14) {
                r1.A03();
            }
            int[] iArr = r1.A09;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) (j & -1);
        } else if (!(this instanceof AnonymousClass0Qf)) {
            AnonymousClass2A8 r12 = (AnonymousClass2A8) this;
            if (r12.A04 > 14) {
                r12.A03();
            }
            int[] iArr2 = r12.A05;
            iArr2[14] = (int) (-1 & j);
            iArr2[15] = (int) (j >>> 32);
        } else {
            AnonymousClass0Qf r13 = (AnonymousClass0Qf) this;
            if (r13.A05 > 14) {
                r13.A03();
            }
            int[] iArr3 = r13.A06;
            iArr3[14] = (int) (j >>> 32);
            iArr3[15] = (int) (j & -1);
        }
        A03();
    }

    public void A01(AnonymousClass0Qg r5) {
        byte[] bArr = r5.A02;
        System.arraycopy(bArr, 0, this.A02, 0, bArr.length);
        this.A00 = r5.A00;
        this.A01 = r5.A01;
    }

    public void A02(byte[] bArr, int i) {
        if (this instanceof C05830Qk) {
            C05830Qk r4 = (C05830Qk) this;
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
            int[] iArr = r4.A09;
            int i5 = r4.A08;
            iArr[i5] = (bArr[i3 + 1] & 255) | i4;
            int i6 = i5 + 1;
            r4.A08 = i6;
            if (i6 == 16) {
                r4.A03();
            }
        } else if (!(this instanceof AnonymousClass0Qf)) {
            AnonymousClass2A8 r6 = (AnonymousClass2A8) this;
            int[] iArr2 = r6.A05;
            int i7 = r6.A04;
            int i8 = i7 + 1;
            r6.A04 = i8;
            iArr2[i7] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            if (i8 == 16) {
                r6.A03();
            }
        } else {
            AnonymousClass0Qf r42 = (AnonymousClass0Qf) this;
            int i9 = i + 1;
            int i10 = i9 + 1;
            int i11 = (bArr[i] << 24) | ((bArr[i9] & 255) << 16) | ((bArr[i10] & 255) << 8);
            int[] iArr3 = r42.A06;
            int i12 = r42.A05;
            iArr3[i12] = (bArr[i10 + 1] & 255) | i11;
            int i13 = i12 + 1;
            r42.A05 = i13;
            if (i13 == 16) {
                r42.A03();
            }
        }
    }

    public void A03() {
        int[] iArr;
        int[] iArr2;
        if (!(this instanceof C05830Qk)) {
            AnonymousClass0Qf r15 = (AnonymousClass0Qf) this;
            int i = 16;
            do {
                iArr2 = r15.A06;
                int i2 = ((iArr2[i - 3] ^ iArr2[i - 8]) ^ iArr2[i - 14]) ^ iArr2[i - 16];
                iArr2[i] = (i2 >>> 31) | (i2 << 1);
                i++;
            } while (i < 80);
            int i3 = r15.A00;
            int i4 = r15.A01;
            int i5 = r15.A02;
            int i6 = r15.A03;
            int i7 = r15.A04;
            int i8 = 0;
            int i9 = 0;
            do {
                int i10 = (((i4 ^ -1) & i6) | (i5 & i4)) + ((i3 << 5) | (i3 >>> 27));
                int i11 = i9 + 1;
                int i12 = i10 + iArr2[i9] + 1518500249 + i7;
                int i13 = (i4 >>> 2) | (i4 << 30);
                int i14 = (((i3 ^ -1) & i5) | (i13 & i3)) + ((i12 << 5) | (i12 >>> 27));
                int i15 = i11 + 1;
                int i16 = i14 + iArr2[i11] + 1518500249 + i6;
                int i17 = (i3 >>> 2) | (i3 << 30);
                int i18 = i15 + 1;
                int i19 = (((i12 ^ -1) & i13) | (i17 & i12)) + ((i16 << 5) | (i16 >>> 27)) + iArr2[i15] + 1518500249 + i5;
                i7 = (i12 >>> 2) | (i12 << 30);
                int i20 = i18 + 1;
                i4 = (((i16 ^ -1) & i17) | (i7 & i16)) + ((i19 << 5) | (i19 >>> 27)) + iArr2[i18] + 1518500249 + i13;
                i6 = (i16 >>> 2) | (i16 << 30);
                i9 = i20 + 1;
                i3 = (((i19 ^ -1) & i7) | (i6 & i19)) + ((i4 << 5) | (i4 >>> 27)) + iArr2[i20] + 1518500249 + i17;
                i5 = (i19 >>> 2) | (i19 << 30);
                i8++;
            } while (i8 < 4);
            int i21 = 0;
            do {
                int i22 = i9 + 1;
                int i23 = ((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6) + iArr2[i9] + 1859775393 + i7;
                int i24 = (i4 >>> 2) | (i4 << 30);
                int i25 = i22 + 1;
                int i26 = ((i23 << 5) | (i23 >>> 27)) + ((i3 ^ i24) ^ i5) + iArr2[i22] + 1859775393 + i6;
                int i27 = (i3 >>> 2) | (i3 << 30);
                int i28 = i25 + 1;
                int i29 = ((i26 << 5) | (i26 >>> 27)) + ((i23 ^ i27) ^ i24) + iArr2[i25] + 1859775393 + i5;
                i7 = (i23 >>> 2) | (i23 << 30);
                int i30 = i28 + 1;
                i4 = ((i29 << 5) | (i29 >>> 27)) + ((i26 ^ i7) ^ i27) + iArr2[i28] + 1859775393 + i24;
                i6 = (i26 >>> 2) | (i26 << 30);
                i9 = i30 + 1;
                i3 = ((i4 << 5) | (i4 >>> 27)) + ((i29 ^ i6) ^ i7) + iArr2[i30] + 1859775393 + i27;
                i5 = (i29 >>> 2) | (i29 << 30);
                i21++;
            } while (i21 < 4);
            int i31 = 0;
            do {
                int i32 = i9 + 1;
                int i33 = ((((((i4 & i6) | (i4 & i5)) | (i5 & i6)) + ((i3 << 5) | (i3 >>> 27))) + iArr2[i9]) - 1894007588) + i7;
                int i34 = (i4 >>> 2) | (i4 << 30);
                int i35 = i32 + 1;
                int i36 = ((((((i3 & i5) | (i3 & i34)) | (i34 & i5)) + ((i33 << 5) | (i33 >>> 27))) + iArr2[i32]) - 1894007588) + i6;
                int i37 = (i3 >>> 2) | (i3 << 30);
                int i38 = i35 + 1;
                int i39 = ((((((i33 & i34) | (i33 & i37)) | (i37 & i34)) + ((i36 << 5) | (i36 >>> 27))) + iArr2[i35]) - 1894007588) + i5;
                i7 = (i33 >>> 2) | (i33 << 30);
                int i40 = i38 + 1;
                i4 = ((((((i36 & i37) | (i36 & i7)) | (i7 & i37)) + ((i39 << 5) | (i39 >>> 27))) + iArr2[i38]) - 1894007588) + i34;
                i6 = (i36 >>> 2) | (i36 << 30);
                i9 = i40 + 1;
                i3 = ((((((i39 & i7) | (i39 & i6)) | (i6 & i7)) + ((i4 << 5) | (i4 >>> 27))) + iArr2[i40]) - 1894007588) + i37;
                i5 = (i39 >>> 2) | (i39 << 30);
                i31++;
            } while (i31 < 4);
            int i41 = 0;
            do {
                int i42 = i9 + 1;
                int i43 = (((((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6)) + iArr2[i9]) - 899497514) + i7;
                int i44 = (i4 >>> 2) | (i4 << 30);
                int i45 = i42 + 1;
                int i46 = (((((i43 << 5) | (i43 >>> 27)) + ((i3 ^ i44) ^ i5)) + iArr2[i42]) - 899497514) + i6;
                int i47 = (i3 >>> 2) | (i3 << 30);
                int i48 = i45 + 1;
                int i49 = (((((i46 << 5) | (i46 >>> 27)) + ((i43 ^ i47) ^ i44)) + iArr2[i45]) - 899497514) + i5;
                i7 = (i43 >>> 2) | (i43 << 30);
                int i50 = i48 + 1;
                i4 = (((((i49 << 5) | (i49 >>> 27)) + ((i46 ^ i7) ^ i47)) + iArr2[i48]) - 899497514) + i44;
                i6 = (i46 >>> 2) | (i46 << 30);
                i9 = i50 + 1;
                i3 = (((((i4 << 5) | (i4 >>> 27)) + ((i49 ^ i6) ^ i7)) + iArr2[i50]) - 899497514) + i47;
                i5 = (i49 >>> 2) | (i49 << 30);
                i41++;
            } while (i41 <= 3);
            r15.A00 = i3 + i3;
            r15.A01 = i4 + i4;
            r15.A02 = i5 + i5;
            r15.A03 = i6 + i6;
            r15.A04 = i7 + i7;
            r15.A05 = 0;
            int i51 = 0;
            do {
                iArr2[i51] = 0;
                i51++;
            } while (i51 < 16);
            return;
        }
        C05830Qk r9 = (C05830Qk) this;
        int i52 = 16;
        do {
            iArr = r9.A09;
            int i53 = iArr[i52 - 2];
            int i54 = ((i53 >>> 10) ^ (((i53 >>> 17) | (i53 << 15)) ^ ((i53 >>> 19) | (i53 << 13)))) + iArr[i52 - 7];
            int i55 = iArr[i52 - 15];
            iArr[i52] = i54 + ((i55 >>> 3) ^ (((i55 >>> 7) | (i55 << 25)) ^ ((i55 >>> 18) | (i55 << 14)))) + iArr[i52 - 16];
            i52++;
        } while (i52 <= 63);
        int i56 = r9.A00;
        int i57 = r9.A01;
        int i58 = r9.A02;
        int i59 = r9.A03;
        int i60 = r9.A04;
        int i61 = r9.A05;
        int i62 = r9.A06;
        int i63 = r9.A07;
        int i64 = 0;
        int i65 = 0;
        do {
            int[] iArr3 = C05830Qk.A0A;
            int A012 = (((i60 ^ -1) & i62) ^ (i61 & i60)) + C05830Qk.A01(i60) + iArr3[i65] + iArr[i65] + i63;
            int i66 = i59 + A012;
            int i67 = i56 & i57;
            int A002 = (((i56 & i58) ^ i67) ^ (i57 & i58)) + C05830Qk.A00(i56) + A012;
            int i68 = i65 + 1;
            int A013 = (((i66 ^ -1) & i61) ^ (i60 & i66)) + C05830Qk.A01(i66) + iArr3[i68] + iArr[i68] + i62;
            int i69 = i58 + A013;
            int i70 = A002 & i56;
            int A003 = (((A002 & i57) ^ i70) ^ i67) + C05830Qk.A00(A002) + A013;
            int i71 = i68 + 1;
            int A014 = (((i69 ^ -1) & i60) ^ (i66 & i69)) + C05830Qk.A01(i69) + iArr3[i71] + iArr[i71] + i61;
            int i72 = i57 + A014;
            int i73 = A003 & A002;
            int A004 = (((A003 & i56) ^ i73) ^ i70) + C05830Qk.A00(A003) + A014;
            int i74 = i71 + 1;
            int A015 = (((i72 ^ -1) & i66) ^ (i69 & i72)) + C05830Qk.A01(i72) + iArr3[i74] + iArr[i74] + i60;
            int i75 = i56 + A015;
            int i76 = A004 & A003;
            int A005 = (((A004 & A002) ^ i76) ^ i73) + C05830Qk.A00(A004) + A015;
            int i77 = i74 + 1;
            int A016 = (((i75 ^ -1) & i69) ^ (i72 & i75)) + C05830Qk.A01(i75) + iArr3[i77] + iArr[i77] + i66;
            i63 = A002 + A016;
            int i78 = A005 & A004;
            i59 = (((A005 & A003) ^ i78) ^ i76) + C05830Qk.A00(A005) + A016;
            int i79 = i77 + 1;
            int A017 = (((i63 ^ -1) & i72) ^ (i75 & i63)) + C05830Qk.A01(i63) + iArr3[i79] + iArr[i79] + i69;
            i62 = A003 + A017;
            int i80 = i59 & A005;
            i58 = (((i59 & A004) ^ i80) ^ i78) + C05830Qk.A00(i59) + A017;
            int i81 = i79 + 1;
            int A018 = (((i62 ^ -1) & i75) ^ (i63 & i62)) + C05830Qk.A01(i62) + iArr3[i81] + iArr[i81] + i72;
            i61 = A004 + A018;
            int i82 = i58 & i59;
            i57 = (((i58 & A005) ^ i82) ^ i80) + C05830Qk.A00(i58) + A018;
            int i83 = i81 + 1;
            int A019 = (((i61 ^ -1) & i63) ^ (i62 & i61)) + C05830Qk.A01(i61) + iArr3[i83] + iArr[i83] + i75;
            i60 = A005 + A019;
            i56 = (((i57 & i59) ^ (i57 & i58)) ^ i82) + C05830Qk.A00(i57) + A019;
            i65 = i83 + 1;
            i64++;
        } while (i64 < 8);
        r9.A00 = i56 + i56;
        r9.A01 = i57 + i57;
        r9.A02 = i58 + i58;
        r9.A03 = i59 + i59;
        r9.A04 = i60 + i60;
        r9.A05 = i61 + i61;
        r9.A06 = i62 + i62;
        r9.A07 = i63 + i63;
        r9.A08 = 0;
        int i84 = 0;
        do {
            iArr[i84] = 0;
            i84++;
        } while (i84 < 16);
    }

    @Override // X.AbstractC05820Qj
    public void AQm(byte b) {
        byte[] bArr = this.A02;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            A02(bArr, 0);
            this.A00 = 0;
        }
        this.A01++;
    }

    @Override // X.AbstractC05820Qj
    public void reset() {
        this.A01 = 0;
        this.A00 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A02;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC05820Qj
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        int i4 = this.A00;
        int i5 = i4;
        int i6 = 0;
        if (i4 != 0) {
            while (true) {
                if (i6 >= max) {
                    i3 = i6;
                    break;
                }
                byte[] bArr2 = this.A02;
                i4++;
                this.A00 = i4;
                i5 = i4;
                int i7 = i6 + 1;
                bArr2[i4] = bArr[i6 + i];
                if (i4 == 4) {
                    A02(bArr2, 0);
                    this.A00 = 0;
                    i5 = 0;
                    i3 = i7;
                    break;
                }
                i6 = i7;
            }
        }
        int i8 = ((max - i3) & -4) + i3;
        while (i3 < i8) {
            A02(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.A02;
            i5++;
            this.A00 = i5;
            bArr3[i5] = bArr[i3 + i];
            i3++;
        }
        this.A01 += (long) max;
    }
}
