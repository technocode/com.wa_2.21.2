package org.whispersystems.curve25519;

import X.AbstractC11590ga;
import X.AnonymousClass1YV;
import X.AnonymousClass3CM;
import X.AnonymousClass3CS;
import X.AnonymousClass3CT;
import X.AnonymousClass3CU;
import X.AnonymousClass3CW;
import X.AnonymousClass3CX;
import X.AnonymousClass3CY;
import X.AnonymousClass3CZ;
import X.C05850Qn;
import X.C68173Ca;

public class JavaCurve25519Provider implements AbstractC11590ga {
    public C05850Qn A00;
    public final AnonymousClass3CM A01;

    public JavaCurve25519Provider() {
        AnonymousClass3CM r1 = new AnonymousClass3CM();
        C05850Qn r0 = new C05850Qn();
        this.A01 = r1;
        this.A00 = r0;
    }

    public static void A00(AnonymousClass3CS r125, AnonymousClass3CT r126) {
        int[] iArr = new int[10];
        int[] iArr2 = r125.A01;
        int[] iArr3 = r126.A00;
        AnonymousClass1YV.A0U(iArr2, iArr3);
        int[] iArr4 = r125.A03;
        int[] iArr5 = r126.A01;
        AnonymousClass1YV.A0U(iArr4, iArr5);
        int[] iArr6 = r125.A00;
        int[] iArr7 = r126.A02;
        int i = iArr7[0];
        int i2 = iArr7[1];
        int i3 = iArr7[2];
        int i4 = iArr7[3];
        int i5 = iArr7[4];
        int i6 = iArr7[5];
        int i7 = iArr7[6];
        int i8 = iArr7[7];
        int i9 = iArr7[8];
        int i10 = iArr7[9];
        int i11 = i << 1;
        int i12 = i2 << 1;
        int i13 = i4 << 1;
        int i14 = i6 << 1;
        int i15 = i8 << 1;
        int i16 = i6 * 38;
        int i17 = i8 * 38;
        long j = (long) i;
        long j2 = j * j;
        long j3 = (long) i11;
        long j4 = (long) i2;
        long j5 = j3 * j4;
        long j6 = (long) i3;
        long j7 = j3 * j6;
        long j8 = (long) i4;
        long j9 = j3 * j8;
        long j10 = (long) i5;
        long j11 = j3 * j10;
        long j12 = (long) i6;
        long j13 = j3 * j12;
        long j14 = (long) i7;
        long j15 = j3 * j14;
        long j16 = (long) i8;
        long j17 = j3 * j16;
        long j18 = (long) i9;
        long j19 = j3 * j18;
        long j20 = (long) i10;
        long j21 = j3 * j20;
        long j22 = (long) i12;
        long j23 = j4 * j22;
        long j24 = j22 * j6;
        long j25 = (long) i13;
        long j26 = j22 * j25;
        long j27 = j22 * j10;
        long j28 = (long) i14;
        long j29 = j22 * j28;
        long j30 = j22 * j14;
        long j31 = (long) i15;
        long j32 = j22 * j31;
        long j33 = j22 * j18;
        long j34 = (long) (i10 * 38);
        long j35 = j6 * j6;
        long j36 = (long) (i3 << 1);
        long j37 = j36 * j8;
        long j38 = j36 * j10;
        long j39 = j36 * j12;
        long j40 = j36 * j14;
        long j41 = j36 * j16;
        long j42 = (long) (i9 * 19);
        long j43 = j36 * j42;
        long j44 = j6 * j34;
        long j45 = j8 * j25;
        long j46 = j25 * j10;
        long j47 = j25 * j28;
        long j48 = j25 * j14;
        long j49 = (long) i17;
        long j50 = j25 * j49;
        long j51 = j25 * j42;
        long j52 = j10 * j10;
        long j53 = (long) (i5 << 1);
        long j54 = j53 * j12;
        long j55 = (long) (i7 * 19);
        long j56 = j53 * j55;
        long j57 = j10 * j49;
        long j58 = j53 * j42;
        long j59 = ((long) i16) * j12;
        long j60 = j28 * j55;
        long j61 = j28 * j49;
        long j62 = j28 * j42;
        long j63 = j28 * j34;
        long j64 = j55 * j14;
        long j65 = j14 * j49;
        long j66 = j49 * j16;
        long j67 = j31 * j42;
        long j68 = j2 + (j22 * j34) + j43 + j50 + j56 + j59;
        long j69 = j5 + j44 + j51 + j57 + j60;
        long j70 = j7 + j23 + (j25 * j34) + j58 + j61 + j64;
        long j71 = j9 + j24 + (j10 * j34) + j62 + j65;
        long j72 = j11 + j26 + j35 + j63 + (((long) (i7 << 1)) * j42) + j66;
        long j73 = j13 + j27 + j37 + (j14 * j34) + j67;
        long j74 = j15 + j29 + j38 + j45 + (j31 * j34) + (j42 * j18);
        long j75 = j17 + j30 + j39 + j46 + (j18 * j34);
        long j76 = j19 + j32 + j40 + j47 + j52 + (j34 * j20);
        long j77 = j21 + j33 + j41 + j48 + j54;
        long j78 = j68 + j68;
        long j79 = j72 + j72;
        long j80 = (j78 + 33554432) >> 26;
        long j81 = j69 + j69 + j80;
        long j82 = j78 - (j80 << 26);
        long j83 = (j79 + 33554432) >> 26;
        long j84 = j73 + j73 + j83;
        long j85 = j79 - (j83 << 26);
        long j86 = (j81 + 16777216) >> 25;
        long j87 = j70 + j70 + j86;
        long j88 = j81 - (j86 << 25);
        long j89 = (j84 + 16777216) >> 25;
        long j90 = j74 + j74 + j89;
        long j91 = j84 - (j89 << 25);
        long j92 = (j87 + 33554432) >> 26;
        long j93 = j71 + j71 + j92;
        long j94 = j87 - (j92 << 26);
        long j95 = (j90 + 33554432) >> 26;
        long j96 = j75 + j75 + j95;
        long j97 = j90 - (j95 << 26);
        long j98 = (j93 + 16777216) >> 25;
        long j99 = j85 + j98;
        long j100 = j93 - (j98 << 25);
        long j101 = (j96 + 16777216) >> 25;
        long j102 = j76 + j76 + j101;
        long j103 = j96 - (j101 << 25);
        long j104 = (j99 + 33554432) >> 26;
        long j105 = j91 + j104;
        long j106 = j99 - (j104 << 26);
        long j107 = (j102 + 33554432) >> 26;
        long j108 = j77 + j77 + j107;
        long j109 = j102 - (j107 << 26);
        long j110 = (j108 + 16777216) >> 25;
        long j111 = (19 * j110) + j82;
        long j112 = (j111 + 33554432) >> 26;
        iArr6[0] = (int) (j111 - (j112 << 26));
        iArr6[1] = (int) (j88 + j112);
        iArr6[2] = (int) j94;
        iArr6[3] = (int) j100;
        iArr6[4] = (int) j106;
        iArr6[5] = (int) j105;
        iArr6[6] = (int) j97;
        iArr6[7] = (int) j103;
        iArr6[8] = (int) j109;
        iArr6[9] = (int) (j108 - (j110 << 25));
        int[] iArr8 = r125.A02;
        AnonymousClass1YV.A0X(iArr8, iArr3, iArr5);
        AnonymousClass1YV.A0U(iArr, iArr8);
        AnonymousClass1YV.A0X(iArr8, iArr4, iArr2);
        AnonymousClass1YV.A0Z(iArr4, iArr4, iArr2);
        AnonymousClass1YV.A0Z(iArr2, iArr, iArr8);
        AnonymousClass1YV.A0Z(iArr6, iArr6, iArr4);
    }

    public static void A01(AnonymousClass3CS r3, AnonymousClass3CU r4) {
        AnonymousClass3CT r2 = new AnonymousClass3CT();
        AnonymousClass1YV.A0R(r2.A00, r4.A01);
        AnonymousClass1YV.A0R(r2.A01, r4.A02);
        AnonymousClass1YV.A0R(r2.A02, r4.A03);
        A00(r3, r2);
    }

    public static void A02(AnonymousClass3CU r11, byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        AnonymousClass3CS r4 = new AnonymousClass3CS();
        AnonymousClass3CT r8 = new AnonymousClass3CT();
        AnonymousClass3CW r3 = new AnonymousClass3CW();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 << 1;
            bArr2[i4] = (byte) ((bArr[i3] >>> 0) & 15);
            bArr2[i4 + 1] = (byte) ((bArr[i3] >>> 4) & 15);
            i3++;
        }
        int i5 = 0;
        byte b = 0;
        do {
            byte b2 = (byte) (bArr2[i5] + b);
            bArr2[i5] = b2;
            b = (byte) (((byte) (b2 + 8)) >> 4);
            bArr2[i5] = (byte) (b2 - (b << 4));
            i5++;
        } while (i5 < 63);
        bArr2[63] = (byte) (bArr2[63] + b);
        AnonymousClass1YV.A0O(r11.A01);
        AnonymousClass1YV.A0P(r11.A02);
        AnonymousClass1YV.A0P(r11.A03);
        AnonymousClass1YV.A0O(r11.A00);
        do {
            A03(r3, i >> 1, bArr2[i]);
            AnonymousClass1YV.A0J(r4, r11, r3);
            AnonymousClass1YV.A0L(r11, r4);
            i += 2;
        } while (i < 64);
        A01(r4, r11);
        AnonymousClass1YV.A0K(r8, r4);
        A00(r4, r8);
        AnonymousClass1YV.A0K(r8, r4);
        A00(r4, r8);
        AnonymousClass1YV.A0K(r8, r4);
        A00(r4, r8);
        AnonymousClass1YV.A0L(r11, r4);
        do {
            A03(r3, i2 >> 1, bArr2[i2]);
            AnonymousClass1YV.A0J(r4, r11, r3);
            AnonymousClass1YV.A0L(r11, r4);
            i2 += 2;
        } while (i2 < 64);
    }

    public static void A03(AnonymousClass3CW r13, int i, byte b) {
        AnonymousClass3CW[][] r10;
        if (i <= 7) {
            r10 = AnonymousClass3CX.A00;
        } else {
            r10 = i <= 15 ? C68173Ca.A00 : i <= 23 ? AnonymousClass3CY.A00 : AnonymousClass3CZ.A00;
        }
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int i2 = (int) (((long) b) >>> 63);
        int[] iArr4 = r13.A02;
        AnonymousClass1YV.A0P(iArr4);
        int[] iArr5 = r13.A01;
        AnonymousClass1YV.A0P(iArr5);
        int[] iArr6 = r13.A00;
        AnonymousClass1YV.A0O(iArr6);
        AnonymousClass3CW[] r12 = r10[i];
        byte b2 = (byte) (b - (((-i2) & b) << 1));
        A04(r13, r12[0], ((b2 ^ 1) - 1) >>> 31);
        A04(r13, r12[1], ((b2 ^ 2) - 1) >>> 31);
        A04(r13, r12[2], ((b2 ^ 3) - 1) >>> 31);
        A04(r13, r12[3], ((b2 ^ 4) - 1) >>> 31);
        A04(r13, r12[4], ((b2 ^ 5) - 1) >>> 31);
        A04(r13, r12[5], ((b2 ^ 6) - 1) >>> 31);
        A04(r13, r12[6], ((b2 ^ 7) - 1) >>> 31);
        A04(r13, r12[7], ((b2 ^ 8) - 1) >>> 31);
        AnonymousClass1YV.A0R(iArr, iArr5);
        AnonymousClass1YV.A0R(iArr2, iArr4);
        AnonymousClass1YV.A0T(iArr3, iArr6);
        AnonymousClass1YV.A0V(iArr4, iArr, i2);
        AnonymousClass1YV.A0V(iArr5, iArr2, i2);
        AnonymousClass1YV.A0V(iArr6, iArr3, i2);
    }

    public static void A04(AnonymousClass3CW r2, AnonymousClass3CW r3, int i) {
        AnonymousClass1YV.A0V(r2.A02, r3.A02, i);
        AnonymousClass1YV.A0V(r2.A01, r3.A01, i);
        AnonymousClass1YV.A0V(r2.A00, r3.A00, i);
    }

    public static void A05(byte[] bArr, AnonymousClass3CU r6) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        AnonymousClass1YV.A0S(iArr, r6.A03);
        AnonymousClass1YV.A0Y(iArr2, r6.A01, iArr);
        AnonymousClass1YV.A0Y(iArr3, r6.A02, iArr);
        AnonymousClass1YV.A0N(bArr, iArr3);
        byte b = bArr[31];
        byte[] bArr2 = new byte[32];
        AnonymousClass1YV.A0N(bArr2, iArr2);
        bArr[31] = (byte) (b ^ ((bArr2[0] & 1) << 7));
    }

    @Override // X.AbstractC11590ga
    public byte[] A4Y() {
        byte[] bArr = new byte[32];
        System.arraycopy(A8f(32), 0, bArr, 0, 32);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = b;
        bArr[31] = (byte) (b | 64);
        return bArr;
    }

    @Override // X.AbstractC11590ga
    public byte[] A8f(int i) {
        byte[] bArr = new byte[i];
        C05850Qn.A00(bArr);
        return bArr;
    }

    @Override // X.AbstractC11590ga
    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        char c = 0;
        int i = 0;
        do {
            bArr4[i] = bArr[i];
            i++;
        } while (i < 32);
        AnonymousClass1YV.A0Q(iArr, bArr2);
        AnonymousClass1YV.A0P(iArr2);
        AnonymousClass1YV.A0O(iArr3);
        AnonymousClass1YV.A0R(iArr4, iArr);
        AnonymousClass1YV.A0P(iArr5);
        int i2 = 254;
        int i3 = 0;
        do {
            int i4 = (bArr4[i2 >> 3] >>> (i2 & 7)) & 1;
            int i5 = i3 ^ i4;
            AnonymousClass1YV.A0W(iArr2, iArr4, i5);
            AnonymousClass1YV.A0W(iArr3, iArr5, i5);
            AnonymousClass1YV.A0Z(iArr6, iArr4, iArr5);
            AnonymousClass1YV.A0Z(iArr7, iArr2, iArr3);
            AnonymousClass1YV.A0X(iArr2, iArr2, iArr3);
            AnonymousClass1YV.A0X(iArr3, iArr4, iArr5);
            AnonymousClass1YV.A0Y(iArr5, iArr6, iArr2);
            AnonymousClass1YV.A0Y(iArr3, iArr3, iArr7);
            AnonymousClass1YV.A0U(iArr6, iArr7);
            AnonymousClass1YV.A0U(iArr7, iArr2);
            AnonymousClass1YV.A0X(iArr4, iArr5, iArr3);
            AnonymousClass1YV.A0Z(iArr3, iArr5, iArr3);
            AnonymousClass1YV.A0Y(iArr2, iArr7, iArr6);
            AnonymousClass1YV.A0Z(iArr7, iArr7, iArr6);
            AnonymousClass1YV.A0U(iArr3, iArr3);
            int i6 = iArr7[c];
            int i7 = iArr7[1];
            int i8 = iArr7[2];
            int i9 = iArr7[3];
            int i10 = iArr7[4];
            int i11 = iArr7[5];
            int i12 = iArr7[6];
            int i13 = iArr7[7];
            int i14 = iArr7[8];
            long j = ((long) i7) * 121666;
            long j2 = ((long) i9) * 121666;
            long j3 = ((long) i11) * 121666;
            long j4 = ((long) i13) * 121666;
            long j5 = ((long) iArr7[9]) * 121666;
            long j6 = (j5 + 16777216) >> 25;
            long j7 = (19 * j6) + (((long) i6) * 121666);
            long j8 = j5 - (j6 << 25);
            long j9 = (j + 16777216) >> 25;
            long j10 = (((long) i8) * 121666) + j9;
            long j11 = j - (j9 << 25);
            long j12 = (j2 + 16777216) >> 25;
            long j13 = (((long) i10) * 121666) + j12;
            long j14 = j2 - (j12 << 25);
            long j15 = (j3 + 16777216) >> 25;
            long j16 = (((long) i12) * 121666) + j15;
            long j17 = j3 - (j15 << 25);
            long j18 = (j4 + 16777216) >> 25;
            long j19 = (((long) i14) * 121666) + j18;
            long j20 = j4 - (j18 << 25);
            long j21 = (j7 + 33554432) >> 26;
            long j22 = j11 + j21;
            long j23 = j7 - (j21 << 26);
            long j24 = (j10 + 33554432) >> 26;
            long j25 = j14 + j24;
            long j26 = j10 - (j24 << 26);
            long j27 = (j13 + 33554432) >> 26;
            long j28 = j17 + j27;
            long j29 = j13 - (j27 << 26);
            long j30 = (j16 + 33554432) >> 26;
            long j31 = j20 + j30;
            long j32 = j16 - (j30 << 26);
            long j33 = (j19 + 33554432) >> 26;
            iArr5[0] = (int) j23;
            iArr5[1] = (int) j22;
            iArr5[2] = (int) j26;
            iArr5[3] = (int) j25;
            iArr5[4] = (int) j29;
            iArr5[5] = (int) j28;
            iArr5[6] = (int) j32;
            iArr5[7] = (int) j31;
            iArr5[8] = (int) (j19 - (j33 << 26));
            iArr5[9] = (int) (j8 + j33);
            AnonymousClass1YV.A0U(iArr4, iArr4);
            AnonymousClass1YV.A0X(iArr6, iArr6, iArr5);
            AnonymousClass1YV.A0Y(iArr5, iArr, iArr3);
            AnonymousClass1YV.A0Y(iArr3, iArr7, iArr6);
            i2--;
            i3 = i4;
            c = 0;
        } while (i2 >= 0);
        AnonymousClass1YV.A0W(iArr2, iArr4, i3);
        AnonymousClass1YV.A0W(iArr3, iArr5, i3);
        AnonymousClass1YV.A0S(iArr3, iArr3);
        AnonymousClass1YV.A0Y(iArr2, iArr2, iArr3);
        AnonymousClass1YV.A0N(bArr3, iArr2);
        return bArr3;
    }

    @Override // X.AbstractC11590ga
    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[64];
        int length = bArr3.length;
        AnonymousClass3CU r2 = new AnonymousClass3CU();
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[(length + 128)];
        A02(r2, bArr2);
        A05(bArr5, r2);
        byte b = (byte) (bArr5[31] & 128);
        long j = (long) length;
        byte[] bArr7 = new byte[64];
        byte[] bArr8 = new byte[64];
        AnonymousClass3CU r10 = new AnonymousClass3CU();
        System.arraycopy(bArr3, 0, bArr6, 64, (int) j);
        System.arraycopy(bArr2, 0, bArr6, 32, 32);
        bArr6[0] = -2;
        int i = 1;
        do {
            bArr6[i] = -1;
            i++;
        } while (i < 32);
        long j2 = j + 64;
        System.arraycopy(bArr, 0, bArr6, (int) j2, 64);
        AnonymousClass3CM.A00(bArr7, bArr6, j + 128);
        System.arraycopy(bArr5, 0, bArr6, 32, 32);
        AnonymousClass1YV.A0M(bArr7);
        A02(r10, bArr7);
        A05(bArr6, r10);
        AnonymousClass3CM.A00(bArr8, bArr6, j2);
        AnonymousClass1YV.A0M(bArr8);
        long A04 = AnonymousClass1YV.A04(bArr8, 0) & 2097151;
        long A07 = (AnonymousClass1YV.A07(bArr8, 2) >>> 5) & 2097151;
        long A042 = (AnonymousClass1YV.A04(bArr8, 5) >>> 2) & 2097151;
        long A072 = (AnonymousClass1YV.A07(bArr8, 7) >>> 7) & 2097151;
        long A073 = (AnonymousClass1YV.A07(bArr8, 10) >>> 4) & 2097151;
        long A043 = (AnonymousClass1YV.A04(bArr8, 13) >>> 1) & 2097151;
        long A074 = (AnonymousClass1YV.A07(bArr8, 15) >>> 6) & 2097151;
        long A044 = (AnonymousClass1YV.A04(bArr8, 18) >>> 3) & 2097151;
        long A045 = AnonymousClass1YV.A04(bArr8, 21) & 2097151;
        long A075 = (AnonymousClass1YV.A07(bArr8, 23) >>> 5) & 2097151;
        long A046 = (AnonymousClass1YV.A04(bArr8, 26) >>> 2) & 2097151;
        long A076 = AnonymousClass1YV.A07(bArr8, 28) >>> 7;
        long A047 = AnonymousClass1YV.A04(bArr2, 0) & 2097151;
        long A077 = (AnonymousClass1YV.A07(bArr2, 2) >>> 5) & 2097151;
        long A048 = (AnonymousClass1YV.A04(bArr2, 5) >>> 2) & 2097151;
        long A078 = (AnonymousClass1YV.A07(bArr2, 7) >>> 7) & 2097151;
        long A079 = (AnonymousClass1YV.A07(bArr2, 10) >>> 4) & 2097151;
        long A049 = (AnonymousClass1YV.A04(bArr2, 13) >>> 1) & 2097151;
        long A0710 = (AnonymousClass1YV.A07(bArr2, 15) >>> 6) & 2097151;
        long A0410 = (AnonymousClass1YV.A04(bArr2, 18) >>> 3) & 2097151;
        long A0411 = AnonymousClass1YV.A04(bArr2, 21) & 2097151;
        long A0711 = (AnonymousClass1YV.A07(bArr2, 23) >>> 5) & 2097151;
        long A0412 = (AnonymousClass1YV.A04(bArr2, 26) >>> 2) & 2097151;
        long A0712 = AnonymousClass1YV.A07(bArr2, 28) >>> 7;
        long A0413 = (A04 * A047) + (AnonymousClass1YV.A04(bArr7, 0) & 2097151);
        long j3 = A07 * A047;
        long A0713 = j3 + (A04 * A077) + ((AnonymousClass1YV.A07(bArr7, 2) >>> 5) & 2097151);
        long j4 = A07 * A077;
        long j5 = A042 * A047;
        long A0414 = j5 + j4 + (A04 * A048) + ((AnonymousClass1YV.A04(bArr7, 5) >>> 2) & 2097151);
        long j6 = A07 * A048;
        long j7 = A072 * A047;
        long A0714 = j7 + (A042 * A077) + j6 + (A04 * A078) + ((AnonymousClass1YV.A07(bArr7, 7) >>> 7) & 2097151);
        long j8 = A07 * A078;
        long j9 = A073 * A047;
        long A0715 = j9 + (A072 * A077) + (A042 * A048) + j8 + (A04 * A079) + ((AnonymousClass1YV.A07(bArr7, 10) >>> 4) & 2097151);
        long j10 = A07 * A079;
        long j11 = A043 * A047;
        long A0415 = j11 + (A073 * A077) + (A072 * A048) + (A042 * A078) + j10 + (A04 * A049) + ((AnonymousClass1YV.A04(bArr7, 13) >>> 1) & 2097151);
        long j12 = A07 * A049;
        long j13 = A074 * A047;
        long A0716 = j13 + (A043 * A077) + (A073 * A048) + (A072 * A078) + (A042 * A079) + j12 + (A04 * A0710) + ((AnonymousClass1YV.A07(bArr7, 15) >>> 6) & 2097151);
        long j14 = A07 * A0710;
        long j15 = A044 * A047;
        long A0416 = j15 + (A074 * A077) + (A043 * A048) + (A073 * A078) + (A072 * A079) + (A042 * A049) + j14 + (A04 * A0410) + ((AnonymousClass1YV.A04(bArr7, 18) >>> 3) & 2097151);
        long j16 = A07 * A0410;
        long j17 = A045 * A047;
        long A0417 = j17 + (A044 * A077) + (A074 * A048) + (A043 * A078) + (A073 * A079) + (A072 * A049) + (A042 * A0710) + j16 + (A04 * A0411) + (AnonymousClass1YV.A04(bArr7, 21) & 2097151);
        long j18 = A07 * A0411;
        long j19 = A075 * A047;
        long A0717 = j19 + (A045 * A077) + (A044 * A048) + (A074 * A078) + (A043 * A079) + (A073 * A049) + (A072 * A0710) + (A042 * A0410) + j18 + (A04 * A0711) + ((AnonymousClass1YV.A07(bArr7, 23) >>> 5) & 2097151);
        long j20 = A07 * A0711;
        long j21 = A046 * A047;
        long A0418 = j21 + (A075 * A077) + (A045 * A048) + (A044 * A078) + (A074 * A079) + (A043 * A049) + (A073 * A0710) + (A072 * A0410) + (A042 * A0411) + j20 + (A04 * A0412) + ((AnonymousClass1YV.A04(bArr7, 26) >>> 2) & 2097151);
        long j22 = A07 * A0412;
        long j23 = A042 * A0711;
        long j24 = A047 * A076;
        long A0718 = j24 + (A046 * A077) + (A075 * A048) + (A045 * A078) + (A044 * A079) + (A074 * A049) + (A043 * A0710) + (A073 * A0410) + (A072 * A0411) + j23 + j22 + (A04 * A0712) + (AnonymousClass1YV.A07(bArr7, 28) >>> 7);
        long j25 = A072 * A0711;
        long j26 = A077 * A076;
        long j27 = j26 + (A046 * A048) + (A075 * A078) + (A045 * A079) + (A044 * A049) + (A074 * A0710) + (A043 * A0410) + (A073 * A0411) + j25 + (A042 * A0412) + (A07 * A0712);
        long j28 = A073 * A0711;
        long j29 = A048 * A076;
        long j30 = j29 + (A046 * A078) + (A075 * A079) + (A045 * A049) + (A044 * A0710) + (A074 * A0410) + (A043 * A0411) + j28 + (A072 * A0412) + (A042 * A0712);
        long j31 = A043 * A0711;
        long j32 = A078 * A076;
        long j33 = j32 + (A046 * A079) + (A075 * A049) + (A045 * A0710) + (A044 * A0410) + (A074 * A0411) + j31 + (A073 * A0412) + (A072 * A0712);
        long j34 = A074 * A0711;
        long j35 = A079 * A076;
        long j36 = j35 + (A046 * A049) + (A075 * A0710) + (A045 * A0410) + (A044 * A0411) + j34 + (A043 * A0412) + (A073 * A0712);
        long j37 = A044 * A0711;
        long j38 = A049 * A076;
        long j39 = j38 + (A046 * A0710) + (A075 * A0410) + (A045 * A0411) + j37 + (A074 * A0412) + (A043 * A0712);
        long j40 = A045 * A0711;
        long j41 = A0710 * A076;
        long j42 = j41 + (A046 * A0410) + (A075 * A0411) + j40 + (A044 * A0412) + (A074 * A0712);
        long j43 = A075 * A0711;
        long j44 = A0410 * A076;
        long j45 = j44 + (A046 * A0411) + j43 + (A045 * A0412) + (A044 * A0712);
        long j46 = A046 * A0711;
        long j47 = A0411 * A076;
        long j48 = j47 + j46 + (A075 * A0412) + (A045 * A0712);
        long j49 = A0711 * A076;
        long j50 = j49 + (A046 * A0412) + (A075 * A0712);
        long j51 = A0412 * A076;
        long j52 = A076 * A0712;
        long j53 = (A0413 + 1048576) >> 21;
        long j54 = A0713 + j53;
        long j55 = A0413 - (j53 << 21);
        long j56 = (A0414 + 1048576) >> 21;
        long j57 = A0714 + j56;
        long j58 = A0414 - (j56 << 21);
        long j59 = (A0715 + 1048576) >> 21;
        long j60 = A0415 + j59;
        long j61 = A0715 - (j59 << 21);
        long j62 = (A0716 + 1048576) >> 21;
        long j63 = A0416 + j62;
        long j64 = A0716 - (j62 << 21);
        long j65 = (A0417 + 1048576) >> 21;
        long j66 = A0717 + j65;
        long j67 = A0417 - (j65 << 21);
        long j68 = (A0418 + 1048576) >> 21;
        long j69 = A0718 + j68;
        long j70 = A0418 - (j68 << 21);
        long j71 = (j27 + 1048576) >> 21;
        long j72 = j30 + j71;
        long j73 = j27 - (j71 << 21);
        long j74 = (j33 + 1048576) >> 21;
        long j75 = j36 + j74;
        long j76 = j33 - (j74 << 21);
        long j77 = (j39 + 1048576) >> 21;
        long j78 = j42 + j77;
        long j79 = j39 - (j77 << 21);
        long j80 = (j45 + 1048576) >> 21;
        long j81 = j48 + j80;
        long j82 = j45 - (j80 << 21);
        long j83 = (j50 + 1048576) >> 21;
        long j84 = j51 + (A046 * A0712) + j83;
        long j85 = j50 - (j83 << 21);
        long j86 = (j52 + 1048576) >> 21;
        long j87 = j86 + 0;
        long j88 = j52 - (j86 << 21);
        long j89 = (j54 + 1048576) >> 21;
        long j90 = j58 + j89;
        long j91 = j54 - (j89 << 21);
        long j92 = (j57 + 1048576) >> 21;
        long j93 = j61 + j92;
        long j94 = j57 - (j92 << 21);
        long j95 = (j60 + 1048576) >> 21;
        long j96 = j64 + j95;
        long j97 = j60 - (j95 << 21);
        long j98 = (j63 + 1048576) >> 21;
        long j99 = j67 + j98;
        long j100 = j63 - (j98 << 21);
        long j101 = (j66 + 1048576) >> 21;
        long j102 = j70 + j101;
        long j103 = j66 - (j101 << 21);
        long j104 = (j69 + 1048576) >> 21;
        long j105 = j73 + j104;
        long j106 = j69 - (j104 << 21);
        long j107 = (j72 + 1048576) >> 21;
        long j108 = j76 + j107;
        long j109 = j72 - (j107 << 21);
        long j110 = (j75 + 1048576) >> 21;
        long j111 = j79 + j110;
        long j112 = j75 - (j110 << 21);
        long j113 = (j78 + 1048576) >> 21;
        long j114 = j82 + j113;
        long j115 = j78 - (j113 << 21);
        long j116 = (j81 + 1048576) >> 21;
        long j117 = j85 + j116;
        long j118 = j81 - (j116 << 21);
        long j119 = (j84 + 1048576) >> 21;
        long j120 = j88 + j119;
        long j121 = j84 - (j119 << 21);
        long j122 = (j87 * 654183) + j109;
        long j123 = (j87 * 136657) + j112;
        long j124 = j111 - (j87 * 683901);
        long j125 = (j120 * 666643) + j102;
        long j126 = (j121 * 666643) + j103;
        long j127 = (j121 * 654183) + (j120 * 470296) + (j87 * 666643) + j106;
        long j128 = (j121 * 136657) + (j122 - (j120 * 997805));
        long j129 = ((j120 * 136657) + (j108 - (j87 * 997805))) - (j121 * 683901);
        long j130 = ((j117 * 654183) + ((j121 * 470296) + j125)) - (j118 * 997805);
        long j131 = (j118 * 136657) + (j127 - (j117 * 997805));
        long j132 = ((j117 * 136657) + (((j120 * 654183) + ((j87 * 470296) + j105)) - (j121 * 997805))) - (j118 * 683901);
        long j133 = (j114 * 666643) + j96;
        long j134 = (j114 * 654183) + (j118 * 470296) + (j117 * 666643) + j99;
        long j135 = (j114 * 136657) + j130;
        long j136 = (j133 + 1048576) >> 21;
        long j137 = (j114 * 470296) + (j118 * 666643) + j100 + j136;
        long j138 = j133 - (j136 << 21);
        long j139 = (j134 + 1048576) >> 21;
        long j140 = (((j118 * 654183) + ((j117 * 470296) + j126)) - (j114 * 997805)) + j139;
        long j141 = j134 - (j139 << 21);
        long j142 = (j135 + 1048576) >> 21;
        long j143 = (j131 - (j114 * 683901)) + j142;
        long j144 = j135 - (j142 << 21);
        long j145 = (j132 + 1048576) >> 21;
        long j146 = (j128 - (j117 * 683901)) + j145;
        long j147 = j132 - (j145 << 21);
        long j148 = (j129 + 1048576) >> 21;
        long j149 = (j123 - (j120 * 683901)) + j148;
        long j150 = j129 - (j148 << 21);
        long j151 = (j124 + 1048576) >> 21;
        long j152 = j115 + j151;
        long j153 = j124 - (j151 << 21);
        long j154 = (j137 + 1048576) >> 21;
        long j155 = j141 + j154;
        long j156 = j137 - (j154 << 21);
        long j157 = (j140 + 1048576) >> 21;
        long j158 = j144 + j157;
        long j159 = j140 - (j157 << 21);
        long j160 = (j143 + 1048576) >> 21;
        long j161 = j147 + j160;
        long j162 = j143 - (j160 << 21);
        long j163 = (j146 + 1048576) >> 21;
        long j164 = j150 + j163;
        long j165 = j146 - (j163 << 21);
        long j166 = (j149 + 1048576) >> 21;
        long j167 = j153 + j166;
        long j168 = j149 - (j166 << 21);
        long j169 = (j152 * 666643) + j97;
        long j170 = (j152 * 470296) + j138;
        long j171 = (j152 * 654183) + j156;
        long j172 = j155 - (j152 * 997805);
        long j173 = (j152 * 136657) + j159;
        long j174 = j158 - (j152 * 683901);
        long j175 = (j167 * 470296) + j169;
        long j176 = (j167 * 654183) + j170;
        long j177 = j171 - (j167 * 997805);
        long j178 = (j167 * 136657) + j172;
        long j179 = j173 - (j167 * 683901);
        long j180 = (j168 * 470296) + (j167 * 666643) + j93;
        long j181 = (j168 * 654183) + j175;
        long j182 = j176 - (j168 * 997805);
        long j183 = (j168 * 136657) + j177;
        long j184 = j178 - (j168 * 683901);
        long j185 = (j164 * 654183) + j180;
        long j186 = j183 - (j164 * 683901);
        long j187 = j165 * 654183;
        long j188 = j185 - (j165 * 997805);
        long j189 = (j165 * 136657) + (j181 - (j164 * 997805));
        long j190 = ((j164 * 136657) + j182) - (j165 * 683901);
        long j191 = (j161 * 666643) + j55;
        long j192 = (j161 * 654183) + (j165 * 470296) + (j164 * 666643) + j90;
        long j193 = (j161 * 136657) + j188;
        long j194 = (j191 + 1048576) >> 21;
        long j195 = (j161 * 470296) + (j165 * 666643) + j91 + j194;
        long j196 = j191 - (j194 << 21);
        long j197 = (j192 + 1048576) >> 21;
        long j198 = ((j187 + ((j164 * 470296) + ((j168 * 666643) + j94))) - (j161 * 997805)) + j197;
        long j199 = j192 - (j197 << 21);
        long j200 = (j193 + 1048576) >> 21;
        long j201 = (j189 - (j161 * 683901)) + j200;
        long j202 = j193 - (j200 << 21);
        long j203 = (j190 + 1048576) >> 21;
        long j204 = j186 + j203;
        long j205 = j190 - (j203 << 21);
        long j206 = (j184 + 1048576) >> 21;
        long j207 = j179 + j206;
        long j208 = j184 - (j206 << 21);
        long j209 = (j174 + 1048576) >> 21;
        long j210 = j162 + j209;
        long j211 = j174 - (j209 << 21);
        long j212 = (j195 + 1048576) >> 21;
        long j213 = j199 + j212;
        long j214 = j195 - (j212 << 21);
        long j215 = (j198 + 1048576) >> 21;
        long j216 = j202 + j215;
        long j217 = j198 - (j215 << 21);
        long j218 = (j201 + 1048576) >> 21;
        long j219 = j205 + j218;
        long j220 = j201 - (j218 << 21);
        long j221 = (j204 + 1048576) >> 21;
        long j222 = j208 + j221;
        long j223 = j204 - (j221 << 21);
        long j224 = (j207 + 1048576) >> 21;
        long j225 = j211 + j224;
        long j226 = j207 - (j224 << 21);
        long j227 = (j210 + 1048576) >> 21;
        long j228 = j227 + 0;
        long j229 = j210 - (j227 << 21);
        long j230 = (j228 * 666643) + j196;
        long j231 = (j228 * 470296) + j214;
        long j232 = j230 >> 21;
        long j233 = j231 + j232;
        long j234 = j230 - (j232 << 21);
        long j235 = j233 >> 21;
        long j236 = (j228 * 654183) + j213 + j235;
        long j237 = j233 - (j235 << 21);
        long j238 = j236 >> 21;
        long j239 = (j217 - (j228 * 997805)) + j238;
        long j240 = j236 - (j238 << 21);
        long j241 = j239 >> 21;
        long j242 = (j228 * 136657) + j216 + j241;
        long j243 = j239 - (j241 << 21);
        long j244 = j242 >> 21;
        long j245 = (j220 - (j228 * 683901)) + j244;
        long j246 = j242 - (j244 << 21);
        long j247 = j245 >> 21;
        long j248 = j219 + j247;
        long j249 = j245 - (j247 << 21);
        long j250 = j248 >> 21;
        long j251 = j223 + j250;
        long j252 = j248 - (j250 << 21);
        long j253 = j251 >> 21;
        long j254 = j222 + j253;
        long j255 = j251 - (j253 << 21);
        long j256 = j254 >> 21;
        long j257 = j226 + j256;
        long j258 = j254 - (j256 << 21);
        long j259 = j257 >> 21;
        long j260 = j225 + j259;
        long j261 = j257 - (j259 << 21);
        long j262 = j260 >> 21;
        long j263 = j229 + j262;
        long j264 = j260 - (j262 << 21);
        long j265 = j263 >> 21;
        long j266 = j265 + 0;
        long j267 = (666643 * j266) + j234;
        long j268 = j249 - (j266 * 683901);
        long j269 = j267 >> 21;
        long j270 = (470296 * j266) + j237 + j269;
        long j271 = j267 - (j269 << 21);
        long j272 = j270 >> 21;
        long j273 = (654183 * j266) + j240 + j272;
        long j274 = j270 - (j272 << 21);
        long j275 = j273 >> 21;
        long j276 = (j243 - (997805 * j266)) + j275;
        long j277 = j273 - (j275 << 21);
        long j278 = j276 >> 21;
        long j279 = (136657 * j266) + j246 + j278;
        long j280 = j276 - (j278 << 21);
        long j281 = j279 >> 21;
        long j282 = j268 + j281;
        long j283 = j279 - (j281 << 21);
        long j284 = j282 >> 21;
        long j285 = j252 + j284;
        long j286 = j282 - (j284 << 21);
        long j287 = j285 >> 21;
        long j288 = j255 + j287;
        long j289 = j285 - (j287 << 21);
        long j290 = j288 >> 21;
        long j291 = j258 + j290;
        long j292 = j288 - (j290 << 21);
        long j293 = j291 >> 21;
        long j294 = j261 + j293;
        long j295 = j291 - (j293 << 21);
        long j296 = j294 >> 21;
        long j297 = j264 + j296;
        long j298 = j294 - (j296 << 21);
        long j299 = j297 >> 21;
        long j300 = (j263 - (j265 << 21)) + j299;
        long j301 = j297 - (j299 << 21);
        System.arraycopy(new byte[]{(byte) ((int) (j271 >> 0)), (byte) ((int) (j271 >> 8)), (byte) ((int) ((j271 >> 16) | (j274 << 5))), (byte) ((int) (j274 >> 3)), (byte) ((int) (j274 >> 11)), (byte) ((int) ((j274 >> 19) | (j277 << 2))), (byte) ((int) (j277 >> 6)), (byte) ((int) ((j277 >> 14) | (j280 << 7))), (byte) ((int) (j280 >> 1)), (byte) ((int) (j280 >> 9)), (byte) ((int) ((j280 >> 17) | (j283 << 4))), (byte) ((int) (j283 >> 4)), (byte) ((int) (j283 >> 12)), (byte) ((int) ((j283 >> 20) | (j286 << 1))), (byte) ((int) (j286 >> 7)), (byte) ((int) ((j286 >> 15) | (j289 << 6))), (byte) ((int) (j289 >> 2)), (byte) ((int) (j289 >> 10)), (byte) ((int) ((j289 >> 18) | (j292 << 3))), (byte) ((int) (j292 >> 5)), (byte) ((int) (j292 >> 13)), (byte) ((int) (j295 >> 0)), (byte) ((int) (j295 >> 8)), (byte) ((int) ((j295 >> 16) | (j298 << 5))), (byte) ((int) (j298 >> 3)), (byte) ((int) (j298 >> 11)), (byte) ((int) ((j301 << 2) | (j298 >> 19))), (byte) ((int) (j301 >> 6)), (byte) ((int) ((j301 >> 14) | (j300 << 7))), (byte) ((int) (j300 >> 1)), (byte) ((int) (j300 >> 9)), (byte) ((int) (j300 >> 17))}, 0, bArr6, 32, 32);
        System.arraycopy(bArr6, 0, bArr4, 0, 64);
        byte b2 = (byte) (bArr4[63] & Byte.MAX_VALUE);
        bArr4[63] = b2;
        bArr4[63] = (byte) (b2 | b);
        return bArr4;
    }

    @Override // X.AbstractC11590ga
    public byte[] generatePublicKey(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        AnonymousClass3CU r6 = new AnonymousClass3CU();
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        A02(r6, bArr);
        int[] iArr5 = r6.A02;
        int[] iArr6 = r6.A03;
        AnonymousClass1YV.A0X(iArr, iArr5, iArr6);
        AnonymousClass1YV.A0Z(iArr2, iArr6, iArr5);
        AnonymousClass1YV.A0S(iArr3, iArr2);
        AnonymousClass1YV.A0Y(iArr4, iArr, iArr3);
        AnonymousClass1YV.A0N(bArr2, iArr4);
        return bArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0292, code lost:
        A00(r5, r22);
        r0 = r9[r20];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x029b, code lost:
        if (r0 <= 0) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x029d, code lost:
        X.AnonymousClass1YV.A0L(r4, r5);
        X.AnonymousClass1YV.A0I(r5, r4, r6[r0 / 2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02a7, code lost:
        r2 = r8[r20];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02a9, code lost:
        if (r2 <= 0) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02ab, code lost:
        X.AnonymousClass1YV.A0L(r4, r5);
        X.AnonymousClass1YV.A0J(r5, r4, X.AnonymousClass3CQ.A00[r2 / 2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02b7, code lost:
        X.AnonymousClass1YV.A0K(r22, r5);
        r20 = r20 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02be, code lost:
        if (r20 < 0) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02c1, code lost:
        if (r2 >= 0) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02c3, code lost:
        X.AnonymousClass1YV.A0L(r4, r5);
        r1 = X.AnonymousClass3CQ.A00[(-r2) / 2];
        r12 = new int[10];
        r11 = r5.A01;
        r2 = r4.A02;
        r0 = r4.A01;
        X.AnonymousClass1YV.A0X(r11, r2, r0);
        r10 = r5.A02;
        X.AnonymousClass1YV.A0Z(r10, r2, r0);
        r3 = r5.A03;
        X.AnonymousClass1YV.A0Y(r3, r11, r1.A01);
        X.AnonymousClass1YV.A0Y(r10, r10, r1.A02);
        r2 = r5.A00;
        X.AnonymousClass1YV.A0Y(r2, r1.A00, r4.A00);
        r0 = r4.A03;
        X.AnonymousClass1YV.A0X(r12, r0, r0);
        X.AnonymousClass1YV.A0Z(r11, r3, r10);
        X.AnonymousClass1YV.A0X(r10, r3, r10);
        X.AnonymousClass1YV.A0Z(r3, r12, r2);
        X.AnonymousClass1YV.A0X(r2, r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0304, code lost:
        if (r0 >= 0) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0306, code lost:
        X.AnonymousClass1YV.A0L(r4, r5);
        r15 = r6[(-r0) / 2];
        r12 = new int[10];
        r11 = r5.A01;
        r1 = r4.A02;
        r0 = r4.A01;
        X.AnonymousClass1YV.A0X(r11, r1, r0);
        r10 = r5.A02;
        X.AnonymousClass1YV.A0Z(r10, r1, r0);
        r3 = r5.A03;
        X.AnonymousClass1YV.A0Y(r3, r11, r15.A01);
        X.AnonymousClass1YV.A0Y(r10, r10, r15.A02);
        r2 = r5.A00;
        X.AnonymousClass1YV.A0Y(r2, r15.A00, r4.A00);
        X.AnonymousClass1YV.A0Y(r11, r4.A03, r15.A03);
        X.AnonymousClass1YV.A0X(r12, r11, r11);
        X.AnonymousClass1YV.A0Z(r11, r3, r10);
        X.AnonymousClass1YV.A0X(r10, r3, r10);
        X.AnonymousClass1YV.A0Z(r3, r12, r2);
        X.AnonymousClass1YV.A0X(r2, r12, r2);
     */
    @Override // X.AbstractC11590ga
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean verifySignature(byte[] r29, byte[] r30, byte[] r31) {
        /*
        // Method dump skipped, instructions count: 922
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.curve25519.JavaCurve25519Provider.verifySignature(byte[], byte[], byte[]):boolean");
    }
}
