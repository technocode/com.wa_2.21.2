package X;

import java.util.Arrays;

/* renamed from: X.12u  reason: invalid class name and case insensitive filesystem */
public final class C226912u {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C226912u(int i, int i2, float f, float f2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = ((float) i) / ((float) i3);
        this.A0K = i / 400;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 << 1;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0A = new short[i6];
        this.A0B = new short[i6];
        this.A0C = new short[i6];
    }

    public final int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0G;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.A02 = i5 / i7;
        this.A01 = i8 / i6;
        return i7;
    }

    public final void A01() {
        int i;
        int A002;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10 = this.A05;
        float f = this.A0F;
        float f2 = this.A0D;
        float f3 = f / f2;
        float f4 = this.A0E * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i11 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i12 = this.A00;
            int i13 = this.A0J;
            if (i12 >= i13) {
                int i14 = 0;
                while (true) {
                    int i15 = this.A09;
                    if (i15 > 0) {
                        int min = Math.min(i13, i15);
                        A02(this.A0A, i14, min);
                        this.A09 -= min;
                        i14 += min;
                    } else {
                        short[] sArr = this.A0A;
                        int i16 = this.A0H;
                        if (i16 > 4000) {
                            i = i16 / 4000;
                        } else {
                            i = 1;
                        }
                        int i17 = this.A0G;
                        if (i17 == i11 && i == i11) {
                            A002 = A00(sArr, i14, this.A0K, this.A0I);
                        } else {
                            A03(sArr, i14, i);
                            short[] sArr2 = this.A0L;
                            int i18 = this.A0K;
                            int i19 = this.A0I;
                            A002 = A00(sArr2, 0, i18 / i, i19 / i);
                            if (i != i11) {
                                int i20 = A002 * i;
                                int i21 = i << 2;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 < i18) {
                                    i22 = i18;
                                }
                                if (i23 > i19) {
                                    i23 = i19;
                                }
                                if (i17 == i11) {
                                    A002 = A00(sArr, i14, i22, i23);
                                } else {
                                    A03(sArr, i14, i11);
                                    A002 = A00(sArr2, 0, i22, i23);
                                }
                            }
                        }
                        int i24 = this.A02;
                        int i25 = this.A01;
                        if (i24 == 0 || (i2 = this.A08) == 0 || i25 > i24 * 3 || (i24 << 1) <= this.A07 * 3) {
                            i2 = A002;
                        }
                        this.A07 = i24;
                        this.A08 = A002;
                        if (d > 1.0d) {
                            if (f3 >= 2.0f) {
                                i4 = (int) (((float) i2) / (f3 - f5));
                            } else {
                                this.A09 = (int) (((2.0f - f3) * ((float) i2)) / (f3 - f5));
                                i4 = i2;
                            }
                            short[] A042 = A04(this.A0B, this.A05, i4);
                            this.A0B = A042;
                            int i26 = this.A05;
                            int i27 = i14 + i2;
                            for (int i28 = 0; i28 < i17; i28++) {
                                int i29 = (i26 * i17) + i28;
                                int i30 = (i27 * i17) + i28;
                                int i31 = (i14 * i17) + i28;
                                for (int i32 = 0; i32 < i4; i32++) {
                                    A042[i29] = (short) (((sArr[i30] * i32) + ((i4 - i32) * sArr[i31])) / i4);
                                    i29 += i17;
                                    i31 += i17;
                                    i30 += i17;
                                }
                            }
                            this.A05 = i26 + i4;
                            i14 = i2 + i4 + i14;
                        } else {
                            if (f3 < 0.5f) {
                                i3 = (int) ((((float) i2) * f3) / (f5 - f3));
                            } else {
                                this.A09 = (int) ((((2.0f * f3) - f5) * ((float) i2)) / (f5 - f3));
                                i3 = i2;
                            }
                            int i33 = i2 + i3;
                            short[] A043 = A04(this.A0B, this.A05, i33);
                            this.A0B = A043;
                            System.arraycopy(sArr, i14 * i17, A043, this.A05 * i17, i17 * i2);
                            short[] sArr3 = this.A0B;
                            int i34 = this.A05;
                            int i35 = i34 + i2;
                            int i36 = i14 + i2;
                            for (int i37 = 0; i37 < i17; i37++) {
                                int i38 = (i35 * i17) + i37;
                                int i39 = (i14 * i17) + i37;
                                int i40 = (i36 * i17) + i37;
                                for (int i41 = 0; i41 < i3; i41++) {
                                    sArr3[i38] = (short) (((sArr[i39] * i41) + ((i3 - i41) * sArr[i40])) / i3);
                                    i38 += i17;
                                    i40 += i17;
                                    i39 += i17;
                                }
                            }
                            this.A05 = i34 + i33;
                            i14 += i3;
                        }
                    }
                    if (i13 + i14 > i12) {
                        break;
                    }
                    f5 = 1.0f;
                    i11 = 1;
                }
                int i42 = this.A00 - i14;
                short[] sArr4 = this.A0A;
                int i43 = this.A0G;
                System.arraycopy(sArr4, i14 * i43, sArr4, 0, i43 * i42);
                this.A00 = i42;
            }
            f5 = 1.0f;
        } else {
            A02(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (!(f4 == f5 || (i5 = this.A05) == i10)) {
            int i44 = this.A0H;
            int i45 = (int) (((float) i44) / f4);
            while (true) {
                if (i45 <= 16384 && i44 <= 16384) {
                    break;
                }
                i45 >>= 1;
                i44 >>= 1;
            }
            int i46 = i5 - i10;
            short[] A044 = A04(this.A0C, this.A06, i46);
            this.A0C = A044;
            short[] sArr5 = this.A0B;
            int i47 = this.A0G;
            System.arraycopy(sArr5, i10 * i47, A044, this.A06 * i47, i47 * i46);
            this.A05 = i10;
            this.A06 += i46;
            int i48 = 0;
            while (true) {
                i6 = this.A06;
                i7 = i6 - 1;
                if (i48 >= i7) {
                    break;
                }
                while (true) {
                    z = true;
                    i8 = this.A04 + 1;
                    int i49 = i8 * i45;
                    i9 = this.A03;
                    if (i49 <= i9 * i44) {
                        break;
                    }
                    short[] A045 = A04(this.A0B, i10, 1);
                    this.A0B = A045;
                    for (int i50 = 0; i50 < i47; i50++) {
                        short[] sArr6 = this.A0C;
                        int i51 = (i48 * i47) + i50;
                        short s = sArr6[i51];
                        short s2 = sArr6[i51 + i47];
                        int i52 = this.A04;
                        int i53 = i52 * i45;
                        int i54 = (i52 + 1) * i45;
                        int i55 = i54 - (this.A03 * i44);
                        int i56 = i54 - i53;
                        A045[(this.A05 * i47) + i50] = (short) ((((i56 - i55) * s2) + (s * i55)) / i56);
                    }
                    this.A03++;
                    i10 = this.A05 + 1;
                    this.A05 = i10;
                }
                this.A04 = i8;
                if (i8 == i44) {
                    this.A04 = 0;
                    if (i9 != i45) {
                        z = false;
                    }
                    C002001d.A3A(z);
                    this.A03 = 0;
                }
                i48++;
            }
            if (i7 != 0) {
                short[] sArr7 = this.A0C;
                System.arraycopy(sArr7, i7 * i47, sArr7, 0, (i6 - i7) * i47);
                this.A06 -= i7;
            }
        }
    }

    public final void A02(short[] sArr, int i, int i2) {
        short[] A042 = A04(this.A0B, this.A05, i2);
        this.A0B = A042;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, A042, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    public final void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int i4 = this.A0G;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0L[i7] = (short) (i8 / i5);
        }
    }

    public final short[] A04(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.A0G;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) >> 1) + i2) * i3);
    }
}
