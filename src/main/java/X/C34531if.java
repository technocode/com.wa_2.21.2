package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;

/* renamed from: X.1if  reason: invalid class name and case insensitive filesystem */
public final class C34531if extends C235816m {
    public static String A04(Context context, String str) {
        Account account = new Account(str, "com.google");
        C235816m.A01(account);
        C001801b.A1U("Calling this from your main thread can lead to deadlock");
        C001801b.A1V("oauth2:https://www.googleapis.com/auth/drive.appdata https://www.googleapis.com/auth/drive.file", "Scope cannot be empty or null.");
        C235816m.A01(account);
        C235816m.A02(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str2);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return ((TokenData) C235816m.A00(context, C235816m.A00, new C34641iv(account, bundle))).A03;
    }
}
