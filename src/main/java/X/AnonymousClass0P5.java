package X;

import android.content.SharedPreferences;

/* renamed from: X.0P5  reason: invalid class name */
public class AnonymousClass0P5 {
    public static volatile AnonymousClass0P5 A01;
    public final AnonymousClass022 A00;

    public AnonymousClass0P5(AnonymousClass022 r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0P5 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0P5.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0P5(AnonymousClass022.A00());
                }
            }
        }
        return A01;
    }

    public final void A01(String str) {
        SharedPreferences A012 = this.A00.A01("scheduler-experiment");
        synchronized (this) {
            A012.edit().putInt(str, A012.getInt(str, 0) + 1).apply();
        }
    }
}
