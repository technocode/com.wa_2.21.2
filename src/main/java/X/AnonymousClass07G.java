package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.07G  reason: invalid class name */
public final class AnonymousClass07G {
    public static final Charset A00 = Charset.forName("UTF-8");
    public static final byte[] A01;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        A01 = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = A01;
        int length = bArr2.length;
        try {
            new C05010Mt(bArr2, 0, length, false).A04(length);
        } catch (C04190Jk e) {
            throw new IllegalArgumentException(e);
        }
    }
}
