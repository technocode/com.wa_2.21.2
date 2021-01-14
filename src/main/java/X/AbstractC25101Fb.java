package X;

import java.lang.reflect.Array;

/* renamed from: X.1Fb  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC25101Fb {
    public final AbstractC25141Ff A00;

    public AbstractC25101Fb(AbstractC25141Ff r1) {
        this.A00 = r1;
    }

    public C25201Fn A00() {
        int[] iArr;
        int i;
        int i2;
        C37241ns r14 = (C37241ns) this;
        C25201Fn r9 = r14.A00;
        if (r9 != null) {
            return r9;
        }
        AbstractC25141Ff r7 = ((AbstractC25101Fb) r14).A00;
        int i3 = r7.A01;
        int i4 = r7.A00;
        if (i3 < 40 || i4 < 40) {
            C25201Fn r92 = new C25201Fn(i3, i4);
            if (r14.A01.length < i3) {
                r14.A01 = new byte[i3];
            }
            int i5 = 0;
            do {
                iArr = r14.A02;
                iArr[i5] = 0;
                i5++;
            } while (i5 < 32);
            for (int i6 = 1; i6 < 5; i6++) {
                byte[] A01 = r7.A01((i4 * i6) / 5, r14.A01);
                int i7 = (i3 << 2) / 5;
                for (int i8 = i3 / 5; i8 < i7; i8++) {
                    int i9 = (A01[i8] & 255) >> 3;
                    iArr[i9] = iArr[i9] + 1;
                }
            }
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                if (iArr[i13] > i10) {
                    i10 = iArr[i13];
                    i12 = i13;
                }
                if (iArr[i13] > i11) {
                    i11 = iArr[i13];
                }
            }
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = i16 - i12;
                int i18 = iArr[i16] * i17 * i17;
                if (i18 > i15) {
                    i14 = i16;
                    i15 = i18;
                }
            }
            if (i12 <= i14) {
                i12 = i14;
                i14 = i12;
            }
            if (i12 - i14 > (length >> 4)) {
                int i19 = i12 - 1;
                int i20 = i19;
                int i21 = -1;
                while (i19 > i14) {
                    int i22 = i19 - i14;
                    int i23 = (i11 - iArr[i19]) * (i12 - i19) * i22 * i22;
                    if (i23 > i21) {
                        i20 = i19;
                        i21 = i23;
                    }
                    i19--;
                }
                int i24 = i20 << 3;
                byte[] A002 = r7.A00();
                for (int i25 = 0; i25 < i4; i25++) {
                    int i26 = i25 * i3;
                    for (int i27 = 0; i27 < i3; i27++) {
                        if ((A002[i26 + i27] & 255) < i24) {
                            r92.A01(i27, i25);
                        }
                    }
                }
                r14.A00 = r92;
                return r92;
            }
            throw C37211np.A00;
        }
        byte[] A003 = r7.A00();
        int i28 = i3 >> 3;
        if ((i3 & 7) != 0) {
            i28++;
        }
        int i29 = i4 >> 3;
        if ((i4 & 7) != 0) {
            i29++;
        }
        int[] iArr2 = new int[2];
        iArr2[1] = i28;
        iArr2[0] = i29;
        int[][] iArr3 = (int[][]) Array.newInstance(int.class, iArr2);
        for (int i30 = 0; i30 < i29; i30++) {
            int i31 = i30 << 3;
            int i32 = i4 - 8;
            if (i31 > i32) {
                i31 = i32;
            }
            for (int i33 = 0; i33 < i28; i33++) {
                int i34 = i33 << 3;
                int i35 = i3 - 8;
                if (i34 > i35) {
                    i34 = i35;
                }
                int i36 = (i31 * i3) + i34;
                int i37 = 255;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                do {
                    int i41 = 0;
                    do {
                        int i42 = A003[i36 + i41] & 255;
                        i39 += i42;
                        if (i42 < i37) {
                            i37 = i42;
                        }
                        if (i42 > i40) {
                            i40 = i42;
                        }
                        i41++;
                    } while (i41 < 8);
                    i2 = i40 - i37;
                    if (i2 > 24) {
                        while (true) {
                            i38++;
                            i36 += i3;
                            int i43 = 0;
                            if (i38 >= 8) {
                                break;
                            }
                            do {
                                i39 += A003[i36 + i43] & 255;
                                i43++;
                            } while (i43 < 8);
                        }
                    }
                    i38++;
                    i36 += i3;
                } while (i38 < 8);
                int i44 = i39 >> 6;
                if (i2 <= 24) {
                    i44 = i37 >> 1;
                    if (i30 > 0 && i33 > 0) {
                        int[] iArr4 = iArr3[i30 - 1];
                        int i45 = i33 - 1;
                        int i46 = (((iArr3[i30][i45] << 1) + iArr4[i33]) + iArr4[i45]) >> 2;
                        if (i37 < i46) {
                            i44 = i46;
                        }
                    }
                }
                iArr3[i30][i33] = i44;
            }
        }
        C25201Fn r93 = new C25201Fn(i3, i4);
        for (int i47 = 0; i47 < i29; i47++) {
            int i48 = i47 << 3;
            int i49 = i4 - 8;
            if (i48 > i49) {
                i48 = i49;
            }
            for (int i50 = 0; i50 < i28; i50++) {
                int i51 = i50 << 3;
                int i52 = i3 - 8;
                if (i51 > i52) {
                    i51 = i52;
                }
                int i53 = i28 - 3;
                if (i50 < 2) {
                    i = 2;
                } else {
                    i = i50;
                    if (i50 > i53) {
                        i = i53;
                    }
                }
                int i54 = i29 - 3;
                if (i47 < 2) {
                    i54 = 2;
                } else if (i47 <= i54) {
                    i54 = i47;
                }
                int i55 = -2;
                int i56 = 0;
                do {
                    int[] iArr5 = iArr3[i54 + i55];
                    i56 = iArr5[i - 2] + iArr5[i - 1] + iArr5[i] + iArr5[i + 1] + iArr5[i + 2] + i56;
                    i55++;
                } while (i55 <= 2);
                int i57 = i56 / 25;
                int i58 = (i48 * i3) + i51;
                int i59 = 0;
                do {
                    int i60 = 0;
                    do {
                        if ((A003[i58 + i60] & 255) <= i57) {
                            r93.A01(i51 + i60, i48 + i59);
                        }
                        i60++;
                    } while (i60 < 8);
                    i59++;
                    i58 += i3;
                } while (i59 < 8);
            }
        }
        r14.A00 = r93;
        return r93;
    }
}
