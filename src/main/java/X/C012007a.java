package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* renamed from: X.07a  reason: invalid class name and case insensitive filesystem */
public final class C012007a {
    public int A00;
    public int A01 = 0;
    public String A02;
    public String A03;
    public final Context A04;

    public C012007a(Context context) {
        this.A04 = context;
    }

    public static String A00(AnonymousClass05T r3) {
        r3.A03();
        AnonymousClass05X r1 = r3.A02;
        String str = r1.A04;
        if (str != null) {
            return str;
        }
        r3.A03();
        String str2 = r1.A01;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized int A01() {
        int i;
        int i2 = this.A01;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.A04.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C001801b.A1h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.A01 = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C001801b.A1h()) {
                this.A01 = 2;
                i = 2;
            } else {
                this.A01 = 1;
                i = 1;
            }
            return i;
        }
        this.A01 = 2;
        return 2;
    }

    public final synchronized int A02() {
        PackageInfo A032;
        if (this.A00 == 0 && (A032 = A03("com.google.android.gms")) != null) {
            this.A00 = A032.versionCode;
        }
        return this.A00;
    }

    public final PackageInfo A03(String str) {
        try {
            return this.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public final synchronized String A04() {
        if (this.A02 == null) {
            A05();
        }
        return this.A02;
    }

    public final synchronized void A05() {
        PackageInfo A032 = A03(this.A04.getPackageName());
        if (A032 != null) {
            this.A02 = Integer.toString(A032.versionCode);
            this.A03 = A032.versionName;
        }
    }
}
