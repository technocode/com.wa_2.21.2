package X;

import android.util.Log;

/* renamed from: X.12A  reason: invalid class name */
public final class AnonymousClass12A {
    public long A00;
    public AnonymousClass12A A01;
    public AnonymousClass12B A02;
    public AnonymousClass14A A03;
    public C232414y A04;
    public C232414y A05;
    public boolean A06;
    public boolean A07;
    public final AbstractC34201i4 A08;
    public final AbstractC229313t A09;
    public final AbstractC232314x A0A;
    public final Object A0B;
    public final AnonymousClass25L[] A0C;
    public final AnonymousClass143[] A0D;
    public final boolean[] A0E;

    public AnonymousClass12A(AnonymousClass25L[] r7, long j, AbstractC232314x r10, AnonymousClass15H r11, AbstractC229313t r12, AnonymousClass12B r13) {
        this.A0C = r7;
        long j2 = r13.A02;
        this.A00 = j - j2;
        this.A0A = r10;
        this.A09 = r12;
        C229113r r4 = r13.A03;
        Object obj = r4.A04;
        if (obj != null) {
            this.A0B = obj;
            this.A02 = r13;
            int length = r7.length;
            this.A0D = new AnonymousClass143[length];
            this.A0E = new boolean[length];
            AbstractC34201i4 A3Q = r12.A3Q(r4, r11, j2);
            long j3 = r4.A02;
            this.A08 = j3 != Long.MIN_VALUE ? new AnonymousClass25T(A3Q, j3) : A3Q;
            return;
        }
        throw null;
    }

    public long A00() {
        if (!this.A07) {
            return this.A02.A02;
        }
        if (this.A06) {
            long A51 = this.A08.A51();
            if (A51 != Long.MIN_VALUE) {
                return A51;
            }
        }
        return this.A02.A01;
    }

    public long A01(long j, boolean z, boolean[] zArr) {
        C232414y r2;
        AnonymousClass25L[] r5;
        int length;
        int i = 0;
        while (true) {
            r2 = this.A05;
            boolean z2 = true;
            if (i >= r2.A00) {
                break;
            }
            boolean[] zArr2 = this.A0E;
            if (z || !r2.A00(this.A04, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        AnonymousClass143[] r11 = this.A0D;
        int i2 = 0;
        while (true) {
            r5 = this.A0C;
            length = r5.length;
            if (i2 >= length) {
                break;
            }
            if (r5[i2].A08 == 6) {
                r11[i2] = null;
            }
            i2++;
        }
        A03(r2);
        C232214w r22 = r2.A01;
        long ANZ = this.A08.ANZ(r22.A00(), this.A0E, r11, zArr, j);
        for (int i3 = 0; i3 < length; i3++) {
            if (r5[i3].A08 == 6) {
                boolean z3 = false;
                if (this.A05.A03[i3] != null) {
                    z3 = true;
                }
                if (z3) {
                    r11[i3] = new C34161i0();
                }
            }
        }
        this.A06 = false;
        for (int i4 = 0; i4 < r11.length; i4++) {
            if (r11[i4] != null) {
                boolean z4 = false;
                if (this.A05.A03[i4] != null) {
                    z4 = true;
                }
                C002001d.A3A(z4);
                if (r5[i4].A08 != 6) {
                    this.A06 = true;
                }
            } else {
                boolean z5 = false;
                if (r22.A02[i4] == null) {
                    z5 = true;
                }
                C002001d.A3A(z5);
            }
        }
        return ANZ;
    }

    public void A02() {
        A03(null);
        try {
            if (this.A02.A03.A02 != Long.MIN_VALUE) {
                this.A09.AMU(((AnonymousClass25T) this.A08).A04);
            } else {
                this.A09.AMU(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void A03(C232414y r5) {
        C232414y r3 = this.A04;
        if (r3 != null) {
            for (int i = 0; i < r3.A00; i++) {
            }
        }
        this.A04 = r5;
        if (r5 != null) {
            for (int i2 = 0; i2 < r5.A00; i2++) {
            }
        }
    }

    public boolean A04() {
        if (this.A07) {
            return !this.A06 || this.A08.A51() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: int[][][] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: X.14v[] */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: X.25e */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v64, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v122, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v133, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v142, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r18v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r11v7, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r12v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r15v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v17, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v28, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r3v30, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r25v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v210, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r18v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v32, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r13v19, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r18v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r29v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v44, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v309, resolved type: int[][] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x057b, code lost:
        if (r0 == null) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x06cc, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x06d3, code lost:
        if (r5 == r2) goto L_0x06d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0156, code lost:
        if ((r1 & r30) == 0) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0193, code lost:
        if (r0 == null) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
        // Method dump skipped, instructions count: 1832
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12A.A05():boolean");
    }
}
