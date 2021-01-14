package X;

import javax.crypto.BadPaddingException;

/* renamed from: X.3Wy  reason: invalid class name and case insensitive filesystem */
public class C73343Wy implements AbstractC68053Bn {
    public C67953Bd A00;

    @Override // X.AbstractC68053Bn
    public boolean ARK() {
        return true;
    }

    public C73343Wy(AbstractC11690gn r2) {
        this.A00 = new C73313Wi(r2);
    }

    public C73343Wy(C67953Bd r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC68053Bn
    public int A3r(byte[] bArr, int i) {
        int i2;
        try {
            C67953Bd r8 = this.A00;
            if (!(r8 instanceof C73313Wi)) {
                try {
                    int i3 = r8.A00;
                    if (i3 + i <= bArr.length) {
                        int i4 = 0;
                        if (i3 != 0) {
                            if (r8.A03) {
                                AbstractC11690gn r1 = r8.A01;
                                byte[] bArr2 = r8.A05;
                                r1.AM9(bArr2, 0, bArr2, 0);
                                int i5 = r8.A00;
                                r8.A00 = 0;
                                System.arraycopy(r8.A05, 0, bArr, i, i5);
                                i4 = i5;
                            } else {
                                throw new C67983Bg("data not block size aligned");
                            }
                        }
                        return i4;
                    }
                    throw new C73283Wf("output buffer too short for doFinal()");
                } finally {
                    r8.A01();
                }
            } else {
                C73313Wi r82 = (C73313Wi) r8;
                AbstractC11690gn r2 = r82.A01;
                int A4x = r2.A4x();
                if (r82.A02) {
                    int i6 = ((C67953Bd) r82).A00;
                    if (i6 != A4x) {
                        i2 = 0;
                    } else if ((A4x << 1) + i <= bArr.length) {
                        i2 = r2.AM9(r82.A05, 0, bArr, i);
                        ((C67953Bd) r82).A00 = 0;
                        i6 = 0;
                    } else {
                        r82.A01();
                        throw new C73283Wf("output buffer too short");
                    }
                    C68023Bk r0 = r82.A00;
                    byte[] bArr3 = r82.A05;
                    if (r0 != null) {
                        int length = bArr3.length;
                        byte b = (byte) (length - i6);
                        while (i6 < length) {
                            bArr3[i6] = b;
                            i6++;
                        }
                        int AM9 = r82.A01.AM9(bArr3, 0, bArr, i + i2) + i2;
                        r82.A01();
                        return AM9;
                    }
                    throw null;
                } else if (((C67953Bd) r82).A00 == A4x) {
                    byte[] bArr4 = r82.A05;
                    int AM92 = r2.AM9(bArr4, 0, bArr4, 0);
                    ((C67953Bd) r82).A00 = 0;
                    try {
                        C68023Bk r02 = r82.A00;
                        byte[] bArr5 = r82.A05;
                        if (r02 != null) {
                            int length2 = bArr5.length;
                            int i7 = bArr5[length2 - 1] & 255;
                            byte b2 = (byte) i7;
                            boolean z = false;
                            if (i7 > length2) {
                                z = true;
                            }
                            boolean z2 = false;
                            if (i7 == 0) {
                                z2 = true;
                            }
                            boolean z3 = z | z2;
                            for (int i8 = 0; i8 < length2; i8++) {
                                boolean z4 = false;
                                if (length2 - i8 <= i7) {
                                    z4 = true;
                                }
                                boolean z5 = false;
                                if (bArr5[i8] != b2) {
                                    z5 = true;
                                }
                                z3 |= z4 & z5;
                            }
                            if (!z3) {
                                int i9 = AM92 - i7;
                                System.arraycopy(bArr5, 0, bArr, i, i9);
                                return i9;
                            }
                            throw new C73273We("pad block corrupted");
                        }
                        throw null;
                    } finally {
                        r82.A01();
                    }
                } else {
                    r82.A01();
                    throw new C67983Bg("last block incomplete in decryption");
                }
            }
        } catch (C73273We e) {
            throw new BadPaddingException(e.getMessage());
        }
    }

    @Override // X.AbstractC68053Bn
    public String A4i() {
        return this.A00.A01.A4i();
    }

    @Override // X.AbstractC68053Bn
    public int A7p(int i) {
        C67953Bd r2 = this.A00;
        if (!(r2 instanceof C73313Wi)) {
            return i + r2.A00;
        }
        int i2 = i + r2.A00;
        int length = r2.A05.length;
        int i3 = i2 % length;
        if (i3 != 0) {
            i2 -= i3;
        } else if (!r2.A02) {
            return i2;
        }
        return i2 + length;
    }

    @Override // X.AbstractC68053Bn
    public AbstractC11690gn A9X() {
        return this.A00.A01;
    }

    @Override // X.AbstractC68053Bn
    public int A9Z(int i) {
        return this.A00.A00(i);
    }

    @Override // X.AbstractC68053Bn
    public void AAX(boolean z, AbstractC11530gT r5) {
        C67953Bd r2 = this.A00;
        if (!(r2 instanceof C73313Wi)) {
            r2.A02 = z;
            r2.A01();
            r2.A01.AAX(z, r5);
            return;
        }
        C73313Wi r22 = (C73313Wi) r2;
        r22.A02 = z;
        r22.A01();
        if (r5 instanceof C73323Wj) {
            C73323Wj r52 = (C73323Wj) r5;
            if (r22.A00 != null) {
                r22.A01.AAX(z, r52.A01);
                return;
            }
            throw null;
        } else if (r22.A00 != null) {
            r22.A01.AAX(z, r5);
        } else {
            throw null;
        }
    }

    @Override // X.AbstractC68053Bn
    public int AMA(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        C67953Bd r4 = this.A00;
        if (!(r4 instanceof C73313Wi)) {
            if (i2 >= 0) {
                int A4x = r4.A01.A4x();
                int A002 = r4.A00(i2);
                if (A002 <= 0 || A002 + i3 <= bArr2.length) {
                    byte[] bArr3 = r4.A05;
                    int length = bArr3.length;
                    int i5 = r4.A00;
                    int i6 = length - i5;
                    if (i2 > i6) {
                        System.arraycopy(bArr, i, bArr3, i5, i6);
                        i4 = r4.A01.AM9(r4.A05, 0, bArr2, i3) + 0;
                        r4.A00 = 0;
                        i2 -= i6;
                        i += i6;
                        while (true) {
                            bArr3 = r4.A05;
                            if (i2 <= bArr3.length) {
                                break;
                            }
                            i4 += r4.A01.AM9(bArr, i, bArr2, i3 + i4);
                            i2 -= A4x;
                            i += A4x;
                        }
                    } else {
                        i4 = 0;
                    }
                    System.arraycopy(bArr, i, bArr3, r4.A00, i2);
                    int i7 = r4.A00 + i2;
                    r4.A00 = i7;
                    byte[] bArr4 = r4.A05;
                    if (i7 != bArr4.length) {
                        return i4;
                    }
                    int AM9 = i4 + r4.A01.AM9(bArr4, 0, bArr2, i3 + i4);
                    r4.A00 = 0;
                    return AM9;
                }
                throw new C73283Wf("output buffer too short");
            }
            throw new IllegalArgumentException("Can't have a negative input length!");
        } else if (i2 >= 0) {
            int A4x2 = r4.A01.A4x();
            int A003 = r4.A00(i2);
            if (A003 <= 0 || A003 + i3 <= bArr2.length) {
                byte[] bArr5 = r4.A05;
                int length2 = bArr5.length;
                int i8 = r4.A00;
                int i9 = length2 - i8;
                int i10 = 0;
                if (i2 > i9) {
                    System.arraycopy(bArr, i, bArr5, i8, i9);
                    r4.A00 = 0;
                    i2 -= i9;
                    i += i9;
                    i10 = r4.A01.AM9(r4.A05, 0, bArr2, i3) + 0;
                    while (true) {
                        bArr5 = r4.A05;
                        if (i2 <= bArr5.length) {
                            break;
                        }
                        i10 += r4.A01.AM9(bArr, i, bArr2, i3 + i10);
                        i2 -= A4x2;
                        i += A4x2;
                    }
                }
                System.arraycopy(bArr, i, bArr5, r4.A00, i2);
                r4.A00 += i2;
                return i10;
            }
            throw new C73283Wf("output buffer too short");
        } else {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
    }

    @Override // X.AbstractC68053Bn
    public void AQp(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("AAD is not supported in the current mode.");
    }
}
