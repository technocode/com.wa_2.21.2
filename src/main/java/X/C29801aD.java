package X;

import java.util.Arrays;

/* renamed from: X.1aD  reason: invalid class name and case insensitive filesystem */
public class C29801aD implements AnonymousClass0WK {
    public int A00 = 16;
    public int A01 = 16;
    public int A02 = -1;
    public int A03 = 0;
    public float[] A04 = new float[16];
    public int[] A05 = new int[16];
    public int[] A06 = new int[16];
    public int[] A07 = new int[16];
    public int[] A08 = new int[16];
    public int[] A09 = new int[16];
    public final AnonymousClass0WI A0A;
    public final C13940lG A0B;

    public C29801aD(AnonymousClass0WI r3, C13940lG r4) {
        this.A0A = r3;
        this.A0B = r4;
        clear();
    }

    public int A00(AnonymousClass0WH r7) {
        int i;
        int i2;
        int[] iArr;
        if (this.A03 == 0 || (i2 = this.A05[(i = r7.A02) % this.A00]) == -1) {
            return -1;
        }
        int[] iArr2 = this.A09;
        if (iArr2[i2] == i) {
            return i2;
        }
        while (true) {
            iArr = this.A07;
            if (iArr[i2] == -1 || iArr2[iArr[i2]] == i) {
                int i3 = iArr[i2];
            } else {
                i2 = iArr[i2];
            }
        }
        int i32 = iArr[i2];
        if (i32 != -1 && iArr2[i32] == i) {
            return i32;
        }
        return -1;
    }

    public final void A01(int i, AnonymousClass0WH r4, float f) {
        this.A09[i] = r4.A02;
        this.A04[i] = f;
        this.A08[i] = -1;
        this.A06[i] = -1;
        r4.A01(this.A0A);
        r4.A05++;
        this.A03++;
    }

    public final void A02(AnonymousClass0WH r5, int i) {
        int[] iArr;
        int i2 = r5.A02 % this.A00;
        int[] iArr2 = this.A05;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.A07;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.A07[i] = -1;
    }

    @Override // X.AnonymousClass0WK
    public void A1g(AnonymousClass0WH r7, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int A002 = A00(r7);
            if (A002 == -1) {
                AME(r7, f);
                return;
            }
            float[] fArr = this.A04;
            fArr[A002] = fArr[A002] + f;
            float f2 = fArr[A002];
            if (f2 > -0.001f && f2 < 0.001f) {
                fArr[A002] = 0.0f;
                AMZ(r7, z);
            }
        }
    }

    @Override // X.AnonymousClass0WK
    public boolean A31(AnonymousClass0WH r4) {
        return A00(r4) != -1;
    }

    @Override // X.AnonymousClass0WK
    public void A3q(float f) {
        int i = this.A03;
        int i2 = this.A02;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.A04;
            fArr[i2] = fArr[i2] / f;
            i2 = this.A06[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // X.AnonymousClass0WK
    public float A4a(AnonymousClass0WH r3) {
        int A002 = A00(r3);
        if (A002 != -1) {
            return this.A04[A002];
        }
        return 0.0f;
    }

    @Override // X.AnonymousClass0WK
    public int A5p() {
        return this.A03;
    }

    @Override // X.AnonymousClass0WK
    public AnonymousClass0WH A9d(int i) {
        int i2 = this.A03;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.A02;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.A0B.A03[this.A09[i3]];
            }
            i3 = this.A06[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // X.AnonymousClass0WK
    public float A9e(int i) {
        int i2 = this.A03;
        int i3 = this.A02;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.A04[i3];
            }
            i3 = this.A06[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // X.AnonymousClass0WK
    public void AAr() {
        int i = this.A03;
        int i2 = this.A02;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.A04;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.A06[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // X.AnonymousClass0WK
    public void AME(AnonymousClass0WH r11, float f) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.A03;
            int i2 = 0;
            if (i == 0) {
                A01(0, r11, f);
                A02(r11, 0);
                this.A02 = 0;
                return;
            }
            int A002 = A00(r11);
            if (A002 != -1) {
                this.A04[A002] = f;
                return;
            }
            int i3 = i + 1;
            int i4 = this.A01;
            if (i3 >= i4) {
                i4 <<= 1;
                this.A09 = Arrays.copyOf(this.A09, i4);
                this.A04 = Arrays.copyOf(this.A04, i4);
                this.A08 = Arrays.copyOf(this.A08, i4);
                this.A06 = Arrays.copyOf(this.A06, i4);
                int[] copyOf = Arrays.copyOf(this.A07, i4);
                this.A07 = copyOf;
                for (int i5 = this.A01; i5 < i4; i5++) {
                    this.A09[i5] = -1;
                    copyOf[i5] = -1;
                }
                this.A01 = i4;
            }
            int i6 = this.A03;
            int i7 = this.A02;
            int i8 = -1;
            for (int i9 = 0; i9 < i6; i9++) {
                int[] iArr2 = this.A09;
                int i10 = iArr2[i7];
                int i11 = r11.A02;
                if (i10 != i11) {
                    if (iArr2[i7] < i11) {
                        i8 = i7;
                    }
                    i7 = this.A06[i7];
                    if (i7 == -1) {
                        break;
                    }
                } else {
                    this.A04[i7] = f;
                    return;
                }
            }
            while (true) {
                if (i2 >= i4) {
                    i2 = -1;
                    break;
                }
                if (this.A09[i2] == -1) {
                    break;
                }
                i2++;
            }
            A01(i2, r11, f);
            int[] iArr3 = this.A08;
            if (i8 != -1) {
                iArr3[i2] = i8;
                iArr = this.A06;
                iArr[i2] = iArr[i8];
                iArr[i8] = i2;
            } else {
                iArr3[i2] = -1;
                if (this.A03 > 0) {
                    iArr = this.A06;
                    iArr[i2] = this.A02;
                    this.A02 = i2;
                } else {
                    iArr = this.A06;
                    iArr[i2] = -1;
                }
            }
            int i12 = iArr[i2];
            if (i12 != -1) {
                iArr3[i12] = i2;
            }
            A02(r11, i2);
            return;
        }
        AMZ(r11, true);
    }

    @Override // X.AnonymousClass0WK
    public float AMZ(AnonymousClass0WH r10, boolean z) {
        int[] iArr;
        int A002 = A00(r10);
        if (A002 == -1) {
            return 0.0f;
        }
        int i = r10.A02;
        int i2 = i % this.A00;
        int[] iArr2 = this.A05;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            int[] iArr3 = this.A09;
            if (iArr3[i3] == i) {
                int[] iArr4 = this.A07;
                iArr2[i2] = iArr4[i3];
                iArr4[i3] = -1;
            } else {
                while (true) {
                    iArr = this.A07;
                    if (iArr[i3] == -1 || iArr3[iArr[i3]] == i) {
                        int i4 = iArr[i3];
                    } else {
                        i3 = iArr[i3];
                    }
                }
                int i42 = iArr[i3];
                if (i42 != -1 && iArr3[i42] == i) {
                    iArr[i3] = iArr[i42];
                    iArr[i42] = -1;
                }
            }
        }
        float f = this.A04[A002];
        if (this.A02 == A002) {
            this.A02 = this.A06[A002];
        }
        this.A09[A002] = -1;
        int[] iArr5 = this.A08;
        int i5 = iArr5[A002];
        if (i5 != -1) {
            int[] iArr6 = this.A06;
            iArr6[i5] = iArr6[A002];
        }
        int i6 = this.A06[A002];
        if (i6 != -1) {
            iArr5[i6] = iArr5[A002];
        }
        this.A03--;
        r10.A05--;
        if (z) {
            r10.A02(this.A0A);
        }
        return f;
    }

    @Override // X.AnonymousClass0WK
    public float AR0(AnonymousClass0WI r10, boolean z) {
        AnonymousClass0WH r0 = r10.A02;
        float A4a = A4a(r0);
        AMZ(r0, z);
        C29801aD r7 = (C29801aD) r10.A01;
        int i = r7.A03;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = r7.A09;
            if (iArr[i3] != -1) {
                A1g(this.A0B.A03[iArr[i3]], r7.A04[i3] * A4a, z);
                i2++;
            }
            i3++;
        }
        return A4a;
    }

    @Override // X.AnonymousClass0WK
    public void clear() {
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass0WH A9d = A9d(i2);
            if (A9d != null) {
                A9d.A02(this.A0A);
            }
        }
        for (int i3 = 0; i3 < this.A01; i3++) {
            this.A09[i3] = -1;
            this.A07[i3] = -1;
        }
        for (int i4 = 0; i4 < this.A00; i4++) {
            this.A05[i4] = -1;
        }
        this.A03 = 0;
        this.A02 = -1;
    }

    public String toString() {
        String A0K;
        String A0K2;
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" { ");
        String obj = sb.toString();
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass0WH A9d = A9d(i2);
            if (A9d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(A9d);
                sb2.append(" = ");
                sb2.append(A9e(i2));
                sb2.append(" ");
                String obj2 = sb2.toString();
                int A002 = A00(A9d);
                String A0K3 = AnonymousClass008.A0K(obj2, "[p: ");
                int i3 = this.A08[A002];
                if (i3 != -1) {
                    StringBuilder A0S = AnonymousClass008.A0S(A0K3);
                    A0S.append(this.A0B.A03[this.A09[i3]]);
                    A0K = A0S.toString();
                } else {
                    A0K = AnonymousClass008.A0K(A0K3, "none");
                }
                String A0K4 = AnonymousClass008.A0K(A0K, ", n: ");
                int i4 = this.A06[A002];
                if (i4 != -1) {
                    StringBuilder A0S2 = AnonymousClass008.A0S(A0K4);
                    A0S2.append(this.A0B.A03[this.A09[i4]]);
                    A0K2 = A0S2.toString();
                } else {
                    A0K2 = AnonymousClass008.A0K(A0K4, "none");
                }
                obj = AnonymousClass008.A0K(A0K2, "]");
            }
        }
        return AnonymousClass008.A0K(obj, " }");
    }
}
