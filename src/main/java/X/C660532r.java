package X;

import android.os.Build;

/* renamed from: X.32r  reason: invalid class name and case insensitive filesystem */
public class C660532r {
    public static final AbstractC660432q A00;

    static {
        AbstractC660432q r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            r0 = new AnonymousClass3Q3();
        } else if (i >= 23) {
            r0 = new AnonymousClass3Q2();
        } else {
            r0 = new AnonymousClass3Q4();
        }
        A00 = r0;
    }
}
