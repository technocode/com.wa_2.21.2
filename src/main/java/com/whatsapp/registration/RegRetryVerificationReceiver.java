package com.whatsapp.registration;

import X.AnonymousClass01X;
import X.AnonymousClass03C;
import X.AnonymousClass03E;
import X.AnonymousClass0BS;
import X.C014708f;
import X.C03800Hr;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.util.Log;

public class RegRetryVerificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.i("reg-retry-verification-receiver/timeout");
        AnonymousClass01X A00 = AnonymousClass01X.A00();
        AnonymousClass03C A002 = AnonymousClass03C.A00();
        if (!C014708f.A00().A02()) {
            long currentTimeMillis = System.currentTimeMillis();
            String A06 = A00.A06(R.string.localized_app_name);
            String A0D = A00.A0D(R.string.verification_retry_headline_app_name, A06);
            String A062 = A00.A06(R.string.verification_retry_message);
            PendingIntent activity = PendingIntent.getActivity(context, 1, new Intent(context, Main.class), 0);
            AnonymousClass03E A003 = AnonymousClass0BS.A00(context);
            A003.A0J = "critical_app_alerts@1";
            A003.A0B(A0D);
            A003.A07.when = currentTimeMillis;
            A003.A04(3);
            A003.A06(16, true);
            A003.A0A(A06);
            A003.A09(A062);
            C03800Hr r0 = new C03800Hr();
            r0.A07(A062);
            A003.A08(r0);
            A003.A09 = activity;
            A003.A07.icon = R.drawable.notifybar;
            A002.A03(null, 1, A003.A01());
            return;
        }
        Log.i("app-init/async/registrationretry/verified");
    }
}
