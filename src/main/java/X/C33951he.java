package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1he  reason: invalid class name and case insensitive filesystem */
public final class C33951he implements AbstractC225412e {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;
    public int A06;
    public long A07;
    public ByteBuffer A08;
    public ByteBuffer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public byte[] A0D = AnonymousClass0W2.A05;

    @Override // X.AbstractC225412e
    public int A7n() {
        return 2;
    }

    public C33951he() {
        ByteBuffer byteBuffer = AbstractC225412e.A00;
        this.A08 = byteBuffer;
        this.A09 = byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r3 != 0) goto L_0x0031;
     */
    @Override // X.AbstractC225412e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2w(int r6, int r7, int r8) {
        /*
            r5 = this;
            r4 = 2
            if (r8 != r4) goto L_0x003a
            int r1 = r5.A02
            if (r1 <= 0) goto L_0x0010
            long r2 = r5.A07
            int r0 = r5.A00
            int r1 = r1 / r0
            long r0 = (long) r1
            long r2 = r2 + r0
            r5.A07 = r2
        L_0x0010:
            r5.A01 = r7
            r5.A04 = r6
            int r1 = X.AnonymousClass0W2.A00(r4, r7)
            r5.A00 = r1
            int r3 = r5.A05
            int r0 = r3 * r1
            byte[] r0 = new byte[r0]
            r5.A0D = r0
            r2 = 0
            r5.A02 = r2
            int r0 = r5.A06
            int r1 = r1 * r0
            r5.A03 = r1
            boolean r1 = r5.A0B
            if (r0 != 0) goto L_0x0031
            r0 = 0
            if (r3 == 0) goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            r5.A0B = r0
            r5.A0C = r2
            if (r1 == r0) goto L_0x0039
            r2 = 1
        L_0x0039:
            return r2
        L_0x003a:
            X.12d r0 = new X.12d
            r0.<init>(r6, r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33951he.A2w(int, int, int):boolean");
    }

    @Override // X.AbstractC225412e
    public ByteBuffer A7l() {
        ByteBuffer byteBuffer = this.A09;
        if (this.A0A && this.A02 > 0 && byteBuffer == AbstractC225412e.A00) {
            int capacity = this.A08.capacity();
            int i = this.A02;
            if (capacity < i) {
                this.A08 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.A08.clear();
            }
            this.A08.put(this.A0D, 0, this.A02);
            this.A02 = 0;
            this.A08.flip();
            byteBuffer = this.A08;
        }
        this.A09 = AbstractC225412e.A00;
        return byteBuffer;
    }

    @Override // X.AbstractC225412e
    public int A7m() {
        return this.A01;
    }

    @Override // X.AbstractC225412e
    public int A7o() {
        return this.A04;
    }

    @Override // X.AbstractC225412e
    public boolean AAt() {
        return this.A0B;
    }

    @Override // X.AbstractC225412e
    public boolean AB1() {
        return this.A0A && this.A02 == 0 && this.A09 == AbstractC225412e.A00;
    }

    @Override // X.AbstractC225412e
    public void AMG() {
        this.A0A = true;
    }

    @Override // X.AbstractC225412e
    public void AMH(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            this.A0C = true;
            int i2 = this.A03;
            int min = Math.min(i, i2);
            this.A07 += (long) (min / this.A00);
            this.A03 = i2 - min;
            byteBuffer.position(position + min);
            if (this.A03 <= 0) {
                int i3 = i - min;
                int length = (this.A02 + i3) - this.A0D.length;
                if (this.A08.capacity() < length) {
                    this.A08 = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
                } else {
                    this.A08.clear();
                }
                int max = Math.max(0, Math.min(length, this.A02));
                this.A08.put(this.A0D, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i3));
                byteBuffer.limit(byteBuffer.position() + max2);
                this.A08.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - max2;
                int i5 = this.A02 - max;
                this.A02 = i5;
                byte[] bArr = this.A0D;
                System.arraycopy(bArr, max, bArr, 0, i5);
                byteBuffer.get(this.A0D, this.A02, i4);
                this.A02 += i4;
                this.A08.flip();
                this.A09 = this.A08;
            }
        }
    }

    @Override // X.AbstractC225412e
    public void flush() {
        this.A09 = AbstractC225412e.A00;
        this.A0A = false;
        if (this.A0C) {
            this.A03 = 0;
        }
        this.A02 = 0;
    }

    @Override // X.AbstractC225412e
    public void reset() {
        flush();
        this.A08 = AbstractC225412e.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A0D = AnonymousClass0W2.A05;
    }
}
