package X;

import android.content.Context;

/* renamed from: X.0GU  reason: invalid class name */
public class AnonymousClass0GU extends C02180Ay {
    public static volatile AnonymousClass0GU A00;

    public AnonymousClass0GU(Context context) {
        super(new AnonymousClass3WY(context), null);
    }

    public static AnonymousClass0GU A00() {
        if (A00 == null) {
            synchronized (AnonymousClass0GU.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass0GU(AnonymousClass00G.A01.A00);
                }
            }
        }
        return A00;
    }
}
