package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.2Dj  reason: invalid class name */
public final class AnonymousClass2Dj implements Closeable {
    public final InputStream[] A00;
    public final /* synthetic */ AnonymousClass2Dk A01;

    public AnonymousClass2Dj(AnonymousClass2Dk r1, InputStream[] inputStreamArr) {
        this.A01 = r1;
        this.A00 = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (InputStream inputStream : this.A00) {
            AnonymousClass2Dk.A03(inputStream);
        }
    }
}
