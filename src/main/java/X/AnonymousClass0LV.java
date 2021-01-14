package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0LV  reason: invalid class name */
public class AnonymousClass0LV {
    public static boolean A00;
    public static boolean A01;
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        if (r9.getPackageManager().hasSystemFeature("android.hardware.type.embedded") != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cd, code lost:
        if (r0.booleanValue() != false) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r9, int r10) {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LV.A00(android.content.Context, int):int");
    }

    public static boolean A01(Context context) {
        if (!A01) {
            try {
                PackageInfo packageInfo = C04660Lg.A00(context).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                AnonymousClass0Lf.A00(context);
                if (packageInfo == null || AnonymousClass0Lf.A02(packageInfo, false) || !AnonymousClass0Lf.A02(packageInfo, true)) {
                    A00 = false;
                } else {
                    A00 = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                A01 = true;
            }
        }
        return A00 || !"user".equals(Build.TYPE);
    }

    public static boolean A02(Context context) {
        Bundle applicationRestrictions;
        boolean equals = "com.google.android.gms".equals("com.google.android.gms");
        if (C001801b.A1g()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                return !C001801b.A1e() || (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) == null || !"true".equals(applicationRestrictions.getString("restricted_profile"));
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static boolean A03(Context context, int i) {
        C04670Lh A002 = C04660Lg.A00(context);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 19) {
            z = true;
        }
        if (z) {
            try {
                ((AppOpsManager) A002.A00.getSystemService("appops")).checkPackage(i, "com.google.android.gms");
            } catch (SecurityException unused) {
            }
        } else {
            String[] packagesForUid = A002.A00.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null) {
                for (String str : packagesForUid) {
                    if (!"com.google.android.gms".equals(str)) {
                    }
                }
            }
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            AnonymousClass0Lf A003 = AnonymousClass0Lf.A00(context);
            if (A003 != null) {
                if (packageInfo != null) {
                    if (AnonymousClass0Lf.A02(packageInfo, false)) {
                        return true;
                    }
                    if (AnonymousClass0Lf.A02(packageInfo, true)) {
                        if (A01(A003.A00)) {
                            return true;
                        }
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    }
                }
                return false;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException unused2) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                return false;
            }
        }
    }
}
