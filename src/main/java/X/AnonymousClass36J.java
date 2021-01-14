package X;

import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

/* renamed from: X.36J  reason: invalid class name */
public final class AnonymousClass36J extends DigestOutputStream {
    public boolean A00;

    public AnonymousClass36J(OutputStream outputStream, MessageDigest messageDigest) {
        super(outputStream, messageDigest);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            super.close();
        }
    }
}
