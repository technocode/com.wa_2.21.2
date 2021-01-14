package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0O5  reason: invalid class name */
public class AnonymousClass0O5 {
    public final HashMap A00 = new HashMap();

    public final void A00() {
        HashMap hashMap = this.A00;
        for (AnonymousClass0SD r4 : hashMap.values()) {
            r4.A01 = true;
            Map map = r4.A00;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : map.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            r4.A00();
        }
        hashMap.clear();
    }
}
