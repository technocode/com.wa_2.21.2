package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0w5  reason: invalid class name and case insensitive filesystem */
public class C20080w5 extends FilterInputStream {
    public int A00;
    public int A01;

    public C20080w5(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= 0) {
            this.A00 = i;
            this.A01 = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.A00);
    }

    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.A01 = this.A00;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.A00--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.A00 -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.A01 != -1) {
            ((FilterInputStream) this).in.reset();
            this.A00 = this.A01;
        } else {
            throw new IOException("mark not set");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, (long) this.A00));
        this.A00 = (int) (((long) this.A00) - skip);
        return skip;
    }
}
