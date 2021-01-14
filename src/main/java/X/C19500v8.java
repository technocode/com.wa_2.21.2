package X;

/* renamed from: X.0v8  reason: invalid class name and case insensitive filesystem */
public class C19500v8 {
    public int A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03 = -1;
    public C19650vN A04;
    public C19650vN A05;
    public C19650vN A06;

    public C19500v8() {
        C19650vN A002 = C19650vN.A00(-1, -1);
        this.A06 = A002;
        A002.A02 = 0;
        A002.A03 = 0;
        A002.A04 = 0;
        this.A04 = A002;
        this.A05 = A002;
        this.A00 = 0;
    }

    public final String A00(C19650vN r8, int i) {
        if (i < 0) {
            return "<snip>";
        }
        if (r8 == null) {
            return "\n{x}";
        }
        StringBuilder A0S = AnonymousClass008.A0S("\n");
        A0S.append(r8.toString());
        String obj = A0S.toString();
        C19650vN[] r5 = r8.A0B;
        for (C19650vN r1 : r5) {
            StringBuilder A0S2 = AnonymousClass008.A0S(obj);
            A0S2.append(A00(r1, i - 1).replace("\n", "\n-"));
            obj = A0S2.toString();
        }
        return obj;
    }

    public void A01() {
        boolean z;
        C19650vN[] r2;
        long nanoTime = System.nanoTime();
        try {
            int i = this.A01;
            if (i != -1) {
                int i2 = i - this.A02;
                int i3 = this.A03;
                int i4 = 1 << (i3 << 1);
                if (i3 == -1) {
                    i4 = 0;
                }
                int i5 = i2 + i4;
                if (this.A00 > i5) {
                    C19650vN r22 = this.A04;
                    while (this.A00 > i5 && r22 != null) {
                        if (!(r22.A02() == null || r22.A04 == this.A03 || r22.A0C != 0)) {
                            synchronized (r22) {
                                if (r22.A06 != null) {
                                    r22.A04();
                                }
                                r22.A06 = null;
                            }
                            this.A00--;
                        }
                        r22 = r22.A09;
                    }
                    do {
                        z = false;
                        for (C19650vN r7 = this.A04; r7 != null; r7 = r7.A09) {
                            for (int i6 = 0; i6 < 4; i6++) {
                                C19650vN r5 = r7.A0B[i6];
                                if (r5 != null && r5.A0C == 0 && r5.A02() == null) {
                                    int i7 = 0;
                                    int i8 = 0;
                                    int i9 = -1;
                                    do {
                                        r2 = r5.A0B;
                                        if (r2[i7] != null) {
                                            i8++;
                                            i9 = i7;
                                        }
                                        i7++;
                                    } while (i7 < 4);
                                    if (i8 == 1) {
                                        r7.A0B[i6] = r2[i9];
                                        A05(r5);
                                        r5.A03();
                                    } else if (i8 == 0) {
                                        r7.A0B[i6] = null;
                                        A05(r5);
                                        r5.A03();
                                    }
                                    z = true;
                                }
                            }
                        }
                    } while (z);
                }
            }
        } finally {
            C19550vD.A0U.A03(System.nanoTime() - nanoTime);
        }
    }

    public void A02(int i, int i2, int i3, C19390uw r10) {
        int i4 = 0;
        r10.A03 = 0;
        r10.A06 = null;
        r10.A05 = null;
        int i5 = 0;
        do {
            r10.A07[i5] = null;
            i5++;
        } while (i5 < 4);
        r10.A00 = i;
        r10.A01 = i2;
        r10.A02 = i3;
        C19650vN r4 = this.A06;
        while (r4.A04 < i3) {
            if (r4.A02() != null) {
                r10.A05 = r4;
            }
            int i6 = (i3 - r4.A04) - 1;
            C19650vN r0 = r4.A0B[(((i >> i6) & 1) << 1) + ((i2 >> i6) & 1)];
            if (r0 == null) {
                break;
            }
            r4 = r0;
        }
        if (r4.A04 == i3 && r4.A02 == i && r4.A03 == i2) {
            if (r4.A02() != null) {
                r10.A06 = r4;
            } else {
                r10.A03 = r4.A0C;
                C19650vN[] r1 = r4.A0B;
                System.arraycopy(r1, 0, r10.A07, 0, 4);
                do {
                    A04(r1[i4]);
                    i4++;
                } while (i4 < 4);
            }
        }
        C19650vN r02 = r10.A06;
        if (r02 != null) {
            A04(r02);
            return;
        }
        C19650vN r03 = r10.A05;
        if (r03 != null) {
            A04(r03);
        }
    }

    public void A03(C19650vN r14) {
        int i;
        if (r14.A02() != null) {
            this.A00++;
        }
        C19650vN r6 = this.A06;
        int i2 = r14.A02;
        int i3 = r14.A03;
        int i4 = r14.A04;
        int i5 = r6.A04;
        while (true) {
            int i6 = (i4 - i5) - 1;
            i = (((i2 >> i6) & 1) << 1) + ((i3 >> i6) & 1);
            C19650vN[] r1 = r6.A0B;
            if (r1[i] == null) {
                break;
            }
            C19650vN r7 = r1[i];
            if (r7 != null) {
                int i7 = r7.A04;
                if (i4 <= i7) {
                    break;
                }
                int i8 = i4 - i7;
                if ((i2 >> i8) != r7.A02 || (i3 >> i8) != r7.A03) {
                    break;
                }
                r6 = r6.A0B[i];
                i5 = r6.A04;
            } else {
                throw null;
            }
        }
        C19650vN[] r10 = r6.A0B;
        C19650vN r8 = r10[i];
        if (r8 == null) {
            r10[i] = r14;
        } else {
            int i9 = r8.A04;
            if (i4 < i9) {
                r10[i] = r14;
                int i10 = (i9 - i4) - 1;
                r14.A0B[(((r8.A02 >> i10) & 1) << 1) + ((r8.A03 >> i10) & 1)] = r8;
            } else if (i9 == i4 && r8.A02 == i2 && r8.A03 == i3) {
                A05(r8);
                System.arraycopy(r8.A0B, 0, r14.A0B, 0, 4);
                r10[i] = r14;
                if (r8.A02() != null) {
                    this.A00--;
                }
                r8.A03();
            } else {
                int i11 = i4 - i9;
                int i12 = i2 >> i11;
                int i13 = i3 >> i11;
                int i14 = r8.A02;
                int i15 = r8.A03;
                while (true) {
                    if (i12 == i14 && i13 == i15) {
                        break;
                    }
                    i12 >>= 1;
                    i13 >>= 1;
                    i14 >>= 1;
                    i15 >>= 1;
                    i9--;
                }
                C19650vN A002 = C19650vN.A00(-1, -1);
                A002.A02 = i12;
                A002.A03 = i13;
                A002.A04 = i9;
                r10[i] = A002;
                C19650vN[] r4 = A002.A0B;
                int i16 = r8.A02;
                int i17 = r8.A03;
                int i18 = (r8.A04 - i9) - 1;
                r4[(((i16 >> i18) & 1) << 1) + ((i17 >> i18) & 1)] = r8;
                int i19 = r14.A02;
                int i20 = r14.A03;
                int i21 = (r14.A04 - i9) - 1;
                r4[(((i19 >> i21) & 1) << 1) + ((i20 >> i21) & 1)] = r14;
                A04(A002);
            }
        }
        A04(r14);
        A01();
    }

    public final void A04(C19650vN r2) {
        if (r2 != null) {
            A05(r2);
            C19650vN r0 = this.A05;
            r0.A09 = r2;
            r2.A08 = r0;
            this.A05 = r2;
        }
    }

    public final void A05(C19650vN r3) {
        if (r3 == this.A04) {
            this.A04 = r3.A09;
        }
        if (r3 == this.A05) {
            this.A05 = r3.A08;
        }
        C19650vN r1 = r3.A09;
        if (r1 != null) {
            r1.A08 = r3.A08;
        }
        C19650vN r0 = r3.A08;
        if (r0 != null) {
            r0.A09 = r1;
        }
        r3.A09 = null;
        r3.A08 = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(this.A06, 10));
        sb.append("\n");
        return sb.toString();
    }
}
