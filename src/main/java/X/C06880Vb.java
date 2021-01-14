package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;

/* renamed from: X.0Vb  reason: invalid class name and case insensitive filesystem */
public class C06880Vb {
    public static boolean A00(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 17 || (applicationInfo.flags & 4194304) == 0 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
