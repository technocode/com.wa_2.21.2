package com.whatsapp.companiondevice;

import X.AbstractActivityC60812rK;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass03C;
import X.AnonymousClass03E;
import X.AnonymousClass0BS;
import X.AnonymousClass0OZ;
import X.AnonymousClass1VI;
import X.C000300f;
import X.C015808q;
import X.C02430Bz;
import X.C03800Hr;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CompanionDeviceVerificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        List list;
        Log.d("CompanionDeviceVerificationReceiver/onReceive");
        C000300f A00 = C000300f.A00();
        AnonymousClass00D A002 = AnonymousClass00D.A00();
        AnonymousClass01X A003 = AnonymousClass01X.A00();
        C015808q A004 = C015808q.A00();
        C02430Bz A005 = C02430Bz.A00();
        SharedPreferences sharedPreferences = A002.A00;
        String string = sharedPreferences.getString("companion_device_verification_ids", null);
        if (string != null) {
            list = Arrays.asList(string.split(","));
        } else {
            list = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (A005 != null) {
                    DeviceJid nullable = DeviceJid.getNullable(str);
                    if (nullable != null) {
                        AnonymousClass1VI A02 = A005.A02(nullable);
                        if (A02 != null) {
                            Log.d("CompanionDeviceVerificationReceiver/fireVerificationNotification");
                            AnonymousClass03C A006 = AnonymousClass03C.A00();
                            String A06 = A003.A06(R.string.notification_companion_device_verification_title);
                            String A0D = A003.A0D(R.string.notification_companion_device_verification_description, A02.A07, AnonymousClass0OZ.A00(A003, A02.A04));
                            AnonymousClass03E A007 = AnonymousClass0BS.A00(context);
                            A007.A0J = "other_notifications@1";
                            A007.A0B(A06);
                            A007.A0A(A06);
                            A007.A09(A0D);
                            A007.A09 = PendingIntent.getActivity(context, 0, AbstractActivityC60812rK.A04(context, A00, A004), 0);
                            C03800Hr r0 = new C03800Hr();
                            r0.A07(A0D);
                            A007.A08(r0);
                            A007.A06(16, true);
                            A007.A07.icon = R.drawable.notify_web_client_connected;
                            A006.A03(null, 21, A007.A01());
                            break;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        } else {
            Log.e("CompanionDeviceVerificationReceiver/onReceive/ deviceIds are missing from prefs");
        }
        sharedPreferences.edit().remove("companion_device_verification_ids");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 536870912);
        if (broadcast != null) {
            broadcast.cancel();
        }
    }
}
