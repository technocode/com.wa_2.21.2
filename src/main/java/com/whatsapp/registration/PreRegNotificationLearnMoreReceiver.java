package com.whatsapp.registration;

import X.AnonymousClass00D;
import X.AnonymousClass03C;
import X.AnonymousClass0M9;
import X.C02780Dk;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PreRegNotificationLearnMoreReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C02780Dk A02 = C02780Dk.A02();
        AnonymousClass0M9 A01 = AnonymousClass0M9.A01();
        AnonymousClass00D A00 = AnonymousClass00D.A00();
        AnonymousClass03C A002 = AnonymousClass03C.A00();
        A02.A05(context, new Intent("android.intent.action.VIEW", A01.A03("general", "30035737", null)).setFlags(268435456));
        A00.A0f(false);
        A002.A04(null, 20, "PreRegNotificationLearnMoreReceiver");
    }
}
