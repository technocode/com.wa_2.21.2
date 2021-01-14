package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: X.0uu  reason: invalid class name and case insensitive filesystem */
public class C19370uu implements Closeable {
    public int A00;
    public int A01;
    public byte[] A02;
    public final InputStream A03;
    public final Charset A04;
    public final /* synthetic */ C19380uv A05;

    public C19370uu(C19380uv r3, InputStream inputStream, Charset charset) {
        this.A05 = r3;
        if (charset == null) {
            throw null;
        } else if (charset.equals(C19380uv.A0F)) {
            this.A03 = inputStream;
            this.A04 = charset;
            this.A02 = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r3[r2] == 13) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19370uu.A00():java.lang.String");
    }

    public final void A01() {
        InputStream inputStream = this.A03;
        byte[] bArr = this.A02;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.A01 = 0;
            this.A00 = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.A03;
        synchronized (inputStream) {
            if (this.A02 != null) {
                this.A02 = null;
                inputStream.close();
            }
        }
    }
}
