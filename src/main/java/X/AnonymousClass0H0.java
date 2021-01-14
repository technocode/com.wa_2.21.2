package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0H0  reason: invalid class name */
public class AnonymousClass0H0 {
    public static volatile AnonymousClass0H0 A02;
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public static AnonymousClass0H0 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0H0.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0H0();
                }
            }
        }
        return A02;
    }
}
