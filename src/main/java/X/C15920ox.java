package X;

/* renamed from: X.0ox  reason: invalid class name and case insensitive filesystem */
public class C15920ox {
    public long A00 = 0;
    public C15920ox A01;

    public int A00(int i) {
        C15920ox r1 = this.A01;
        if (r1 == null) {
            if (i >= 64) {
                return Long.bitCount(this.A00);
            }
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.A00) + r1.A00(i - 64);
        }
    }

    public void A01() {
        this.A00 = 0;
        C15920ox r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void A02() {
        if (this.A01 == null) {
            this.A01 = new C15920ox();
        }
    }

    public void A03(int i) {
        if (i >= 64) {
            C15920ox r0 = this.A01;
            if (r0 != null) {
                r0.A03(i - 64);
                return;
            }
            return;
        }
        this.A00 &= (1 << i) ^ -1;
    }

    public void A04(int i) {
        if (i >= 64) {
            A02();
            this.A01.A04(i - 64);
            return;
        }
        this.A00 |= 1 << i;
    }

    public void A05(int i, boolean z) {
        if (i >= 64) {
            A02();
            this.A01.A05(i - 64, z);
            return;
        }
        long j = this.A00;
        boolean z2 = false;
        if ((j & Long.MIN_VALUE) != 0) {
            z2 = true;
        }
        long j2 = (1 << i) - 1;
        this.A00 = ((j & (j2 ^ -1)) << 1) | (j & j2);
        if (z) {
            A04(i);
        } else {
            A03(i);
        }
        if (z2 || this.A01 != null) {
            A02();
            this.A01.A05(0, z2);
        }
    }

    public boolean A06(int i) {
        if (i < 64) {
            return (this.A00 & (1 << i)) != 0;
        }
        A02();
        return this.A01.A06(i - 64);
    }

    public boolean A07(int i) {
        if (i >= 64) {
            A02();
            return this.A01.A07(i - 64);
        }
        long j = 1 << i;
        long j2 = this.A00;
        boolean z = false;
        if ((j2 & j) != 0) {
            z = true;
        }
        long j3 = j2 & (j ^ -1);
        this.A00 = j3;
        long j4 = j - 1;
        this.A00 = (j3 & j4) | Long.rotateRight((j4 ^ -1) & j3, 1);
        C15920ox r0 = this.A01;
        if (r0 != null) {
            if (r0.A06(0)) {
                A04(63);
            }
            this.A01.A07(0);
        }
        return z;
    }

    public String toString() {
        C15920ox r0 = this.A01;
        if (r0 == null) {
            return Long.toBinaryString(this.A00);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r0.toString());
        sb.append("xx");
        sb.append(Long.toBinaryString(this.A00));
        return sb.toString();
    }
}
