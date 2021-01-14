package X;

import java.util.Arrays;

/* renamed from: X.1aC  reason: invalid class name and case insensitive filesystem */
public class C29791aC implements AnonymousClass0WK {
    public int A00 = 8;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = -1;
    public boolean A04 = false;
    public float[] A05 = new float[8];
    public int[] A06 = new int[8];
    public int[] A07 = new int[8];
    public final AnonymousClass0WI A08;
    public final C13940lG A09;

    public C29791aC(AnonymousClass0WI r4, C13940lG r5) {
        this.A08 = r4;
        this.A09 = r5;
    }

    @Override // X.AnonymousClass0WK
    public void A1g(AnonymousClass0WH r14, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.A02;
            if (i == -1) {
                this.A02 = 0;
                this.A05[0] = f;
                this.A06[0] = r14.A02;
                this.A07[0] = -1;
                r14.A05++;
                r14.A01(this.A08);
                this.A01++;
                if (!this.A04) {
                    int i2 = this.A03 + 1;
                    this.A03 = i2;
                    int length = this.A06.length;
                    if (i2 >= length) {
                        this.A04 = true;
                        this.A03 = length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1) {
                int i5 = this.A01;
                if (i3 >= i5) {
                    break;
                }
                int[] iArr = this.A06;
                int i6 = iArr[i];
                int i7 = r14.A02;
                if (i6 == i7) {
                    float[] fArr = this.A05;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int[] iArr2 = this.A07;
                        if (i == i) {
                            this.A02 = iArr2[i];
                        } else {
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            r14.A02(this.A08);
                        }
                        if (this.A04) {
                            this.A03 = i;
                        }
                        r14.A05--;
                        this.A01 = i5 - 1;
                        return;
                    }
                    return;
                }
                if (iArr[i] < i7) {
                    i4 = i;
                }
                i = this.A07[i];
                i3++;
            }
            int i8 = this.A03;
            int i9 = i8 + 1;
            if (this.A04) {
                int[] iArr3 = this.A06;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.A06;
            int length2 = iArr4.length;
            if (i8 >= length2 && this.A01 < length2) {
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    } else if (iArr4[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (i8 >= length2) {
                i8 = length2;
                int i11 = this.A00 << 1;
                this.A00 = i11;
                this.A04 = false;
                this.A03 = length2 - 1;
                this.A05 = Arrays.copyOf(this.A05, i11);
                this.A06 = Arrays.copyOf(this.A06, this.A00);
                this.A07 = Arrays.copyOf(this.A07, this.A00);
            }
            this.A06[i8] = r14.A02;
            this.A05[i8] = f;
            int[] iArr5 = this.A07;
            if (i4 != -1) {
                iArr5[i8] = iArr5[i4];
                iArr5[i4] = i8;
            } else {
                iArr5[i8] = this.A02;
                this.A02 = i8;
            }
            r14.A05++;
            r14.A01(this.A08);
            this.A01++;
            if (!this.A04) {
                this.A03++;
            }
            int i12 = this.A03;
            int length3 = this.A06.length;
            if (i12 >= length3) {
                this.A04 = true;
                this.A03 = length3 - 1;
            }
        }
    }

    @Override // X.AnonymousClass0WK
    public boolean A31(AnonymousClass0WH r7) {
        int i = this.A02;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            if (this.A06[i] == r7.A02) {
                return true;
            }
            i = this.A07[i];
            i2++;
        }
        return false;
    }

    @Override // X.AnonymousClass0WK
    public void A3q(float f) {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            float[] fArr = this.A05;
            fArr[i] = fArr[i] / f;
            i = this.A07[i];
            i2++;
        }
    }

    @Override // X.AnonymousClass0WK
    public final float A4a(AnonymousClass0WH r5) {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            if (this.A06[i] == r5.A02) {
                return this.A05[i];
            }
            i = this.A07[i];
            i2++;
        }
        return 0.0f;
    }

    @Override // X.AnonymousClass0WK
    public int A5p() {
        return this.A01;
    }

    @Override // X.AnonymousClass0WK
    public AnonymousClass0WH A9d(int i) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            if (i3 == i) {
                return this.A09.A03[this.A06[i2]];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return null;
    }

    @Override // X.AnonymousClass0WK
    public float A9e(int i) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            if (i3 == i) {
                return this.A05[i2];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // X.AnonymousClass0WK
    public void AAr() {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            float[] fArr = this.A05;
            fArr[i] = fArr[i] * -1.0f;
            i = this.A07[i];
            i2++;
        }
    }

    @Override // X.AnonymousClass0WK
    public final void AME(AnonymousClass0WH r10, float f) {
        if (f == 0.0f) {
            AMZ(r10, true);
            return;
        }
        int i = this.A02;
        if (i == -1) {
            this.A02 = 0;
            this.A05[0] = f;
            this.A06[0] = r10.A02;
            this.A07[0] = -1;
            r10.A05++;
            r10.A01(this.A08);
            this.A01++;
            if (!this.A04) {
                int i2 = this.A03 + 1;
                this.A03 = i2;
                int length = this.A06.length;
                if (i2 >= length) {
                    this.A04 = true;
                    this.A03 = length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.A01) {
            int[] iArr = this.A06;
            int i5 = iArr[i];
            int i6 = r10.A02;
            if (i5 == i6) {
                this.A05[i] = f;
                return;
            }
            if (iArr[i] < i6) {
                i4 = i;
            }
            i = this.A07[i];
            i3++;
        }
        int i7 = this.A03;
        int i8 = i7 + 1;
        if (this.A04) {
            int[] iArr2 = this.A06;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.A06;
        int length2 = iArr3.length;
        if (i7 >= length2 && this.A01 < length2) {
            int i9 = 0;
            while (true) {
                if (i9 >= length2) {
                    break;
                } else if (iArr3[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (i7 >= length2) {
            i7 = length2;
            int i10 = this.A00 << 1;
            this.A00 = i10;
            this.A04 = false;
            this.A03 = length2 - 1;
            this.A05 = Arrays.copyOf(this.A05, i10);
            this.A06 = Arrays.copyOf(this.A06, this.A00);
            this.A07 = Arrays.copyOf(this.A07, this.A00);
        }
        this.A06[i7] = r10.A02;
        this.A05[i7] = f;
        int[] iArr4 = this.A07;
        if (i4 != -1) {
            iArr4[i7] = iArr4[i4];
            iArr4[i4] = i7;
        } else {
            iArr4[i7] = this.A02;
            this.A02 = i7;
        }
        r10.A05++;
        r10.A01(this.A08);
        int i11 = this.A01 + 1;
        this.A01 = i11;
        if (!this.A04) {
            this.A03++;
        }
        int length3 = this.A06.length;
        if (i11 >= length3) {
            this.A04 = true;
        }
        if (this.A03 >= length3) {
            this.A04 = true;
            this.A03 = length3 - 1;
        }
    }

    @Override // X.AnonymousClass0WK
    public final float AMZ(AnonymousClass0WH r11, boolean z) {
        int i = this.A02;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1) {
            int i4 = this.A01;
            if (i2 >= i4) {
                break;
            }
            int[] iArr = this.A06;
            if (iArr[i] == r11.A02) {
                int[] iArr2 = this.A07;
                if (i == i) {
                    this.A02 = iArr2[i];
                } else {
                    iArr2[i3] = iArr2[i];
                }
                if (z) {
                    r11.A02(this.A08);
                }
                r11.A05--;
                this.A01 = i4 - 1;
                iArr[i] = -1;
                if (this.A04) {
                    this.A03 = i;
                }
                return this.A05[i];
            }
            i2++;
            i3 = i;
            i = this.A07[i];
        }
        return 0.0f;
    }

    @Override // X.AnonymousClass0WK
    public float AR0(AnonymousClass0WI r7, boolean z) {
        AnonymousClass0WH r0 = r7.A02;
        float A4a = A4a(r0);
        AMZ(r0, z);
        AnonymousClass0WK r4 = r7.A01;
        int A5p = r4.A5p();
        for (int i = 0; i < A5p; i++) {
            AnonymousClass0WH A9d = r4.A9d(i);
            A1g(A9d, r4.A4a(A9d) * A4a, z);
        }
        return A4a;
    }

    @Override // X.AnonymousClass0WK
    public final void clear() {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            AnonymousClass0WH r1 = this.A09.A03[this.A06[i]];
            if (r1 != null) {
                r1.A02(this.A08);
            }
            i = this.A07[i];
            i2++;
        }
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = false;
        this.A01 = 0;
    }

    public String toString() {
        int i = this.A02;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            StringBuilder A0S = AnonymousClass008.A0S(AnonymousClass008.A0K(str, " -> "));
            A0S.append(this.A05[i]);
            A0S.append(" : ");
            StringBuilder A0S2 = AnonymousClass008.A0S(A0S.toString());
            A0S2.append(this.A09.A03[this.A06[i]]);
            str = A0S2.toString();
            i = this.A07[i];
            i2++;
        }
        return str;
    }
}
