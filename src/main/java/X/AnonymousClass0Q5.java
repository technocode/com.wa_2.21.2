package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0Q5  reason: invalid class name */
public class AnonymousClass0Q5 extends ByteArrayOutputStream {
    public final ByteBuffer A00() {
        ByteBuffer wrap = ByteBuffer.wrap(((ByteArrayOutputStream) this).buf, 0, size());
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.asReadOnlyBuffer();
    }

    public final byte[] A01() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
