package X;

import android.os.Build;

/* renamed from: X.3WK  reason: invalid class name */
public class AnonymousClass3WK {
    public static AnonymousClass3WK A00;

    public static AnonymousClass2VM A00() {
        if (Build.VERSION.SDK_INT > 18) {
            return new AnonymousClass3WE();
        }
        return new AnonymousClass3WD();
    }
}
