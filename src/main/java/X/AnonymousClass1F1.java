package X;

import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;

/* renamed from: X.1F1  reason: invalid class name */
public final class AnonymousClass1F1 implements Closeable {
    public AbstractC011406u A00;
    public final URL A01;
    public volatile InputStream A02;

    public AnonymousClass1F1(URL url) {
        this.A01 = url;
    }

    public static void A00(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C242319n.A00.A00(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C242119k.A00(this.A02);
    }
}
