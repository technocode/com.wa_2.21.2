package X;

import java.io.InputStream;

/* renamed from: X.1Qb  reason: invalid class name and case insensitive filesystem */
public class C27451Qb extends InputStream {
    public final int A00;
    public final AnonymousClass0CL A01;
    public final InputStream A02;

    public C27451Qb(InputStream inputStream, int i, AnonymousClass0CL r3) {
        this.A02 = inputStream;
        this.A00 = i;
        this.A01 = r3;
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
        this.A02.mark(i);
    }

    public boolean markSupported() {
        return this.A02.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.A02.read();
        if (read >= 0) {
            this.A01.A04(1, this.A00);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int read = this.A02.read(bArr);
        if (read > 0) {
            this.A01.A04(read, this.A00);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.A02.read(bArr, i, i2);
        if (read > 0) {
            this.A01.A04(read, this.A00);
        }
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.A02.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long skip = this.A02.skip(j);
        this.A01.A06(skip, this.A00);
        return skip;
    }
}
