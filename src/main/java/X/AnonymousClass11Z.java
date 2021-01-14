package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.11Z  reason: invalid class name */
public final class AnonymousClass11Z implements Closeable {
    public final AnonymousClass11X A00;
    public final InputStream A01;

    public AnonymousClass11Z(AnonymousClass11X r1, InputStream inputStream) {
        this.A00 = r1;
        this.A01 = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.close();
    }
}
