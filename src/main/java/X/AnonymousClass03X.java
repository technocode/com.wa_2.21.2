package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.03X  reason: invalid class name */
public class AnonymousClass03X {
    public static final Map A02 = new HashMap();
    public static volatile AnonymousClass03X A03;
    public final SharedPreferences A00;
    public final Object A01 = new Object();

    public AnonymousClass03X(AnonymousClass022 r2) {
        this.A00 = r2.A02(AnonymousClass020.A02);
    }

    public static AnonymousClass03X A00() {
        if (A03 == null) {
            synchronized (AnonymousClass03X.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass03X(AnonymousClass022.A00());
                }
            }
        }
        return A03;
    }
}
