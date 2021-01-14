package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.0us  reason: invalid class name and case insensitive filesystem */
public final class C19350us implements Closeable {
    public final InputStream[] A00;
    public final /* synthetic */ C19380uv A01;

    public C19350us(C19380uv r1, InputStream[] inputStreamArr) {
        this.A01 = r1;
        this.A00 = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (InputStream inputStream : this.A00) {
            C19380uv.A01(inputStream);
        }
    }
}
