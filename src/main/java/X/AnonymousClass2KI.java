package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;

/* renamed from: X.2KI  reason: invalid class name */
public class AnonymousClass2KI extends InputStream {
    public ByteArrayInputStream A00;
    public boolean A01;
    public final InputStream A02;
    public final Cipher A03;
    public final Mac A04;

    public AnonymousClass2KI(InputStream inputStream, AnonymousClass2KK r5) {
        this.A02 = inputStream;
        byte[] bArr = r5.A01;
        this.A03 = C28051Sr.A1D(bArr, r5.A00, 1);
        this.A04 = C28051Sr.A1E(bArr, r5.A02);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        while (true) {
            int read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
            if (read != 0) {
                return bArr[0];
            }
            Thread.yield();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        ByteArrayInputStream byteArrayInputStream = this.A00;
        if (byteArrayInputStream != null) {
            int read = byteArrayInputStream.read(bArr, i, i2);
            if (read > 0) {
                return read;
            }
            this.A00 = null;
            if (this.A01) {
                return -1;
            }
        }
        int read2 = this.A02.read(bArr, i, i2);
        if (read2 == -1) {
            ByteBuffer allocate = ByteBuffer.allocate(42);
            try {
                byte[] doFinal = this.A03.doFinal();
                allocate.put(doFinal);
                allocate.put(C05360Of.A07(this.A04.doFinal(doFinal), 10));
                allocate.flip();
                byte[] bArr2 = new byte[allocate.remaining()];
                allocate.get(bArr2);
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
                this.A00 = byteArrayInputStream2;
                this.A01 = true;
                return byteArrayInputStream2.read(bArr, i, i2);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new AssertionError(e);
            }
        } else if (read2 <= 0) {
            return read2;
        } else {
            byte[] update = this.A03.update(bArr, i, read2);
            if (update == null) {
                return 0;
            }
            this.A04.update(update);
            int length = update.length;
            if (length <= i2) {
                System.arraycopy(update, 0, bArr, i, length);
                return length;
            }
            System.arraycopy(update, 0, bArr, i, i2);
            this.A00 = new ByteArrayInputStream(update, i2, length - i2);
            return i2;
        }
    }
}
