package X;

import android.content.DialogInterface;
import android.net.wifi.WifiManager;
import com.whatsapp.messaging.CaptivePortalActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2Up  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC50412Up implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WifiManager A01;
    public final /* synthetic */ CaptivePortalActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ DialogInterface$OnClickListenerC50412Up(CaptivePortalActivity captivePortalActivity, WifiManager wifiManager, int i, String str) {
        this.A02 = captivePortalActivity;
        this.A01 = wifiManager;
        this.A00 = i;
        this.A03 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CaptivePortalActivity captivePortalActivity = this.A02;
        WifiManager wifiManager = this.A01;
        int i2 = this.A00;
        String str = this.A03;
        StringBuilder sb = new StringBuilder("forgetting wifi network ");
        sb.append(i2);
        sb.append(" named ");
        sb.append(str);
        Log.i(sb.toString());
        if (!wifiManager.removeNetwork(i2)) {
            StringBuilder sb2 = new StringBuilder("remove network failed for wifi network ");
            sb2.append(i2);
            sb2.append(" named ");
            sb2.append(str);
            Log.w(sb2.toString());
        } else if (!wifiManager.saveConfiguration()) {
            StringBuilder sb3 = new StringBuilder("save configuration failed for wifi network ");
            sb3.append(i2);
            sb3.append(" named ");
            sb3.append(str);
            Log.w(sb3.toString());
        }
        if (!wifiManager.disconnect()) {
            StringBuilder sb4 = new StringBuilder("failed to disconnect from wifi network ");
            sb4.append(i2);
            sb4.append(" named ");
            sb4.append(str);
            Log.w(sb4.toString());
        }
        captivePortalActivity.finish();
    }
}
