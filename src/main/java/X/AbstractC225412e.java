package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.12e  reason: invalid class name and case insensitive filesystem */
public interface AbstractC225412e {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A2w(int i, int i2, int i3);

    ByteBuffer A7l();

    int A7m();

    int A7n();

    int A7o();

    boolean AAt();

    boolean AB1();

    void AMG();

    void AMH(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
