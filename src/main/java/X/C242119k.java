package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.19k  reason: invalid class name and case insensitive filesystem */
public final class C242119k {
    public static final Logger A00 = Logger.getLogger(C242119k.class.getName());

    public static void A00(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
