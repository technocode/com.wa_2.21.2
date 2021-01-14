package X;

import java.util.Arrays;

/* renamed from: X.0WD  reason: invalid class name */
public class AnonymousClass0WD {
    public static int A0E = 1000;
    public static boolean A0F = true;
    public static long A0G;
    public static long A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public AnonymousClass0WJ A07;
    public AnonymousClass0WJ A08;
    public boolean A09;
    public AnonymousClass0WI[] A0A;
    public AnonymousClass0WH[] A0B;
    public boolean[] A0C;
    public final C13940lG A0D;

    public AnonymousClass0WD() {
        this.A06 = 0;
        this.A00 = 32;
        this.A01 = 32;
        this.A0A = null;
        this.A09 = false;
        this.A0C = new boolean[32];
        this.A03 = 1;
        this.A04 = 0;
        this.A02 = 32;
        this.A0B = new AnonymousClass0WH[A0E];
        this.A05 = 0;
        this.A0A = new AnonymousClass0WI[32];
        A08();
        C13940lG r1 = new C13940lG();
        this.A0D = r1;
        this.A07 = new C451223b(r1);
        if (A0F) {
            this.A08 = new C451123a(r1);
        } else {
            this.A08 = new AnonymousClass0WI(r1);
        }
    }

    public static int A00(Object obj) {
        AnonymousClass0WH r0 = ((AnonymousClass0WG) obj).A02;
        if (r0 != null) {
            return (int) (r0.A00 + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0WI A01() {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WD.A01():X.0WI");
    }

    public AnonymousClass0WH A02() {
        if (this.A03 + 1 >= this.A01) {
            A07();
        }
        AnonymousClass0WH A042 = A04(EnumC13980lK.SLACK);
        int i = this.A06 + 1;
        this.A06 = i;
        this.A03++;
        A042.A02 = i;
        this.A0D.A03[i] = A042;
        return A042;
    }

    public AnonymousClass0WH A03(int i) {
        if (this.A03 + 1 >= this.A01) {
            A07();
        }
        AnonymousClass0WH A042 = A04(EnumC13980lK.ERROR);
        int i2 = this.A06 + 1;
        this.A06 = i2;
        this.A03++;
        A042.A02 = i2;
        A042.A04 = i;
        this.A0D.A03[i2] = A042;
        this.A07.A1k(A042);
        return A042;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0WH A04(X.EnumC13980lK r6) {
        /*
            r5 = this;
            X.0lG r0 = r5.A0D
            X.0lH r4 = r0.A02
            int r0 = r4.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0043
            int r1 = r0 + -1
            java.lang.Object[] r0 = r4.A01
            r3 = r0[r1]
            r0[r1] = r2
            r4.A00 = r1
        L_0x0013:
            X.0WH r3 = (X.AnonymousClass0WH) r3
            if (r3 != 0) goto L_0x003d
            X.0WH r3 = new X.0WH
            r3.<init>(r6)
            r3.A06 = r6
        L_0x001e:
            int r1 = r5.A05
            int r0 = X.AnonymousClass0WD.A0E
            if (r1 < r0) goto L_0x0032
            int r1 = r0 << 1
            X.AnonymousClass0WD.A0E = r1
            X.0WH[] r0 = r5.A0B
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            X.0WH[] r0 = (X.AnonymousClass0WH[]) r0
            r5.A0B = r0
        L_0x0032:
            X.0WH[] r2 = r5.A0B
            int r1 = r5.A05
            int r0 = r1 + 1
            r5.A05 = r0
            r2[r1] = r3
            return r3
        L_0x003d:
            r3.A00()
            r3.A06 = r6
            goto L_0x001e
        L_0x0043:
            r3 = r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WD.A04(X.0lK):X.0WH");
    }

    public AnonymousClass0WH A05(Object obj) {
        AnonymousClass0WH r3 = null;
        if (obj == null) {
            return null;
        }
        if (this.A03 + 1 >= this.A01) {
            A07();
        }
        if (obj instanceof AnonymousClass0WG) {
            AnonymousClass0WG r5 = (AnonymousClass0WG) obj;
            r3 = r5.A02;
            if (r3 == null) {
                r5.A02();
                r3 = r5.A02;
            }
            int i = r3.A02;
            if (i == -1 || i > this.A06 || this.A0D.A03[i] == null) {
                if (i != -1) {
                    r3.A00();
                }
                int i2 = this.A06 + 1;
                this.A06 = i2;
                this.A03++;
                r3.A02 = i2;
                r3.A06 = EnumC13980lK.UNRESTRICTED;
                this.A0D.A03[i2] = r3;
            }
        }
        return r3;
    }

    public void A06() {
        C13940lG r5;
        AnonymousClass0WH[] r11;
        int i = 0;
        while (true) {
            r5 = this.A0D;
            r11 = r5.A03;
            if (i >= r11.length) {
                break;
            }
            AnonymousClass0WH r0 = r11[i];
            if (r0 != null) {
                r0.A00();
            }
            i++;
        }
        C13950lH r10 = r5.A02;
        AnonymousClass0WH[] r9 = this.A0B;
        int i2 = this.A05;
        if (r10 != null) {
            int length = r9.length;
            if (i2 > length) {
                i2 = length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                AnonymousClass0WH r3 = r9[i3];
                int i4 = r10.A00;
                Object[] objArr = r10.A01;
                if (i4 < objArr.length) {
                    objArr[i4] = r3;
                    r10.A00 = i4 + 1;
                }
            }
            this.A05 = 0;
            Arrays.fill(r11, (Object) null);
            this.A06 = 0;
            this.A07.clear();
            this.A03 = 1;
            for (int i5 = 0; i5 < this.A04; i5++) {
            }
            A08();
            this.A04 = 0;
            if (A0F) {
                this.A08 = new C451123a(r5);
            } else {
                this.A08 = new AnonymousClass0WI(r5);
            }
        } else {
            throw null;
        }
    }

    public final void A07() {
        int i = this.A00 << 1;
        this.A00 = i;
        this.A0A = (AnonymousClass0WI[]) Arrays.copyOf(this.A0A, i);
        C13940lG r2 = this.A0D;
        r2.A03 = (AnonymousClass0WH[]) Arrays.copyOf(r2.A03, this.A00);
        int i2 = this.A00;
        this.A0C = new boolean[i2];
        this.A01 = i2;
        this.A02 = i2;
    }

    public final void A08() {
        int i = 0;
        if (A0F) {
            while (true) {
                AnonymousClass0WI[] r2 = this.A0A;
                if (i < r2.length) {
                    AnonymousClass0WI r1 = r2[i];
                    if (r1 != null) {
                        this.A0D.A01.A00(r1);
                    }
                    r2[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                AnonymousClass0WI[] r22 = this.A0A;
                if (i < r22.length) {
                    AnonymousClass0WI r12 = r22[i];
                    if (r12 != null) {
                        this.A0D.A00.A00(r12);
                    }
                    r22[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass0WI r18) {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WD.A09(X.0WI):void");
    }

    public final void A0A(AnonymousClass0WI r5) {
        AnonymousClass0WI[] r3;
        int i;
        if (A0F) {
            r3 = this.A0A;
            i = this.A04;
            AnonymousClass0WI r1 = r3[i];
            if (r1 != null) {
                this.A0D.A01.A00(r1);
            }
        } else {
            r3 = this.A0A;
            i = this.A04;
            AnonymousClass0WI r12 = r3[i];
            if (r12 != null) {
                this.A0D.A00.A00(r12);
            }
        }
        r3[i] = r5;
        AnonymousClass0WH r13 = r5.A02;
        r13.A01 = i;
        this.A04 = i + 1;
        r13.A03(r5);
    }

    public void A0B(AnonymousClass0WJ r19) {
        EnumC13980lK r11 = EnumC13980lK.UNRESTRICTED;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= this.A04) {
                break;
            }
            AnonymousClass0WI[] r1 = this.A0A;
            if (r1[i].A02.A06 != r11 && r1[i].A00 < 0.0f) {
                boolean z = false;
                int i3 = 0;
                do {
                    i3 += i2;
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    for (int i7 = 0; i7 < this.A04; i7++) {
                        AnonymousClass0WI r5 = this.A0A[i7];
                        if (r5.A02.A06 != r11 && !r5.A04 && r5.A00 < 0.0f) {
                            for (int i8 = 1; i8 < this.A03; i8++) {
                                AnonymousClass0WH r3 = this.A0D.A03[i8];
                                float A4a = r5.A01.A4a(r3);
                                int i9 = 0;
                                if (A4a > 0.0f) {
                                    do {
                                        float f2 = r3.A0A[i9] / A4a;
                                        if ((f2 < f && i9 == i6) || i9 > i6) {
                                            i6 = i9;
                                            f = f2;
                                            i4 = i7;
                                            i5 = i8;
                                        }
                                        i9++;
                                    } while (i9 < 9);
                                }
                            }
                        }
                    }
                    if (i4 != -1) {
                        AnonymousClass0WI r12 = this.A0A[i4];
                        r12.A02.A01 = -1;
                        r12.A02(this.A0D.A03[i5]);
                        AnonymousClass0WH r0 = r12.A02;
                        r0.A01 = i4;
                        r0.A03(r12);
                    } else {
                        z = true;
                    }
                    if (i3 > (this.A03 >> 1)) {
                        break;
                    }
                    i2 = 1;
                } while (!z);
            } else {
                i++;
            }
        }
        A0C(r19);
        for (int i10 = 0; i10 < this.A04; i10++) {
            AnonymousClass0WI r02 = this.A0A[i10];
            r02.A02.A00 = r02.A00;
        }
    }

    public final void A0C(AnonymousClass0WJ r11) {
        for (int i = 0; i < this.A03; i++) {
            this.A0C[i] = false;
        }
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 < (this.A03 << 1)) {
                AnonymousClass0WH r0 = ((AnonymousClass0WI) r11).A02;
                if (r0 != null) {
                    this.A0C[r0.A02] = true;
                }
                boolean[] zArr = this.A0C;
                AnonymousClass0WH A8N = r11.A8N(this, zArr);
                if (A8N != null) {
                    int i3 = A8N.A02;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                        float f = Float.MAX_VALUE;
                        int i4 = -1;
                        for (int i5 = 0; i5 < this.A04; i5++) {
                            AnonymousClass0WI r1 = this.A0A[i5];
                            if (r1.A02.A06 != EnumC13980lK.UNRESTRICTED && !r1.A04 && r1.A01.A31(A8N)) {
                                float A4a = r1.A01.A4a(A8N);
                                if (A4a < 0.0f) {
                                    float f2 = (-r1.A00) / A4a;
                                    if (f2 < f) {
                                        i4 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        if (i4 > -1) {
                            AnonymousClass0WI r12 = this.A0A[i4];
                            r12.A02.A01 = -1;
                            r12.A02(A8N);
                            AnonymousClass0WH r02 = r12.A02;
                            r02.A01 = i4;
                            r02.A03(r12);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void A0D(AnonymousClass0WH r5, int i) {
        int i2 = r5.A01;
        if (i2 == -1) {
            r5.A00 = (float) i;
            r5.A08 = true;
            int i3 = r5.A03;
            for (int i4 = 0; i4 < i3; i4++) {
                r5.A0B[i4].A05(r5, false);
            }
            r5.A03 = 0;
        } else if (i2 != -1) {
            AnonymousClass0WI r1 = this.A0A[i2];
            if (r1.A04) {
                r1.A00 = (float) i;
            } else if (r1.A01.A5p() == 0) {
                r1.A04 = true;
                r1.A00 = (float) i;
            } else {
                AnonymousClass0WI A012 = A01();
                if (i < 0) {
                    A012.A00 = (float) (-i);
                    A012.A01.AME(r5, 1.0f);
                } else {
                    A012.A00 = (float) i;
                    A012.A01.AME(r5, -1.0f);
                }
                A09(A012);
            }
        } else {
            AnonymousClass0WI A013 = A01();
            A013.A02 = r5;
            float f = (float) i;
            r5.A00 = f;
            A013.A00 = f;
            A013.A04 = true;
            A09(A013);
        }
    }

    public void A0E(AnonymousClass0WH r7, AnonymousClass0WH r8, int i, float f, AnonymousClass0WH r11, AnonymousClass0WH r12, int i2, int i3) {
        AnonymousClass0WI A012 = A01();
        if (r8 == r11) {
            A012.A01.AME(r7, 1.0f);
            A012.A01.AME(r12, 1.0f);
            A012.A01.AME(r8, -2.0f);
        } else if (f == 0.5f) {
            A012.A01.AME(r7, 1.0f);
            A012.A01.AME(r8, -1.0f);
            A012.A01.AME(r11, -1.0f);
            A012.A01.AME(r12, 1.0f);
            if (i > 0 || i2 > 0) {
                A012.A00 = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            A012.A01.AME(r7, -1.0f);
            A012.A01.AME(r8, 1.0f);
            A012.A00 = (float) i;
        } else if (f >= 1.0f) {
            A012.A01.AME(r12, -1.0f);
            A012.A01.AME(r11, 1.0f);
            A012.A00 = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            A012.A01.AME(r7, f2 * 1.0f);
            A012.A01.AME(r8, f2 * -1.0f);
            A012.A01.AME(r11, -1.0f * f);
            A012.A01.AME(r12, 1.0f * f);
            if (i > 0 || i2 > 0) {
                A012.A00 = (((float) i2) * f) + (((float) (-i)) * f2);
            }
        }
        if (i3 != 8) {
            A012.A01.AME(A03(i3), 1.0f);
            A012.A01.AME(A03(i3), -1.0f);
        }
        A09(A012);
    }

    public void A0F(AnonymousClass0WH r7, AnonymousClass0WH r8, int i, int i2) {
        if (i2 == 8 && r8.A08 && r7.A01 == -1) {
            r7.A00 = r8.A00 + ((float) i);
            r7.A08 = true;
            int i3 = r7.A03;
            for (int i4 = 0; i4 < i3; i4++) {
                r7.A0B[i4].A05(r7, false);
            }
            r7.A03 = 0;
            return;
        }
        AnonymousClass0WI A012 = A01();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            A012.A00 = (float) i;
        }
        if (!z) {
            A012.A01.AME(r7, -1.0f);
            A012.A01.AME(r8, 1.0f);
        } else {
            A012.A01.AME(r7, 1.0f);
            A012.A01.AME(r8, -1.0f);
        }
        if (i2 != 8) {
            A012.A01.AME(A03(i2), 1.0f);
            A012.A01.AME(A03(i2), -1.0f);
        }
        A09(A012);
    }

    public void A0G(AnonymousClass0WH r5, AnonymousClass0WH r6, int i, int i2) {
        AnonymousClass0WI A012 = A01();
        AnonymousClass0WH A022 = A02();
        A022.A04 = 0;
        A012.A03(r5, r6, A022, i);
        if (i2 != 8) {
            int A4a = (int) (A012.A01.A4a(A022) * -1.0f);
            A012.A01.AME(A03(i2), (float) A4a);
        }
        A09(A012);
    }

    public void A0H(AnonymousClass0WH r5, AnonymousClass0WH r6, int i, int i2) {
        AnonymousClass0WI A012 = A01();
        AnonymousClass0WH A022 = A02();
        A022.A04 = 0;
        A012.A04(r5, r6, A022, i);
        if (i2 != 8) {
            int A4a = (int) (A012.A01.A4a(A022) * -1.0f);
            A012.A01.AME(A03(i2), (float) A4a);
        }
        A09(A012);
    }

    public void A0I(AnonymousClass0WH r4, AnonymousClass0WH r5, AnonymousClass0WH r6, AnonymousClass0WH r7, float f) {
        AnonymousClass0WI A012 = A01();
        A012.A01.AME(r4, -1.0f);
        A012.A01.AME(r5, 1.0f);
        A012.A01.AME(r6, f);
        A012.A01.AME(r7, -f);
        A09(A012);
    }
}
