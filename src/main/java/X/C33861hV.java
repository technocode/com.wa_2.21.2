package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: X.1hV  reason: invalid class name and case insensitive filesystem */
public final class C33861hV implements AbstractC225412e {
    public int A00 = -1;
    public int A01 = -1;
    public ByteBuffer A02;
    public ByteBuffer A03;
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;

    @Override // X.AbstractC225412e
    public int A7n() {
        return 2;
    }

    public C33861hV() {
        ByteBuffer byteBuffer = AbstractC225412e.A00;
        this.A02 = byteBuffer;
        this.A03 = byteBuffer;
    }

    @Override // X.AbstractC225412e
    public boolean A2w(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.A07, this.A06);
        int[] iArr = this.A07;
        this.A06 = iArr;
        if (iArr == null) {
            this.A04 = false;
            return z;
        } else if (i3 != 2) {
            throw new C225312d(i, i2, i3);
        } else if (!z && this.A01 == i && this.A00 == i2) {
            return false;
        } else {
            this.A01 = i;
            this.A00 = i2;
            int length = iArr.length;
            boolean z2 = false;
            if (i2 != length) {
                z2 = true;
            }
            this.A04 = z2;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = iArr[i4];
                if (i5 < i2) {
                    boolean z3 = false;
                    if (i5 != i4) {
                        z3 = true;
                    }
                    boolean z4 = z3 | z2;
                    this.A04 = z4;
                    z2 = z4;
                } else {
                    throw new C225312d(i, i2, i3);
                }
            }
            return true;
        }
    }

    @Override // X.AbstractC225412e
    public ByteBuffer A7l() {
        ByteBuffer byteBuffer = this.A03;
        this.A03 = AbstractC225412e.A00;
        return byteBuffer;
    }

    @Override // X.AbstractC225412e
    public int A7m() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // X.AbstractC225412e
    public int A7o() {
        return this.A01;
    }

    @Override // X.AbstractC225412e
    public boolean AAt() {
        return this.A04;
    }

    @Override // X.AbstractC225412e
    public boolean AB1() {
        return this.A05 && this.A03 == AbstractC225412e.A00;
    }

    @Override // X.AbstractC225412e
    public void AMG() {
        this.A05 = true;
    }

    @Override // X.AbstractC225412e
    public void AMH(ByteBuffer byteBuffer) {
        boolean z = false;
        if (this.A06 != null) {
            z = true;
        }
        C002001d.A3A(z);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.A00 << 1)) * this.A06.length) << 1;
        if (this.A02.capacity() < length) {
            this.A02 = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (position < limit) {
            for (int i : this.A06) {
                this.A02.putShort(byteBuffer.getShort((i << 1) + position));
            }
            position += this.A00 << 1;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // X.AbstractC225412e
    public void flush() {
        this.A03 = AbstractC225412e.A00;
        this.A05 = false;
    }

    @Override // X.AbstractC225412e
    public void reset() {
        flush();
        this.A02 = AbstractC225412e.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
