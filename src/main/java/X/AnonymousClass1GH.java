package X;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1GH  reason: invalid class name */
public final class AnonymousClass1GH {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static AnonymousClass1G9 A00(int i, AnonymousClass1G3 r10) {
        int i2 = 1;
        do {
            AnonymousClass1G9 A01 = AnonymousClass1G9.A01(i2);
            int i3 = A01.A00;
            AnonymousClass1G8 r0 = A01.A03[r10.ordinal()];
            int i4 = r0.A00;
            int i5 = 0;
            for (AnonymousClass1G7 r02 : r0.A01) {
                i5 += r02.A00;
            }
            if (i3 - (i5 * i4) >= ((i + 7) >> 3)) {
                return A01;
            }
            i2++;
        } while (i2 <= 40);
        throw new C25191Fl("Data too big");
    }

    public static AnonymousClass1GJ A01(String str, AnonymousClass1G3 r30, Map map) {
        String str2;
        AnonymousClass1G5 r13;
        int length;
        int length2;
        int i;
        int i2;
        AnonymousClass1Fp r2;
        AnonymousClass1G5 r8 = AnonymousClass1G5.BYTE;
        if (map == null) {
            str2 = null;
        } else {
            str2 = (String) map.get(EnumC25131Fe.CHARACTER_SET);
        }
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        if ("Shift_JIS".equals(str2)) {
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length3 = bytes.length;
                if (length3 % 2 == 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length3) {
                            r13 = AnonymousClass1G5.KANJI;
                            break;
                        }
                        int i4 = bytes[i3] & 255;
                        if ((i4 < 129 || i4 > 159) && (i4 < 224 || i4 > 235)) {
                            break;
                        }
                        i3 += 2;
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
            r13 = r8;
        } else {
            int i5 = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (i5 < str.length()) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        int[] iArr = A00;
                        if (charAt >= iArr.length || iArr[charAt] == -1) {
                            break;
                        }
                        z = true;
                    } else {
                        z2 = true;
                    }
                    i5++;
                } else if (z) {
                    r13 = AnonymousClass1G5.ALPHANUMERIC;
                } else if (z2) {
                    r13 = AnonymousClass1G5.NUMERIC;
                }
            }
            r13 = r8;
        }
        AnonymousClass1Fm r7 = new AnonymousClass1Fm();
        if (r13 == r8 && !"ISO-8859-1".equals(str2) && (r2 = (AnonymousClass1Fp) AnonymousClass1Fp.A00.get(str2)) != null) {
            r7.A01(AnonymousClass1G5.ECI.bits, 4);
            r7.A01(r2.values[0], 8);
        }
        r7.A01(r13.bits, 4);
        AnonymousClass1Fm r6 = new AnonymousClass1Fm();
        int ordinal = r13.ordinal();
        if (ordinal == 1) {
            int length4 = str.length();
            int i6 = 0;
            while (i6 < length4) {
                int charAt2 = str.charAt(i6) - '0';
                int i7 = i6 + 2;
                if (i7 < length4) {
                    r6.A01(((str.charAt(i6 + 1) - '0') * 10) + (charAt2 * 100) + (str.charAt(i7) - '0'), 10);
                    i6 += 3;
                } else {
                    i6++;
                    if (i6 < length4) {
                        r6.A01((charAt2 * 10) + (str.charAt(i6) - '0'), 7);
                        i6 = i7;
                    } else {
                        r6.A01(charAt2, 4);
                    }
                }
            }
        } else if (ordinal == 2) {
            int length5 = str.length();
            int i8 = 0;
            while (i8 < length5) {
                char charAt3 = str.charAt(i8);
                int[] iArr2 = A00;
                int length6 = iArr2.length;
                if (charAt3 >= length6 || (i = iArr2[charAt3]) == -1) {
                    throw new C25191Fl();
                }
                int i9 = i8 + 1;
                if (i9 < length5) {
                    char charAt4 = str.charAt(i9);
                    if (charAt4 >= length6 || (i2 = iArr2[charAt4]) == -1) {
                        throw new C25191Fl();
                    }
                    r6.A01((i * 45) + i2, 11);
                    i8 += 2;
                } else {
                    r6.A01(i, 6);
                    i8 = i9;
                }
            }
        } else if (ordinal == 4) {
            try {
                byte[] bytes2 = str.getBytes(str2);
                for (byte b : bytes2) {
                    r6.A01(b, 8);
                }
            } catch (UnsupportedEncodingException e) {
                throw new C25191Fl(e);
            }
        } else if (ordinal == 6) {
            try {
                byte[] bytes3 = str.getBytes("Shift_JIS");
                int length7 = bytes3.length;
                for (int i10 = 0; i10 < length7; i10 += 2) {
                    int i11 = ((bytes3[i10] & 255) << 8) | (bytes3[i10 + 1] & 255);
                    int i12 = 33088;
                    if (i11 < 33088 || i11 > 40956) {
                        if (i11 >= 57408 && i11 <= 60351) {
                            i12 = 49472;
                        }
                        throw new C25191Fl("Invalid byte sequence");
                    }
                    int i13 = i11 - i12;
                    if (i13 != -1) {
                        r6.A01(((i13 >> 8) * 192) + (i13 & 255), 13);
                    } else {
                        throw new C25191Fl("Invalid byte sequence");
                    }
                }
            } catch (UnsupportedEncodingException e2) {
                throw new C25191Fl(e2);
            }
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(r13);
            throw new C25191Fl(sb.toString());
        }
        AnonymousClass1G9 A002 = A00(r13.A00(A00(r13.A00(AnonymousClass1G9.A01(1)) + r7.A00 + r6.A00, r30)) + r7.A00 + r6.A00, r30);
        AnonymousClass1Fm r14 = new AnonymousClass1Fm();
        int i14 = r7.A00;
        r14.A00(r14.A00 + i14);
        for (int i15 = 0; i15 < i14; i15++) {
            r14.A02(r7.A03(i15));
        }
        if (r13 == r8) {
            length = (r6.A00 + 7) >> 3;
        } else {
            length = str.length();
        }
        int A003 = r13.A00(A002);
        int i16 = 1 << A003;
        if (length < i16) {
            r14.A01(length, A003);
            int i17 = r6.A00;
            r14.A00(r14.A00 + i17);
            for (int i18 = 0; i18 < i17; i18++) {
                r14.A02(r6.A03(i18));
            }
            AnonymousClass1G8 r62 = A002.A03[r30.ordinal()];
            int i19 = A002.A00;
            int i20 = r62.A00;
            int i21 = 0;
            for (AnonymousClass1G7 r0 : r62.A01) {
                i21 += r0.A00;
            }
            int i22 = i19 - (i21 * i20);
            int i23 = i22 << 3;
            int i24 = r14.A00;
            if (i24 <= i23) {
                int i25 = 0;
                while (r14.A00 < i23) {
                    r14.A02(false);
                    i25++;
                    if (i25 >= 4) {
                        break;
                    }
                }
                int i26 = r14.A00 & 7;
                if (i26 > 0) {
                    while (i26 < 8) {
                        r14.A02(false);
                        i26++;
                    }
                }
                int i27 = i22 - ((r14.A00 + 7) >> 3);
                for (int i28 = 0; i28 < i27; i28++) {
                    int i29 = 17;
                    if ((i28 & 1) == 0) {
                        i29 = 236;
                    }
                    r14.A01(i29, 8);
                }
                int i30 = r14.A00;
                if (i30 == i23) {
                    int i31 = 0;
                    for (AnonymousClass1G7 r02 : r62.A01) {
                        i31 += r02.A00;
                    }
                    if (((i30 + 7) >> 3) == i22) {
                        ArrayList arrayList = new ArrayList(i31);
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 0;
                        for (int i35 = 0; i35 < i31; i35++) {
                            int[] iArr3 = new int[1];
                            if (i35 < i31) {
                                int i36 = i19 % i31;
                                int i37 = i31 - i36;
                                int i38 = i19 / i31;
                                int i39 = i38 + 1;
                                int i40 = i22 / i31;
                                int i41 = i40 + 1;
                                int i42 = i38 - i40;
                                int i43 = i39 - i41;
                                if (i42 != i43) {
                                    throw new C25191Fl("EC bytes mismatch");
                                } else if (i31 != i37 + i36) {
                                    throw new C25191Fl("RS blocks mismatch");
                                } else if (i19 == ((i41 + i43) * i36) + ((i40 + i42) * i37)) {
                                    if (i35 < i37) {
                                        iArr3[0] = i40;
                                    } else {
                                        iArr3[0] = i41;
                                        i40 = i41;
                                        i42 = i43;
                                    }
                                    byte[] bArr = new byte[i40];
                                    int i44 = i32 << 3;
                                    for (int i45 = 0; i45 < i40; i45++) {
                                        int i46 = 0;
                                        int i47 = 0;
                                        do {
                                            if (r14.A03(i44)) {
                                                i47 |= 1 << (7 - i46);
                                            }
                                            i44++;
                                            i46++;
                                        } while (i46 < 8);
                                        bArr[i45] = (byte) i47;
                                    }
                                    int i48 = i40 + i42;
                                    int[] iArr4 = new int[i48];
                                    for (int i49 = 0; i49 < i40; i49++) {
                                        iArr4[i49] = bArr[i49] & 255;
                                    }
                                    C25221Fw r4 = new C25221Fw(AnonymousClass1Ft.A09);
                                    if (i42 != 0) {
                                        int i50 = i48 - i42;
                                        if (i50 > 0) {
                                            List list = r4.A01;
                                            int size = list.size();
                                            int i51 = i42;
                                            if (i51 >= size) {
                                                AnonymousClass1Fu r18 = (AnonymousClass1Fu) list.get(list.size() - 1);
                                                int size2 = list.size();
                                                while (true) {
                                                    i51 = i42;
                                                    if (size2 > i51) {
                                                        break;
                                                    }
                                                    AnonymousClass1Ft r22 = r4.A00;
                                                    r18 = r18.A04(new AnonymousClass1Fu(r22, new int[]{1, r22.A05[(size2 - 1) + r22.A00]}));
                                                    list.add(r18);
                                                    size2++;
                                                }
                                            }
                                            AnonymousClass1Fu r03 = (AnonymousClass1Fu) list.get(i51);
                                            int[] iArr5 = new int[i50];
                                            System.arraycopy(iArr4, 0, iArr5, 0, i50);
                                            AnonymousClass1Fu A02 = new AnonymousClass1Fu(r4.A00, iArr5).A02(i42, 1);
                                            AnonymousClass1Ft r04 = A02.A00;
                                            if (r04.equals(r03.A00)) {
                                                int[] iArr6 = r03.A01;
                                                if (iArr6[0] == 0) {
                                                    throw new IllegalArgumentException("Divide by 0");
                                                }
                                                AnonymousClass1Fu r23 = r04.A04;
                                                int length8 = iArr6.length - 1;
                                                int A004 = r04.A00(iArr6[length8 - length8]);
                                                while (A02.A01.length - 1 >= length8 && A02.A01[0] != 0) {
                                                    int[] iArr7 = A02.A01;
                                                    int length9 = iArr7.length - 1;
                                                    int i52 = length9 - length8;
                                                    int A01 = r04.A01(iArr7[length9 - length9], A004);
                                                    AnonymousClass1Fu A022 = r03.A02(i52, A01);
                                                    r23 = r23.A03(r04.A02(i52, A01));
                                                    A02 = A02.A03(A022);
                                                }
                                                int[] iArr8 = new AnonymousClass1Fu[]{r23, A02}[1].A01;
                                                int length10 = iArr8.length;
                                                int i53 = i42 - length10;
                                                for (int i54 = 0; i54 < i53; i54++) {
                                                    iArr4[i50 + i54] = 0;
                                                }
                                                System.arraycopy(iArr8, 0, iArr4, i50 + i53, length10);
                                                byte[] bArr2 = new byte[i42];
                                                for (int i55 = 0; i55 < i42; i55++) {
                                                    bArr2[i55] = (byte) iArr4[i40 + i55];
                                                }
                                                arrayList.add(new AnonymousClass1GG(bArr, bArr2));
                                                i33 = Math.max(i33, i40);
                                                i34 = Math.max(i34, i42);
                                                i32 += iArr3[0];
                                            } else {
                                                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                            }
                                        } else {
                                            throw new IllegalArgumentException("No data bytes provided");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("No error correction bytes");
                                    }
                                } else {
                                    throw new C25191Fl("Total bytes mismatch");
                                }
                            } else {
                                throw new C25191Fl("Block ID too large");
                            }
                        }
                        if (i22 == i32) {
                            AnonymousClass1Fm r24 = new AnonymousClass1Fm();
                            for (int i56 = 0; i56 < i33; i56++) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    byte[] bArr3 = ((AnonymousClass1GG) it.next()).A00;
                                    if (i56 < bArr3.length) {
                                        r24.A01(bArr3[i56], 8);
                                    }
                                }
                            }
                            for (int i57 = 0; i57 < i34; i57++) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    byte[] bArr4 = ((AnonymousClass1GG) it2.next()).A01;
                                    if (i57 < bArr4.length) {
                                        r24.A01(bArr4[i57], 8);
                                    }
                                }
                            }
                            int i58 = (r24.A00 + 7) >> 3;
                            if (i19 == i58) {
                                AnonymousClass1GJ r3 = new AnonymousClass1GJ();
                                r3.A01 = r30;
                                r3.A02 = r13;
                                r3.A03 = A002;
                                int i59 = (A002.A01 << 2) + 17;
                                AnonymousClass05j r63 = new AnonymousClass05j(i59, i59);
                                int i60 = Integer.MAX_VALUE;
                                int i61 = -1;
                                int i62 = 0;
                                do {
                                    AnonymousClass1GI.A03(r24, r30, A002, i62, r63);
                                    int A04 = C008805h.A04(r63, false) + C008805h.A04(r63, true);
                                    byte[][] bArr5 = r63.A02;
                                    int i63 = r63.A01;
                                    int i64 = r63.A00;
                                    int i65 = 0;
                                    for (int i66 = 0; i66 < i64 - 1; i66++) {
                                        int i67 = 0;
                                        while (i67 < i63 - 1) {
                                            byte[] bArr6 = bArr5[i66];
                                            byte b2 = bArr6[i67];
                                            int i68 = i67 + 1;
                                            if (b2 == bArr6[i68]) {
                                                int i69 = i66 + 1;
                                                if (b2 == bArr5[i69][i67] && b2 == bArr5[i69][i68]) {
                                                    i65++;
                                                }
                                            }
                                            i67 = i68;
                                        }
                                    }
                                    int i70 = (i65 * 3) + A04;
                                    int i71 = 0;
                                    for (int i72 = 0; i72 < i64; i72++) {
                                        for (int i73 = 0; i73 < i63; i73++) {
                                            byte[] bArr7 = bArr5[i72];
                                            int i74 = i73 + 6;
                                            if (i74 < i63 && bArr7[i73] == 1 && bArr7[i73 + 1] == 0 && bArr7[i73 + 2] == 1 && bArr7[i73 + 3] == 1 && bArr7[i73 + 4] == 1 && bArr7[i73 + 5] == 0 && bArr7[i74] == 1) {
                                                int i75 = i73 - 4;
                                                while (true) {
                                                    if (i75 >= i73) {
                                                        break;
                                                    } else if (i75 >= 0 && i75 < bArr7.length && bArr7[i75] == 1) {
                                                        int i76 = i73 + 7;
                                                        int i77 = i73 + 11;
                                                        while (true) {
                                                            if (i76 >= i77) {
                                                                break;
                                                            }
                                                            if (i76 >= 0 && i76 < bArr7.length && bArr7[i76] == 1) {
                                                                break;
                                                            }
                                                            i76++;
                                                        }
                                                    } else {
                                                        i75++;
                                                    }
                                                }
                                                i71++;
                                            }
                                            int i78 = i72 + 6;
                                            if (i78 < i64 && bArr5[i72][i73] == 1 && bArr5[i72 + 1][i73] == 0 && bArr5[i72 + 2][i73] == 1 && bArr5[i72 + 3][i73] == 1 && bArr5[i72 + 4][i73] == 1 && bArr5[i72 + 5][i73] == 0 && bArr5[i78][i73] == 1) {
                                                int i79 = i72 - 4;
                                                while (true) {
                                                    if (i79 >= i72) {
                                                        break;
                                                    } else if (i79 >= 0 && i79 < (length2 = bArr5.length) && bArr5[i79][i73] == 1) {
                                                        int i80 = i72 + 7;
                                                        int i81 = i72 + 11;
                                                        while (true) {
                                                            if (i80 >= i81) {
                                                                break;
                                                            }
                                                            if (i80 >= 0 && i80 < length2 && bArr5[i80][i73] == 1) {
                                                                break;
                                                            }
                                                            i80++;
                                                        }
                                                    } else {
                                                        i79++;
                                                    }
                                                }
                                                i71++;
                                            }
                                        }
                                    }
                                    int i82 = (i71 * 40) + i70;
                                    int i83 = 0;
                                    for (int i84 = 0; i84 < i64; i84++) {
                                        byte[] bArr8 = bArr5[i84];
                                        for (int i85 = 0; i85 < i63; i85++) {
                                            if (bArr8[i85] == 1) {
                                                i83++;
                                            }
                                        }
                                    }
                                    int i86 = i64 * i63;
                                    int abs = (((Math.abs((i83 << 1) - i86) * 10) / i86) * 10) + i82;
                                    if (abs < i60) {
                                        i60 = abs;
                                        i61 = i62;
                                    }
                                    i62++;
                                } while (i62 < 8);
                                r3.A00 = i61;
                                AnonymousClass1GI.A03(r24, r30, A002, i61, r63);
                                r3.A04 = r63;
                                return r3;
                            }
                            StringBuilder A0T = AnonymousClass008.A0T("Interleaving error: ", i19, " and ");
                            A0T.append(i58);
                            A0T.append(" differ.");
                            throw new C25191Fl(A0T.toString());
                        }
                        throw new C25191Fl("Data bytes does not match offset");
                    }
                    throw new C25191Fl("Number of bits and data bytes does not match");
                }
                throw new C25191Fl("Bits size does not equal capacity");
            }
            StringBuilder A0S = AnonymousClass008.A0S("data bits cannot fit in the QR Code");
            A0S.append(i24);
            A0S.append(" > ");
            A0S.append(i23);
            throw new C25191Fl(A0S.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(length);
        sb2.append(" is bigger than ");
        sb2.append(i16 - 1);
        throw new C25191Fl(sb2.toString());
    }
}
