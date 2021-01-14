package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.30c  reason: invalid class name and case insensitive filesystem */
public class C655330c extends BroadcastReceiver {
    public final AnonymousClass00D A00 = AnonymousClass00D.A00();

    public void onReceive(Context context, Intent intent) {
        Log.i("ProcessProviderMigrationInfo/on-receive");
        AnonymousClass0FV A002 = AnonymousClass0FV.A00();
        Bundle resultExtras = getResultExtras(true);
        if (getResultCode() == -1 && resultExtras != null && intent != null) {
            if ("com.whatsapp.registration.directmigration.initialMigrationInfoAction".equals(intent.getAction())) {
                Log.i("ProcessProviderMigrationInfo/received-phone-number");
                AnonymousClass00D r3 = this.A00;
                AnonymousClass008.A0m(r3, "registration_sibling_app_country_code", resultExtras.getString("me_country_code", null));
                AnonymousClass008.A0m(r3, "registration_sibling_app_phone_number", resultExtras.getString("phone_number", null));
                AnonymousClass008.A0k(r3, "direct_db_migration_timeout_in_secs", resultExtras.getInt("direct_db_migration_timeout_in_secs", 180));
                boolean z = resultExtras.getBoolean("sister_app_content_provider_enabled", false);
                r3.A00.edit().putBoolean("sister_app_content_provider_is_enabled", z).apply();
                StringBuilder sb = new StringBuilder("ProcessProviderMigrationInfo/sister-app-content-provider-is-enabled = ");
                sb.append(z);
                Log.i(sb.toString());
            } else if ("com.whatsapp.registration.directmigration.recoveryTokenAction".equals(intent.getAction())) {
                Log.i("ProcessProviderMigrationInfo/received-recovery-token");
                SharedPreferences sharedPreferences = this.A00.A00;
                String string = sharedPreferences.getString("registration_sibling_app_country_code", null);
                String string2 = sharedPreferences.getString("registration_sibling_app_phone_number", null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(string2);
                String A1o = C002001d.A1o(sb2.toString());
                byte[] byteArray = resultExtras.getByteArray("key_recovery_token");
                if (!TextUtils.isEmpty(A1o) && byteArray != null) {
                    C007603r.A09(context, byteArray, A1o);
                    A002.A01.A00 = Boolean.TRUE;
                }
            }
        }
    }
}
