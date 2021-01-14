package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0P1  reason: invalid class name */
public class AnonymousClass0P1 {
    public static volatile AnonymousClass0P1 A01;
    public final Set A00 = new HashSet();

    public static AnonymousClass0P1 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0P1.class) {
                if (A01 == null) {
                    AnonymousClass022.A00();
                    A01 = new AnonymousClass0P1();
                }
            }
        }
        return A01;
    }
}
