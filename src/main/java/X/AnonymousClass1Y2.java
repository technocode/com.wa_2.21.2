package X;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

/* renamed from: X.1Y2  reason: invalid class name */
public class AnonymousClass1Y2 extends CipherInputStream {
    public final AtomicLong A00;

    public AnonymousClass1Y2(InputStream inputStream, Cipher cipher, AtomicLong atomicLong) {
        super(inputStream, cipher);
        this.A00 = atomicLong;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = super.read();
        if (read >= 0) {
            this.A00.incrementAndGet();
        }
        return read;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.A00.addAndGet((long) read);
        }
        return read;
    }
}
