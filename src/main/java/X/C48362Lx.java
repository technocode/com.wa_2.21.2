package X;

import java.io.OutputStream;
import java.security.SecureRandom;

/* renamed from: X.2Lx  reason: invalid class name and case insensitive filesystem */
public class C48362Lx {
    public static final SecureRandom A04 = new SecureRandom();
    public byte[] A00;
    public final C48352Lw A01;
    public final C48342Lv[] A02;
    public final C48382Lz[] A03;

    public C48362Lx(C48352Lw r1, C48382Lz[] r2, C48342Lv[] r3) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }

    public static C48362Lx A00(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 12) {
                short A1G = C28051Sr.A1G(bArr, 0);
                byte b = bArr[2];
                boolean z = false;
                if ((b & 128) != 0) {
                    z = true;
                }
                byte b2 = (byte) ((b >> 3) & 15);
                boolean z2 = false;
                if ((b & 4) != 0) {
                    z2 = true;
                }
                boolean z3 = false;
                if ((b & 2) != 0) {
                    z3 = true;
                }
                boolean z4 = false;
                if ((b & 1) != 0) {
                    z4 = true;
                }
                byte b3 = bArr[3];
                boolean z5 = false;
                if ((b3 & 128) != 0) {
                    z5 = true;
                }
                C48352Lw r2 = new C48352Lw(A1G, z, b2, z2, z3, z4, z5, (short) ((byte) (b3 & 15)), C28051Sr.A1G(bArr, 4), C28051Sr.A1G(bArr, 6), C28051Sr.A1G(bArr, 8), C28051Sr.A1G(bArr, 10));
                int i = r2.A05;
                C48382Lz[] r11 = new C48382Lz[i];
                int i2 = 12;
                for (int i3 = 0; i3 < i; i3++) {
                    C48372Ly A002 = C48372Ly.A00(bArr, i2);
                    int i4 = A002.A00 + i2;
                    if (length >= i4 + 4) {
                        r11[i3] = new C48382Lz(A002, C28051Sr.A1G(bArr, i4), C28051Sr.A1G(bArr, i4 + 2), A002.A00 + 4);
                        i2 += r11[i3].A00;
                    } else {
                        throw new IllegalArgumentException("insufficient data");
                    }
                }
                int i5 = r2.A03;
                C48342Lv[] r7 = new C48342Lv[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    C48372Ly A003 = C48372Ly.A00(bArr, i2);
                    int i7 = A003.A00;
                    int i8 = i7 + i2;
                    int i9 = i8 + 10;
                    if (length >= i9) {
                        short A1G2 = C28051Sr.A1G(bArr, i8);
                        short A1G3 = C28051Sr.A1G(bArr, i8 + 2);
                        int i10 = i8 + 4;
                        byte b4 = bArr[i10];
                        byte b5 = bArr[i10 + 1];
                        byte b6 = bArr[i10 + 2];
                        int i11 = (bArr[i10 + 3] & 255) | ((b4 << 24) & -16777216) | ((b5 << 16) & 16711680) | ((b6 << 8) & 65280);
                        int A1G4 = C28051Sr.A1G(bArr, i8 + 8);
                        if (length >= i9 + A1G4) {
                            byte[] bArr2 = new byte[A1G4];
                            System.arraycopy(bArr, i9, bArr2, 0, A1G4);
                            r7[i6] = new C48342Lv(A003, A1G2, A1G3, i11, bArr2, i7 + 10 + A1G4);
                            i2 += r7[i6].A00;
                        } else {
                            throw new IllegalArgumentException("insufficient data");
                        }
                    } else {
                        throw new IllegalArgumentException("insufficient data");
                    }
                }
                C48362Lx r0 = new C48362Lx(r2, r11, r7);
                r0.A00 = bArr;
                return r0;
            }
            throw new IllegalArgumentException("bytes does not contain enough data");
        }
        throw new NullPointerException("bytes may not be null");
    }

    public static C48362Lx A01(C48382Lz[] r15) {
        return new C48362Lx(new C48352Lw((short) A04.nextInt(65536), false, (byte) 0, false, false, true, false, 0, 1, 0, 0, 0), r15, new C48342Lv[0]);
    }

    public void A02(OutputStream outputStream) {
        C48352Lw r3 = this.A01;
        byte[] bArr = new byte[12];
        C28051Sr.A1l(r3.A01, bArr, 0);
        bArr[2] = 0;
        int i = 128;
        int i2 = 0;
        if (r3.A0A) {
            i2 = 128;
        }
        byte b = (byte) (i2 | 0);
        bArr[2] = b;
        byte b2 = (byte) (b | ((byte) ((r3.A00 & 15) << 3)));
        bArr[2] = b2;
        byte b3 = 0;
        if (r3.A07) {
            b3 = 4;
        }
        byte b4 = (byte) (b2 | b3);
        bArr[2] = b4;
        byte b5 = 0;
        if (r3.A0B) {
            b5 = 2;
        }
        byte b6 = (byte) (b4 | b5);
        bArr[2] = b6;
        bArr[2] = (byte) (b6 | (r3.A09 ? 1 : 0));
        bArr[3] = 0;
        if (!r3.A08) {
            i = 0;
        }
        byte b7 = (byte) (0 | i);
        bArr[3] = b7;
        bArr[3] = (byte) (b7 | ((byte) (r3.A06 & 15)));
        C28051Sr.A1l(r3.A05, bArr, 4);
        C28051Sr.A1l(r3.A03, bArr, 6);
        C28051Sr.A1l(r3.A04, bArr, 8);
        C28051Sr.A1l(r3.A02, bArr, 10);
        outputStream.write(bArr);
        C48382Lz[] r5 = this.A03;
        for (C48382Lz r1 : r5) {
            r1.A01.A02(outputStream);
            C28051Sr.A1j(outputStream, r1.A03);
            C28051Sr.A1j(outputStream, r1.A02);
        }
        C48342Lv[] r32 = this.A02;
        for (C48342Lv r52 : r32) {
            r52.A02.A02(outputStream);
            C28051Sr.A1j(outputStream, r52.A04);
            C28051Sr.A1j(outputStream, r52.A03);
            int i3 = r52.A01;
            outputStream.write((i3 >>> 24) & 255);
            outputStream.write((i3 >>> 16) & 255);
            outputStream.write((i3 >>> 8) & 255);
            outputStream.write(i3 & 255);
            byte[] bArr2 = r52.A05;
            C28051Sr.A1j(outputStream, (short) bArr2.length);
            outputStream.write(bArr2);
        }
    }
}
