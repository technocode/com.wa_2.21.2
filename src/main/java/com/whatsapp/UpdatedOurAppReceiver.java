package com.whatsapp;

import X.AbstractC003201p;
import X.AnonymousClass00D;
import X.AnonymousClass01I;
import X.AnonymousClass0BA;
import X.AnonymousClass0FE;
import X.AnonymousClass0L1;
import X.C014708f;
import X.C04560Kv;
import X.C04570Kw;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;

public class UpdatedOurAppReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            AnonymousClass01I A00 = AnonymousClass01I.A00();
            AnonymousClass00D A002 = AnonymousClass00D.A00();
            Log.i("received broadcast that com.whatsapp was updated");
            SharedPreferences sharedPreferences = A002.A00;
            sharedPreferences.getInt("c2dm_app_vers", 0);
            sharedPreferences.getString("c2dm_reg_id", null);
            A00.A04();
            if (A00.A00 != null) {
                Log.i("updatedappreceiver/request-refresh");
                RegistrationIntentService.A00(context.getApplicationContext());
            } else {
                Log.i("updateappreceiver/skip-refresh");
            }
            if (C014708f.A00().A02()) {
                Log.i("updatedappreceiver/update-notif");
                AnonymousClass0FE.A00().A04();
                AnonymousClass0L1.A00().A05(true);
                AnonymousClass0BA A003 = AnonymousClass0BA.A00();
                A003.A0A.ANF(new RunnableEBaseShape3S0100000_I0_3(A003, 33));
                C04560Kv A004 = C04560Kv.A00();
                A004.A0A.ANF(new RunnableEBaseShape3S0100000_I0_3(A004, 37));
                C04570Kw A005 = C04570Kw.A00();
                A005.A07.ANF(new RunnableEBaseShape3S0100000_I0_3(A005, 34));
            }
            AbstractC003201p.A01(A002.A07());
        }
    }
}
