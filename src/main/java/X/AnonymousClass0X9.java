package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.0X9  reason: invalid class name */
public class AnonymousClass0X9 {
    public static volatile AnonymousClass0X9 A01;
    public final JniBridge A00;

    public AnonymousClass0X9(JniBridge jniBridge) {
        this.A00 = jniBridge;
    }

    public static AnonymousClass0X9 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0X9.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0X9(JniBridge.getInstance());
                }
            }
        }
        return A01;
    }
}
