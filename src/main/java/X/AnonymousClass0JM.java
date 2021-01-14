package X;

import android.content.SharedPreferences;

/* renamed from: X.0JM  reason: invalid class name */
public class AnonymousClass0JM {
    public static volatile AnonymousClass0JM A01;
    public final SharedPreferences A00;

    public AnonymousClass0JM(AnonymousClass022 r2) {
        this.A00 = r2.A01("time_spent_prefs");
    }

    public static AnonymousClass0JM A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0JM.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0JM(AnonymousClass022.A00());
                }
            }
        }
        return A01;
    }
}
