package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1hZ  reason: invalid class name and case insensitive filesystem */
public final class C33901hZ implements AbstractC225412e {
    public static final int A06 = Float.floatToIntBits(Float.NaN);
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public ByteBuffer A03;
    public ByteBuffer A04;
    public boolean A05;

    @Override // X.AbstractC225412e
    public int A7n() {
        return 4;
    }

    public C33901hZ() {
        ByteBuffer byteBuffer = AbstractC225412e.A00;
        this.A03 = byteBuffer;
        this.A04 = byteBuffer;
    }

    @Override // X.AbstractC225412e
    public boolean A2w(int i, int i2, int i3) {
        if (i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C225312d(i, i2, i3);
        } else if (this.A01 == i && this.A00 == i2 && this.A02 == i3) {
            return false;
        } else {
            this.A01 = i;
            this.A00 = i2;
            this.A02 = i3;
            return true;
        }
    }

    @Override // X.AbstractC225412e
    public ByteBuffer A7l() {
        ByteBuffer byteBuffer = this.A04;
        this.A04 = AbstractC225412e.A00;
        return byteBuffer;
    }

    @Override // X.AbstractC225412e
    public int A7m() {
        return this.A00;
    }

    @Override // X.AbstractC225412e
    public int A7o() {
        return this.A01;
    }

    @Override // X.AbstractC225412e
    public boolean AAt() {
        int i = this.A02;
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    @Override // X.AbstractC225412e
    public boolean AB1() {
        return this.A05 && this.A04 == AbstractC225412e.A00;
    }

    @Override // X.AbstractC225412e
    public void AMG() {
        this.A05 = true;
    }

    @Override // X.AbstractC225412e
    public void AMH(ByteBuffer byteBuffer) {
        boolean z = false;
        if (this.A02 == 1073741824) {
            z = true;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) << 2;
        }
        if (this.A03.capacity() < i) {
            this.A03 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        if (z) {
            while (position < limit) {
                ByteBuffer byteBuffer2 = this.A03;
                int floatToIntBits = Float.floatToIntBits((float) (((double) ((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits == A06) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(floatToIntBits);
                position += 4;
            }
        } else {
            while (position < limit) {
                ByteBuffer byteBuffer3 = this.A03;
                int floatToIntBits2 = Float.floatToIntBits((float) (((double) (((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits2 == A06) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBuffer3.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // X.AbstractC225412e
    public void flush() {
        this.A04 = AbstractC225412e.A00;
        this.A05 = false;
    }

    @Override // X.AbstractC225412e
    public void reset() {
        flush();
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = 0;
        this.A03 = AbstractC225412e.A00;
    }
}
