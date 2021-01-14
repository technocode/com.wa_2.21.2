package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: X.35K  reason: invalid class name */
public class AnonymousClass35K extends InputStream {
    public long A00;
    public final long A01;
    public final InputStream A02;

    public AnonymousClass35K(InputStream inputStream, long j) {
        StringBuilder sb = new StringBuilder("bounded-input-stream/construct/");
        sb.append(j);
        Log.i(sb.toString());
        TextUtils.join(", ", Thread.currentThread().getStackTrace());
        this.A02 = inputStream;
        this.A01 = j;
    }

    @Override // java.io.InputStream
    public int available() {
        long j = this.A00;
        long j2 = this.A01;
        if (j < j2) {
            return this.A02.available();
        }
        Log.i(String.format(Locale.ENGLISH, "bounded-input-stream/available size-limit:%d already-read:%d, returning 0", Long.valueOf(j2), Long.valueOf(j)));
        return 0;
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
        long j = this.A00;
        long j2 = this.A01;
        if (j >= j2) {
            Log.i(String.format(Locale.ENGLISH, "bounded-input-stream/read size-limit:%d already-read:%d, returning -1", Long.valueOf(j2), Long.valueOf(j)));
            return -1;
        }
        int read = this.A02.read();
        if (read >= 0) {
            this.A00++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        long j = this.A00;
        long j2 = this.A01;
        if (((long) i2) + j > j2) {
            Log.i(String.format(Locale.ENGLISH, "bounded-input-stream/read/bytes-truncated-from-%d-to-%d", Integer.valueOf(i2), Long.valueOf(j2 - j)));
            i2 = (int) (j2 - this.A00);
        }
        if (i2 <= 0) {
            return -1;
        }
        int read = this.A02.read(bArr, i, i2);
        if (read > 0) {
            this.A00 += (long) read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.A02.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long j2 = this.A00;
        long j3 = this.A01;
        if (j2 + j > j3) {
            Log.i(String.format(Locale.ENGLISH, "bounded-input-stream/skip/bytes-truncated-from-%d-to-%d", Long.valueOf(j), Long.valueOf(j3 - j2)));
            j = Math.max(j3 - this.A00, 0L);
        }
        return super.skip(j);
    }
}
