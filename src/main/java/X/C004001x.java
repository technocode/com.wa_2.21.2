package X;

import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: X.01x  reason: invalid class name and case insensitive filesystem */
public final class C004001x extends PrintStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
    }

    public C004001x(OutputStream outputStream) {
        super(outputStream);
    }
}
