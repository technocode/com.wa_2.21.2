package X;

/* renamed from: X.1i5  reason: invalid class name and case insensitive filesystem */
public class C34211i5 implements AnonymousClass13K {
    public long A00;
    public AnonymousClass126 A01;
    public AnonymousClass126 A02;
    public AnonymousClass141 A03;
    public AnonymousClass141 A04;
    public AnonymousClass141 A05;
    public AnonymousClass142 A06;
    public final int A07;
    public final C229913z A08 = new C229913z();
    public final AnonymousClass140 A09 = new AnonymousClass140();
    public final AnonymousClass15H A0A;
    public final C233815n A0B = new C233815n(32);

    public C34211i5(AnonymousClass15H r5) {
        this.A0A = r5;
        int i = r5.A04;
        this.A07 = i;
        AnonymousClass141 r0 = new AnonymousClass141(0, i);
        this.A03 = r0;
        this.A04 = r0;
        this.A05 = r0;
    }

    public final int A00(int i) {
        AnonymousClass158 r5;
        AnonymousClass141 r7 = this.A05;
        AnonymousClass141 r4 = r7;
        if (!r7.A02) {
            AnonymousClass15H r3 = this.A0A;
            synchronized (r3) {
                r3.A00++;
                int i2 = r3.A01;
                if (i2 > 0) {
                    AnonymousClass158[] r2 = r3.A03;
                    int i3 = i2 - 1;
                    r3.A01 = i3;
                    r5 = r2[i3];
                    r2[i3] = null;
                } else {
                    r5 = new AnonymousClass158(new byte[r3.A04]);
                }
            }
            r4 = this.A05;
            AnonymousClass141 r0 = new AnonymousClass141(r4.A03, this.A07);
            r7.A01 = r5;
            r7.A00 = r0;
            r7.A02 = true;
        }
        return Math.min(i, (int) (r4.A03 - this.A00));
    }

    public int A01(long j, boolean z) {
        AnonymousClass140 r4 = this.A09;
        synchronized (r4) {
            int i = r4.A04 + r4.A03;
            int i2 = r4.A01;
            if (i >= i2) {
                i -= i2;
            }
            if (r4.A01()) {
                long[] jArr = r4.A0F;
                if (j >= jArr[i] && (j <= r4.A06 || z)) {
                    int i3 = r4.A02;
                    int i4 = r4.A03;
                    int i5 = i3 - i4;
                    int i6 = -1;
                    for (int i7 = 0; i7 < i5 && jArr[i] <= j; i7++) {
                        if ((r4.A0B[i] & 1) != 0) {
                            i6 = i7;
                        }
                        i++;
                        if (i == r4.A01) {
                            i = 0;
                        }
                    }
                    if (i6 == -1) {
                        return -1;
                    }
                    r4.A03 = i4 + i6;
                    return i6;
                }
            }
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r6 == 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.AnonymousClass13A r14, int r15) {
        /*
            r13 = this;
            int r10 = r13.A00(r15)
            X.141 r1 = r13.A05
            X.158 r0 = r1.A01
            byte[] r8 = r0.A00
            long r2 = r13.A00
            long r0 = r1.A04
            long r2 = r2 - r0
            int r9 = (int) r2
            r11 = 0
            int r9 = r9 + r11
            r7 = r14
            int r0 = r14.A00
            if (r0 == 0) goto L_0x0025
            int r6 = java.lang.Math.min(r0, r10)
            byte[] r0 = r14.A03
            java.lang.System.arraycopy(r0, r11, r8, r9, r6)
            r14.A02(r6)
            if (r6 != 0) goto L_0x002a
        L_0x0025:
            r12 = 1
            int r6 = r7.A00(r8, r9, r10, r11, r12)
        L_0x002a:
            r0 = -1
            if (r6 == r0) goto L_0x0033
            long r2 = r14.A02
            long r0 = (long) r6
            long r2 = r2 + r0
            r14.A02 = r2
        L_0x0033:
            r0 = -1
            if (r6 != r0) goto L_0x003c
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x003c:
            long r4 = r13.A00
            long r0 = (long) r6
            long r4 = r4 + r0
            r13.A00 = r4
            X.141 r3 = r13.A05
            long r1 = r3.A03
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            X.141 r0 = r3.A00
            r13.A05 = r0
        L_0x004e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34211i5.A02(X.13A, int):int");
    }

    public long A03() {
        long j;
        AnonymousClass140 r2 = this.A09;
        synchronized (r2) {
            j = r2.A06;
        }
        return j;
    }

    public void A04() {
        long j;
        AnonymousClass140 r2 = this.A09;
        synchronized (r2) {
            int i = r2.A02;
            if (i == 0) {
                j = -1;
            } else {
                j = r2.A00(i);
            }
        }
        A06(j);
    }

    public void A05() {
        AnonymousClass140 r2 = this.A09;
        int i = 0;
        r2.A02 = 0;
        r2.A00 = 0;
        r2.A04 = 0;
        r2.A03 = 0;
        r2.A0A = true;
        r2.A05 = Long.MIN_VALUE;
        r2.A06 = Long.MIN_VALUE;
        r2.A08 = false;
        AnonymousClass141 r6 = this.A03;
        if (r6.A02) {
            AnonymousClass141 r0 = this.A05;
            int i2 = (((int) (r0.A04 - r6.A04)) / this.A07) + (r0.A02 ? 1 : 0);
            AnonymousClass158[] r1 = new AnonymousClass158[i2];
            while (i < i2) {
                r1[i] = r6.A01;
                r6.A01 = null;
                AnonymousClass141 r02 = r6.A00;
                r6.A00 = null;
                i++;
                r6 = r02;
            }
            this.A0A.A02(r1);
        }
        AnonymousClass141 r03 = new AnonymousClass141(0, this.A07);
        this.A03 = r03;
        this.A04 = r03;
        this.A05 = r03;
        this.A00 = 0;
        this.A0A.A00();
    }

    public final void A06(long j) {
        if (j != -1) {
            while (true) {
                AnonymousClass141 r5 = this.A03;
                if (j >= r5.A03) {
                    AnonymousClass15H r3 = this.A0A;
                    AnonymousClass158 r2 = r5.A01;
                    synchronized (r3) {
                        AnonymousClass158[] r1 = r3.A06;
                        r1[0] = r2;
                        r3.A02(r1);
                    }
                    AnonymousClass141 r22 = this.A03;
                    r22.A01 = null;
                    AnonymousClass141 r0 = r22.A00;
                    r22.A00 = null;
                    this.A03 = r0;
                } else if (this.A04.A04 < r5.A04) {
                    this.A04 = r5;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void A07(long j, byte[] bArr, int i) {
        AnonymousClass141 r3;
        while (true) {
            r3 = this.A04;
            if (j < r3.A03) {
                break;
            }
            this.A04 = r3.A00;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (r3.A03 - j));
            System.arraycopy(r3.A01.A00, ((int) (j - r3.A04)) + 0, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            r3 = this.A04;
            if (j == r3.A03) {
                r3 = r3.A00;
                this.A04 = r3;
            }
        }
    }
}
