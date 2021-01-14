package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;

/* renamed from: X.0LQ  reason: invalid class name */
public class AnonymousClass0LQ {
    public static final AnonymousClass0LQ A00 = new AnonymousClass0LQ();

    public int A00(Context context, int i) {
        int A002 = AnonymousClass0LV.A00(context, i);
        boolean z = true;
        if (A002 != 18) {
            if (A002 == 1) {
                z = AnonymousClass0LV.A02(context);
            } else {
                z = false;
            }
        }
        if (z) {
            return 18;
        }
        return A002;
    }

    public Intent A01(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !C001801b.A1m(context)) {
                StringBuilder A0S = AnonymousClass008.A0S("gcore_");
                A0S.append(12451000);
                A0S.append("-");
                if (!TextUtils.isEmpty(str)) {
                    A0S.append(str);
                }
                A0S.append("-");
                if (context != null) {
                    A0S.append(context.getPackageName());
                }
                A0S.append("-");
                if (context != null) {
                    try {
                        C04670Lh A002 = C04660Lg.A00(context);
                        A0S.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String obj = A0S.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(obj)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", obj);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage(SearchActionVerificationClientUtil.ANDROID_WEAR_PACKAGE);
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }
}
