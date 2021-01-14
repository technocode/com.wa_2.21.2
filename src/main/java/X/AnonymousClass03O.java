package X;

import android.content.SharedPreferences;

/* renamed from: X.03O  reason: invalid class name */
public class AnonymousClass03O {
    public static volatile AnonymousClass03O A01;
    public final SharedPreferences A00;

    public AnonymousClass03O(AnonymousClass022 r2) {
        this.A00 = r2.A02("field-stats-events-sampling");
    }

    public static AnonymousClass03O A00() {
        if (A01 == null) {
            synchronized (AnonymousClass03O.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass03O(AnonymousClass022.A00());
                }
            }
        }
        return A01;
    }
}
