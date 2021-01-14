package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.19l  reason: invalid class name */
public final class AnonymousClass19l extends FilterInputStream {
    public long A00;
    public long A01 = -1;

    public AnonymousClass19l(InputStream inputStream) {
        super(inputStream);
        if (inputStream != null) {
            this.A00 = 1048576;
            return;
        }
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min((long) ((FilterInputStream) this).in.available(), this.A00);
    }

    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.A01 = this.A00;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
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
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.A00 -= (long) read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.A01 != -1) {
            ((FilterInputStream) this).in.reset();
            this.A00 = this.A01;
        } else {
            throw new IOException("Mark not set");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.A00));
        this.A00 -= skip;
        return skip;
    }
}
