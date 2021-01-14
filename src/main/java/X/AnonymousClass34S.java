package X;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.34S  reason: invalid class name */
public class AnonymousClass34S extends InputStream {
    public final /* synthetic */ RandomAccessFile A00;

    public AnonymousClass34S(RandomAccessFile randomAccessFile) {
        this.A00 = randomAccessFile;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.A00.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.A00.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }
}
