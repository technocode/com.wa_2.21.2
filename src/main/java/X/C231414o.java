package X;

/* renamed from: X.14o  reason: invalid class name and case insensitive filesystem */
public final class C231414o implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C231614q A06;

    public C231414o(AnonymousClass126 r4, C231614q r5, int i) {
        this.A06 = r5;
        int i2 = 0;
        this.A05 = AnonymousClass25d.A01(i, false) ? 1 : 0;
        this.A03 = AnonymousClass25d.A03(r4, r5.A0A) ? 1 : 0;
        this.A02 = (r4.A0D & 1) != 0 ? 1 : i2;
        this.A01 = r4.A05;
        this.A04 = r4.A0C;
        this.A00 = r4.A04;
    }

    /* renamed from: A00 */
    public int compareTo(C231414o r6) {
        int i;
        int i2;
        int i3;
        int i4 = this.A05;
        int i5 = r6.A05;
        if (i4 == i5) {
            int i6 = this.A03;
            int i7 = r6.A03;
            if (i6 == i7) {
                int i8 = this.A02;
                int i9 = r6.A02;
                if (i8 != i9) {
                    if (i8 > i9) {
                        return 1;
                    }
                    return i9 > i8 ? -1 : 0;
                } else if (this.A06.A0H) {
                    int i10 = r6.A00;
                    int i11 = this.A00;
                    if (i10 > i11) {
                        return 1;
                    }
                    return i11 > i10 ? -1 : 0;
                } else {
                    int i12 = 1;
                    if (i4 != 1) {
                        i12 = -1;
                    }
                    int i13 = this.A01;
                    int i14 = r6.A01;
                    if (i13 != i14) {
                        if (i13 > i14) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                            if (i14 > i13) {
                                i3 = -1;
                            }
                        }
                        return i3 * i12;
                    }
                    int i15 = this.A04;
                    int i16 = r6.A04;
                    if (i15 != i16) {
                        if (i15 > i16) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                            if (i16 > i15) {
                                i2 = -1;
                            }
                        }
                        return i2 * i12;
                    }
                    int i17 = this.A00;
                    int i18 = r6.A00;
                    if (i17 > i18) {
                        i = 1;
                    } else {
                        i = 0;
                        if (i18 > i17) {
                            i = -1;
                        }
                    }
                    return i * i12;
                }
            } else if (i6 > i7) {
                return 1;
            } else {
                return i7 > i6 ? -1 : 0;
            }
        } else if (i4 > i5) {
            return 1;
        } else {
            return i5 > i4 ? -1 : 0;
        }
    }
}
