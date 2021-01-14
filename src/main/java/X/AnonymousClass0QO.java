package X;

import android.os.Build;

/* renamed from: X.0QO  reason: invalid class name */
public class AnonymousClass0QO {
    public static int A00 = -1;
    public static Boolean A01;
    public static final String[] A02 = {"GT-N7100", "GT-I9305"};

    public static boolean A00() {
        Boolean bool = A01;
        if (bool == null) {
            boolean z = false;
            for (String str : A02) {
                if (Build.MODEL.equals(str)) {
                    A01 = Boolean.TRUE;
                    return true;
                }
            }
            int i = A00;
            if (i < 0) {
                return false;
            }
            if (i <= 48) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            A01 = bool;
        }
        return bool.booleanValue();
    }
}
