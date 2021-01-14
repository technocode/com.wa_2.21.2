package X;

import android.os.Build;

/* renamed from: X.0Ph  reason: invalid class name and case insensitive filesystem */
public interface AbstractC05590Ph {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        }
        A00 = z;
    }
}
