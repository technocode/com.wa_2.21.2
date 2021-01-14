package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.02a  reason: invalid class name and case insensitive filesystem */
public class C004302a {
    public static final Object A00 = new Object();

    public static int A00(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static int A01(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static ColorStateList A02(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static Drawable A03(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        return context.getResources().getDrawable(i);
    }

    public static File A04(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        File file = new File(context.getApplicationInfo().dataDir, "no_backup");
        synchronized (C004302a.class) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            if (file.exists()) {
                return file;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to create files subdir ");
            sb.append(file.getPath());
            Log.w("ContextCompat", sb.toString());
            return null;
        }
    }

    public static Executor A05(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return context.getMainExecutor();
        }
        return new AnonymousClass07X(new Handler(context.getMainLooper()));
    }

    public static void A06(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static boolean A07(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static File[] A08(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] A09(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(null);
        }
        return new File[]{context.getExternalFilesDir(null)};
    }
}
