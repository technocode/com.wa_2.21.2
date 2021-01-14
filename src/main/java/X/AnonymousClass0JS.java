package X;

import java.util.HashMap;

/* renamed from: X.0JS  reason: invalid class name */
public class AnonymousClass0JS {
    public static volatile AnonymousClass0JS A01;
    public final HashMap A00 = new HashMap();

    public static AnonymousClass0JS A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0JS.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0JS();
                }
            }
        }
        return A01;
    }
}
