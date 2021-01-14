package X;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: X.13A  reason: invalid class name */
public final class AnonymousClass13A {
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03 = new byte[65536];
    public final long A04;
    public final AnonymousClass15E A05;
    public final byte[] A06 = new byte[4096];

    public AnonymousClass13A(AnonymousClass15E r2, long j, long j2) {
        this.A05 = r2;
        this.A02 = j;
        this.A04 = j2;
    }

    public final int A00(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    public void A01(int i) {
        int min = Math.min(this.A00, i);
        A02(min);
        while (min < i) {
            if (min != -1) {
                byte[] bArr = this.A06;
                min = A00(bArr, -min, Math.min(i, bArr.length + min), min, false);
            } else {
                return;
            }
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
    }

    public final void A02(int i) {
        int i2 = this.A00 - i;
        this.A00 = i2;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(65536 + i2)];
        }
        System.arraycopy(bArr, i, bArr, 0, i2);
        this.A03 = bArr;
    }

    public void A03(byte[] bArr, int i, int i2) {
        if (A04(i2)) {
            System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        }
    }

    public boolean A04(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i2 > length) {
            this.A03 = Arrays.copyOf(bArr, Math.max(65536 + i2, Math.min(length << 1, i2 + 524288)));
        }
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = i3 - i4;
        while (i5 < i) {
            i5 = A00(this.A03, i4, i, i5, false);
            if (i5 == -1) {
                return false;
            }
            i4 = this.A01;
            this.A00 = i4 + i5;
        }
        this.A01 = i4 + i;
        return true;
    }

    public boolean A05(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.A00;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.A03, 0, bArr, i, i3);
            A02(i3);
        }
        while (i3 < i2) {
            if (i3 == -1) {
                return false;
            }
            i3 = A00(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.A02 += (long) i3;
        }
        if (i3 != -1) {
            return true;
        }
        return false;
    }
}
