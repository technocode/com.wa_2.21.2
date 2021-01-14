package com.whatsapp;

import X.AbstractActivityC60812rK;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass03C;
import X.AnonymousClass03E;
import X.AnonymousClass0BS;
import X.AnonymousClass0C4;
import X.AnonymousClass0K4;
import X.AnonymousClass0OZ;
import X.C000300f;
import X.C015808q;
import X.C03800Hr;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WebSessionVerificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        List asList;
        Log.d("WebSessionVerificationReceiver/onReceive");
        AnonymousClass0C4 A00 = AnonymousClass0C4.A00();
        C000300f A002 = C000300f.A00();
        AnonymousClass01X A003 = AnonymousClass01X.A00();
        AnonymousClass00D A004 = AnonymousClass00D.A00();
        C015808q A005 = C015808q.A00();
        AnonymousClass03C A006 = AnonymousClass03C.A00();
        SharedPreferences sharedPreferences = A004.A00;
        String string = sharedPreferences.getString("web_session_verification_browser_ids", null);
        if (string == null || (asList = Arrays.asList(string.split(","))) == null) {
            Log.e("WebSessionVerificationReceiver/onReceive/ browserIds are missing from prefs");
            return;
        }
        Iterator it = asList.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass0K4 A02 = A00.A02((String) it.next());
                if (A02 != null) {
                    Log.d("WebSessionVerificationReceiver/fireVerificationNotification");
                    String A007 = AnonymousClass0OZ.A00(A003, A02.A07);
                    AnonymousClass03E A008 = AnonymousClass0BS.A00(context);
                    A008.A0J = "other_notifications@1";
                    A008.A0B(A003.A06(R.string.notification_web_session_verification_title));
                    A008.A07.when = A02.A05;
                    A008.A0A(A003.A06(R.string.notification_web_session_verification_title));
                    A008.A09(A003.A0D(R.string.notification_web_session_verification_description, A02.A09, A007));
                    A008.A09 = PendingIntent.getActivity(context, 0, AbstractActivityC60812rK.A04(context, A002, A005), 0);
                    C03800Hr r3 = new C03800Hr();
                    r3.A07(A003.A0D(R.string.notification_web_session_verification_description, A02.A09, A007));
                    A008.A08(r3);
                    A008.A06(16, true);
                    A008.A07.icon = R.drawable.notify_web_client_connected;
                    A006.A03(null, 15, A008.A01());
                    break;
                }
            } else {
                break;
            }
        }
        sharedPreferences.edit().putString("web_session_verification_browser_ids", null).putLong("web_session_verification_when_millis", -1).apply();
    }
}
