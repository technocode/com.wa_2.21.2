package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0AO  reason: invalid class name */
public class AnonymousClass0AO {
    public static volatile AnonymousClass0AO A04;
    public long A00 = -1;
    public final AnonymousClass00S A01;
    public final AnonymousClass0AP A02;
    public final Map A03 = new HashMap();

    public AnonymousClass0AO(AnonymousClass00S r3, AnonymousClass0AP r4) {
        this.A01 = r3;
        this.A02 = r4;
    }

    public static AnonymousClass0AO A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0AO.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0AO(AnonymousClass00S.A00(), AnonymousClass0AP.A00());
                }
            }
        }
        return A04;
    }
}
