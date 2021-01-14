package com.whatsapp.messaging;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass0JQ;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass2C0;
import X.DialogInterface$OnClickListenerC50402Uo;
import X.DialogInterface$OnClickListenerC50412Up;
import X.DialogInterface$OnClickListenerC50422Uq;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class CaptivePortalActivity extends AnonymousClass2C0 {
    public final AnonymousClass0JQ A00 = AnonymousClass0JQ.A00();
    public final AnonymousClass03P A01 = AnonymousClass03P.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        WifiInfo connectionInfo;
        int length;
        super.onCreate(bundle);
        requestWindowFeature(1);
        WifiManager A0B = this.A01.A0B();
        if (A0B == null) {
            Log.w("captiveportalactivity/create wm=null");
            connectionInfo = null;
        } else {
            connectionInfo = A0B.getConnectionInfo();
        }
        AnonymousClass0MB r3 = new AnonymousClass0MB(this);
        AnonymousClass0MC r8 = r3.A01;
        r8.A0J = false;
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        r8.A0I = r5.A06(R.string.no_internet_title);
        r3.A06(r5.A06(R.string.ok), new DialogInterface$OnClickListenerC50402Uo(this));
        r3.A05(r5.A06(R.string.disable_wifi), new DialogInterface$OnClickListenerC50422Uq(this, A0B));
        if (connectionInfo != null) {
            int networkId = connectionInfo.getNetworkId();
            String ssid = connectionInfo.getSSID();
            if (ssid != null && (length = ssid.length()) >= 2 && ((ssid.startsWith("\"") || ssid.startsWith("'")) && (ssid.endsWith("\"") || ssid.endsWith("'")))) {
                ssid = ssid.substring(1, length - 1);
            }
            AnonymousClass008.A18("wifi network name is ", ssid);
            r8.A0E = r5.A0D(R.string.wifi_network_blocked_explanation, ssid);
            r3.A07(r5.A0D(R.string.forget_wifi_network, ssid), new DialogInterface$OnClickListenerC50412Up(this, A0B, networkId, ssid));
        } else {
            r8.A0E = r5.A06(R.string.wifi_blocked_explanation);
        }
        Log.i("captive portal dialog created");
        r3.A00().show();
    }

    @Override // X.ActivityC004902h
    public void onPause() {
        super.onPause();
        AnonymousClass0JQ r2 = this.A00;
        r2.A00.removeMessages(1);
        r2.A01();
    }

    @Override // X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A00.A00.sendEmptyMessageDelayed(1, 3000);
    }
}
