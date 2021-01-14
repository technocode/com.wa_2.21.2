package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.22b  reason: invalid class name and case insensitive filesystem */
public class C448922b extends AbstractC29021Ws {
    public static final Uri A01 = Uri.parse("content://com.transsion.hilauncher.unreadprovider");
    public static final Uri A02 = Uri.parse("content://com.transsion.XOSLauncher.unreadprovider");
    public final C002701k A00;

    public C448922b(C002701k r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC29021Ws
    public List A00(Context context) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                try {
                    ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                    if (resolveActivity != null) {
                        PermissionInfo[] permissionInfoArr = packageManager.getPackageInfo(resolveActivity.activityInfo.packageName, 4096).permissions;
                        int length = permissionInfoArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = true;
                                break;
                            }
                            PermissionInfo permissionInfo = permissionInfoArr[i];
                            if ("com.transsion.hilauncher.permission.CHANGE_BADGE".equals(permissionInfo.name) || "com.transsion.XOSLauncher.permission.CHANGE_BADGE".equals(permissionInfo.name)) {
                                break;
                            }
                            i++;
                        }
                        if (z && this.A00.A0E(190)) {
                            return Arrays.asList("com.transsion.XOSLauncher", "com.transsion.hilauncher");
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            z = false;
            return Arrays.asList("com.transsion.XOSLauncher", "com.transsion.hilauncher");
        }
        return new ArrayList();
    }
}
