package X;

import android.content.DialogInterface;
import android.net.wifi.WifiManager;
import com.whatsapp.messaging.CaptivePortalActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2Uq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC50422Uq implements DialogInterface.OnClickListener {
    public final /* synthetic */ WifiManager A00;
    public final /* synthetic */ CaptivePortalActivity A01;

    public /* synthetic */ DialogInterface$OnClickListenerC50422Uq(CaptivePortalActivity captivePortalActivity, WifiManager wifiManager) {
        this.A01 = captivePortalActivity;
        this.A00 = wifiManager;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CaptivePortalActivity captivePortalActivity = this.A01;
        WifiManager wifiManager = this.A00;
        Log.i("disable wifi radio");
        if (wifiManager != null) {
            wifiManager.setWifiEnabled(false);
        }
        captivePortalActivity.finish();
    }
}
