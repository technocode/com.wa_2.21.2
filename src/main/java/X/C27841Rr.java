package X;

import android.os.Build;

/* renamed from: X.1Rr  reason: invalid class name and case insensitive filesystem */
public class C27841Rr {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 22) {
            z = true;
        }
        A00 = z;
    }
}
