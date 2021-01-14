package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1hb  reason: invalid class name and case insensitive filesystem */
public final class C33921hb implements AbstractC225412e {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = -1;
    public ByteBuffer A03;
    public ByteBuffer A04;
    public boolean A05;

    @Override // X.AbstractC225412e
    public int A7n() {
        return 2;
    }

    public C33921hb() {
        ByteBuffer byteBuffer = AbstractC225412e.A00;
        this.A03 = byteBuffer;
        this.A04 = byteBuffer;
    }

    @Override // X.AbstractC225412e
    public boolean A2w(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C225312d(i, i2, i3);
        } else if (this.A02 == i && this.A00 == i2 && this.A01 == i3) {
            return false;
        } else {
            this.A02 = i;
            this.A00 = i2;
            this.A01 = i3;
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
        return this.A02;
    }

    @Override // X.AbstractC225412e
    public boolean AAt() {
        int i = this.A01;
        return (i == 0 || i == 2) ? false : true;
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
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.A01;
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 3) {
                if (i3 == 1073741824) {
                    i = i2 >> 1;
                } else {
                    throw new IllegalStateException();
                }
            }
            i = i2 << 1;
        } else {
            i2 /= 3;
            i = i2 << 1;
        }
        if (this.A03.capacity() < i) {
            this.A03 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        int i4 = this.A01;
        if (i4 == Integer.MIN_VALUE) {
            while (position < limit) {
                this.A03.put(byteBuffer.get(position + 1));
                this.A03.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i4 == 3) {
            while (position < limit) {
                this.A03.put((byte) 0);
                this.A03.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i4 != 1073741824) {
            throw new IllegalStateException();
        } else {
            while (position < limit) {
                this.A03.put(byteBuffer.get(position + 2));
                this.A03.put(byteBuffer.get(position + 3));
                position += 4;
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
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = AbstractC225412e.A00;
    }
}
