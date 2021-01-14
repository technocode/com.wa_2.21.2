package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0ge  reason: invalid class name and case insensitive filesystem */
public class C11620ge {
    public static final byte[] A01 = {71, 79, 65};
    public final InputStream A00;

    public C11620ge(InputStream inputStream) {
        this.A00 = inputStream;
    }

    public final byte[] A00(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i > 0) {
            int read = this.A00.read(bArr, i2, i);
            if (read != -1) {
                i2 += read;
                i -= read;
            } else {
                throw new IOException("Closed before read completed!");
            }
        }
        return bArr;
    }
}
