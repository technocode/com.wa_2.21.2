package X;

import java.io.Closeable;

/* renamed from: X.11b  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC223411b implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this instanceof C33751hI) {
            ((C33751hI) this).A02.close();
        }
    }
}
