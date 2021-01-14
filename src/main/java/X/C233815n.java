package X;

import java.nio.charset.Charset;

/* renamed from: X.15n  reason: invalid class name and case insensitive filesystem */
public final class C233815n {
    public int A00;
    public int A01;
    public byte[] A02;

    public C233815n() {
        this.A02 = AnonymousClass0W2.A05;
    }

    public C233815n(int i) {
        this.A02 = new byte[i];
        this.A00 = i;
    }

    public C233815n(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }

    public C233815n(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
    }

    public int A00() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        this.A01 = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public int A01() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public int A02() {
        int A002 = A00();
        if (A002 >= 0) {
            return A002;
        }
        throw new IllegalStateException(AnonymousClass008.A0F("Top bit not zero: ", A002));
    }

    public int A03() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public long A04() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = i4 + 1;
        this.A01 = i5;
        int i6 = i5 + 1;
        this.A01 = i6;
        int i7 = i6 + 1;
        this.A01 = i7;
        int i8 = i7 + 1;
        this.A01 = i8;
        this.A01 = i8 + 1;
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    public long A05() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        this.A01 = i4 + 1;
        return (((long) bArr[i4]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
    }

    public long A06() {
        long A04 = A04();
        if (A04 >= 0) {
            return A04;
        }
        throw new IllegalStateException(AnonymousClass008.A0I("Top bit not zero: ", A04));
    }

    public String A07() {
        int i = this.A00;
        int i2 = this.A01;
        if (i - i2 == 0) {
            return null;
        }
        int i3 = i2;
        while (i3 < i) {
            byte b = this.A02[i3];
            if (b == 10 || b == 13) {
                break;
            }
            i3++;
        }
        if (i3 - i2 >= 3) {
            byte[] bArr = this.A02;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.A01 = i2;
            }
        }
        String str = new String(this.A02, i2, i3 - i2, Charset.forName("UTF-8"));
        this.A01 = i3;
        int i4 = this.A00;
        if (i3 == i4) {
            return str;
        }
        byte[] bArr2 = this.A02;
        if (bArr2[i3] == 13) {
            i3++;
            this.A01 = i3;
            if (i3 == i4) {
                return str;
            }
        }
        if (bArr2[i3] == 10) {
            this.A01 = i3 + 1;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r5.A02[r1] != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A08(int r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0005
            java.lang.String r0 = ""
            return r0
        L_0x0005:
            int r4 = r5.A01
            int r0 = r4 + r6
            int r1 = r0 + -1
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x0017
            byte[] r0 = r5.A02
            byte r0 = r0[r1]
            int r3 = r6 + -1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r6
        L_0x0018:
            byte[] r2 = r5.A02
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r4, r3, r0)
            int r0 = r5.A01
            int r0 = r0 + r6
            r5.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233815n.A08(int):java.lang.String");
    }

    public String A09(int i, Charset charset) {
        String str = new String(this.A02, this.A01, i, charset);
        this.A01 += i;
        return str;
    }

    public void A0A(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 > r2.A00) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0007
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            X.C002001d.A39(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233815n.A0B(int):void");
    }

    public void A0C(int i) {
        A0B(this.A01 + i);
    }
}
