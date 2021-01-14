package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0ER  reason: invalid class name */
public class AnonymousClass0ER {
    public static volatile AnonymousClass0ER A04;
    public final AnonymousClass00S A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public AnonymousClass0ER(AnonymousClass00S r2) {
        this.A00 = r2;
    }

    public static AnonymousClass0ER A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0ER.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0ER(AnonymousClass00S.A00());
                }
            }
        }
        return A04;
    }

    public void A01(String[] strArr) {
        Set set = this.A03;
        synchronized (set) {
            set.removeAll(AnonymousClass1VY.A0H(strArr));
        }
    }
}
