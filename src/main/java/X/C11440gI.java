package X;

import com.whatsapp.util.Log;
import java.io.InputStream;

/* renamed from: X.0gI  reason: invalid class name and case insensitive filesystem */
public class C11440gI extends InputStream {
    public final int A00;
    public final AnonymousClass0CL A01;
    public final InputStream A02;

    public C11440gI(InputStream inputStream, AnonymousClass0CL r2, int i) {
        this.A02 = inputStream;
        this.A01 = r2;
        this.A00 = i;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.A02.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.A02.close();
    }

    public void mark(int i) {
        Log.w("mark called in MessageInputStream");
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.A02.read();
        if (read != -1) {
            this.A01.A03(1, this.A00);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int read = this.A02.read(bArr);
        if (read > 0) {
            this.A01.A03(read, this.A00);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.A02.read(bArr, i, i2);
        if (read > 0) {
            this.A01.A03(read, this.A00);
        }
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        Log.w("reset called in MessageInputStream");
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long skip = this.A02.skip(j);
        this.A01.A05(skip, this.A00);
        return skip;
    }
}
