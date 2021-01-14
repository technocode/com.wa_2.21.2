package com.whatsapp.registration.directmigration;

import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass0FV;
import X.AnonymousClass0FX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MigrationRequesterBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        AnonymousClass00D A00 = AnonymousClass00D.A00();
        AnonymousClass0FV A002 = AnonymousClass0FV.A00();
        if (intent != null) {
            Log.i("MigrationRequesterBroadcastReceiver/received-broadcast");
            if ("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("extra_min_storage_needed", 0);
                long longExtra2 = intent.getLongExtra("extra_msg_db_size", 0);
                AnonymousClass0FX r4 = A002.A01;
                r4.A03 = Double.valueOf((double) longExtra);
                r4.A02 = Double.valueOf((double) longExtra2);
                AnonymousClass008.A0l(A00, "registration_sibling_app_min_storage_needed", longExtra);
            }
        }
    }
}
