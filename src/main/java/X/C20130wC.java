package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Base64;
import java.security.MessageDigest;

/* renamed from: X.0wC  reason: invalid class name and case insensitive filesystem */
public class C20130wC {
    public static void A00(Context context, Intent intent) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent().setPackage(context.getPackageName()), 134217728);
        Bundle bundle = new Bundle();
        bundle.putParcelable("auth_pending_intent", activity);
        intent.putExtra("auth_bundle", bundle);
    }

    public static boolean A01(Context context, String str) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Signature[] signatureArr;
        int[] iArr;
        if (str == null || (!str.equals("com.facebook.services") && !str.equals("com.facebook.services.dev"))) {
            return false;
        }
        ApplicationInfo applicationInfo2 = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 4160)) != null && (applicationInfo = packageInfo.applicationInfo) != null && applicationInfo.enabled && (signatureArr = packageInfo.signatures) != null && signatureArr.length == 1) {
                int i = applicationInfo.flags;
                if ((i & 1) != 0 || (i & 128) != 0) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (strArr != null && (iArr = packageInfo.requestedPermissionsFlags) != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < strArr.length && i2 < iArr.length) {
                                    if ((iArr[i2] & 2) == 0) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    try {
                        MessageDigest instance = MessageDigest.getInstance("SHA-1");
                        if (instance != null) {
                            byte[] byteArray = packageInfo.signatures[0].toByteArray();
                            instance.update(byteArray, 0, byteArray.length);
                            String encodeToString = Base64.encodeToString(instance.digest(), 11);
                            if (encodeToString != null) {
                                try {
                                    applicationInfo2 = context.getApplicationInfo();
                                } catch (RuntimeException e) {
                                    if (!(e.getCause() instanceof DeadObjectException)) {
                                        throw e;
                                    }
                                }
                                context.getApplicationContext();
                                if (applicationInfo2 == null || (applicationInfo2.flags & 2) == 0) {
                                    return "e6fv6XFRr-tXEDJmsSANhagF19Y".equals(encodeToString);
                                }
                                return "7XE60X540nq3JXIiFpcVSgM8diY".equals(encodeToString);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
        }
        return false;
    }
}
