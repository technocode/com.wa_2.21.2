package X;

import java.lang.reflect.Array;

/* renamed from: X.0go  reason: invalid class name and case insensitive filesystem */
public class C11700go {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public AbstractC11690gn A06;
    public C68013Bj A07;
    public C11710gp A08;
    public boolean A09;
    public byte[] A0A;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public byte[] A0F;
    public byte[] A0G;
    public byte[] A0H;
    public byte[] A0I;
    public byte[] A0J;

    public C11700go(AbstractC11690gn r3) {
        if (r3.A4x() == 16) {
            this.A06 = r3;
            this.A08 = new C11710gp();
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    public int A00(int i) {
        int i2 = i + this.A01;
        if (this.A09) {
            return i2 + this.A02;
        }
        int i3 = this.A02;
        int i4 = i2 - i3;
        if (i2 < i3) {
            return 0;
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0213, code lost:
        if (r3 == 0) goto L_0x01be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(byte[] r21, int r22) {
        /*
        // Method dump skipped, instructions count: 551
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11700go.A01(byte[], int):int");
    }

    public int A02(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length >= i + i2) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte[] bArr3 = this.A0G;
                int i6 = this.A01;
                bArr3[i6] = bArr[i + i5];
                int i7 = i6 + 1;
                this.A01 = i7;
                if (i7 == bArr3.length) {
                    int i8 = i3 + i4;
                    if (bArr2.length >= i8 + 16) {
                        if (this.A05 == 0) {
                            A03();
                        }
                        byte[] bArr4 = this.A0G;
                        byte[] A072 = A07();
                        AbstractC11730gr.A00(A072, bArr4);
                        System.arraycopy(A072, 0, bArr2, i8, 16);
                        byte[] bArr5 = this.A0C;
                        boolean z = this.A09;
                        if (z) {
                            bArr4 = A072;
                        }
                        AbstractC11730gr.A00(bArr5, bArr4);
                        this.A08.A00(bArr5);
                        this.A05 += 16;
                        if (z) {
                            this.A01 = 0;
                        } else {
                            byte[] bArr6 = this.A0G;
                            System.arraycopy(bArr6, 16, bArr6, 0, this.A02);
                            this.A01 = this.A02;
                        }
                        i4 += 16;
                    } else {
                        throw new C73283Wf("Output buffer too short");
                    }
                }
            }
            return i4;
        }
        throw new C67983Bg("Input buffer too short");
    }

    public final void A03() {
        if (this.A03 > 0) {
            System.arraycopy(this.A0D, 0, this.A0E, 0, 16);
            this.A04 = this.A03;
        }
        int i = this.A00;
        if (i > 0) {
            A06(this.A0E, this.A0F, 0, i);
            this.A04 += (long) i;
        }
        if (this.A04 > 0) {
            System.arraycopy(this.A0E, 0, this.A0C, 0, 16);
        }
    }

    public void A04(boolean z, AbstractC11530gT r20) {
        byte[] bArr;
        int i;
        AbstractC11530gT r1;
        int length;
        this.A09 = z;
        this.A0I = null;
        if (r20 instanceof C11720gq) {
            C11720gq r12 = (C11720gq) r20;
            bArr = r12.A02;
            this.A0J = bArr;
            int i2 = r12.A00;
            if (i2 < 32 || i2 > 128 || i2 % 8 != 0) {
                throw new IllegalArgumentException(AnonymousClass008.A0F("Invalid value for MAC size: ", i2));
            }
            i = i2 / 8;
            this.A02 = i;
            r1 = r12.A01;
        } else if (r20 instanceof C11550gV) {
            C11550gV r13 = (C11550gV) r20;
            bArr = r13.A01;
            this.A0J = bArr;
            this.A02 = 16;
            i = 16;
            r1 = r13.A00;
        } else {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        int i3 = i + 16;
        if (z) {
            i3 = 16;
        }
        this.A0G = new byte[i3];
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (r1 != null) {
            this.A06.AAX(true, r1);
            byte[] bArr2 = new byte[16];
            this.A0A = bArr2;
            this.A06.AM9(bArr2, 0, bArr2, 0);
            C11710gp r5 = this.A08;
            byte[] bArr3 = this.A0A;
            if (r5.A01 == null) {
                r5.A01 = (int[][][]) Array.newInstance(int.class, 32, 16, 4);
            } else {
                byte[] bArr4 = r5.A00;
                if (bArr4 != bArr3) {
                    if (bArr4 != null && bArr3 != null && (length = bArr4.length) == bArr3.length) {
                        int i4 = 0;
                        while (true) {
                            if (i4 == length) {
                                break;
                            }
                            if (bArr4[i4] != bArr3[i4]) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
                this.A07 = null;
            }
            r5.A00 = C002001d.A3m(bArr3);
            int[][][] iArr = r5.A01;
            int[][] iArr2 = iArr[1];
            int[] iArr3 = iArr2[8];
            int i5 = 0;
            for (int i6 = 0; i6 < iArr3.length; i6++) {
                iArr3[i6] = AnonymousClass1YV.A01(bArr3, i5);
                i5 += 4;
            }
            int i7 = 4;
            int i8 = 4;
            do {
                AbstractC11730gr.A02(iArr2[i8 + i8], iArr2[i8]);
                i8 >>= 1;
            } while (i8 >= 1);
            int[] iArr4 = iArr2[1];
            int[][] iArr5 = iArr[0];
            AbstractC11730gr.A02(iArr4, iArr5[8]);
            do {
                AbstractC11730gr.A02(iArr5[i7 + i7], iArr5[i7]);
                i7 >>= 1;
            } while (i7 >= 1);
            int i9 = 0;
            while (true) {
                int i10 = 2;
                do {
                    for (int i11 = 1; i11 < i10; i11++) {
                        int[][] iArr6 = iArr[i9];
                        int[] iArr7 = iArr6[i10];
                        int[] iArr8 = iArr6[i11];
                        int[] iArr9 = iArr6[i10 + i11];
                        iArr9[0] = iArr7[0] ^ iArr8[0];
                        iArr9[1] = iArr7[1] ^ iArr8[1];
                        iArr9[2] = iArr7[2] ^ iArr8[2];
                        iArr9[3] = iArr7[3] ^ iArr8[3];
                    }
                    i10 += i10;
                } while (i10 < 16);
                i9++;
                if (i9 == 32) {
                    break;
                }
                int i12 = 8;
                if (i9 > 1) {
                    do {
                        int[] iArr10 = iArr[i9 - 2][i12];
                        int[] iArr11 = iArr[i9][i12];
                        int i13 = iArr10[0];
                        iArr11[0] = i13 >>> 8;
                        int i14 = i13 << 24;
                        int i15 = iArr10[1];
                        iArr11[1] = i14 | (i15 >>> 8);
                        int i16 = i15 << 24;
                        int i17 = iArr10[2];
                        iArr11[2] = i16 | (i17 >>> 8);
                        int i18 = i17 << 24;
                        int i19 = iArr10[3];
                        iArr11[3] = i18 | (i19 >>> 8);
                        iArr11[0] = AbstractC11730gr.A00[(i19 << 24) >>> 24] ^ iArr11[0];
                        i12 >>= 1;
                    } while (i12 > 0);
                }
            }
            this.A07 = null;
        } else if (this.A0A == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr5 = new byte[16];
        this.A0B = bArr5;
        byte[] bArr6 = this.A0J;
        int length2 = bArr6.length;
        if (length2 == 12) {
            System.arraycopy(bArr6, 0, bArr5, 0, length2);
            bArr5 = this.A0B;
            bArr5[15] = 1;
        } else {
            for (int i20 = 0; i20 < length2; i20 += 16) {
                A06(bArr5, bArr6, i20, Math.min(length2 - i20, 16));
            }
            byte[] bArr7 = new byte[16];
            AnonymousClass1YV.A0E(((long) length2) * 8, bArr7, 8);
            AbstractC11730gr.A00(bArr5, bArr7);
            this.A08.A00(bArr5);
        }
        this.A0C = new byte[16];
        this.A0D = new byte[16];
        this.A0E = new byte[16];
        this.A0F = new byte[16];
        this.A00 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A0H = C002001d.A3m(bArr5);
        this.A01 = 0;
        this.A05 = 0;
    }

    public void A05(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A0F;
            int i4 = this.A00;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.A00 = i5;
            if (i5 == 16) {
                byte[] bArr3 = this.A0D;
                AbstractC11730gr.A00(bArr3, bArr2);
                this.A08.A00(bArr3);
                this.A00 = 0;
                this.A03 += 16;
            }
        }
    }

    public final void A06(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            } else {
                this.A08.A00(bArr);
                return;
            }
        }
    }

    public final byte[] A07() {
        byte[] bArr = this.A0H;
        int i = (bArr[15] & 255) + 1;
        bArr[15] = (byte) i;
        int i2 = (i >>> 8) + (bArr[14] & 255);
        bArr[14] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr[13] & 255);
        bArr[13] = (byte) i3;
        bArr[12] = (byte) ((i3 >>> 8) + (bArr[12] & 255));
        byte[] bArr2 = new byte[16];
        this.A06.AM9(bArr, 0, bArr2, 0);
        return bArr2;
    }
}
