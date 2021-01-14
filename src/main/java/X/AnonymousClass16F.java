package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.16F  reason: invalid class name */
public final class AnonymousClass16F {
    public SharedPreferences A00;

    public AnonymousClass16F(Context context) {
        SharedPreferences sharedPreferences;
        try {
            Context createPackageContext = context.createPackageContext("com.google.android.gms", 3);
            if (createPackageContext != null) {
                try {
                    sharedPreferences = createPackageContext.getSharedPreferences("google_ads_flags", 0);
                    this.A00 = sharedPreferences;
                } catch (Throwable th) {
                    Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
                    this.A00 = null;
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        sharedPreferences = null;
        this.A00 = sharedPreferences;
    }
}
