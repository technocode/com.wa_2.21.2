package X;

/* renamed from: X.3Wg  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC73293Wg implements AbstractC11690gn, AbstractC67993Bh {
    public void A00(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte b;
        byte b2;
        if (i3 + i2 <= bArr2.length) {
            int i4 = i + i2;
            if (i4 > bArr.length) {
                throw new C67983Bg("input buffer too small");
            }
            while (i < i4) {
                int i5 = i3 + 1;
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (this instanceof C74453au) {
                    C74453au r8 = (C74453au) this;
                    int i7 = r8.A00;
                    if (i7 == 0) {
                        r8.A05.AM9(r8.A02, 0, r8.A03, 0);
                        byte[] bArr3 = r8.A03;
                        int i8 = r8.A00;
                        r8.A00 = i8 + 1;
                        b = (byte) (b3 ^ bArr3[i8]);
                    } else {
                        byte[] bArr4 = r8.A03;
                        int i9 = i7 + 1;
                        r8.A00 = i9;
                        b = (byte) (b3 ^ bArr4[i7]);
                        byte[] bArr5 = r8.A02;
                        int length = bArr5.length;
                        if (i9 == length) {
                            r8.A00 = 0;
                            int i10 = length - 0;
                            do {
                                i10--;
                                if (i10 < 0) {
                                    break;
                                }
                                b2 = (byte) (bArr5[i10] + 1);
                                bArr5[i10] = b2;
                            } while (b2 == 0);
                            byte[] bArr6 = r8.A01;
                            int length2 = bArr6.length;
                            if (length2 < r8.A04) {
                                for (int i11 = 0; i11 != length2; i11++) {
                                    if (bArr5[i11] != bArr6[i11]) {
                                        throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                                    }
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (!(this instanceof C74443at)) {
                    C74433as r82 = (C74433as) this;
                    if (r82.A03) {
                        if (r82.A01 == 0) {
                            r82.A02.AM9(r82.A06, 0, r82.A05, 0);
                        }
                        byte[] bArr7 = r82.A05;
                        int i12 = r82.A01;
                        b = (byte) (b3 ^ bArr7[i12]);
                        byte[] bArr8 = r82.A07;
                        int i13 = i12 + 1;
                        r82.A01 = i13;
                        bArr8[i12] = b;
                        int i14 = r82.A00;
                        if (i13 == i14) {
                            r82.A01 = 0;
                            byte[] bArr9 = r82.A06;
                            System.arraycopy(bArr9, i14, bArr9, 0, bArr9.length - i14);
                            byte[] bArr10 = r82.A07;
                            byte[] bArr11 = r82.A06;
                            int length3 = bArr11.length;
                            int i15 = r82.A00;
                            System.arraycopy(bArr10, 0, bArr11, length3 - i15, i15);
                        }
                    } else {
                        if (r82.A01 == 0) {
                            r82.A02.AM9(r82.A06, 0, r82.A05, 0);
                        }
                        byte[] bArr12 = r82.A07;
                        int i16 = r82.A01;
                        bArr12[i16] = b3;
                        byte[] bArr13 = r82.A05;
                        int i17 = i16 + 1;
                        r82.A01 = i17;
                        b = (byte) (b3 ^ bArr13[i16]);
                        int i18 = r82.A00;
                        if (i17 == i18) {
                            r82.A01 = 0;
                            byte[] bArr14 = r82.A06;
                            System.arraycopy(bArr14, i18, bArr14, 0, bArr14.length - i18);
                            byte[] bArr15 = r82.A07;
                            byte[] bArr16 = r82.A06;
                            int length4 = bArr16.length;
                            int i19 = r82.A00;
                            System.arraycopy(bArr15, 0, bArr16, length4 - i19, i19);
                        }
                    }
                } else {
                    C74443at r83 = (C74443at) this;
                    if (r83.A00 == 0) {
                        r83.A05.AM9(r83.A03, 0, r83.A02, 0);
                    }
                    byte[] bArr17 = r83.A02;
                    int i20 = r83.A00;
                    int i21 = i20 + 1;
                    r83.A00 = i21;
                    b = (byte) (b3 ^ bArr17[i20]);
                    int i22 = r83.A04;
                    if (i21 == i22) {
                        r83.A00 = 0;
                        byte[] bArr18 = r83.A03;
                        System.arraycopy(bArr18, i22, bArr18, 0, bArr18.length - i22);
                        byte[] bArr19 = r83.A02;
                        byte[] bArr20 = r83.A03;
                        System.arraycopy(bArr19, 0, bArr20, bArr20.length - i22, i22);
                    }
                }
                bArr2[i3] = b;
                i3 = i5;
                i = i6;
            }
            return;
        }
        throw new C67983Bg("output buffer too short");
    }
}
