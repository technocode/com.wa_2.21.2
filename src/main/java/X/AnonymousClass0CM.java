package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0CM  reason: invalid class name */
public class AnonymousClass0CM {
    public static volatile AnonymousClass0CM A01;
    public final JniBridge A00;

    public AnonymousClass0CM(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }

    public static AnonymousClass0CM A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0CM.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0CM(JniBridge.getInstance());
                }
            }
        }
        return A01;
    }
}
