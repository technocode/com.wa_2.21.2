package X;

import java.nio.ByteBuffer;

/* renamed from: X.1hf  reason: invalid class name and case insensitive filesystem */
public class C33961hf extends AbstractC227012v {
    public long A00;
    public ByteBuffer A01;
    public final int A02;
    public final C227212x A03 = new C227212x();

    public C33961hf(int i) {
        this.A02 = i;
    }

    public final ByteBuffer A02(int i) {
        int capacity;
        int i2 = this.A02;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        StringBuilder sb = new StringBuilder("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public void A03() {
        super.A00 = 0;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public void A04(int i) {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            this.A01 = A02(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.A01.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer A022 = A02(i2);
            if (position > 0) {
                this.A01.position(0);
                this.A01.limit(position);
                A022.put(this.A01);
            }
            this.A01 = A022;
        }
    }
}
