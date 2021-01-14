package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1ei  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC32331ei implements AbstractC19670vP {
    public static final C19490v7 A03 = new C19490v7(32);
    public int A00;
    public int A01;
    public final AtomicLong A02 = new AtomicLong(0);

    public AbstractC32331ei(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public static C19680vQ A00(InputStream inputStream, boolean z) {
        C19490v7 r5 = A03;
        C19680vQ r6 = (C19680vQ) r5.A00();
        if (r6 == null) {
            r6 = new C19680vQ(new byte[131072], 0);
        }
        byte[] bArr = r6.A02;
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, i, bArr.length - i);
                if (read == -1) {
                    break;
                }
                i += read;
                int length = bArr.length;
                if (i >= length) {
                    byte[] bArr2 = new byte[(length << 1)];
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    bArr = bArr2;
                }
            } catch (IOException e) {
                if (!z || i == 0) {
                    r5.A02(r6);
                    if (z) {
                        C19550vD.A0P.A01();
                        return null;
                    }
                    throw e;
                }
            }
        }
        if (r6.A02 != bArr) {
            r5.A02(r6);
            return new C19680vQ(bArr, i);
        }
        r6.A00 = i;
        return r6;
    }

    public static void A01(C19680vQ r2) {
        if (r2.A02.length == 131072) {
            r2.A01 = null;
            A03.A02(r2);
        }
    }
}
