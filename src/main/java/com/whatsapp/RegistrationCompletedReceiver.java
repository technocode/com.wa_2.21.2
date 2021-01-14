package com.whatsapp;

import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass01I;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class RegistrationCompletedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.i("received broadcast that smba was registered on this device");
        AnonymousClass01I A00 = AnonymousClass01I.A00();
        AnonymousClass00D A002 = AnonymousClass00D.A00();
        if (A00.A09(UserJid.getNullable(intent.getStringExtra("jid")))) {
            Log.i("smba registered this clients phone number");
            AnonymousClass008.A0n(A002, "registration_biz_registered_on_device", true);
        }
    }
}
