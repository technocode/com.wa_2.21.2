package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: X.1hd  reason: invalid class name and case insensitive filesystem */
public final class C33941hd implements AbstractC225412e {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02 = -1;
    public int A03 = -1;
    public int A04;
    public int A05 = -1;
    public long A06;
    public long A07;
    public C226912u A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public ShortBuffer A0B;
    public boolean A0C;

    @Override // X.AbstractC225412e
    public int A7n() {
        return 2;
    }

    public C33941hd() {
        ByteBuffer byteBuffer = AbstractC225412e.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
        this.A04 = -1;
    }

    @Override // X.AbstractC225412e
    public boolean A2w(int i, int i2, int i3) {
        if (i3 == 2) {
            int i4 = this.A04;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.A05 == i && this.A02 == i2 && this.A03 == i4) {
                return false;
            }
            this.A05 = i;
            this.A02 = i2;
            this.A03 = i4;
            this.A08 = null;
            return true;
        }
        throw new C225312d(i, i2, i3);
    }

    @Override // X.AbstractC225412e
    public ByteBuffer A7l() {
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = AbstractC225412e.A00;
        return byteBuffer;
    }

    @Override // X.AbstractC225412e
    public int A7m() {
        return this.A02;
    }

    @Override // X.AbstractC225412e
    public int A7o() {
        return this.A03;
    }

    @Override // X.AbstractC225412e
    public boolean AAt() {
        int i = this.A05;
        if (i != -1) {
            return Math.abs(this.A01 - 1.0f) >= 0.01f || Math.abs(this.A00 - 1.0f) >= 0.01f || this.A03 != i;
        }
        return false;
    }

    @Override // X.AbstractC225412e
    public boolean AB1() {
        if (!this.A0C) {
            return false;
        }
        C226912u r0 = this.A08;
        return r0 == null || r0.A05 == 0;
    }

    @Override // X.AbstractC225412e
    public void AMG() {
        int i;
        C226912u r8 = this.A08;
        boolean z = false;
        if (r8 != null) {
            z = true;
        }
        C002001d.A3A(z);
        int i2 = r8.A00;
        float f = r8.A0F;
        float f2 = r8.A0D;
        int i3 = r8.A05 + ((int) ((((((float) i2) / (f / f2)) + ((float) r8.A06)) / (r8.A0E * f2)) + 0.5f));
        short[] A042 = r8.A04(r8.A0A, i2, (r8.A0J << 1) + i2);
        r8.A0A = A042;
        int i4 = 0;
        while (true) {
            i = r8.A0J << 1;
            int i5 = r8.A0G;
            if (i4 >= i * i5) {
                break;
            }
            A042[(i5 * i2) + i4] = 0;
            i4++;
        }
        r8.A00 = i + r8.A00;
        r8.A01();
        if (r8.A05 > i3) {
            r8.A05 = i3;
        }
        r8.A00 = 0;
        r8.A09 = 0;
        r8.A06 = 0;
        this.A0C = true;
    }

    @Override // X.AbstractC225412e
    public void AMH(ByteBuffer byteBuffer) {
        boolean z = false;
        if (this.A08 != null) {
            z = true;
        }
        C002001d.A3A(z);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A06 += (long) remaining;
            C226912u r9 = this.A08;
            if (r9 != null) {
                int remaining2 = asShortBuffer.remaining();
                int i = r9.A0G;
                int i2 = remaining2 / i;
                short[] A042 = r9.A04(r9.A0A, r9.A00, i2);
                r9.A0A = A042;
                asShortBuffer.get(A042, r9.A00 * i, ((i * i2) << 1) >> 1);
                r9.A00 += i2;
                r9.A01();
                byteBuffer.position(byteBuffer.position() + remaining);
            } else {
                throw null;
            }
        }
        int i3 = (this.A08.A05 * this.A02) << 1;
        if (i3 > 0) {
            if (this.A09.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.A09 = order;
                this.A0B = order.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            C226912u r6 = this.A08;
            ShortBuffer shortBuffer = this.A0B;
            if (r6 != null) {
                int remaining3 = shortBuffer.remaining();
                int i4 = r6.A0G;
                int min = Math.min(remaining3 / i4, r6.A05);
                shortBuffer.put(r6.A0B, 0, i4 * min);
                int i5 = r6.A05 - min;
                r6.A05 = i5;
                short[] sArr = r6.A0B;
                System.arraycopy(sArr, min * i4, sArr, 0, i5 * i4);
                this.A07 += (long) i3;
                this.A09.limit(i3);
                this.A0A = this.A09;
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC225412e
    public void flush() {
        if (AAt()) {
            C226912u r0 = this.A08;
            if (r0 == null) {
                this.A08 = new C226912u(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                r0.A00 = 0;
                r0.A05 = 0;
                r0.A06 = 0;
                r0.A04 = 0;
                r0.A03 = 0;
                r0.A09 = 0;
                r0.A08 = 0;
                r0.A07 = 0;
                r0.A02 = 0;
                r0.A01 = 0;
            }
        }
        this.A0A = AbstractC225412e.A00;
        this.A06 = 0;
        this.A07 = 0;
        this.A0C = false;
    }

    @Override // X.AbstractC225412e
    public void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        ByteBuffer byteBuffer = AbstractC225412e.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0;
        this.A07 = 0;
        this.A0C = false;
    }
}
