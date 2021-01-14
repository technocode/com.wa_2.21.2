package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* renamed from: X.1f5  reason: invalid class name and case insensitive filesystem */
public final class C32521f5 implements AbstractC20050w2 {
    @Override // X.AbstractC20050w2
    public void AMT(Object obj) {
        Closeable closeable = (Closeable) obj;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                try {
                    C19920vp.A00.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException unused) {
                }
            }
        }
    }
}
